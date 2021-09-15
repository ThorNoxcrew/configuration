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
        absoluteVec(337.5, 34.0, 502.5),
        "Barbara Syrup",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5MzU0NzM2MiwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IwOTBhNjI5ZWUzNjYyZTBlMWIyMjZmMWNlMWI0NWVkNTZlYThkNzYxZGM4YWQ4YmI2ZGE5MTljNDYzMmUxMzAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "nbkp1gm1KNgcco/lD4K1H2fl+6AIWCIc4l+R0Fv9PmE9uCpy8GVB4YtAk+BxKm1iTot2sx0+BjPzbJ8vBqJUatgw+GHBziJ8LM8nnb3a8Kh9rDtGoNu2qnwNIfeBRkVif0Q51ClW9g+MsdKvSaX+4ugrLJ7DLzu86HCwVtaU3u2DiGamb/Y8ScpFUGMGV9wX1sszJ33tg9fK1B1TJVA/uzeCZm8TcOOcZAaA/j+h6odGm0DykFNZKPUAER7vyy17zfBs/TjhdRICGp0SqiNaPp2uaPEynvjYQqi70F/10a5MG/N8UBmeUsySwDWO1QRfK8Sf3wq1OKc5NbUv3gdRFW3DVPwXxeh61C/G6phQjAfNdspqGedGYLFmyZGbvr0jrWAtsSJgwgMSZxxGij5oT01IQ0yAfWxQiQhtfPJZM3+ps5pe7WbasEdbZxcYveGj8W+6kp4/Dhpmjkpa0zwmD219zCJzbctSe1vyguajf632WofrfHSKtHl/32IfPGAym9k7Y8UfABiqT3wGNkGpqZP7we1/nNVmMptZAd9bmFYyaWQikcGNjbHloG0BosJ+V5nUJ0JiZmJoaMSXw4iy3OySRKdNK9pPsw5MtFNmtjaeiQ9NS/hTdnGhGelfe7nwRjVkQwUSyBbr3gEP2q+/S5XBsODgnHza0SC+0/CJQ9A="
    ) {
        rotation(-180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
            }
        }

        helmet("mcc:island_cosmetics.hair.braid")

        belowName("island.npc.shop.material")

        type("shop")
    }
}
