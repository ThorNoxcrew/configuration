import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Below is a Player NPC with the texture and texture signature provided, you can get the values
    // by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's
    // API limit :)
    playerNPC(
        // The spawn position of the NPC, must use decimals
        absoluteVec(333.5, 35.0, 464.5),
        // Translation key for name or untranslatable text
        "",
        // The texture provided from https://mineskin.org/
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjc5ODY5ODIyNCwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ4ZDE0ZjBjNjgxZTEzYTJhYjc0M2Q1YTE2YjAxMjk2YTc1YWFlYmQyNWJkMjQ1ZDU4NjI5ZTNiOTBjZWU0NTgiCiAgICB9CiAgfQp9",
        // The testure signature provided from https://mineskin.org/
        "BwGHkcC3kIlN/A4oPu8qy1nmPk3xMLc+yPa8hvptF3ctQe66VA8OkpOU129DDKn+lkiSS6E4EYq6nRoUPMc9iAtwzKmQDeLxh+C9CNptz6n/E821I3r/15va+r3H6r0DfYZSCg4udJc69ZFyH1lXfibDBGFNI1Y5HwkLNUb1vk7diyM5O0Z/dRFEfohv4tMYTIOknfMu4zwjFY6QikMi4kzCEcHvGPRemSAgSOZO5ArI8fwc27fJ/lRi4MmKaVYj71Q0SpIVCn88MGF+MjaHMrwgUhX1AdHel3oNiZD4I9EVeawBTb1cVoQwizJqyIYFWAlyJ7xT9uK0/FiEWPcRHhxDsmibtZFkhoMeHB0le8IOFju985iKpKFM89A/NbqS/h6c615cEqvFfXRWKuKFq8CQTV2p6vLWT9xqyeYXEBgRVwyVRF4yrsyjrC2xBqNIfw4RjP21E2C485PonFt0uCDYRT5VFXWTzcMPEzYZKFGXl1CypJ2pPfSthyv3CEstr5mLF6qybDxN5MruiJavLkC3pgSlEwzPLI5gQtgSTGQF+kciVFRYPsHSip7xlo/bQVWDnlqyJ+nBVrMCbyD/DgucYgJSkj19lG+D8sTC/MqQ76IDpLakRazZrwJSy2zfAcRPUb3lJsQLuvdpS/aDKTUtFjB/rZVxy7lGWYGBMtw="
    ) {
        // Set the direction the NPC is facing when spawned, use decimals for this
        rotation(180.0, 0.0)

        helmet("mcc:island_cosmetics.hair.professor")
        // chestplate("diamond_chestplate")
        // leggings("minecraft:diamont_leggings")
        // boots("item here")
        // mainHand("minecraft:potato{Enchantments:[{id:binding_curse,lvl:1}]}")
        offHand("mcc:island_gadgets.fox_launcher_a")
    }
}
