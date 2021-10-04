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
        absoluteVec(263.5, 36.0, 470.5),
        "Weezoo",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjU2NDY5Njk4NiwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjlkN2FhMmM2ZjAzMjI4NTRiZTdiZDRjNjc5ZDYxNTE0YzlmMmM0NGVkZDk5YTg5ZTEwNDEzZDgxNWYzNDUyMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "tqn/btb/DQ0ptYZ6WOmtlek+m1ExvWEjw8Hdub6++LX2YXidShtE4XjSadB+ij98O1u8Ygj5clp5Ven6FCfS/pg+fSVZU3jVOnyBmm45d1O9WQdXsq7F+5YEQ+vuYtADJKn8oR26LobXDwZCm12GAdksx7/eNsLNfqPCHPKC4436ZwK9jvMPp9tOjNvXS0tkw4iohJ/huJckJ7vq7bWKlNLLccoOxDHGMBAn7r2se9E1UVC898lQ9mWcN8Ybkp+3qq1wyGdi41JHxvIxjt25uCEe7a8sTwffefgy7NQMg5XL5p0hXElfqAbqk/bWEZ/w7hD7mQDxHfLu5h28oo5tcJ+vvAZ9G6O5gA4UCckwrRL8mmqAm1D2uonMMGc9A/evdDqiYprz3EA014WoVYnFlqG2Y2U6gZ9A5NA0r9i9k8sYPDtzdYA2nE8KDqKtbxeR3DGvabOOUeIQpSfWr4l+T6UNwtRY2p2Bu1sE755XAv8Y1wk+8YisxMNtF0K4bwRfd2IgyMz72hYqB0VTzdFtRHtNgIN4hU8nrtJZCX7RhfI65Mwi2XCVvBiPal3LWboZaT7FKhy1+ANVASVer4zrdl5pggEBXL5ReVihqIkdK21wLf6nuyByj4arIaQHLgQLBiI53uFxYP1S2y61JM9+sdMPQvCFFAoUPFO2gv+5SiQ="
    ) {
        rotation(-120.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "particleStore", player).open(player)
            }
        }

        belowName("island.npc.shop.particle")
        type("shop")
    }
}
