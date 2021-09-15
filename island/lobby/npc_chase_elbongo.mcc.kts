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
        absoluteVec(330.5, 35.0, 492.5),
        "Chase Elbongo",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMzAwNDkxMTQ0MiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NlNTJiM2JkMGU5N2U5YzA5OTMwMmFkZTUzYzdiOTU1ZmZjOTUzOWY4NTBmYzMxMDdlMTkzYWJlMDgxYTZiZjQiCiAgICB9CiAgfQp9",
        "W8m/0+yKepw05JmiDRLIYO2xieS43TQKzBqi7bivNyHFsWH2+cTG34eCYBIdo6WSKB8GHr3hno58JlE+TvpNEQ9rzCchbl24FwkhxoNxV368f7xqYYracKsnztj+E6FQ5UTU3PhMu3DLZ2n83t+G1lZK3EcsmNmaykWRbQnjzPNjWPNjbe6B/etFPqH70YXyOFrfkcM5RYeSZRoWAvJrQR5cY8lOF1fyteEWw2Id8FyvgZLxAjUXs9pv2V0hj+yNsqlhCqFGBV3UJW1x/Ubxl9eZrfwzY5x0VZkIheCvl7C7CgswYSIwI4FRkxd8DqvnpJrk3/YlTuxcscTUfjnIupja+eFwAfIc0L9l7f0LPo6LNKPYyJtBiNIrFqL6iCKGDbU7PTIFlBD20y9Wc8Xen6h345f7KkZ5cRsOerENE2exIncvcI9j9EUKfHs4ZdWukVV6wfvRRsMSoOjf3F9TUF76uTI6Qc7QtzcT74l+sAH7NjUvqvzCHlod8DUcnTYLPYlUql+v/G53EmqqOd0+kfu5TdM+ixOUXh5bUgA0S9rm4bYQ1Muv/cgifgtSiM70PGdzcWTvHKi72uyJ99aEn8KumEyriqL/Jdxdfe6WsjV5xB4ZaW5QeXmtmicwxHLdzdg5NZuXSkrWwb06szchmOE2KrnJi6+Em5o/sN8Uf74="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
            }
        }

        belowName("island.npc.milestone")

        type("milestone")
    }
}
