import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl at tables outside of diner (table of 4).
    playerNPC(
        absoluteVec(331.5, 33.0, 420.0),
        "Bessie Moobell",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNjMyODQzMCwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NjZDEyYTliMmViMWFhMTIwYmNiZDMyMjE4ZDQ1MWM5ODczYWZiY2MxNjFlYTJjZjllZGEzNzgzNjU0MGViZmIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "epS4HULFyX47CP5lPvmKxkrXkcdIN+BIBCmveniX1EfrBCBiAWIAIkv3hlvbwGmC97lRIxnoDR4gRELPD0vN3LBVKF8brVVDRiDIhaie+yIAnwGDfeX/kgs1cxU2Y90TZ4/anFxCwcXwTdhwqM6xwOnaHZrL2nxgMHLhdrGvqyHfnBEYaIP6WvSMYrwzaRPDCXgnzvaM6YaYpspoWzVf/feE94kOasGiL+N8Cqp9hi2m6vOi7jEgQ5isVhIf6rv29gtyBzZ1bXB/LWVsDSC8zviOrKSFZlX923mG2XGT7iqqoxCgK8BLaET1fCW543Vvub2vng1uEVFvL3L2gU4WfWOT40ydcBtDIsKZtcYP6CFU5UDgErGOx1gTRNa7/tJzCm6BsBOxiQslkGR17ejWRsxQqlcdCmy0hKUdiqWan0ThV5uY8gL/N3Ql2312wvLmaXz2u1WDWPkP9AeHHbit6dqmsIMARBAZdohmKJWRlaIEZ+LmDx2h1fRX4Cl0GgknihEhzgPCBXbNVJQObi7SmHDKydmD7lJhycPClPx/GR0I8gPOV3a2wMsMpClYfEYezD80TpAffTRYqhBJZDiPUOFAjb/nuVqbO+xoJbRZWQjFknQkixM97HAZ7un1o0D13iUJNq65Yv52kuER5sLMZ8gBvXrQrW05AlkHzUiKMEE="
    ) {
        rotation(180.0, 0.0)

        type("ambient")
    }
}
