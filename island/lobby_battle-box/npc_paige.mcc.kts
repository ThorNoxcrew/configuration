import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Woman patrolling area to right of battlebox lobby
    playerNPC(
        absoluteVec(1268.0, 31.0, 48.0),
        "Postrunner Paige",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMTk5NjU0NTY3MSwKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTI5ODYxYWEwNDk5ODJhYTg0MDFjN2ZjNjBiMTMwMGY1OGExOWQxNmZmNzE5MjJhZGQ4NzQxNGFiYTc0OGQxIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "PrKbd5huuegISi80v7G3Bb5zlnWOhhhQ/HdmR8+745KZKBGK9pwiNVIbkju7/SeS6eCrvh/MwZoUI6DeP8A5wTPIX9kvnt/62wXVIqIZ7YZ2N3IZVTomGAdz+oljuyUkNGUz6eLR8T5EKAP3Be5jRcUcnrglEEYlVK62R3X+/YT3F/uL0vRZwDN+kn6/P+XOD8/8TWyLBrKtbHUjzio7ostmquQzNbtxhqzDErCgNeBqY8l1FxGrK+6QnF6af+0zZ/NKxogRehhYgATx69/CtGP4i2Fce3Zy/w9NNgtArxFn6QzXZ9fn8gAEU+8MHDEVgvk8AX22hCbg2XMRagtVn4f+Ii54UL5AouYP2t4tzM7ZDFeeftygRHK/tcSy1y7UL7BwHCguwwYcXweA7A1pQtdGVDMR9UFGxgbvfddZfk0/Wcc7XLeN/2PFrVCUN896U+SXOw2106yBrEwJy18DOxdzla/aOQvax0mKlfKE+2OO6ARbAz50wNgiWs4vNwlT+i/8J19prKO6Z5jAPbGVodvkYFSMBgB/8YVAbfWCorDWtpYHPkzirqWimxJ2y65zHj2lv+6JWFE8qAT63ChEqbnKLOv7GtFVdiYsIx0G9bHciAGbzgnX4/w96/xklQrQJpYsswGgjs6Q1Q7CgeLrteprqbkFAYIEjtCp7b3IDJo="
    ) {
        rotation(90.0, 0.0)

        val pointList = LinkedList<Transform>()
        pointList += Transform(1268.0, 31.0, 48.0)
        pointList += Transform(1303.0, 31.0, 48.0)
        patrol(pointList)
        type("ambient")
        helmet("mcc:island_cosmetics.hat.headphones{display:{color:3609670}}")
    }
}
