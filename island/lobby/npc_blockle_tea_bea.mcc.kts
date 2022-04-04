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
        absoluteVec(333.5, 33.0, 424.5),
        "Bea",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0NTc0NTc1MDUwNSwKICAicHJvZmlsZUlkIiA6ICJjNzQ1Mzc4MDY5MzY0ODg2ODkwNzRkOTQ3ZjBlOTlmNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJjdWN1bWkwNyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMTU0YWE5Mjg5M2FiZTkyNThiYzI1Y2NmYTczZDIzMWZhM2EwYzliN2U4ZWVhMDlhNDkzYjEzOWNhNmQ1YzRlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "fwoFbwwGOHBeavFuGcqNG/jPX5Z+DDDSvpK+l6+0ltqWDXVvz+uGaWt5Mgf6DeFaLpWoCinmmG33nYUQjLKpUnS37qXrGr8HD9OBs5cUX3CY+W2k8VNAvpUOw/a9NriHOvSJNta92/wOOS3DkD4Yqq1oEPbtZHvHuonmtUPRRQtxIT1aI80fgVainJNFtbwnpW5tCg3lZUQUEqVyAAiN7Nu/b8ZuGhrwTGkZziRpsTy2xe2ednrY25wH1Z2vlDGBLgi/H4VWsKrGRVlBtb9GsjmAP9/GH+OwiuQy/+Kuxu4oxwr2tcbrBlkpyzsnLWduJy5G4C1z+MrUiMJ1IlcAty9lvayjqQ6LQsXNApglDlEQnhwEzHpvDdIK9z66Bt+lGoUIYL/UBGKqGtuJ3tkpNw2hGxdxkPGzXRH6SjdTrwp+VhS/BMfln49KIsQCdl6MhlyaTt/jxd5x+id51nJq/4vwO53+GB2L01g1ykMlEE/LMZdRI9boccE94DXKanI/Lq3nYluBejuUIYsXcfoFrKjapVUcFj1Plm94hXU88lf+AUe60XjijzQpUFbzsQjQ1JS3OEKIBZHwxdwLSY/MVujpfjX6X3Jqbf6JtCWcgXGkcnGZcvtN5nDrnQ3cCeQqC456vUxU9u0xeNz2KYe2aXIFqKNlSx2r8nKDnu7bt40="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        helmet("mcc:island_cosmetics.hat_npc.bea")
        offHand("mcc:island_cosmetics.accessory.blockle_tea{display:{color:16756962}}")

        //belowName("island.npc.shop.coffee")

        //type("shop_drinks")
    }
}
