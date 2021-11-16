import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Chef left of hub roaming in a small kitchen
    playerNPC(
        absoluteVec(380.5, 36.0, 601.5),
        "Chef Gary",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjg0NzcwNDQ0MCwKICAicHJvZmlsZUlkIiA6ICJiNjM2OWQ0MzMwNTU0NGIzOWE5OTBhODYyNWY5MmEwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb2JpbmhvXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OWU3MzNmMDllNDVjZDcyOTRkMDA2MGQ4MmY1MjdhNGJhMWQ3OTJlODM3Y2U4ZjAyOWYwYzgxNzQ2N2I2YWM3IgogICAgfQogIH0KfQ==",
        "MgHpacuoyjVLHATk3n1g7MDdm3Pr59gIXyLvqXfDxjtrZ1ixPSi574V/VfR8+yH33YZbkXekWRuJInOmKtv12tvd1mSys5kB4sGOMfIDk55U/E0nK9ubVgKgYB0D2m9fYpmu/m4sOwZ8TO9JhHyql0fGvAfEOB6mIkQCrvYdNT7Gut2IHfcG0/puwn8drzdMzxqQjZEZsJA6u841wPc0iNuSP5rj43qadgWBQ94lCMeB2NYCYohX/XOpBjk8ZcSVMdtikDxlWjaZDHqbeVZIjm0CQYb3VtSIy45NM9Jnzu3RpAQXnuGEDxnzo1oOP6aWVSx47OGWA7NDkMAO2R9lc9jpb0+/ukOagyaJUKqmTu2ZUuuiupoAz4iEuC+DIxRarz3vYkDLI9F8G3sP7mPsiDIifeUwjODTHcY6UsPKrHVLvmMnsOziz4kTRBIabpcwIolQSL3F9uIaPEuCbQutoHEMD1KAWTQVRfxp1Tpkd5nVt9aZSrm7LxUGH318vXjxC4vy1fjHpa3XezWGrLUrrKDNuYodmLqY9qVkik0uHBT+wBJ+2JJnT5S4hs7uJoi5bFwrXoqSVlfjK6UOqrxMQTwe1PZdHJZkFSfvMQWhFIKfgXNxZLhWUh4PX/8kwltBEL3/oE+6rOq5XkgkECk3Eq1BaPu7rZDBLM4pm+bNxrE="
    ) {
        roaming(absoluteVec(381.0, 36.0, 602.0), absoluteVec(379.5, 36.0, 601.5))

        type("ambient")
        helmet("mcc:island_cosmetics.hat.chefs_hat")
    }
}
