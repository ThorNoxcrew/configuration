import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Diner keyboardist.
    playerNPC(
        absoluteVec(314.7, 33.0, 393.0),
        "Bobbie Key",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk1ODkwOTk3MiwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80Zjk5ZDllYjYyMDA5OWFmY2U5Y2E2NDMzMDdmYmQ0ZjM3ZWY0YTc2NmUxOGFmZDZhMWQ1OTI4Y2ExNzVkZTU1IgogICAgfQogIH0KfQ==",
        "ipcmrkcuU6ByAkvDNNWfHvMH//+/YiuUbiaO06syCw3GzNd5mAFepKNPryvh+TKah9fbytUoFznwuYZUUZ7nGxITZxJHpKcZINOazhPhwXx7RDS0RmpYqs4rNz1xdivF/q21fa5esolMCFpME5xLzVXyH4v/yvxPBLq0Z6/5BtLYXy4CsCsD9+Pd7bK48zsHHsJYWnOeqhpwycrg4BYeVhyGv69P5ev4YH4xUSasYEtecQmLhjrd4kzw81nATrb4z6FX+V+3J8vqNdYRmfce8kmuPap6NU02r3G/YlrNSC1PoLBTP9XPo4Ld1bWdfRs84f/cyq0aQO7DMkn1ONCvk1LZH6Tf4PM8dUDPVwtV85LqfuGz7IZpE2x5fK7pjwqf0JYNt8Jwu7HHX6mwg2tgSFOT4cd1DPAfbFsnPbdr9jGVPrPgcDIxVADKsNa/g4DGs8u190Ix3BbgsLsVsIrg5dXR6Sm8e/wJgVUUkcklbsFUNyLgTErM2DAMdFLbV8oOP2P5m7msXwM4Yv5kura+RswbewQeTbOaUG+t3zfSBhbpRMcaWz5dji6GYc7uaMm698eFiTws5Q7bwP7ei/fAguth7XpX6Tt2uwBpdBtMEQuLHTYG7/gjth5pozbbFrEABf8WpQUe/sF3oHte/LjPccZtuCwS/AUgmcvbQ1wFpag="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
