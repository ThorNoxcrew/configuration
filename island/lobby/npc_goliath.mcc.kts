import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man on couch in library with girlfriend.
    playerNPC(
        absoluteVec(273.5, 41.0, 612.5),
        "Goliath Omnom",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNzg1MDg0MCwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kZTgzMDViYmFmMzdjYWIyYjIyZmQwNWYxM2JlYWZjNmU1ZTVkZjEwOGQ3NzA5NWU3ZjljOWMxNzFlNjZlMDVlIgogICAgfQogIH0KfQ==",
        "Vpl4CAcPSvHkdZGNgIyP3PtZsuGL56/F0DxxDXLA5ZtpEJBKq6pZ2zaZ+lPG11YcgpXaFqaOkgaFc24tCcscBp75az00nXfKSpk23UEVM+kT1j5ouqRD+7UEdyn9LWxRFSUWpfmPbcLDW5HAn/UfVbek6aoYyHtxUewxrmTfzcOuEELOcRtGldXq52TzY6mZzAcUi0R+e92dNkekuym0U1SX5FY2nM4UDy1uF/twcb+TT72WDyg1iU/5rR67mPM59e5r+BOlBGATF2jVu16e+tQFpsoiTWD7umoNmJKZBIwvAYybc+mF9r4wkP5Ld+wf0LRLE5sImzHoc81w3nKY8IXGfgLRHrSdQIUmClVCn0in/72x9AC9KpaNe8DHBBwL+uFoNTPHqFwiDthJOe4ixMa7qA4fFsxr0ggylFPuUlwQHp5ynC4sw6dR/QZmr37zTOAxUIsktn8mz/Jr84C6ksSMy6YjVK9qdntBQQEssGzQ9qOumibS+nsq6pdEMtoA3oaND6MfFIZjwR8AbefsI32W1BTe/FYePNcQNKArIGSy0ZL8JAQwQa4YHf52ChsUOHSezLEU8mVP2wOrHnlAnYl/X0/3D8RhgqvIiFmyafiLM0a+tZp/lnh37w8HAV1sj7Je0xRdo4MmliNyMwCkLhLT7wvM1mQeJVGW9LCrXDA="
    ) {
        rotation(-135.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
