import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  // Below is a Player NPC with the texture and texture signature provided, you can get the values
  // by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's
  // API limit :)
  playerNPC(
      // The spawn position of the NPC, must use decimals
      absoluteVec(395.5, 34.0, 587.5),
      // Translation key for name or untranslatable text
      "<glyph=mcc:icon.emojis.scream> Vin Petrol",
      // The texture provided from https://mineskin.org/
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNzczNDQ2MTE5NSwKICAicHJvZmlsZUlkIiA6ICJiN2ZkYmU2N2NkMDA0NjgzYjlmYTllM2UxNzczODI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ2MmY5YjA0MTkxNjNkMjc3YjIzYWMxMTY4YjQ5NTkzZWFkMGNlNTZhY2E2OGQ4ZGNmMGVjNTA4NGQxZjdhMDIiCiAgICB9CiAgfQp9",
      // The texture signature provided from https://mineskin.org/
      "Bhw8j5HdRrGDYlftaER3dTOqXHhEsNjbcAlWQEHL6ess9M50tu2IpdW6vhDOmk1TCXpLbZDpea7TRCeBFWLHgWJbvpbPf3rHKxkwP1TEjmUy8Z59aIPiWV8Tk6HFZkmP0LPX2p1CdpDLD1fEO90thUSH9738qIw9Q4DapBZSpghInV6PDmDCRUevF6V0ZYspeX3Ict1JA9U5OBUk01FdyBJCptSkfqJ+XCvXfXAejG2bVc0/j7K8lhK5Ql+uZDAmWSfxJacSe5QotF9mUKXbgkTzFb5IiSOxfHBNHvNKvD8UXzjqdNwcmx+4hlgpYIXZZHySIKf5AZfxROvRy83d77/BHJBgWZsCpuB+92Jk9C+h775UTmSj5ncKVUNmHneMApVfjvlxd4KV0xgUwx8XwV4IxMcJjxgx/rYdEzxZYAalyPU2J3MJDOvJDnVPMTmIZiKjPsbziXf6gn9Ya+jCl7SGpScdkm32TITRqF+59rpyNOn308WasjXP4BKPD7Bw8Ctf4jjqQdy2BNzma5wMP7nm5A2j+VvZd7iOdS5+znMWE4nhwD8ykPb58Z1ppeIVRiTPeojx5nWzEzhzU4iNvdDhiGoCd1Wm0TSHd2I98ZalHzixLYTa1wqtYil2iLFF2TQZRdbnyQcBgiAqWwQmpVhfe43MIqb9hcNu1MfLsQM=") {
    // Set the direction the NPC is facing when spawned, use decimals for this
    rotation(-180.0, -4.0)


    // Bubble chat, randomly selecting one from the list every 4 seconds
    proximityBubbleChat(
        listOf(
            i18n.translatable("island.npc.jacklumberdo.dialogue1"),
            i18n.translatable("island.npc.jacklumberdo.dialogue2"),
            i18n.translatable("island.npc.jacklumberdo.dialogue3")),
        45.seconds)

    type("ambient")
  }
}
