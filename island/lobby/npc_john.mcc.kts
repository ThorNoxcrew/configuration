import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands on corner in shop district
    playerNPC(
        absoluteVec(294.5, 37.0, 489.6),
        "John",
        "eyJ0aW1lc3RhbXAiOjE1ODc4NTY5ODMxMzgsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYzZmVmOThhMzliZWJlMjhmZmUxNjBhMjRiMDAyMTk4Y2YxYzE0Yzg0YzI1ODU3NjY4MjkxYzY4OWJhNDZmNSJ9fX0=",
        "wardb754feAUWNaTlD5vOr7WICQVUkRg1ErFrIOHOJab+M5C5ywVMkvZeAg/5TPpzqdg/CDvTjDX3qKXQfGNTE89LPYkjJnhcjUHm8M2/GQdzjW6EkuOzdZt3+0Qii80ydJmW84GwjGhgAjiwDYuVUkntAoM5bnrHbLPN6hnx9X+hqnqnSYEUJES8rMlZdt2nPjr0QwU6CBtQ0uMadqtYN/4kuZZwNRyF//nwjar5RTWTf6YfYJI4UVEaX7itC96dnfdq85EZMzni/b/c7ttTXQ1mM+NojtSy64HLiHMQgcms82RUNkh9d4iZa8nbv6j3Id/Xdzvp9OMdPPXhA0Qqtcmcfip15UFXgMbiLudxAF8zzVgiWZDbiiK6PfOvN4cY/QrZNgksyh+Oui/QYfZWmoBlob7eHWAoO2r+Ni2n0U3hvwpp13veYSbrZoMAtc2cARMMlXOIMS8nuMRxSG+Ty5+T5gEAFrnw2nQFOxOZIjRA3MW22EfbQbRN8bFO/8rjFEXl+yUK5d+zsa6uRW7UNw1b5POO769EwiUzHU0TcNEkeGTS+P9vNdHkmcG0Fbg0xbM/YPzdbs5D9bKEpF8p+fI+rPpQxjQyKsI6yGyovELjVsIN2mwzTmFHezD7nOO8X4QRsUQm0zzipTKgaeF55hR+3FqigDYAEnyNFLnXHU="
    ) {
        rotation(130.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
