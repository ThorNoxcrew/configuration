import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Sits on bench on street outside diner.
    playerNPC(
        absoluteVec(345.5, 32.0, 431.5),
        "Jordan Kay",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjQ1OTQwMzY3NSwKICAicHJvZmlsZUlkIiA6ICI2MWVhMDkyM2FhNDQ0OTEwYmNlZjViZmQ2ZDNjMGQ1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVEYXJ0aEZhdGhlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MWFiOThlODhjNWU5MmNkMDE0MzNmOTgyMTE3MmI2ZTdmZDk3MTZkZTVlZGU3YzI3ODdlNGI1NTEwY2ZmZGU4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "FXkywE3aGxq3RvRfoHSlBdTGp4h4AQiIktDPVQ1qGQjnEpmsiC3lwMYOCakWuf4bpFcbiR76wMDwUutmg4Iw19rVEkdrdS6CVmMC8xioQzySf7cpEmu9O3mJhOlN8LSVcjhvels/OYbKvk9I+eh4rmHYnPPW9kMj/TpsTUGyQlHvvOVhza6seeMeishbwJJjQpYFUpTal4q20RnuJEarFNPq3ijFqPLSn3lA7SVF8T+AWLE6ngVuvtEACSaeA9GTXMbY7o4vxatbW5tdMewUGqnWsFifkFjwk5Ge9zPbGkEEouc7aVJtktdo2TzodXxq8C7nHgDA9e/Y+t/Xs7BlYXgx19uE6wLjsbefVnN4+gOfDrjI7lMnHin7AJZzVLtwMVGiy34XYe7GFXAi+Npj6D6oSgYOwFkk3EbR/SOLZG20N8+1odvIIQWokKC1Z1nqEmB9vinpqCGLgJ3o5j8O7kNEd7OsTPREkOvzd83hs0w7s8u5HYE7B2JEoNbNGUpdPCRdTpXSLSVhFIijeb9CrhrddlEdCyfNm9zB8jHI9OPaCxwSb1kJQuyJ6MF6F29zTMdBEzWrEP0Z9AJMgNP9O+LnDofXIjjiWPu1jS4vg7LjPD2D3kOMDJvhRgpotwYAhX2QipK+U9TyvDryrNVKbVr1GbM1qIv8dzBXmJX9hGE="
    ) {
        rotation(-140.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
