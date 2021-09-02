import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import kotlin.time.seconds

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(391.5, 34.0, 549.5),
      "Isaac",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NTA5NjkxNywKICAicHJvZmlsZUlkIiA6ICI4MWU4ZWU1MTE1ZmE0NzU5OTU1YTAzMThkNTNhNjViYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDb25zaWRlclRoYXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzkzMDk5MzhhNTE3NDBmODE4MTEyMDExYTI0OGRkYTgxNmU3NTYzNzY3N2U1ZWZkZGQ2Y2I3MDc2NjY1MTA4ZiIKICAgIH0KICB9Cn0=",
      "F/h3mV9WN7oMb8ugi+afVqFwTNrCFxE8Sn67sbEf7CmH3ILpw9Mr2xHRE+BaWbCibrEN3B65uUXtxlMsmVnkDvFGs0OCsnxLVjfaimzyU8/3Nf9xEoBT613eJr5jBcIfK4C4i1J49yUOkwuabiMi3SNwWzklreDaBD67MDDKXwYSQiPf5J0sYNXxUwGgGoF4MfUKijpJVCVir2ggHFGZN/54S8A80On6Skyrtx4IvD78SlEvaQFVTs0XKLAU82f0mD8tR1w6uVHFS6KA9hozxnEGuOYp8KWPKVYA8R18W/JGfEmOnpSjUaxZfk2+jZYqorY5mEszplMaOlS4VlgvfJRWWqLSCuwNmEUmRNFi55ZodBvBrlwNyJm1sb013jBo+lxkrGpmu/Iww3N8eWNcjU7AmYuHZH2ATYDRoOHlZvlYAeqEgaceewTbz5DPxtrrn7cdXMO+wKFH+rLXvxMkd86SW4Z7WhFoHIO4l5cUYueTcObXmgorslE7vk+3OETzN1X7v9+yefcbJVKHdgrZ8D55K4Da+jJBiE3k0fN64nzCKmvvsBTKi253kN2+CjU/cSc7Bgdih3x9VOvWNEpkapfT0uXHEuqXHh7cVTK49mN28SFl1kyImFyvhqQwswVUb/yHBW0NGSDu9kwkhJs50hKpivLyJQ5FBJF7peZ+ygk=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(20)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) { player.performCommand("faction join") }
    }

    proximityChat(
        listOf(
            i18n.translatable("island.npc.joinfaction.dialogue1"),
            i18n.translatable("island.npc.joinfaction.dialogue2")),
        60.seconds)

    type("factionmaster")
  }
}
