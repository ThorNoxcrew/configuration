import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Robot worker on top of HITW factory
    playerNPC(
        absoluteVec(-245.0, 45.0, -795.0),
        "P14t",
        "ewogICJ0aW1lc3RhbXAiIDogMTU5NjQ3NzkzMzI1MiwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgyOTdlYjViNzc2YmYyOTc1ODUxODI0YmJmYTA1YjY2NzI4N2M5N2FlMGIxMTRmZWFiOWI2ZGRkNjhhZjk3ZDkiCiAgICB9CiAgfQp9",
        "SdB93USUVZL1Q+Vub7EjudVQP6IxWfDlVrN+f3+gu6QEnU5q/3Ii6k0nmjWet2ge6FjsW9iMZ37/YBK67EhhCoS8vcLdwTMQkBnoly1R0Ug8+NOSL7gahMEeC2ooIoK9EC1fE7A2gSKSauKSoIlCNKTQFYsPNKZLlakEPyMprG6KerIcOvBTDuMzvDvebC6rfdX3eJO45bFW1H+TA4ohkYZEPcMAfjFaJPEIqZ/YRDSknRwGy3VQLd7SDjmGdnNHHq8XeCfZh9IIZtuhOkpGCIw0Nuu3DEpSGx4X0H32ux/jq41rMo9sgThOSRey4SvxPO/dsZ0koqTlYk2tFMDj1Dj8HoM1dSGoRm21Rf5rWn/TAHFm0MnEiXnEUp6vtI4XPVsvgo8xJb4W4BQENKsB/mJI5Z9nXrl7xbquOUL0WkU4sHucFKzJ0M+virnapg4BZS+zH5rZ9ToGbSTZogpCGsR4E0pJzvJLbV76iT3pW2jC1Vu7g5RZ4zq84yXPsVAMLebdP3UdZE7sNV9coqSedhCw8A5vOdZ4XhqYYWWEY4oy0x3231sm7k6DK+bGoCiJNeDh4YbeNp6TwARY+cE+U9TU6roM+mcm7scFHJfevCToJVdJ3LbQdoR9r45jXX9OVubeMTwTMITiP9tXvEtt7CKG7QxUzcItk5XTEla7qMI="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(-244.5, 45.0, -784.0), absoluteVec(-246.5, 45.0, -803.0))

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.robot_arm")
        mainHand("mcc:island_cosmetics.accessory.robot_arm")
    }
}
