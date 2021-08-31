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
      absoluteVec(330.5, 35.0, 492.5),
      "Chase Elbongo",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNjQ0NTQyMDc2NywKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIwMzIwNWJkYzkwMDU5MTFjOTBmMjAyZGM1MzFkZmY5YTRiOGJhYmJlYjFlYzMxOTZlMTYwYTg0YTg5M2Q2NzYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
      "kxbE3uMdcwcQIPrmPuLZNZ+8bEHlZ8lMXFnhcOGikxBDyZUuSEjvsXrpGSx77lO2LPyXi913sRkRqNZiCuprSqyBNWtsr/IkZunIF7Zd7Em2sANDCIEKZocCpnjr6NQc9pB/Hw5dontZNHIn+An0t0KnILqCBeQMasA8wqwiVecMw31lxZVuV+3fAj0Y3vw31XTtr4Kc6RzpbyFZHLzTCU3kZXg4ucW1b5an97yxtNOZ/0y1K8cMSM7yMu7r+5kahtClIaNZS9xxB0MUE377+GSPOKiGXCMMF39Tk6C4Uqe4ky5EH4LgYnMsvLrLwqrxHzJ8FlXAbaUftJq8FIwcRPO4k64Xi41R9dlYpTQ1lyUmO4/oCyGSqtmvgWUDjx8/cQRwsM+FEdlMv+vD6G3CMXgaD9xLttEKJTUtNmlNGbSUkhkz0C1pEDkE9IKasCI12irHvfo/3WcuzAjjBKbw1gh/v/l0lkamiGqKlDz4U3O2FLXrnX/WSXLt4gRUxDkKzgseqUHr1M88Bu3j2RAhziR5CesBZMSZ9At26OI75furQrcu1ZnDvUbonaQNX4a3/p6DZ1JAPLbjnnMo47nk3vkVmuOY9t9Oy+f1TbMkahfGm1LJcIZq3pClyzH58X9xigTGuRLNaSdOXy8EzAotP+iCXZxyiox7Ebe4OBGue6Q=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.milestone")

    type("milestone")
  }
}
