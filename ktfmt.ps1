Get-ChildItem -Recurse -Include "*.kts" | % {
  echo $_.FullName
  & java -jar .ktfmt-0.25.jar $_.FullName
}
