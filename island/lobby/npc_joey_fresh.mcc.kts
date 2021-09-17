import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    playerNPC(
        absoluteVec(389.5, 34.0, 570.5),
        "<glyph=mcc:icon.emojis.sweat_smile> Joey Fresh",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NDk5OTgzMCwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjIzMjRjMGEyYjgyNjU2NmFlOTJiNmJkN2M5MjQ1NDc2MGU1NTBiOTM2OGQ3ZjRkZDYwN2MzYTBhYmNmMWI0OSIKICAgIH0KICB9Cn0=",
        "XZVUbdjexn8UxA1U3lyPwricttYR5bhmBOj/D2DHi8fkLO7uBwyhXPeXmKHD2aKDTnUfo2ltz9/OEBOk8fYGIqjUesLHQ5UPuwmCcLW2YTvBHaKAUj5RHfiLXaQ9GE2s+TSVFt1xy0MfBlNmPI0a/tNaaHanwHQU+6zaaBJKeMEwgPGBVQQwbns4ANJhvrAHHtrbnSKRwrnpZnvo2AMCjNDeiZoeksHubOrlC/0YqCg/aheUoF3e/2iaKhJJmAtARFJJ9907944K6SObjTaYGHOvRBpkLcIz1GFGLbskaHr0WGK44jfmcWyFGlU2fUp9zxAVMCGyZSj176bMAtf5DIVvcNMmFyvxwqmzSPeqRIn+je8KR9M0JRofqlNM8o9dZG+ivVKh3uRz3n+0bNvETLqrjXfa4wON8BXBt3/b4MABkWBSh+Ut3WR1APbcmDQ0AOOwNICLKG4uzOPi95ZOwNii76Xyo5DGj1s69l6ixYVPcdfWX6ps7NiKU35UJx6HLOC76hQA8GEfY92ZVvALak3C4Rz4T3kefvXkWKa84AUFEx6JaMPSQWiGn/T2p+EZT3XI1DJ6wq94l2c4lWbfzNBwoHHgwM2ienK2MX0JUXtzpna83vu0vBf/QY8MLYhgfwi7fLQVpKrAhM6pPKs3DK18BQc34hJGo189T/qFlDA="
    ) {
        roaming(absoluteVec(393.5, 34.0, 567.5), absoluteVec(386.5, 34.0, 573.5))

        proximityChat(
            listOf(
                i18n.translatable("island.npc.joeyfresh.dialogue1")
            ),
            30.seconds
        )

        type("ambient")
    }
}
