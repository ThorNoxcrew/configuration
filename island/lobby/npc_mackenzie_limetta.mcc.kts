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
      absoluteVec(297.5, 30.0, 453.5),
      "Mackenzie Limetta",
      "ewogICJ0aW1lc3RhbXAiIDogMTYxMDE5ODA3MTgzOCwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzgxNDRhMzAzYjdhZGM1ZGViZDM2NTRlMDMxYjA2MWFhMDI1NjI1YjllNWY2MzM3MmI5ZjQ5NzFmZGM1NDA2MSIKICAgIH0KICB9Cn0=",
      "WEvkwevvKPvF7/wG8Ee+oF0vdK0/Mm1eDQX4Nu25gcPjI7PhsgqMkOBB1fUKv1K5EOrQNhlcjnoiMUN7ykjz0SCwf7nd9hSkMQrSzU385p5nOeYQ4q0UrRs2BH5d36VNj6ld5y8wlStcBrVENNZCG2zNZawYyHLSNmWOqfRSmN/q39gZaUhaI1EghpGEP6T5W1Wc+Sv7aAnq8bMQVUQ9oOhrEs6Vjz1ulMpN0FbLkMaiNqhOmw72lGq8HYj6Xu4xhNsGh34i2QdjlM21npT1knoFTroYlTVGQ7U5cEdTvWhwHX3kIvBZWyj4EmAgnHSbAMi5GmVnDC++Do5DxxL+dFixPBA0l/3Tan4/prhCJjfhK4+NOMNXncoaYuW+02a+7KNR2k487v/0maTqbttQgk4KoLaF5btC9LnL9NUoImy0+abTICcvCvH7ey1zilbtDRDmdoPzISP7mUBSE1NC3RFeTFMcbmuEQSukmXgu5R4onhGT9Pz+f2hJKrYFLRVK4MAtpemHtBNtw1DUcXlJcS/LS/QRKgNB7/8FmHDgrf8bYh0pLhs89pBb5NR1mtIqo89Msq9gAywSi1P1M2m8WgaB3d50P+WN8TRnDYzaSStc9k/UjR6EjPwPkDSxXzMnNsO1Qrhn9jyG4OkFX5wq5GXTnSXg1sdJDXQCGY87nEk=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.auction")
    type("shop")
  }
}
