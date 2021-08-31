import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.ShopGui
import kotlin.time.seconds

mccScript {
  val i18n: I18n by inject()
  val shopManager: ShopManager by inject()

  playerNPC(
      absoluteVec(369.5, 25.0, 484.5),
      "Mia Wattington",
      "ewogICJ0aW1lc3RhbXAiIDogMTU5NjI2NTA3OTIyNywKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYjcwNzMwN2NiOWYzMzc0OWRjNDQzM2IwNjE3Yzk1YWE5YzQ3MGQ0OGY5ZWZhNTcwODE4MGFmZDU4YmFkYzkiCiAgICB9CiAgfQp9",
      "Qo4UrkmRDVw/jrbvN6A4Tn2GEdPS6XT4kmNp4RFUBtb7ooO2zIWSLf02sDnR/QYTC2QfFX7z6BZUMi9lp8773jTx1w7gqNJaE1nmxovQNZGlmMM6J82MHJRlr0Hb7pYMU4ExTD0duGXbMQLj/lzxN4trjH/QEqdDxkmLUT7CSDj/zRmetl3y4BsgHSxcQWRnf5L+ce98fS3ws4HhLlgJWQCElQ7rUuha8DYsl3pMG5+RDidlURS/VcdjcZIE0OxYznDtB4vLC0tNWKIJqbSAOtxb68PBCZGQzLucUCT503BSbvckjX+YSgiLk5dGlwBBd8IpP2mpFw3aGMVRz6LFBgNRKMLYi/dnLig2JsYrQfD6rgMxsvhjZxYkgYJ5jZxJ5XshbkXHuKvnL5zHbNgc2cmeeIJwf/sa5mA1cQXfeCTwTFD4lQFljgScMT3zwLYs4R9CHkbta9pkt89uCDRyNrislMv3ZGrZWvxZJnAJgI0DXzUp5z2gflYU7k8U+snmn27yi+J6JvbqgjhTe7Yjk75dNdtXh36j5faNnZqLaMgoKIq3Isy++amX/9ay/4WA6GHLOq+bd7FJQpz0LPsFJF8vrvZUYl4oEytu0zzcfXERycSwsXlTvfALsaNGvg/w0nwqPowc8fGXLojU29nLev1KOtPQDSLxprK7EBnfHA8=") {
    rotation(-90.0, 45.0)
    lookClosePerPlayer(4)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.gadgets")
    type("shop")
  }
}
