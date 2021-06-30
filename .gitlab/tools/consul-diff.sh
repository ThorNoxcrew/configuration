#!/bin/bash
set -euo pipefail

export CONSUL_HTTP_ADDR=http://localhost:8500

array_contains() {
  local -r item="${1?Item required}"
  shift
  local -r arr=( "${@}" )
  for other in "${arr[@]}"; do
    if [ "${item}" == "${other}" ]; then
      return 0
    fi
  done
  return 1
}

# Consul is A
A=()
B=()

mapfile -t A < <(consul kv export -token "$CONSUL_ACL_TOKEN" /configuration/"$CI_COMMIT_BRANCH" | jq -r '.[].key' | sed "s|configuration/$CI_COMMIT_BRANCH/|./|g" | cut -c2-)
mapfile -t B < <(find . -not -path '*/\.*' -type f -print | cut -c2-)

for aitem in "${A[@]}"; do
  if ! array_contains "${aitem}" "${B[@]}"; then
    echo "${aitem} does not exist locally and needs to be removed from Consul"
    consul kv delete -token "$CONSUL_ACL_TOKEN" /configuration/"$CI_COMMIT_BRANCH"${aitem}
  fi
done
