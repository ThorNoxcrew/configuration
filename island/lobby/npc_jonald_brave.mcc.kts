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
        absoluteVec(315.5, 36.0, 419.0),
        "Jonald Brave",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NTE2OTkzNywKICAicHJvZmlsZUlkIiA6ICIzOTVkZTJlYjVjNjU0ZmRkOWQ2NDAwY2JhNmNmNjFhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcGFyZXN0ZXZlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ5MDY2YjE4ZmVlNWZiMmM0ZmI3Y2E0ZGU2MjhhNWIxZjYwM2Q5ZGRhMTBjYjFlNjBhNWQ4ZDNkOTEwMTE2NzciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "q1lQR8uVlaUkxhnxdRRpH2tH3otWFEhVWU/7JxGDT1jW/pXptcUi9A82kYwKzVi4YubTuIJciQsaw5TqyJ6tzVxxaaBx2n4vG0gPZtLOCuydKcR6c3MYAfHwfMaWzT1XQtNYdGN1apxCx3ByJYMpVjyoCfZL2ogmQS/LmRnF6GNXjGSqao5yAwugDJstErTE5ohwMoZwZSWmaqnFpXbqOEar8To0a4gyuFGgeNfME0CsO5h4ObcCKT/rctiZ3kjM+tnWHe2DEXEQ7EjJSRQHC0Vgxm2OIj170QOx9eSmLKktkRaGBzoh9wtMPhjawYG1WhsdcN5EKxZl0H4oYb5eMh1N3oRGUYU1mNNhs0sRSTt+AbXBplGh3AdVLn/3Yf1KkjlDyw61yhQUTPFy3k9LFA4kGbqvM2vUU9PWh7+My1PSrkrgbLcLCS0hEo/+B+H2NRPMmuUXst2+b13wI+wbr9M30VqYF6SjKktPheyETf4G4ctk5jxF1geKrSk1f6Aj/2MSB7vhe6c4535oZ8vDitSnCpFPwco4nUFRtuqc62yLzMXTy4X8YgrzCo3LxJaUKuLQiayY7CVFCD6SK+XlYVjUP8m2xKo8CW9Tq3qCT4T4fZUFi53PyQd3CQdAoS2/+ppA6t8vll40SVwIH23TYPOf0I423Y2mX1xo+OuVs8w="
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
