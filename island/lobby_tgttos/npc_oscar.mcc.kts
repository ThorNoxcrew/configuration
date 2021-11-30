import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // NPC practicing the '20-block dash' in TGTTOS lobby
    playerNPC(
        absoluteVec(271.0, 86.0, 261.0),
        "Oscar Kido",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzNzcwMTI2MzIwOCwKICAicHJvZmlsZUlkIiA6ICIzOTVkZTJlYjVjNjU0ZmRkOWQ2NDAwY2JhNmNmNjFhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcGFyZXN0ZXZlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI0M2Q2NzE1ZmQ3MzE3NjFjNDcxMzBiZTJlZmY1Y2JjNWQ0ZGI3MDk5YTEwMGMwODMxODcyMTEwMzRiOTQ1NzAiCiAgICB9CiAgfQp9",
        "G2MuMBuiaZb5CB1wkSlr+9MQ/W47Q+xkMmPSZBKKICE0qi5Gpm3J76WUn2vsjvhu1ZYZv8+yPSkYivgJ2h/2uyjErlfUju2jOBW+CmZz26jDUL4UitlUR/oSrn5uTJRC3TvrtZGwoDquX8nZI+7iYTd1F4UnsRtwMubWLBbAIv8DQe+/OW/SpjNTyA8MgLy9H+LMEA/qvcB8+US3wP9wkrphmg4wxxBE9pHYCCoP9fg6a8Bm7YjJpyFOg0dNVolcufH9NdgihbfUa1Qu5TNs5kHDkXYiTl/QcHXcjtDd+7+/sCepEFwpCPj0y7e1NqS3izHVigjOQcJqLxgheUbL77xCoMUtvGuM5Oh4lts200fSP4B2IC5Y5pOVSPneTwtJsgJKTYGyQkz9BBXf2kB4208TOtF4VL5KvfkVJafXgPLalT5EMthw6N3BkNz2WlwowN8ddtOA/qn9aHl54+rzNXujiExLLGJZqYkb6ozRCpePp1LBeGyRNY8lXnkA9a89l1ay545vgXKzMUOffvdSNfdRg1oHymovy0Bsl7gQr8Nc4DEv9n6KwZprsJGx2b3xfIexzO4XhWC679EvrsN0TbbHUO6x0+tdCasp8Tw+sXpGSjfxycVZUtQSRr0XyoW/hM7EbkkOAXNqjnVbGWIBrU5iieCPAnHYOXugR36WJhs="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        val pointList = LinkedList<Transform>()
        pointList += Transform(271.0, 86.0, 261.0)
        pointList += Transform(251.0, 86.0, 261.0)
        patrol(pointList)

        type("ambient")
        helmet("mcc:island_cosmetics.hair.dreadlocks")
    }
}
