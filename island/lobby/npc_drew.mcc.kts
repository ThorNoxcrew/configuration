import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// skater Punk in alley right of main Hub
    playerNPC(
        absoluteVec(338.5, 36.0, 508.7),
        "Drew the Punk",
        "eyJ0aW1lc3RhbXAiOjE1NzA4MjcxMDU2NjEsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MzM0OTIyNzJlN2Q1ODQzNjQzY2E5MGZlZTEwYjQxZmVmYWVmZTgwMTE5MzFhYWJmZmJhZTAxYzIyN2EwMDJjIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
        "KHNR8LXTrh0vAk7fVwa8l/J/x5RtkJ5PlXL5FyWvXj2ZnGZ5z+PoX7+MIWylYlxj2EO9wMvHBqmqf/VINpWH/7OmzS+0IFKS1H5aM+woS5wquLwIMDjS7qyJSUbNHOTEKYrHaamHz483JMycTZ6sJW2xMXX9m4MTxBKmAIFs+OV1zObdLkUZIn95O4jmfEAaE7K3ov8P23gbU16CiqBg8GiyMmyXtBmscMsUsqbLPi+iAv1xo8d7poKiqxX1PYncASGiGu4y3OiND3lFXqNJFDgiClOQwmFeb7HQeTvFrnaFhEUvliZQJ7IPICKiAgsGbW7HEbfpiiHyVm5TMTRUxMr3uKRKm7qQr61yP+yRxbwghLO2yw11tXuKOmrb0H7anRw7AMm/06MkgSI6gTS24aaSIsI5bTmuTyzRrIwSAmhjTBdG7drii9sO8tW34A1et1gxuxSP7uVbFGXMFOefcT0tXcH5zLLqONe10Ag4unss4a5JRwPeSOw9Nz6yCDjMya5gvA06JNHHHHxrSjVh9+A1o5/HJC0uVFb8wIxf/nG4NyH6RbVs7Ajm0beJtzEX1l49XAVKhTWoKG4qig8FPYravVdMDdlcmc1PERHZNdkxHEIikK81cPeR4O9j7TfqDQoOi3wLZCJJeAvIMlGcl469t8e53e0iRGYXq9p6a3c="
    ) {
        rotation(-155.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.skateboard{display:{color:1659080}}")
    }
}
