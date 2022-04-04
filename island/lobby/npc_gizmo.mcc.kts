// import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
// import com.noxcrew.mcc.island.server.shop.ShopGui
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(373.0, 33.0, 487.0),
        "Gary Gizmo",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0MzczMTg5MjcwMCwKICAicHJvZmlsZUlkIiA6ICJjNDM5NDI3Y2U1NGQ0NDMwYTYzOGU5OTdlYzc2YTBhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVNYXN0ZXJHb2xkZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTRjNTMyNzA5NDMwNWM1MzA0MzMxYzE2MDE1YTNlOTk2YzkyNWI1ZGQ2ZjllYjFmYjdiMDg4NTQwNzE5YjRjNSIKICAgIH0KICB9Cn0=",
        "Rliv2u0S3S8EtpSasSuatIzZzWrRw0x7DgffikY5EdSaIWJ0jCv7ii7fjkAJHZxWoK8m/y3BU6IcX/77VqKiID54laNnfjf9UIo5af4eWD1JaRu+xNc9Z2dI1KTNV7guolttIGhAuJotbGgpEr6Jxq33IacbfWPGyFgFot7BNd9dd2/lUpGckg8d/MzITzzOguuA658EkekZdfj61yPhedGuBQvEC8ll/2szql/JTwcS1LNqLh0KJ6kQwtIZSHHgMpuU8fXt9lkK2m1PT9pRKEAHk5iIUS4CcdW1eI636Hp74OmiRfac72fRDzU2Mg31D0y+G3VvoTUgR0K/ccwkrc8q83tCr5sdskxxSFX5QPii0BnIMxMstDSWocTA8niX8y7NzX0nuOirPhG0ACcA1+EeQoLGuhP7gPQV1mpnUvzIlTp0WMGJ/zc5wT/RsLMnYDqwI9mLklWpE8hcDW3WEL7a3fdzusM8p5o1++scKjLjoXIyt9kI9jad5rVEZQPJpGSJ7TUBN9C7uuOTBO0LGjKEuViRterIrBekKpF+XCP+Ql7QPE796ZwWdbgbVFDI7Mm40TTsrVfYfn3hWIHHTCYnTKWNgTSN74RKQl47vxl07nC1x792GMX71Zz4gwoVG9ORVTnxCxe5L7iYHTCAuSnsPksC6xALuCi8my+86Uc="
    ) {
        rotation(120.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        proximityChat(
            listOf(
                i18n.translatable("island.npc.gadgetsClosed.dialogue1"),
                i18n.translatable("island.npc.gadgetsClosed.dialogue2"),
                i18n.translatable("island.npc.gadgetsClosed.dialogue3")
            ),
            30.seconds
        )
        /*interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
            }
        }*/
        helmet("mcc:island_cosmetics.hat_npc.gizmo")

        // belowName("island.npc.shop.gadgets")
        // type("shop_gadgets")
    }
}
