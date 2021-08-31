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
      "ewogICJ0aW1lc3RhbXAiIDogMTU4OTIxNjM1OTIzOCwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Y0OGU1ZDM1YWI2ODU0NmM3YzVjZTQ3NmE5YmUxMDNhMmNmYmI5ZTU0OGIzNzhlMWYyOGNiYjZlZWQ0OGMzZSIKICAgIH0KICB9Cn0=",
      "plqgsYCKjA54ZCSHw3pq2N7/lB4qaREDYrJpR3tLNNRYwdHBcdzIS6cg52ZIfpmQNCLajVMWcRPlHxlztfGE7erHTUZtxpsZRJ+W9krSOqjRDOFpDnQS2sSNmcQRpF6ducsefmORPK+5bOyGwzZwjUGn4f1u2HjdkMdTB8Gd56+D7kFubeifR+mdSjNvX1PWNCBO6nMcR8ESc88Z650/NeNo4zTGXNH+sGG1jCzkCTnh4cbXti8fFDygv/KKFJtixCBFfJQ5eIZqFMNshDu8SvF0NbcKCIX6oqwfh2sHtAcolpqTPkbHUzwfu/G0qCt/Bov0kSyj+T9PeAAuPGjcM8F0VoY5EyTVQVUrck9QB81fgapUjfHNIlJAEsaQORi7GNNKpwMZNGvjz6r5bg6PHzZh72RPDjdfM7ZELb61dCD/WFkEBBy0xkN8bsF99fhJ8hyGd9oGKDZtqnJ6QJO81Ct8yjQLHLYwk5jKQmO/ROopAmVMouAde+UrOlgqi/0pfvSKdyLnzH17XLHnjYzIqDbjAisDGxFSHj9T1n6kjvYWELLyCtqZZ2psBXql+4xnWpDRxrH+xdocWK/sgLhtJ2Q5g1TrXOGWYfn0xyPxrC4Cxbh+bJJVNtPSfCror6emFlUuOlX8VuamLenpWRdtNADifjiiBt7IBQLkV/ciJ5s=") {
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
