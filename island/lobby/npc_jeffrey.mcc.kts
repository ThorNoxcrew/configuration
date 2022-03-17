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
        "Jeffrey Shavers",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MTMxMDk0OCwKICAicHJvZmlsZUlkIiA6ICJlMmVkYTM1YjMzZGU0M2UxOTVhZmRkNDgxNzQ4ZDlhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFsa19SaWNlR0kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjU0OWEyMjY0YjA1NDcxNmYxMmI3NDJiNzI5Yjg2YjcyNGRkN2E2YzA0MmI3Y2RhNzBjYjhiNWNkOWE0YTFiMCIKICAgIH0KICB9Cn0=",
        "GIY7YPsANG/6tGWeqYC5s7nKTBF/GWHXPl8JUNovnexmfzK+V3QyqmAIKD7uKRIfQbSLHZ88xc3UvBXUl8K/99jfftus6nlPFAqxYeocBu5J5SosQb9Vau+bopYxcg/C8uXh0rama/a5kPZ3AER/TVbydFLP5/44aUtgZDp3+qpxpaM4K2L8WwFKU2F4cMQLajxWZk0wc09nbFkcml5FEKb09x5xgofDEBZGUbunXCfAFjyHKoKfVdOz9UXw7NKCwv45HDlWico3nGJxdgfp6wKNs8537orMuwE/U2pcO7cW+JlB8tj5+0ULDvGv+xZtp5An+Y6i/AgNrpPKXEi1YXN+BSrSGglmlCGh/TQQxXT2KMkbyoPqSjBn1TbV5B7bVynKKRPHtgvoqxxnxwKDTtOpefiZtVHtOKSOBL28bTsutxA1MecZIdJ3YPdvygcumXHCgCz+CnNuC63Y6ThUURMXyZqU5ErgSUOrbP6H9czVTU288Tj+HKrlHitenLMNkdvtjGmoqvsdAj2C36CidNYL+vCuFTnE9da8U9wj/3Ldf729chwG6+bBYn56gQEM6BGPvf26EEtQMbdLLFhIOP3lFZmn12ro7ahJeqoOb329mrU1wOg2O/V3QxsGdvOs3cpbfajqjPVfmY4R3MaTstnO2S2jHoShB/1rPFCHWOw="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "shop_barber", player).open(player)
            }
        }

        belowName("island.npc.shop.barber")

        type("barber")
    }
}
