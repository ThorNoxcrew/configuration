import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.ShopGui

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(338.5, 33.0, 413.5),
        "Stacy Bandana",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNDE5Mzk1NzkyOCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U3NmQxNTYwMGJkNzU4MTRiM2I4MTkwMTI1ZGE1YmI1N2U3NmYyMTYzMGUxNjRhZjMwMzQ0MTI2ZDNiYTA5YTQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "ZSJYYieptpbn3fRvm4y9MVvqebgipaI9j9rRQL/6vlZ/tKC4gkmRF16OjWTSB726PCAompD/X1AWZyaAMcDKDz/RX+84A06N0NUXkvJewaGDMQGgyrv8g5e/wlANA/EQkF8pQ1jfQMI2xXx4uPLkb5s/pLTXUSisr9xroo2kKEib12/SfCFlh39yj7/5STpVUvid4/yeB6H3h0VZIGJ+INVeVMQ01OaKEOLLXGDjwvHSdbtN4gcG+LM7MoVhjuMTvgnVgJGe+TYdCI6tdL6xwft4yRZLJOl3JI8ZMSpUrNVHU9unt7wvcA7+/mcV7w/f3Cj3NtmwR9rUDYRXj0rPPQljOKzyq3HJL7isiNeDRPKmrzgkQuwfUoRY1TLtYad6iCOtppNmLjkKSxG+2PqVrqWBV2vTQ7bl1Dj7Z58R8gKyW1ykYOb+X1bvRvoams+kai9XmQBHItslNeYwAxMdCzMvg1m0x7hheSfd98WBiIBrAbIJNZ/a1ByXnLh35dOJ19m4oqUdBqQ+8SQcrdAqRGlHYSDBvmrX1WyAbEeWU55Y8LR7RP092OPgkf3NV/VXEMkHRawOAtWNH3Brble0QN4kKzV3j18r5ewzKSHeEgfNABjpZ5XIPIRKOjUK5MYNeuBsTmTzPyb8sGGlPe3VE9Af1mLfNijcoBuQoayyPac="
    ) {
        rotation(75.0, 0.0)

        val pointList = LinkedList<Transform>()
        pointList += Transform(332.5, 33.0, 416.5)
        pointList += Transform(338.5, 33.0, 418.5)
        pointList += Transform(336.5, 33.0, 427.5)
        pointList += Transform(339.5, 33.0, 430.5)
        pointList += Transform(336.5, 33.0, 426.5)
        pointList += Transform(333.5, 33.0, 432.5)
        pointList += Transform(336.5, 33.0, 427.5)
        pointList += Transform(338.5, 33.0, 418.5)
        pointList += Transform(332.5, 33.0, 416.5)

        patrol(pointList)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
            }
        }

        belowName("island.npc.shop.coffee")

        type("shop")
    }
}
