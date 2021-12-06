import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl pacing outside a port-o-potty on beach right of HUB
    playerNPC(
        absoluteVec(415.0, 30.0, 406.0),
        "Elle Wee",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyODM5MTcwNjAzOCwKICAicHJvZmlsZUlkIiA6ICIwZWQ2MDFlMDhjZTM0YjRkYWUxZmI4MDljZmEwNTM5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZWVkTW9yZUFjY291bnRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NlNGI3NTQ3ZTMwYmEzOGYyNmY0YzhlMWZlNWFjNmY5ZGQ1ZTVjNjI2MjUxYTZjNDEzODhhNTM1ODAyNTI1NDAiCiAgICB9CiAgfQp9",
        "WYDSKlZnIfMD86swhTzIxkoonxd9d9EnFc731HJkQyR8rFhlsq24KMxtTQfUVMLsts6L5xrVXFuTUCYcGllC4CY/gqUFDyiOMBE9TV+Bt7N1myA1ovOTv9Q6roFjMy4HVNj4NIevA3x9Eri0tD1FnPbpJ3KIBb6D1YoyDLa/h+HoilO0Ea58GvniKQeJ4CdhwHOWvhXYktBmLZw+SfIE/FkJRqLolEZ7KfDM75BZgqANc2XKNghvrO8SxvDnBbqc51mQ/luOUeYJSI+ChNAd9WqNAB0dBqIDFXZlEU5XpGE8s7ua/WZWQSfDro2y3rOHvkV5J4nu6v2N2hBqBuH5MJzIN7X6W6gYpX4waprfe0UDCAoHkxxS2FkJO10jEi7u94HVaJDRbs0fx3HCC6aNk5GhkMxkS0i9SUoUzygl0d3djghDyI+GPOX11xwzqH9uQ8caOIMOY1Mo+y9RhJUgP0cmY1b0G3zqDjV2C+M82amx7oQjckq6H4Ng0ek+kI1cwwVHOgeLO/Bf7D0gYR/PUaQ/hM1cHWd6wh7r9YC7DKvNRSwzCjyKWMKkym6axGTTfv0zXbl6bMRm/TXhXPJvuVjV1zlOejqkgKWjfcfERQM1fbZA9e7Ww9KZQNz07rA8YmCaqlAdooa3Oj0HK9ek/7T7vnOksVIB72E7yLH+OX4="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(415.0, 30.0, 406.0)
        pointList += Transform(417.0, 30.0, 406.0)

        patrol(pointList)

        type("ambient")
    }
}
