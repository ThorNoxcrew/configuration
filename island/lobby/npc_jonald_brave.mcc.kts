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
      absoluteVec(309.5, 36.0, 417.5),
      "Jonald Brave",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDQxNzUxNTg0MCwKICAicHJvZmlsZUlkIiA6ICJhYzYxZjQwZGJhNDE0YzkwOWU0NWJkMTgwMmY5MTYxYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmlmYW5pIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y0MmMyMjU4YWU5ZmM1ZmRlYmE1NGYyODE3MDgwMjg4YjliM2Q4ZWU1M2Q4ZmRkMzAzMDhkY2MyOTgwZTBiZDAiCiAgICB9CiAgfQp9",
      "MtcYOt1cU7klIyrs09qZY00UCX6rQm9Y+FJtV3saJOlkRFPDwXsFtUV8D+9XmFqfwtcNkb4EriTmgbSQIxRTgWyyXJuVh2PC1qaQaE9hUWBVZ99xv8czlqJCHFEmb6ymvvouw56cNVDESU665iKRwMwVf3aUdfMBfV+WDrQc9yWBq/AVyrT4yFldXZAVUMdgeLWAKDSZsXIiqjIc1JbUaKZZ3/nPDcrGUMRGS5Qn7TayKLdtbZXWnCtSRH/sIwyBxnvHyfli3V9hTnuyGfHZ9T66qcp5Z18V4TtEgbK836omjk3eQK++QufOc8gjSnQf7C88CofeN9/XdU37KjjtNetbwU2Gw8CGQ/KS4uZauOngsTwTyX7Ai4dzRkAHT6rjTYHeT9FqTr002EVxLkmGjCzUYqz1gNxhsTn7iQYRVRTeC3M4I9HHEi471/fSurvkBtl1yByqfN9jAraRqk/UtY2VBfCjtqGsjqe/B5wgAqjaLVZdrKabjGmUEk6XhnA6bNlqtqRCE3o4j9vaOfczLvxJ18fKCy287AQw4aR/qSwsEgN8xOA/rXxqaTwIhG0u0wjN1gbGyiMoO6secMmofbXiJEqR/prmbe8uXvzoaPSGn5RWagDL84DyNbF2Pq3rC1V9z2MNyd68nTe9Gb/nRbVZGHgP0dTERQHIqv7GXvE=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(3)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.bank")
    type("shop")
  }
}
