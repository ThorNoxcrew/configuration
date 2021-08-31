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
      absoluteVec(284.5, 38.0, 510.5),
      "Doug Printeeno",
      "ewogICJ0aW1lc3RhbXAiIDogMTYxNTI3MDU3Njg5NSwKICAicHJvZmlsZUlkIiA6ICJkMGI4MjE1OThmMTE0NzI1ODBmNmNiZTliOGUxYmU3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJqYmFydHl5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcyZTYyZTA5NTdkNzZlNmZlNTRiNTg1YjIxNjQ4OGZkNDU1YzY2ZDFlNzVkNmMxY2RmOTEwZDY0NGRlZDA5NzciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
      "SUaDfE9b4AmQu0Nr9fIIFFQNrqAarZKkQ/QgtUIPIAaw9XHmeSzSpnvCUayHwc9z4F21bO7Aum+OMVY6AQMDbfOoiqBMSHtr0f29O3nkxa7lgu7Uk0KXPRiiTjGHo+xwci/LDcbwAf/dD617hXvUsQt+fu6NDjPyi0NyaAM+LMLEvKWNqmyWg9F0LjjvtiIMn50Tmg0LyItLKb8hOkICmGStbFHY5YArhnnmB4bnSk8tYWXHCpZzQgV1iAYxM4P+w/JVzj9KiXtxPh5EVUx2lMUDEdU2uF2KOWjhbXjaKYgvR3vZN6T35JBi6n5Hm//+MhAQtpm1gU8dN8mvCizSAhspRk8u2q9IjBqwhavQvlHMHCFUcjWx35aslwq6sIRMzmUtwPUCjhsrFQ4tJ2C6CL/pk3kg7AKNf36XmH4OYnXsJlXRCyyfKZRjoAoixQhEP+f49Vttxp63gMOlXVZJ/4YSxkv0qWLbZPIyjs562b+mUW9UE5AG6tiB4/Nkf4I723pe87TayZQJebI4LeiF6rf1zZYJUwBfljpCui/2lvx0iD/368y5Teyks2EeU8l9/XKIpBGy/Jat0BAh5s3cGrzzDI+Cb5wGCJhMMsQJCaoKO7JXGIKtYu+DGUh23Jn26uyi6n6tSG9WS6F100hjM5i4zxx5JYFXJCOgY2zV0B0=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.coffee")
    type("shop")
  }
}
