import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl at tables outside of diner (table of 2).
    playerNPC(
        absoluteVec(339.5, 33.0, 415.5),
        "Bea Loverly",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNTExNTM5MSwKICAicHJvZmlsZUlkIiA6ICI5ZDQyNWFiOGFmZjg0MGU1OWM3NzUzZjc5Mjg5YjMyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21wa2luNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTU5ZTlkZTgxZDE3Y2RhY2RiN2U4MmMxODI5MDdkMWI5NWExM2FhOTZiYzgxN2FjMzJiOTM4ZTQzZDQ0ZTAzMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "x6cybzS6II4gqIVCB0cPyEAAJmbWQpW6dOFjdshgZvBmK/Od/OUPsDjjJUmg7uXtn2SDNw14a7s2enH/O7J0FkpGkDND9iKLp8R0W9FzgMHgi7LJJ0Q3BL07IOfkfHVUVJPp/IJCfnsyJOQwzuInF76KK0EPp7OWTw4y/LZHGjlFxdf/xs74buhOv9x52rP1QRqkKlhL+91N4TIy7dQ26NBX9WVR6ARvm4v6ohJVDp4GiTfdJWSQC9nbk53ZpNFqJVwp+W1HZ8yeN952V6gOubi+NL1+01iZOzn8lGNwSoz2pDGjPMxR51m+TksfLIGonQZqnyGFV45YYsHNXeF43UCnVw8hMIaSnhD1lkw2txNku+vnn2/L7Y18nhA2C7NzOFJHpVB9WRZAWIc1T9XJY+UYnA8FnA6jVchK+Cby0KpP8ktk/Z5C6A4TgH+wGxd2HGlIM56mq4lRI7wQ78qWKnlBiTItYCqiwOTvf3hMzU3Vc0VI7jXvQVx06Nb0AalPc5ESp4l5Lw2NmUlS+q5mPX39Bj7sW5BnCqcCmvmlZ0iEGPSwDb9Q09DPiQh6+iY0v9nmk4sx7oQ4/aHJ4Ds1NbeO7MXZCOocwaRjZhszRckpIWBMbhZ6V+TYO87Tiqq4S5GfrpXL7b5YNdC0fLCOF5YV/kVtrcbvlBX+LWbkIo0="
    ) {
        rotation(-45.0, 0.0)

        type("ambient")
        mainHand("mcc:island_cosmetics.accessory.blockle_tea{display:{color:13145600}}")
    }
}
