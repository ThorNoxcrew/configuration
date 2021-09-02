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
      absoluteVec(335.5, 34.0, 452.5),
      "Bling King",
      "eyJ0aW1lc3RhbXAiOjE1ODc4MTQzODYxODAsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NGM4ZDkwMDYzM2I1MzNiOTkzNzk5Yjk4MzYyZjc1MGI2NTRmZjRiZDE0YzU3MzNmMTY2YjBjOTRiMjZmNzc3In19fQ==",
      "UW+8Wk3rTRyTPAseCLAe22qTsI/shQDHiCI60TWae/858zgX7HQ+e3OJjr9RUiylYL0pgq3AXjEtA049DMZuOPAnKm94iVC3PtLNv6/zHHdU7g8kqbM99C+AQR+wHIXaAoWpE1P0nvXcAU/pjMfrOpNRR7RQwte0NdCpTJspxdG1tqoywrERRJ2hNFxnUnfqYyqwwyo1PdjN2toRTbcGJGebfhgQPfcFLKEG/SYV5tRjy4/NmhRkEASgyLAKRxX3KIIeXrW+n4HuKeElSJNPuBVxoECSNvV/6fexuBgEyhzgOstAubxea28//6sGwnC6tCzgQEUB4NjGMYIwborXbeDqGzg7doDlNNMuYicd/+YL+RwndU1wDdP3tmVGF61OrBR/hI9TqoT6mqqTPFyxxMHH3MEdMgVS4AEF4D4io930YIUQwWXB31CEUEX5meJCM4fLgylUM6Xq2vTK/TMZKFPWfVmTSVS2Oco8Htc/IBiMl0EHP72HBPCvAeLp9r7P2VL58S7rSt6+B8WvAgzEo0eq3+voqVfYBL1My0hlLXf032y8e95FLO4TsehWFgkh+RneN86mSfFzh11MspRn6OvrK9TbRZ99zcQ5BKeIOFuNRL1Aev77FfbMcYzXCr953bRXD1ggiemLgZRcncs+F+L/wr2BWp5cJ9xbrB7zGME=") {
    rotation(-32.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "accessoryStore", player).open(player)
      }
    }

    belowName("island.npc.shop.accessory")
    type("shop")
  }
}
