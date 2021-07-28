Get-ChildItem -Recurse -Include "*.kts" | % {
  echo $_.FullName
  & java -jar .gitlab\tools\.ktfmt-0.25.jar $_.FullName
}

