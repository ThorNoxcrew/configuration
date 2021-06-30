import com.noxcrew.mcc.commons.server.util.sendToAny
import kotlin.time.seconds

mccScript {
  // Player NPC using a username for a skin, first string is the display name, the second name is
  // the skin to use
  playerNPC(
      absoluteVec(-270.0, 36.0, -774.0),
      "Join HITW",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzM2MjA5NjgyNSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1NGRiNzY0NjYzOTI3YTFmMDE1MzIzNDMyZmFjMzQ0NWE4OTBlYzVjNTU2Yjk0YWRlZjUyZjZlMTllZGRkMDEiCiAgICB9CiAgfQp9",
      "CRWRcMbC5u0E/5M+9Yjv2766/Jz9RFHzQqAETfeAxGwV0J++KeaAWUugtdC2LfgzgYHaZ+rbT5ZzaL6MBwzhcilqptEwjS/SrX49mE3iKx+Mrvm6e96yHI0qy7qs998sD429R8nFtmEZ6JDfxao1eDwS2tMAqmuI4HTHY5jF7iHPtEUIwHwxO7XHIsUAmNxJ4K4izm8qb4r511zAm7cwFI4YbP0EyTIPwqCfkCU480lDCweemb1yPKTnwl/gz85kULga7/nFRk8Vsir3fDphOJ22dDSRYVPfjlbqUz/wQo2mMkKfMG6BOXilo3657DGxshzP4nGqbxbwHTnM4vDpNNeC40qHdwbmb1pJz+4c/vKMzSfcqynQ0EIMn/BcmJW5hjIj4AeRGR8M1Cc5wwr+uVvkIxW1kAXQoPjADNp3DBh20XDSFzx3zQkZaEW9lJSjArhA1RZMvhGa5nN9WiMTDS4DQNSTSwnnhRauN4mS+PFMVq8hRFO9kvucc+tk2TL5nTiSzhVPoHdzem/OUUY4ayuLx2TvHgFB0EjOrHaDG5F6Zz9rCfbx8qTNAcJxQ6OShDp45p8ot+Cb992VUN/YKXTAVOAOATPkCQX8Z7AxQMRGKr+T86GuNiGUESJXlZLiwtVbjcIRIbRtmnW0HNu5qqkILlKN340bl8etrcfi9VQ=") {
    rotation(30.0, 0.0)
    lookClosePerPlayer(10)
    cooldown(5.seconds)

    interactBehavior { npc, player -> player.sendToAny("hole-in-the-wall", "island") }

    proximityBubbleChat(text("It's super fun!"), 8.seconds)
  }
}
