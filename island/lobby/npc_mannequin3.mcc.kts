import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Below is a Player NPC with the texture and texture signature provided, you can get the values
    // by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's
    // API limit :)
    playerNPC(
        // The spawn position of the NPC, must use decimals
        absoluteVec(336.5, 35.0, 464.5),
        // Translation key for name or untranslatable text
        "",
        // The texture provided from https://mineskin.org/
        "ewogICJ0aW1lc3RhbXAiIDogMTY0NTc0ODEzNDgwNCwKICAicHJvZmlsZUlkIiA6ICJmYzUwMjkzYTVkMGI0NzViYWYwNDJhNzIwMWJhMzBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZjMGI0ZDBlMDNmYTAyMjAwMmJmNjhiYzQ5MzYxYjUwMjllOWU1MTVlN2EyZDJkZDI0MGI5NjE1MGM5ZjQ5NjQiCiAgICB9CiAgfQp9",
        // The testure signature provided from https://mineskin.org/
        "EWC/ukGq5LGzla+MOxaT318LTF3ikZ7uYWHYhrOnLgtbEB0SWWxysvXKVoRU9okFKP8KoGiKQtYo2uO/tak4ATDXtN+C7fg8HY1Be5yui6YdxhzIfNpKFb5g2T+H0Rq0RLzD5DESwOrmGrODLJYjs4kUD1XP2HbeEVYcKQLx4061yoXMPACrncxIhZHgiygTXxBHKtto7V3lIREuIxsgr0KJhWId9n2Ioz3Qz+QMEbC2mQ9Xsv7IF+YSPsybLuKWkwzprZXU4UuCmuELJUFUP638fdXvSGV6elerEfnXPrsRnm89pLdNGwCKeJcPoORc9FIe0wl+0q8efVnvtVPiYbyv97vSRwhyXEbVxSXvN5xccjQJ+Su65u9htADaqhzPl1HtI8a69LcViZX5arxPDxc8nxRVGQl+EW7Js4lWiX3reQaCeqvx6h6d5YUCPjdhiTYs6KfWT3LBuq8j83dw5E3Di4JXpezh8/+ppwp3m5MPQ4eSCq4X4jxc3Hm8A3mCgfXXwEA9B0cSLxXa9gjOJDj0w+8HQjlw/KSAfe/wefzClyWtR1wVvwZhEphz3n3I39VAj3KCqNNJ7wREz7C8L4GHtxv7TokXnSq9YWCo3ms1h46eOFHp+LNFnHnZdKLc0ixWcgAb27tx9tQoX59IZh1wvD1L7ufjp5wwiTnNuS4="
    ) {
        // Set the direction the NPC is facing when spawned, use decimals for this
        rotation(180.0, 0.0)

        helmet("mcc:island_cosmetics.hat.snapback")
        // chestplate("diamond_chestplate")
        // leggings("minecraft:diamont_leggings")
        // boots("item here")
        // mainHand("minecraft:potato{Enchantments:[{id:binding_curse,lvl:1}]}")
        offHand("mcc:island_cosmetics.accessory.skateboard")
    }
}
