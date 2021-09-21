import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Barbarian looking out at a bridge over water outside the main hub area by the mountains.
    playerNPC(
        absoluteVec(235.5, 79.0, 611.5),
        "Bronan",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzMzM1Mzc0MiwKICAicHJvZmlsZUlkIiA6ICJmYzUwMjkzYTVkMGI0NzViYWYwNDJhNzIwMWJhMzBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFjZTNmYWEyMDdmZGFkMjE1ZjY3Mjg5MzMyMmVjMzdhOGFhNjkxNTA4NDBkNTcyMWRmMmY1ZTdkMmY5MWU5NTYiCiAgICB9CiAgfQp9",
        "Bs5P2CeR5eDNVauP0YjJyniG6+AW+e13sYzFOX61NNfM1vgwWt42srEc88W/9ynbrdpkF8/LpsrLqQ9B0wqGFZilyJ6h9akYqWo2a89SIaM3JTqd/lmK4drJTBQhTUIe+zKQ2nQo0rz5QwgsCztEHjYi/mK0SWti+ISO9FMtbVzf2jqtcsrRkcs1gYTiAkCj41wv08b6qn2K+yo0rP4Qd1aFsNECIj7RJ/1Y7bGoKe3FzUjBKqemYKOASFbGXXVAHmrBIbSV2CY+SEnnc1J/zk8DmRFPcjdSd3WwE86y4yrfB8IcrhXuWJFje48lEs8+MITnDKJtU5soyrOOInnD1MlX+tudH7SVWF3aVT3QIM67sZGHyQp3sQnUGQn3t4o4ebgM3+6CTenZ8DOYWW5YURNotuprcJ3sjv7AgzjfBL/1VVRIy3+VM8ySSAYZBeWgdXiVFij1aMAeRusEJO+moiW7i259Mf9TVfx8VvDpPL9GtruxT5zbKfvmGO9Bz9YE6tuT7Bg22YFk0TW+QdWF7Dj0hrWVTpVHtW85Ij3Y4p9Swj8EkQI5DAWclFqRJzreB608Qm/eoG6tMcZaoqek0szhMd1lno5JWUL064cIOxlDdvkIPEmy5Qff68v9J42sT1ufWAtS2TAVTKJo9lLLohTp5WFHP6i+n1FwPvkKsnE="
    ) {
        rotation(-180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
