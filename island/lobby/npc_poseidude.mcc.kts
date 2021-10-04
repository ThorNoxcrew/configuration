import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// King-like individual standing atop a stone by Aqua Axolotyl house
    playerNPC(
        absoluteVec(492.5, 33.5, 491.0),
        "Poseidude",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3NDg0MjMxNCwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYTI4MTZmMjVhMWQ4ZDZmZTdjZjUxYWRlN2IxZjBmMjU0ZmNlZTE5YzVjNzg5NDFjNTRhMWMwMDA3YTNhYWNmIgogICAgfQogIH0KfQ==",
        "VSob1La0vSkoAz2QfAdAJ1IuZDHTWNTkrY9/H46CaqBrWIA1Rv0q4jd0MUkOYUhZmXRBm5qAV/4h+UBNNG6Q2rGeKLH64skFt9T4j7yM2BI9WIpQCHjpVNP7Y1Oi7cCGaUCcGkjF73ol5TwXJhSu8hlHiHR67ekQdu6L4i1PRvIA5taF06/NJrwZYyKvqrizqqHgL4UxhJYHghM4ahUMnGKSdc8s6KWkwUz4q/40l8UTTuXMJFbNjOBytGsJL5GAFCD5j4m2zB9jHnO3yl/IIlCs+legCEY5YbnKF+9qdZBZC/2Fo8pcXYq83XVu9LjVSjRQnMwiBGpp/9NVQaLD69BjgQcyj29bv8wvQj8iYXFb6fcTxkgRRWilmLiR42HRO4sb5HWePg/DkIQgqz/rfAo7BFj845U16qO0gokYYquKqtuvSGNs2wBseER/oFoTjmQLjAC64MJxWLrtmJzOcbcApkCK5SW607YLvAo4M9SS0C9Th8t7nVO5PL1EwUzbAmKPMJkLknujLg7rlemBI8bsQ3I1iLq5gL853sOLXh5rVYNw/kewUS//zoniG5Vwu5RL0xbqu5/KQgUiUgsW/x4qz7q0e9ix2NRa95LKhKEs8hHBT7hNHjix9fpM2KFWtSESxInSidKHMJaTxZth5NOS1mF4Mdk/zcX67oLp2I0="
    ) {
        rotation(75.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
