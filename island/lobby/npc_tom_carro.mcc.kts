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
      absoluteVec(337.5, 34.0, 494.5),
      "Tom Carro",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMjUzNTc3OTI0MywKICAicHJvZmlsZUlkIiA6ICIzOTg5OGFiODFmMjU0NmQxOGIyY2ExMTE1MDRkZGU1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNeVV1aWRJcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xMWEyNjQ2M2FlYTk5OWZlOGMzY2ZjNWYyMjEyNTE1MzNlYjNmZmM3YmFhZGJkNTIzYWJjYTY4YzI2NjkyOTAyIgogICAgfQogIH0KfQ==",
      "GDdIX9b+Fx4qdmUXrSloguTm4bGyJhV0c1xPsWl157bFLcqnUCZapHZYZdq9CNB6fY9gZw+yBDmmJ3Oh8L2rR1mqI5MbgRlxxiC+juEN0N/NqGHpSy7TeTPMP6/12fvz4WBnJoDN9GIJPt5EfWsBr9D5qy8zsDknMGQ/k6PGCjEo+gQwxFnHMFQlVsvJh5wbt1zDy5nmvcBCbZ2SYWQk6LRTVWmfnir/RXCSMVNER61yDMezchc1mIk5dipgxmKL41wR0Ue7v+lNHNCXV/XWD3hj8/Jt9lwmmUg7mHAtjVVtw5mm/Gk27jHkO4TidjYej+NBG9eC8bj0hKo1P5t4oh36gDShwfTiujf4Fn2AfPnUD7xd+J2D1hOMUV9CrK7LIgniT8+5ZntyRrjgewPih9FWRotCZ7dLmmjqy08rP0wLTERYjOkdKxiruyQFA6Dl7wk1ncQxGxCnCoSlfmsMmO5w+3BeJy87rSjjlg19/bYjsbZCPuLJeE+sCM32HvOzGEGiA1kpPI7OBFha9mF3uuzcUEHDcsEhQcQXccmEvjzYAvXFiTYEFf+QkFI4lCHcOE+UFZLoei8IyhvqkSpebzAAUxzjns4cFRMecp9lnc1yP/S0tdUWuvSB2N/a2cc6R4EQVzKu0SSQvhhQRcizslBkXr6F/m7IbEXuoNaXzUQ=") {
    rotation(75.0, 0.0)
    lookClosePerPlayer(3)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    offHand("mcc:island_cosmetics.accessory.pipe_wrench")

    belowName("island.npc.shop.blueprint")

    type("shop")
  }
}
