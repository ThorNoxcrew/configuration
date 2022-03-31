import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Boy with snorkling gear watching girl surf
    playerNPC(
        absoluteVec(157.0, 27.0, 386.0),
        "Teri'i Tetuanui",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNzM4NjMxOCwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNjRjYjBjN2YxNzA4MTdiMDY2OGViYjNiMDk5ZDY5NWRiNzMyOWFhYTVmZmNiYjY4OTI3NzIzYTFkOWRjZWE3IgogICAgfQogIH0KfQ==",
        "LkNQU6JaqL2eZnI9fcP6uDCMXl1rrkCjQibT/KqghtkeHZ/+T4BjwihxE8oiWMGu2iGcXlhTS1d0V8HQkIcA2WvUT2EmY5tbU3PPsvHyr2VcZxbaLD1UZpoOSpSIi0po4r283FGq/B1KdZGXqItRSOcaG6vynSnUGvzT+6R4TauqjQWua9wjZDRsyNWOxmleP4SijGu3ymBOTKUO53JdNEzQMs7kbx+uCTdQ2uj85AC3FRHxDbIkUC56ucVlkqGWBcSXG6I8COdqil98Y5mlvjQLp03LO7wxgcQRxtmCOQgS5DDlLehSV8P5a+rHiGHUpBMd72k6CChcb4Pz9VVlUyJyFpJx3LYpekHmok8XBvesskee1qeqihgy06zoBxeTU5l5e1emK6cfmHHK9RR8lQpKQISCtJW34mXjTy4clmnx5q/WLk2YJj86mIibAcylB5hOMwNo//JUCls/D9PhO2Wb/1z82Q2VORSv3ZSF8zSKqIHhexLWMr7Z41mgfvEZ7LhIQtvewyT7OdLjBS5Q8vwRTva3Wl70IZSvEQIhKOh9J6nLaULOWzuGpycl8EYQVm+Ai9ZyGNF8yGbmwp+yCakUChDrnP5mLPJoMxzB3ALKxVg9kk3NJ7cAd+dq9uW+EpnZUVxuKyGib7tw9qtTw/SeQdl5ryS0ma7y4mHkPvQ="
    ) {
        rotation(-170.0, 18.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        
        type("ambient")
        helmet("mcc:island_cosmetics.hat.snorkel{display:{color:13068314}}")
    }
}
