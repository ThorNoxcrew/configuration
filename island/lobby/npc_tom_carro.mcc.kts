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
      "ewogICJ0aW1lc3RhbXAiIDogMTYyOTE0NDI2ODMxOCwKICAicHJvZmlsZUlkIiA6ICJmNThkZWJkNTlmNTA0MjIyOGY2MDIyMjExZDRjMTQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnZlbnRpdmV0YWxlbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTI4YTJhYzU3ODI3MTE1ZjU0ZDI1ODExNTVjZmNjMDZjMDQ3NDE3ZGY5ZjcyNmRmMDE1YTc5YTQxYjU1YzI4ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "jeQ/hW4UOz70y8GS/YINyP3yq0f6Tpy/xvNzRHKIikKn2skCom/OF1Qx/4yQRnYn1Kd7AlMqkLrxK2m2k/iK9/O02E75Xy20xi4QfPVZr77AOoUkal1EKbliVZAYpvJVtSA1bZWVoBUWSpacKFm8btNIofiF8N59rXGMkPiEottaEoKdaCernrufrW21LPW6hOr1c0FHy4UC/Pd41L7iWk0ChzCA8uZru4788+2UK4lWMES5ovfbo9OiPETgOD7WFmpwonO6xP7BrgPB4zN2W5dUlLXkOV5BcRzi2BUt2ThNubHeilm2+S2Jcn1dacApy0xX9BXH3VNtBvnT7dYh+kRiLX8JTuyavn7imMu+tx7SriuyzrSxuPABgzml23LNLml976Clbb7kJUNtYCGJ77UV4n8xtSV2C3T/99X9GY6fJneRVrFBxpNJ8/vZEyG/tCeTFkobezAtPwN1PdYHcb2sCLXbAYmjLYStKuYp4uDoMXOSbX/adHDBI/4OYPntefiq82kzJudaRFwHu/rH8FQXjmn4TtOZxyM++aEnifsHibT4X/NdC9zMXeddBJY00+aApRSqps/ktz9do5jUYELb0ImnW/kjt+FaKuWrc5AI25gHaP5l7wgSyJp8bTWK64UvRx9xXPQRBR0PwDL2TsekFGkgAFUMxD0C4QjFvmQ=") {
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
