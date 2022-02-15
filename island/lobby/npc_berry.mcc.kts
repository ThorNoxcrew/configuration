import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Wealthy woman in house to right of main hub standing on upper floor.
    playerNPC(
        absoluteVec(337.5, 42.0, 588.5),
        "Berry Strada",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNDg1MzM3NjUzMCwKICAicHJvZmlsZUlkIiA6ICJjODE0MzE4MmQ1MDc0NjQ5YWZlODRmZDNmODY1NDQ2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBWll4ViIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83YjYyZmUzMWFiZjUyZTI0MGZhMTMyNmE5Mjc4ZDhhNmJlMjMxNzRkNGZkNDQzNjdiY2M1NTg1NTQ0MTU4ZGU0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "tDZavUv+AOiVD2+jSf7Ktb7f7mVIWxbo0TCM+m5OkHowSaC3+YgLU9oS+T7cvgSrCP8UpQtFLziPIQWKsZQAxlgPNog1yYQLgLBkL4c5OO1C5WoNdGsYCa6N9rGfNTCWTHBVjyBvjGw2biBFKY5V6l+d1//Og/k35l8zKowsV/bhKmHUBpw1HPXge85jIW3R0kFUD64N8Z8cC8MoahcVCaPkWRRe5YWx+d/FUyRL2sqWs2AXiE6mCRTxLWO3QsTVl03Mro0ulBmi2cSFM36Kyo/yg+6++xqJUsMaj2blyr6r/GTigh6JV7bzPrg6XMm2jbPKIw7h+RwEh3EkHuC/YB49loKTGjaQ1/jHmX4sfDs3qHW5Y5UNYrrPoOEFJxRGmMZ09cyDe7y0GuEZohHCVtKmp5qDy/D3B3v6uxIVsioJ0MS5O9Fnn/Ni28WOspOBieUl5AoBUxjo9HIDY4yr0o3eGA5/1TZBm4PHcA5PT1BBVcxDrdbu/c9WuqSH8GFLCl9f7GkhbJHPrBaY1+rnbym/5TGcATvQGUc1K8MmTcr16afr2ORh8Sfbvv4MfZVwDIq/S99klhW7l1DxUM6E+KXmk0z0H4cNVN5406Y55mFDo/Ru1lLL1SxVwG00R6x/gSB0SBJMa35JYkdxexRFEOOkOWshcStbms1UutcsskU="
    ) {
        rotation(170.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.fancy_hat")
    }
}
