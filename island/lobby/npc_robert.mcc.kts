import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Painter stood on a corner at the back of the town hall
    playerNPC(
        absoluteVec(345.5, 32.0, 439.0),
        "Painter Robert",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2Mjg1NDQ2OCwKICAicHJvZmlsZUlkIiA6ICI3MzY0ODFkZmY2ZGY0NWUwOTA0ODg0ZjNiMWExMjY1NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd2lsaWdodFFBUSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hM2YxNWE1YjQ1YWQ5NzUzMGY0OWViNTcxNTg1YjNmNGFmOGNhYzdkNDUzN2FjODRjOTk1OTI2YzI2YWI1ZTdiIgogICAgfQogIH0KfQ==",
        "F14niOQznARqfl3MMHF+qPkMZGFSgpEYzG6xpbuE0o6Xre1LibAu1jZs1r4cgAeh4My/obCPpJ7MFYRL7cSj7+R0kmenVvncsfiWyBNmizFnmcxFUUpqnoGDr63m/fISzT89DAHb7UiLLyOJYzIUAadj0HUbKcFFszxv8sylYu70Jptc8DWSA7aQROGlRCWPJ/P2EIpJIAXtMM1o87UCRlj3dQBIk50zGrVXQwks4sRFufp9yViJ+Qz2Iqt/lCYkVs7t4VkuqfzI/JHRyCQUsRC81gnIw6GchFD6Rqm/Lmo8ajcAQ8qH8DY7neeCxjgBD1XEuUZ7ij0+SwNRWEhqbZt6irLLxGWoOPqVXvZHolV8YZ/gt8YyhcfwHpgwEKKjTZ6YmmS4bzhfjWRtpIcIsE3LJmeWmolFyTgn/LVLcfZLlR0RUAbVl5neLPpb2rd6YMKW1I9WKoy0K1+IvTcOmzIpHAblBJ1INWTGc0ofr85/mpvOcik3GL2ba7Psi4eld8FJ84u1QMnJTdKYEV2G24qNwqDrZgyOeWG+J4SnD15M46BpMz3AaG5gd49AOtfYU/nNYFU/zpIXfnJYGUlsWeZYNJHLru/eSWnRYlqDEF7sKtSG2T9h7cHeAg1z7Ok+DpAWC33KEIz+O6sBCFxfALle4RmKpeMn0ad5C01sAg4="
    ) {
        rotation(-50.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")

        helmet("mcc:island_cosmetics.hair.afro{display:{color:8932428}}")
        offHand("mcc:island_cosmetics.accessory.paintbrush{display:{color:1296363}}")
        mainHand("mcc:island_cosmetics.accessory.paint_palette")
    }
}
