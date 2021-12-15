import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Roams next to Brawler X in a sort of mock-duel. Named after Venture Bros characters.
    playerNPC(
        absoluteVec(185.0, 69.0, -790.0),
        "Ray Gholder",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzNzYwMTI1MDI4MSwKICAicHJvZmlsZUlkIiA6ICJhOGJhMGY1YTFmNjQ0MTgzODZkZGI3OWExZmY5ZWRlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyOTA3NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zZGM1ODVlY2M5MjgxNmNhNmQ0MzBlNGZjMTdkMTNmODQ2MWZiN2QyYTY1N2Y3ODVkMjc5OTg5OTA2YWE1YzAxIgogICAgfQogIH0KfQ==",
        "YO0j+O8sTsw8L0bNdUoHLnFxcoPVNbZp7IniBS2tTI4vUuyZ5kM/zq1x3zxONHyNSkf4C8kOOqCNx9aMz0QtG+2Pz4pyewlpxME60c5G+onsflMDHtxw4yK6p1nHxLiaf86hyQJMd8bgo8rxUaCV+DjD+WLd6N5Cjkkv53dB8G59DsaqLgEHObU61fOKcRHk1RLJu809UDUaWlwcOEel65f9/zmTv22sXD56ujCrb5VsbR7byrIOzzdUN4EWX3+r0ENDae3sd5puNn8dsGTWAL743jQsu6Zcy4c11ZbIT67w5TB88RIT2nxNAnHqXbqgYn10eWnuPrPVedn9ZrqYIxr5xFcjfvVXaLhPCCyvtJU8cGTvn//jZA7WPFL0ffntCuG0RQNP0mvUe3edsFLOT/WzIYaomXgivOrMtzF07MAo5rZNQNTyYwe8H4Q8byGl5HJvZi5Yo/poRt5pIUWFeEan2mS6Wosqs7TifoGMggCd4kV9Omfc5urhEyWNQ9V4REF/ZMH+7ktRy+A5TKlPf6LQ9o9p0X3InHJH7sCmgXWFMcs4wu5qkkXzVO/QYk6IgBP3vo3nGulMaaSKmsmQXNJK8go0hgf2lSE1FWfChkMcBX5UOYpLfbJ518+3wk0wLXusVRddpbyg0I6ZJbk4FjN9PvS4b3sPtphoPriWm0I="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(183.5, 69.0, -787.0), absoluteVec(190.0, 69.0, -797.0))
        type("ambient")
        offHand("mcc:island_cosmetics.accessory.wormhole_blaster")
    }
}
