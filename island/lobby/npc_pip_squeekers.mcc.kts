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
        absoluteVec(333.5, 33.0, 424.5),
        "Pip Squeekers",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyOTAzODc5OTI0OSwKICAicHJvZmlsZUlkIiA6ICIzZmM3ZmRmOTM5NjM0YzQxOTExOTliYTNmN2NjM2ZlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJZZWxlaGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTAyNTNmZWFjMmM5YjA5YjExM2I4ZmE0NWUwN2Q2NGU5NmZlNWI2YmMzZDI5ZWQzODIzZmUyMTllYzhlNTNiMyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "nDXRXTBKZkVBnkhOxPFHX+e2h1JbX7a73NzaPslx4xO4FUAEJrwtfpiO/DrRNzDI5z0R4ouHRK1G2Ykdnt//UxIW1R3XWEZokaaaaDzlvOh6oezWAWfiApKwQWeMAB5BoK0POMrgNMxpht/9WfVZrpWFOuj37q2NJhoe3Gt3zRvWMLW5TzkIRQWGYLVxgWGTvu5svNVBepAQ64vGFog3FyUo80/mhYjpIHj+X2AG2hsM75o+Ax1Uhn66rCw59ejdiNGCrqchU+XR4xlMV5panBd0AZc556wazSkIJhBk7JQm7xGrCwuxjg+huKF0D5Wu6W57t07uKGl+IxeH1tAtvJd8HT1tJaZS9kU6URXAv8aMYmhQGk+Wqt1akny129NnZZstsLAetni0FLa3EyWHJMQiBBFntLpcyKSlk+fduMTCKhyNV7Aqu+zY3lwDOBDkOjWMa5AghG1DpihMf1yqvn8yuX7Iq4fB6hhbYH9+AuXl3ox6BsoXzgRlTPT6rnXagIkmxFwNCJDqdl8jgK7YB6t5x4R3tMlT9fsbUTgbT5czWKuH0I/oHRCWtkaspS8hdGZiXuk11QtoYvuDjGLDYVfJT86gBd+AptJm6KPVc6dDuqzQEqmRG0aHj2tQSCvggl2NNRuVPz/U8hucLCikeF/2uVLe8uC+xZzJLZWSmS4="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
            }
        }

        helmet("mcc:island_cosmetics.hair.hipster")

        belowName("island.npc.shop.coffee")

        type("shop")
    }
}
