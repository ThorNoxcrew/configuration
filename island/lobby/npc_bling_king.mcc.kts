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
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjYyMzE3MzY2MSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MTE5OWZlZThlZGZlNGFhNzcwOTliYzA0ODU3YThkMmJhMzYwMDVlMzg1NjM2ZjRlZmU0ZWYwMjE4NjRjZDM3IgogICAgfQogIH0KfQ==",
        "vnDFn12YUrGKEfmAyzcgzUXreKyUVyLO6CcYYyp9qrxucopmuNbYfmxm5jehl8t4hjLXKO55zLOFgTCsMPxVt3cluMViVetI8NG3PX/ZnMgdZWOk8tWfUA2rUhcbIehVT3HkIEnu5vzEwhlobUYLSER8+qF0OEWTEUoXiophDFfKakw2zWazr4Cd7J1mANQIXqjQTMbL9HSyYkc7zrcoDZW1YXDEnVQEjRS8Y/TUYoCsGNWbQz5c0+7KYu8ky13imjr3IQSFBTc4MhIft3p/XdWqugzrhvd3a4GXY8JvsNrIYfXxR5gm80o2M8Df7mNnm2kX3sYKK8t0tDMwSdWZzMAkZmg8r524qf9ebvW1141zQqWL8WREnUHtMZak0cAeDT+n2OfHrr7yB0WcGxy+7cVw4R0ynjwIuhbYFSWuQGI+MninIG6nxc0pXaICXdQKBoIzhiKrEnxQXN0rqWPGsskaNs/TBd8ZxdB9FUWLy/EVn0oogqvS7mAZ+2FxAMzxclCplIeEtUwWShm1gUTHXz0rdNyXujD9SmLI/N2nxP7ewR0RJJWrQbmDzKM5EdahlSQ77aM0p+rlED0iC5upAcV/g17z+wfPy6lk+BygouE3UOQnNXcSvUXY1WBIUDWY+EKPwoGsX7Gf517Sv3Ll2bhBqaxMDI0eKQ+an00+f/E="
    ) {
        rotation(-32.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "accessoryStore", player).open(player)
            }
        }

        belowName("island.npc.shop.accessory")
        type("shop_wardrobe")
    }
}
