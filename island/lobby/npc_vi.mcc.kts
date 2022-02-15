import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Near diner adjacent to bank graffiti.
    playerNPC(
        absoluteVec(320.5, 32.5, 413.5),
        "Vi Stolas",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjMzOTE1NTg2NSwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ZDA5MzNlYThlMGJmOGUzZGJhOGNmNGRmNzAzODFjNzE0YzYyOGI5Mjk1YjRiM2ZmMWI4NDY5ODhhODBjZmM4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "Oy4FP1mvdmvBSnJoHQxa2t81kmOHCevRkN4C0NPJIxsQEQ8+4SezReHrqiQ8zyGBoUC0qm5z5QSH3+kx0NMhO1SiSzwm45czBaKOOtusETXqf59lIRyiIXxzOOtJlPl54/ZtQhSb+Xg44N/q9vwzRiDLs6TpYkOwLjQGLsGobWopbphdMN7Uhkhx7WIP7Zci3CDzyRC4o08CWYED2KgcK2QrXvMNQTlCB6i71ttsqYApTKcMKyRDdy2tdnDsDMsLQvie6FYkZWpT7kvcb1qCNLRSG7PVmA6oudhPpPLx11rl+aahjMf/5x0ECBKU1agfkCoHgpNnQu+Mct0ZSdUe1az0/+Av4cJDpjFM7BItOZ4oYPsEliF3Vb2FJdXvlUrRaDmBOZF7f571pZnqUNF9cpT5/K1uaWCG6HAN8+S6KwA+2S3TwI5YIKebwCkljvrR080DdDy2KBg8fQhYK9BhPwQi8ehGXQbgQnKiyPE2QdtvdKPlqW5kyNoFmizgYQKm50X40HWgF851Bo2zQGKM+At9qwTOApI8kkiWr47B1Da4kHL87vVbf8noy0s7blN+/0W96Bo1ygSXghDWi1u4mo4jiKdMvq4bGkd+g/s7NHASGKpFQf5huVQM7OhansyeA8zVbJWHKFZP/b3M++IBun9ceHPBH8WlYMlvaSabuLY="
    ) {
        rotation(-42.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        mainHand("mcc:island_cosmetics.accessory.rose")
    }
}
