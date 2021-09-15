Get-ChildItem -Recurse -Include "*.kts" | % {
  echo $_.FullName
  & java -jar .gitlab\tools\ktlint -F $_.FullName
}

