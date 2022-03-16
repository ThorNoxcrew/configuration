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
        "Makeover Madeline",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MjMwOTExOSwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjc3NDNiMzJhM2NmNmNlODkyYmM3YjEzN2RkY2JhMjBjMWNiY2E3ZTBlZTMwNWUyMTczZTU2MWMwMzgzYWI2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "rEul+l2RBw+FKpPXogCmnDLQ14izk2R6x692M6MgFoNCZYCdPpMAG/nvvGMZb/NDEo45XjqjnvbN4oSTNUpvpA0w8+7ciay3v+sAKUhPAmAGvRMFeFQOPszdRUEz5cpRVYBTRCTB9ff7LoIrwvRFTux35mztGH/TwG4PYsiEoFghL8d88e/XaMJzzbmYiOGozz707jWcVlIWTfQvdLnZ17l8MuesW4jJZq5twBr76rvwKT4CDBhFf4U4w+7pMURvk8qNSf+daHza4beGN7IGJa+fzM5hbAWSCf35SkrPl1Refogx254y2dPRIowM7nBgCsfdnaA/CNMvLFnHdEKz4uCEdOVxnM6ZmoeqU6hAyzkImeIpiwUnweC5AmTE4oQJ0zKMA4VxKCoUqXtHs4fkv15uqjBNfa+m7hVZDEoVTYPff9dTUDRz28N8y4xb/qBiDVxZIGcWdfl00M69pKBkVqd6P7AlDcSXiGFHfD9IjgbArbjxmPc0RtJBHnDrPrWDsPwYI4OaQ99XFlva0MYwERvVrzJNpcsCCKSDy/I4INsh9dCkNvRhCJfEH5mot8phHuUYkb96LEruP8oOQeWpDL2hM+mAPQywQxhQzN/H3Nq9QS9vpH7A5jeyN4gYbwq6al/GwR7/ja4Tclel0fqPDpvZ3Kj8iD+0eatKkJOfWj8="
    ) {
        rotation(75.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            BarberShopGuiController(player).openWithCurrentHairStyle(null)
        }

        belowName("island.npc.shop.barber")
        type("barber")
        mainHand("mcc:island_cosmetics.accessory.hair_dryer{display:{color:14448867}}")
    }
}
