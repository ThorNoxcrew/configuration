import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Roams next to Brawler X in a sort of mock-duel. Named after Venture Bros characters.
    playerNPC(
        absoluteVec(247.5, 88.1, -785.5),
        "Thunder the Cook",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMDkwOTY3NjcwNCwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E2YzE4Mzc1ZDg5MGZiYTU5NDA4NzBhZjAyYTVlZjIzMGYzZDEyYTNmZWViZDAyYjc4MzNkZWVjYjIyN2JiNDEiCiAgICB9CiAgfQp9",
        "t/sDAS5jiIFyDaiJK4n+KqS5U1cNYbvO09uA6o55uPDaZ0R9DUqvQ3czK6rhUnG+CQB/0PAVqkA8p+43jW3r2nkliZYo5VKN0097EHVAhucv9HBBSXTY52zKgpCTb0qS0BeMpoDtN2lEtX9shatgnEhSAo0z9P/s774RBC8ucy23uj2Gskud3aeAF42Q93+JsfPQOzJOet+SGgKoz8Q/KaQvkCnqSsh+WZaNjUErdiJcIRbM+G9IipFpqXlK8a+sApYwFLF28781t4DbA2NrjO6N2tXOgGqb2ZKCHzDp+cDzbHIgGJu7ES873igDTe+SwfvWTKlvmUXHIN76pk0jK/tnC2xgdg8LdzuMNz+03fZypvySQT0IRRtYhl9Ciuia2fMEU1Z/ffYxXeHoIdL6Kh99FJIzdE5HSK23mvyg5gMowSfEP2E22+tAbBXE8aOLMzQRYP87uRlGYakCaQ6SwoIWgKfdYTc3CJtdH37hcTlgAgKnnc43PcpOm+Rh72frEdu7+Sa4FT1xSjrcsKuU53mHfvat1niBzqGJ6+7F4SwaKEkvVsy1YsVTpNOlSCTzVYZQrtvxR7r1RP7VBbaudO8bU70zmX3hhQvrYHPqCq8ZDNcFH/BJwwuvEvpCIY+YEvKASiDFMd5CGTDs0h3r7nYL9vF0lhhVRpXXanFQAFQ="
    ) {
        roaming(absoluteVec(247.5, 88.1, -785.5), absoluteVec(248.0, 88.1, -783.5))
        
        type("ambient")
        helmet("mcc:island_cosmetics.hat.chefs_hat")
    }
}
