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
        absoluteVec(371.5, 34.0, 496.5),
        "Barbie LeBlanc",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjM5MDUwNDUxMCwKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwZTdkZjZjYWUxOGM0NTUzMjk5MDkxNzRkZGE0ODI3OTczMzU0NGJhZWYxMzQ4Mzk4NmE1ZWM3ZmRkZGI4ZDkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "kwGrMJMGcAIjn2vbHZFCc1tGIdRZxFoDcpBjxE0bDpLTkWBDPi5yzZQjoshjD1rXmSj7TWKrSv9/eiPQTXXsNFTrhULJayLAuso5ylGgZuCkwjdxla09KnVQHTfhYSR6UThRfLuWIB2IsWVE+CJVY9ZCuNAh60zkBnv0k3C8faNjhSz7u6xokuoW/ChVvAppWKPGxYq+krORX3jq9hHVbvqWTopB5OTEyTPYcBkfnyx+rVGLMltV44kBNMoMUczm3pkvoOeoXZE0pTjL2thFlqpStSS080XLhDR6PQLDF/k/4BIDu4DIEeEu/lhMNr3gZPpGUkX1GcXxxAQGx/NQ5N+c0Akpd17q2DwIDDjUAcd4rEAXcx5N47v8j2VogvfokqyvxA1eaLX2OM4OEnZDDAvpG9ygd4AxwljAHy5gvlpmoazJXsrzWcqh6R13CQwuughdvOyyadKM/T5eHyI4j7guSiRgFxDFkuRO9DlEj3Tq+Dym9DyEjk7k05oMkVRB4zsE+W3kRn/VEqJi5Kf2dy4p19k+porM+4sExOc03HJ2OqEFV9zcVMKYg+dDZ3kSCWc4ljg96ubKiahIxu5kYcZxqtTKZ1C8O/s08B8Ydxyv+iE0br4uHBAchPDwIBg8vBC5Fnb8UQqVO5mVvGlgJqdnjsSDisSj/KLrqsnVtIU="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "barberShop", player).open(player)
            }
        }

        belowName("island.npc.shop.barber")

        type("barber")
    }
}
