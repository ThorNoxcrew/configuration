import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
      val i18n: I18n by inject()

//NPC using one of Thor's skins standing by the docs looking out at the water.
    playerNPC(
        absoluteVec(413.0, 32.0, 453.5),
        "Tor",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTcxNTQzNTAwNiwKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNTE3ZjliMzY3YjJjMmYyNzM1MThmNDM5N2E2N2U4MjY2MDVmYTExNzUyM2I1OTg4NWU4ZTU3YTQzOTg2ZDEwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "JsvloUgO7Q5tkxoGcuGk65Twyr/nXAlkiZTnffSaBeoOCIvf3Sy68GfPMO92m9vnLv8v/MuZtnfyOqO8iTm/MMe1fJOCeO4xAfmyi5Q7nO4dyMQN5JEmbjYP3OqHJt5Y2u/KMeggv8072wJQ3f5EalTdeWdcaaApADuMlmEIxmBh8Kit/HVY3O/T7Ff9gE6QKChqelBPgSTtTAaEe5CLNRq9LP7RW51AhN5ega3ZpYD/ypwB3wqHLZ34Euxhs2zgnVOtQ3epnyg9IFo8G+3DASLNOs2NFNgQx9iEW1iuxkBI2FEkNqZ/LUUE0vhSU83il6Kr2uiRNRGmgOVaWjUAXZ2HGeo1ItrdYf/lYhfgiAP3b25Fs6edjZhO/07JME/X0og0t7oIf+mpZ/I5g1mjpFW92062cItrGgs1Qv5jMHzoQ2g0YG2hd2Y3aZQt8N+kKvlhfkQtUB3WQS3VCRcReqO5TtgKMuwhDuwHfAkGWxbvzrBMc66FjgLF81g83/c9ZWB1sQg/Ad1eKyGaHZXVm1HYl0H/vGXJfPptQlIXB+UmNpMk6y8bLk02aUu0ncfaL4T+ahzcnZUtYN3b0PvkEi0esVWzOvHfqnkGBUXQIpPTWTEbVfbr7lv25tcAo9aUKyXJ1Y5mbT9/++u+81/sW3JIQka7V90Hl/lO9kT2cP0="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
