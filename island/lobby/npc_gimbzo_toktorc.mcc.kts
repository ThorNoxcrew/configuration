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
        absoluteVec(367.5, 33.0, 487.5),
        "Gimbzo TokTorc",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NDg3ODM5MywKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM2OWVkMjkzYzFlZDg2Njg2ZTY4YzE5ZDIxNjBjOGFjNDcyMjNiYjYwMWE2NTkxOWE3MjJmZTJlNjE3N2Y2OSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "FLb7wOfGSf0s2Lh9XupQcniCCrfk+rXMk9znOOhTDoShBGbYX8cAxec8CvHSj0fJ4L2A8SJV8SO/yqr12WCOJETQ8oj7NaY4wlTELycLHx4y+wiQNy7CH/g25rvA5D2KYT7DH8conNazBRUtEeKTUyYn9OabLeTfJJe5unPALWfsvNn+OxvhSMpIOpqNw1EzeO1xnvSXKbHKmPF1ockFkcAhvCLcKgvHbwpLyAy+u7iEKIUYP0nOef9QBJyu7kpbIrM2/qSM/ta3FEzmJVZIvNitfmWlEt0xuyxfKnqD1TNxaT62qtLQeE1fWsuHiv61XUZMIWO2+n67i+nFpVZdxA/0mFasGAOOpgynrbZ+OI9yMP6/5yVoJiok44Vuay8LbSwuU5c3Lrnx+GRBs9kTtRqvQrKpAoU559U5Wm6dG7y3K6dRQVh7So5NVy3Qhe0jAilCinbmeF+T7XqY1kknxDSgfjXUkS/eLlfyf3TfeaIEhbjBVvoKNc22MY8dGJpJuZiGlAVbmmgGBO5I0mWyFYmmZiUC0Xdd6JDInrKxZ8H9lvS4rUuOzFgmBn1z+pG4JgZb6aXx8kLRhnenmFWU/JXlJ/JY2qeXGTxgtQjfKodRFXq8733yVy22IwiBCMtf1x6IvFCr8zzUxRDc2RaNH0CMIZLwE0KgKRzg7QTHsQk="
    ) {
        rotation(75.0, 0.0)
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
        helmet("mcc:island_cosmetics.hair.professor")
        offHand("mcc:island_cosmetics.accessory.pipe_wrench")

        belowName("island.npc.shop.gadgets")

        type("shop")
    }
}
