import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(350.5, 35.5, 518.5),
      "<glyph=mcc:icon.emojis.sweat_smile> Cory Walker",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDI3MzU1ODk0NCwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU4NWQ0YjU0M2VkMDM0NTk3NDg4YjU2OTMwYmQ0YWEzNTc3MGIyNDg5NmUwODYyMjFiNzI4NmUyY2FkOTE0NmUiCiAgICB9CiAgfQp9",
      "PzVhddMvBa2mPddpUkJ+pr5rCsmS8KyEwk39uJCI5qkmPgc3CqXq0KCMtNbuKv0SFS9d3PDerrF/uQLAJC2GFcmzehVTxGEIKTMpsWMXTxqdsWF7GCreyd0ng6ATk1K3rcBkNcTIy6J8DkGfeXzJdSbRUU+ujF4adBtj4f5NL6/fDH0qR5saHwhZ0Pm7O8OAnPF60sqmpI8Y+ZLn977WpJWpfwnopzzPauPn8SVT8zm+HUWBE7XfoleE+fmtzeihG6NDffW87J8sz4uJnx1WTvvoti4tRWBW6xlMHYZJTGE8XCBnqSr1MtUSVUAi/uDS7DHWHqTL1hvcekeb4m/Gz88dDEUD7odB7FGCH0EASsrHjQ2zyULY1arwTzirexVIBT0e/lgKGZ0Q9/VWrAXPraIOJZ93PvuHr4BnN8XHZRcoVby7YPDlMev+nNcD+hLCJpSdFhYZtC4rEBgiT/K0jbkfX1AQ0qkQzNegdkgXAdIYBKeSxJ66oqqzbGicrOn7fqQUQcOa6DBy51oy+FE6g4siDx5ZcPG7fq6X+XSQ4MEpTFtLLhzXPYKrf57FLtDRQCjn1vYRfNC7nHq8fYHKi8KshikQENA0vctAkaqRFmCuOABbBcoiG1afTQRi9XpxOgnkbNXy3vE0PhYPOIuGf/rRkSfDpZwCp2fkq1gWNP0=") {
    rotation(75.0, 0.0)

    val pointList = LinkedList<Transform>()
    pointList += Transform(349.5, 33.5, 485.5)
    pointList += Transform(288.5, 36.0, 483.5)
    pointList += Transform(284.0, 36.0, 474.5)
    pointList += Transform(283.5, 34.5, 450.5)
    pointList += Transform(293.5, 34.5, 443.5)
    pointList += Transform(349.5, 31.5, 444.5)
    pointList += Transform(351.5, 32.0, 456.5)
    pointList += Transform(349.5, 33.5, 485.5)

    patrol(pointList)

    helmet("mcc:island_cosmetics.hair.full_beard")

    type("ambient")
  }
}
