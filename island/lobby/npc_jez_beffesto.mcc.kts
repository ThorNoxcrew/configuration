import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.ShopGui
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

// Bank Vendor
    playerNPC(
        absoluteVec(315.5, 36.0, 422.0),
        "Jezz Beffesto",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyNDQyODk3ODU0MSwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0NTJhZWFhMjhiOTNiNTlhODJhNmFkNzlkOTc4MzdmODI0Yzk3NTc5ZjgxYjQ1OGJjZTQ5NjkyZjdkZDE4MmIiCiAgICB9CiAgfQp9",
        "ycxWhkSXgVkROoBpAmCCpfmIUQBhnz2aSib7qEF0+u3Y3/DL8h+lr/1JFnFo1KR2ARjQr8DO1YbkqHVKpTD1JHcz5wINe5o39S4g68V9QPPmn/HW35vEJjVNWHZEMxUC6BR4mxfMha7ao9MsKE+W7BqOZjNa/01fa2We2fqfoMdR6UkqIo5PoDlT+xjhLCJwl9VzMojLoNZ3335mm+kmsSIiW6MfOctIeOAcDx2MAGY/DRorv9cPaXWs+QRzopDo+23/8EYX2ya4xvbjr5mPjoZ9l6Z6o7CpMMB8qNuTsMsbLsW98hxFGzhYOGjrIJJ99aXzeQXOdhGwOvDrHz/RuvnAhNTIt1fR7QWGe8d+zCJNYUD8srYLTbEzWW63e+bkE89sTS5Xsu4VqlS5iJI/I23FpMZnvBl/NgU94pK9OW0WZMSPweq+UDp2LLrN8E83Ma2e4QJ+3x4NyBbNwtuaTHGlktvza6YSeQHK9W+e268bFeUslmSNqJNzAbirwOkksCmPT0NCM7A1peerXZUKN1L1smCYLHWzWhJWtqDlcstVaAlKn78f7l1hBNY5+WwIP9jquthmMQsGz1fqVVn+6cv8azqGpieg/RFY4juiNKOl2BT7J2K+Vlntg5x+RIeSpCZk8rp5fhS4LKzAUqIcR5F63IDeye9fYIdDuZxl/o4="
    ) {
        rotation(90.0, 0.0)
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
