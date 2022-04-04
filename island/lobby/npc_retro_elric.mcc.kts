import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Wolves Fan talking in group left of main lobby.
    playerNPC(
        absoluteVec(344.5, 36.0, 526.5),
        "Elric Ibone",
        "ewogICJ0aW1lc3RhbXAiIDogMTYwODQzMjUzMjQwOCwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMWQ2YjU3ZWY2ZTBhMWYyZDVmZWFjOGFjNjdjZjA0ZmM2MTNiZjhjYTk2ODg0OGU5MTE4YmJjNzdjZTYzYmQyIgogICAgfQogIH0KfQ==",
        "rqq8HH6uMyRcpsdv5NgasnC7f4kJHqyLjENWs8IjcBrvYbXnEOeEMeYSIHIMmnYdLq6F+dcaIJabvo07WLyn4MX54xeVf329XUEQ9y91PkWPyXTJqcZeuVf2U1UK13w1A7/T1ZOnQfFMQdyKyFslm6iY+rUU2Yi5fa6fcyz7OgAwXpfVdjKeLzYJSyfAHo6Zpdxn/ZzoNHH4aGfEYTvbavmktmX4ZYXWm6n5grYBcoC0AyktMXi9jurGFtl5grNizg+0j3w50fwxMRX2PM5rfQSAyFaG06z9ndeMhUAItC6CSIsaPdVw+KKC7tlKqFaAqyf4JxbooPCpXSG+b7jl2vZNxA1izss0NyxLeUApkmiFSfaU6jebbdCn8sfr1fg36nWFM2086OpyTcK1ST9G9KeU04v+e+doqsrA2HvdC0pgYYTAKpeffhnEL5J2OkJlV19f69FlTCmDq41+VfzJ37fPxkxiO3X/I/HOWGC5A0N8trlUBuJZ5T+LuhI0nNR2yc81wAeC9eIjj0vXNIJgc5STWxdGN6xaKOotGvha32VUrvgi1beOxbZO3NYNqfHufyR/e5oEXy7d4m5OHkYn/aczNBnu6U86N1thEs7kD/35asJKxGtU3b5IUOed+kOdKvw8hLY5e9HJx4SXbbsBAymknFgwVUv9CXAWp040Jz0="
    ) {
        rotation(50.0, 0.0)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.bone")
    }
}
