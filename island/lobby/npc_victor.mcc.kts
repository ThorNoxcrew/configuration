import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Florist on 2nd floor of building left of hub center.
    playerNPC(
        absoluteVec(350.2, 43.0, 587.6),
        "Victor Ador",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTAyNjYxODc0MywKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJiOTM3YTA4ZWQ1ZjM1MWQ2MDE3OTQ4MDMyNTE4ODc3ZjgwMGEzMWE3MjAwYTc1Y2Y2OGIzMGRkM2JhZmUxZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "vEUlzogMaOkmmjYHK+tgI+TesnJuF20asL4D5elvwBkFkCAxzKq8+r41J3VhKIdc31FTfnTCVG9wwfGiefQnQpZOb7hdpnvr1HXC7IkEmrX8CFoV87dZMQi9gJ3dBfBQBCo1JPde0bM9KoqzbIrM7qlY6oAh36Op7DHoujVv5fY4dB7GcxqiOZAY4zjjdTAQnSbgT6xNF5j08RxNh/EToT6IUHFSeLgzbwj/7PBc7v7shHMj5vmjPRmaeFD37CX7vBQetGeiJnDRVVu7s2XYEtiUO4npT/tRJWDTUnUrU1W65oSGepSFDCX35F4dQ6fKMXm8g4Vbdo/sGLOeXIU199F/vqxQfnbnlgmg1IqDM44Ubt0y7qKi1nZsC2aD6Ds8cI1jkEikhEERa6YJ3iJEMsZJtx9v8g2LN0sudVic2fjNqmTxG6n5YUBE1FQOqxn4AgnfqMU3yooHn6a4hE+gODKArHARXBYzHcnieCsRuTUGikrJLUBOZqPGR1okVXqw7KNtzzyjw/IfjLqlmTesHOM6o8c3a9QjYywRbC4Y83Me30wA8mzczac5EyXsjyx/2zy1uG0sEQqNf+cQurBU/A+mTXIY1gLM9/4uCk0fwGybXMoVlrJ7FApVTkiM77OOKVWBVC1c8DzdPHFyWZr7GlldHPsSPtqBbpZ+k3U89cI="
    ) {
        rotation(-160.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
