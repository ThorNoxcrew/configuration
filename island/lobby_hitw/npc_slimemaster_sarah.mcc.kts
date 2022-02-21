import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // NPC roaming near HITW back slime walls.
    playerNPC(
        absoluteVec(-741.5, 34.0, 1280.0),
        "Slimemaster Sarah",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNzE3MDMwNTQ2MiwKICAicHJvZmlsZUlkIiA6ICJmMjU5MTFiOTZkZDU0MjJhYTcwNzNiOTBmOGI4MTUyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmYXJsb3VjaDEwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mNTQ3NDk2YmViNDkwMGU2NDMxMzdhN2VhMzJjYjIwMTMyY2JmZDU1YTAzM2I4OGY5MTljZmVlODczNzAwMmMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "ui/WLC6ClCSE3GnqAChx7NjrjNZBXg/j3wQETTEB1yfk+DDD74f1Jq6N1rFtX1Vx2aJRWb96UxpHuuwMVL1dTM7fXof2ZF5BhPQ/H0OaqkTLigtyQRJg58ww9uFSjFveIU1d3bLzRlwceFs1VpT7e5VW1pZQNcMvaCuL6I0fEzg6R8ktwlazxstvGDSIwCTr4cApWJlMUDlpV3GH6yy+0yl7qjm6NXWybdxnN7QzoZYks9CmoLGUpZjpfswbySUgG6ZsqXQpF8pjy7ofAjUsbjoB7q6de0sZzbROB3VqS61YBKH1FkV3tQ6wc79b/0VHw4BZd6nkROkTD0JhICRSINPtJJ1lL5zjdMc2MonAKwL8HaVmGml/fToeFU7/C99Ll95GIyiajaCxMIQcKOwABE9m7X195hyvH9WlcALivDM31gGndRFwJjZEfgnD58sbmFjTeaof673m5a8+jZalzM0xmcKwZiWn3XQ3+R7KUZUAl3LrdZpmdzlceOGAcJ5KQY+8QA6wLYKqdZ19n7a/3sGu1UJEvVCzcDogA20FF28kR3ieBhiG4Q7U9ooZvpC2BlIroOxhoCjpVJKRSEVfOCReDZSlHdvZLKTSoZlFXT3zHKNs7boNNfDAuXiXq/LIyxDdcQ9FOs+SfQSj2PKuuXvuHYymRExvOpbeOaq3OBI="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(-741.0, 34.0, 1270.5), absoluteVec(-742.0, 34.0, 1290.0))

        type("ambient")
    }
}
