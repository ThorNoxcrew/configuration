import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.barber.BarberShopGuiController
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(363.0, 34.0, 502.0),
        "Pretty Uppy Lady",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjQwMzc0Mjc1MCwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODMyNGU3MjQyZTM3NjkzMTE2MzVjOTdhM2Q4ZWJhNjZlMzE3ZDY2Mjg0NDAwNDcxZWQ5Yjk2NWQyZDg3MmJjYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "JHP9bHq4Imtr1HFgHCFVYYyWHAMOWh2760TUUJPwy1n+Lua+ad7ghuoFfgeqJYVNWVGyl+M0v6S4EHjIojDI+N3OgIf2izO9dVzT6bB2bor70DBAyHjaPZjpDsSPZZaTY2I/62QmS3DQGrKlRTvHeP5u1YU+sUbpa2cq+Qi0HUPmYRh2DVr0cy1Ra69HhsJtQitWsbXfItJ60OBAumn9FIsylXCk16UPNO+RZaq8ZfqEbjsmYOLaR31Zz7XZhXjpbelH86wLIMug3MJsFnIPru0pqRHJYO8Xc1cxCM2w3S6+ZS0s5oP+99oYEjANvMSmtjpcsa8wZWNKSEjHdoMUcFkw6Ln7cXGunrBC8AT87rE7+CPKj6jRdRCMf2jD4gFmNBpFQmqBfi+M/ngXbqByAc6O/cr9erJm4ApQAWf0f0ZXTwkwIrrHDUttaq3byaECQ3Rvg3J2ykktpch14vJ79kMXUnUVsLQ9nZ+8/IzKxDe0wAQK7S0nS0OtOkAuHSGt/34YYoECGpkl6fh4d7J0ke18+7Hy4OgVnstJuinlF65Mdfs5w8K8WIeEbrIiy05nfa/dEJq8KmOmpckMbKsMUmP0Hsqytb5GlEYHayQ+HRjPaD1n3lIWrhuBn6rsU7+diyCYR02ynAdnfwSUsFNBSguihX92DyZ6kyVcgIenRzY="
    ) {
        rotation(75.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                BarberShopGuiController(player).openWithCurrentHairStyle(null)
            }
        }

        belowName("island.npc.shop.barber")
        type("shop")
        mainHand("mcc:island_cosmetics.accessory.paintbrush")
    }
}
