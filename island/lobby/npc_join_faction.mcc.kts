import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import kotlin.time.seconds

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(392.5, 34.0, 549.5),
      "Albedo Squidface",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNzQ3Mjk5MzI4MywKICAicHJvZmlsZUlkIiA6ICJkZGE5MjVkNzM3NGY0MDM3YThjM2Y5MmFmMjYxYWMyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYXZ1RGF2dUQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzIyNDM2MzUyNDBjYzM1YzRmNmE0MGI5ODc5ODE2ZTgwNzE4ZjI1NTUwNjFhY2JlOWU5NWE5MmQ5MWIzYmZhYyIKICAgIH0KICB9Cn0=",
      "NpGXeAOOlLHva6EgE0Z//8oe/ffA9XCSIinkFAR6U7vr+cVh9NE2WnYpe+Y5b40Uj5np4PuFTQzFB+V75fkJXS6eh0Pm2wsj+wNpFNLeKxP7jaNfK+DUwNhIspM3kq3SogmKC3mm8OiP/XsM8nfb3yUmJCIyeXNe1kt7ZBfSTQu45PzbC4pSgDeZ7v0Q3SCNBzi99WF8/xg7cePaxwldM/mYdG4btAUvBXKS+an9r7EBUb/rYsQ9yxfPH/7LDWRA7DjAwQ7Du15s79KtDK/OqITWjUVw98MJPUZxTZ1bOikTjRC/AZ192oJdsVfwU7SVlLgKkDolDTbgSY831J1T0KU4mTQSVoJYx6cfWWC4h5/i6kkfiAqeZi5bwFxR+cn3TU6cVLSdI4vmPU1eY5OmwwnuUQcEHVox6i1eUGKNfUwOCfEN9KbrvnpAoEeGxFr/7rl78qroxUX5+zz3sKHmr6Aez0l3BzkYHomEwm1LYgsC8pu3Pco9vHB6Yg23EKA4/gR3d31ZeNeIsj1gGRmVBna34c/k1/jaZxqyvU7hmGsYFHXCqbiPyG906vV3dqha6hNau45FcLYlFnZeakzdr+4fEqUyuSfChoITvTgvniNWxGTaLe8QK/1Uc8ZQ1ibZriKsvhw4hgCsFnbBRhDk35Y+CDGGw3OLCavoDSpelMg=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(20)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) { player.performCommand("faction join") }
    }

    proximityBubbleChat(
        listOf(
            i18n.translatable("island.npc.joinfaction.dialogue1"),
            i18n.translatable("island.npc.joinfaction.dialogue2")),
        60.seconds)

    type("factionmaster")
  }
}
