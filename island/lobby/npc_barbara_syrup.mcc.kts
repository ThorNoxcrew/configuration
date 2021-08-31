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
      absoluteVec(337.5, 34.0, 502.5),
      "Barbara Syrup",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDQxNjg1Nzg0MSwKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDhmOTdmM2E3NzlmNjM5OTAyMzExNWNhYzU3NzZkNDI2YjA3YTZmM2EzMWMzNzdkMzk3MDE2Mzg5OTlhZWJhMiIKICAgIH0KICB9Cn0=",
      "qJUmO/A3GUU05HTeUZg9rDG2V41OURHDVErOK9mpnjWaHI6USZuxR7+jqV/eDoGOM0CzcvoUk24Es6HyWPoMsGq/w1XSqnazR+YXYBT5HEzDQRMujKfYMrPG1/qyjuz5/X6q/pHLQv5GVXk4qvrPtaPYt1DpckUjmZnDhVxK66socR0Lr7BzArvpvABV8B3Iabq/HHZoZiRRCnFBX3NKxVPtpeCNyjtfb+KmXz6cBJALAPqUTOktdh7gSA7vN8Ty9Gi2XdxlcbAIAqW+sF7zSop2rERVFv1Lta4E31p2HLICoOchmV4/0jj86aiqLMUw9cqOcmdWY975NaCPUejhC0ejx7LVu2f+hn2V4oA8WRz93eb0DALG2tF6Dr6IWLqrGW2fOI6/zp7McOMLo2BzsQgwiRaxY5o/H4AlWOxFCzCs5vLFFWuS+sgPREaqAdyKFeEiDccKR9/bGqeGQP7XUfCPyJousKeSyf+0pgPDsHCerxII4TbYkzESPOuOdmHcAM3wzuL2fj931oi0vhZ08Amf02yCfpwNkQNy7p1eVJHoe+P1UUYVWIGIc3LGdZcuPbbbtOkkbinM8vWJJEbdQfOeZ4jpu7WkLDxy5NSoljuiqCwS6FebwF0qKcds0lYYLI1lglSs4ub4SXytdpsUQN8oG+/Ljx5yEDcB/qmZ5Sg=") {
    rotation(-180.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    helmet("mcc:island_cosmetics.hair.braid")

    belowName("island.npc.shop.material")

    type("shop")
  }
}
