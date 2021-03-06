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
        absoluteVec(358.5, 32.0, 448.0),
        "Springsteen",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMzI1OTgxNzUwNCwKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMThlYTRhZTA5Y2JiNWQ1YTczMmVlMTc1OTU2MTQ0NWFmYmZkYzczMjg1YTE1ZGZhZTdmMTdiMTM3YmU2ZmZiNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "EvDtY9q5SUBayg9SwqjgmnEHm2tDBMpMxVpP5jR07L2/s6OY0o6KOtj6UwLg7OAUIRRUabLeGVtbcDb/090M47qgzuMhtTIRkSDhkl8rqolXKoD9SfByB3DHsbDcWCeJKQtYCLm1X/6nvcg6eb/p0jz/TJSmUUlUxocyp1WHIzNsRZ4O0HfJrpsfHsRNfhM/NnfBGtsIkEaQ1/bA2+olFiwjV/MNUikQdpW+MmQveozE7e3OLVgrtDVY+kIcMSWhM9yEdc7ha3MTm8+OxYBVwBjzcODG4HtvXwwl42Zckce/dGGBbJ7qE553r5LCMBNIZVt66Ez3k9qyAL0wVOG+WZmmfDYBSW44lFZ5r2XdY4uaA0N1xu+LyB2fa4m1n3n8dRKQHnss5TRr2OsGlVpo9ufVO39ra2TeGMarmuXI942ZwNQCakQB72N0cJnAC6xRB/aF9LwhBLVBA8o2oDmYygyOWtAXgyFr0kNwSum4xv5si9ROs6qOWwyieK+mknmz1BwHQBbKbHuAG1FGWnwfPwQHOi/Ru7ftAg8WkQNbfAk5XkUbSXxLckIxE1uVPLz9tMuKcFCledNufuuzPShEOqjjhKJJVn2qV7/tGJ9XZmwWQbNan2fCbKFjk3WvikfWu8SYUgN1ja8kSqu7vaoz+bai4V/FJNmoqjGVIbkamKw="
    ) {
        rotation(180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "musicStore", player).open(player)
            }
        }

        proximityChat(
            listOf(
                i18n.translatable("island.npc.springsteen.dialogue1")
            ),
            30.seconds
        )

        belowName("island.npc.shop.music")
        type("shop")
    }
}
