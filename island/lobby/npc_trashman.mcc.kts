import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
    val i18n: I18n by inject()

    playerNPC(
        absoluteVec(298.5, 41.0, 635.0),
        "The Trashman",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzNzYwMTI1MDI4MSwKICAicHJvZmlsZUlkIiA6ICJhOGJhMGY1YTFmNjQ0MTgzODZkZGI3OWExZmY5ZWRlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyOTA3NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zZGM1ODVlY2M5MjgxNmNhNmQ0MzBlNGZjMTdkMTNmODQ2MWZiN2QyYTY1N2Y3ODVkMjc5OTg5OTA2YWE1YzAxIgogICAgfQogIH0KfQ==",
        "YO0j+O8sTsw8L0bNdUoHLnFxcoPVNbZp7IniBS2tTI4vUuyZ5kM/zq1x3zxONHyNSkf4C8kOOqCNx9aMz0QtG+2Pz4pyewlpxME60c5G+onsflMDHtxw4yK6p1nHxLiaf86hyQJMd8bgo8rxUaCV+DjD+WLd6N5Cjkkv53dB8G59DsaqLgEHObU61fOKcRHk1RLJu809UDUaWlwcOEel65f9/zmTv22sXD56ujCrb5VsbR7byrIOzzdUN4EWX3+r0ENDae3sd5puNn8dsGTWAL743jQsu6Zcy4c11ZbIT67w5TB88RIT2nxNAnHqXbqgYn10eWnuPrPVedn9ZrqYIxr5xFcjfvVXaLhPCCyvtJU8cGTvn//jZA7WPFL0ffntCuG0RQNP0mvUe3edsFLOT/WzIYaomXgivOrMtzF07MAo5rZNQNTyYwe8H4Q8byGl5HJvZi5Yo/poRt5pIUWFeEan2mS6Wosqs7TifoGMggCd4kV9Omfc5urhEyWNQ9V4REF/ZMH+7ktRy+A5TKlPf6LQ9o9p0X3InHJH7sCmgXWFMcs4wu5qkkXzVO/QYk6IgBP3vo3nGulMaaSKmsmQXNJK8go0hgf2lSE1FWfChkMcBX5UOYpLfbJ518+3wk0wLXusVRddpbyg0I6ZJbk4FjN9PvS4b3sPtphoPriWm0I="
    ) {
        rotation(-90.0, 0.0)

        val pointList = LinkedList<Transform>()
        pointList += Transform(298.5, 41.0, 635.0)
        pointList += Transform(300.5, 40.0, 635.0)
        pointList += Transform(300.5, 40.0, 623.0)
        pointList += Transform(300.5, 41.0, 616.0)
        pointList += Transform(306.5, 40.5, 613.5)
        pointList += Transform(315.5, 40.5, 607.0)
        pointList += Transform(325.5, 40.5, 603.5)
        pointList += Transform(325.5, 37.0, 597.0)
        pointList += Transform(331.5, 37.0, 595.5)
        pointList += Transform(338.5, 37.0, 598.5)
        pointList += Transform(341.5, 38.0, 604.0)
        pointList += Transform(344.0, 38.0, 610.5)
        pointList += Transform(344.5, 38.0, 617.0)
        pointList += Transform(348.0, 38.0, 619.0)
        pointList += Transform(359.0, 38.0, 619.0)
        pointList += Transform(368.5, 38.0, 620.0)
        pointList += Transform(370.0, 37.5, 624.0)
        pointList += Transform(375.5, 37.5, 627.0)
        pointList += Transform(380.5, 37.5, 627.5)
        pointList += Transform(380.5, 40.5, 633.5)
        pointList += Transform(378.5, 40.5, 645.0)
        pointList += Transform(374.5, 41.0, 651.0)
        pointList += Transform(374.5, 41.0, 663.0)
        pointList += Transform(376.5, 41.0, 664.5)
        patrol(pointList)
        helmet("mcc:island_cosmetics.hair.groundskeeper")
        offHand("mcc:island_cosmetics.accessory.trash_can_lid")
        type("ambient")
    }
}
