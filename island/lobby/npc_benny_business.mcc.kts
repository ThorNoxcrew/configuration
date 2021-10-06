import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Bussinessman that walks from the left side of HUB to the bank and back.
    playerNPC(
        absoluteVec(302.2, 37.5, 588.7),
        "Benny Business",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMzgzMjc2NzcxMCwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFkYzczZDI3ZTg0NTE5YTdmMTkxMzc2MWI1OTFjMGQ5ZGM2MDk4OGViMTkxMzkyMTRmOWYyNjBmMmI0MjU1MjciCiAgICB9CiAgfQp9",
        "aXohnTFclplGjnBp3/BDMkqjAeQDqK+t8vs0FdWVNrqptASJV3OOdCP5q2HhE5Y3VWt+YOjZkemayBJiNDO3W66ayB+AuBwwK3s4oOEF7efmQp8ojCjlW2k2E4fN1cF4Fvbn7oa+wqbT7FOfPxfGqSABMR1r6E1rSOV06B7bVf6h8dgAV/WArXlxo47aTTQoBh1DfZmQ7E8sM4w3iX+eBnTYWSoPH4HDJqbp6V+3aR9elcs4Ib6azGPB7qQRQeGBucaBTpK0ZELfyfRcDOJ+RAIi9ekWLrROuCktwZgRlGub3V6TPG+oR+PWzACaiHd3KdwmTe+YweoBuCerAPXHSAHUSm/DmOQGwZ8UOYmjvbZTxfxSRiCo2z4jawNi3mrtjxDGM86a5evCQefXN/6gJ7YVlzDl4wuVUULzA0KOKiCuwjKVv90ahcF2RyR5Xruwao/CpoWrCQ+ZBVF3pTKVLBmG4yjrIzT8MSVtf3MRTofD4+aHhVUW/btlsXSu6CvLFkZw+9+yT2XAZ/c26hk3QdhAfO7hZwn4T+0H33e/HxOWs54m0JtBXgFcKmJE4hVZWXVrBaH0QPyI5jk53kx77H4SOShq8o62tJMPjdFaVUL+9D+lLbr+RfP9jilmKowL3tqDET1QK7XIu9JBnJAUBfjKQL2Iv05H3CgpzStg3x0="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(302.2, 37.5, 588.7)
        pointList += Transform(298.5, 38.0, 577.5)
        pointList += Transform(263.8, 38.0, 577.5)
        pointList += Transform(263.8, 38.0, 552.0)
        pointList += Transform(261.6, 38.0, 547.6)
        pointList += Transform(261.6, 38.0, 539.0)
        pointList += Transform(257.2, 38.0, 535.5)
        pointList += Transform(245.4, 41.0, 535.5)
        pointList += Transform(241.3, 41.0, 529.6)
        pointList += Transform(233.8, 42.0, 529.5)
        pointList += Transform(233.5, 42.0, 512.5)
        pointList += Transform(231.4, 42.0, 508.8)
        pointList += Transform(231.5, 41.5, 496.0)
        pointList += Transform(239.5, 41.0, 489.5)
        pointList += Transform(243.2, 41.0, 482.8)
        pointList += Transform(255.3, 34.0, 482.8)
        pointList += Transform(255.0, 33.0, 469.0)
        pointList += Transform(251.2, 33.0, 461.6)
        pointList += Transform(251.2, 33.0, 459.2)
        pointList += Transform(256.4, 35.0, 459.2)
        pointList += Transform(257.5, 35.0, 452.6)
        pointList += Transform(260.9, 35.0, 450.3)
        pointList += Transform(276.4, 35.0, 450.3)
        pointList += Transform(284.5, 35.0, 443.7)
        pointList += Transform(286.5, 35.0, 439.2)
        pointList += Transform(296.3, 35.0, 437.3)
        pointList += Transform(307.5, 35.0, 437.3)
        pointList += Transform(307.5, 36.0, 423.5)
        pointList += Transform(310.0, 36.0, 422.8)
        pointList += Transform(311.0, 36.0, 421.8)
        pointList += Transform(313.2, 36.0, 422.0)

        patrol(pointList)

        type("ambient")
    }
}
