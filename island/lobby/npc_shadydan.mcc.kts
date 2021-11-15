import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Robber on top of bank by AC duct.
    playerNPC(
        absoluteVec(310.0, 52.0, 418.5),
        "Shady Dan",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyOTE0NDkzMjg0NywKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIwZDA0ODhjNjI2YzYyM2ViZmIwOWY1MTJhZTg3N2VmOTFjZDVjODk3ZDI0MjQzOGZhODkzNWIwZTI4N2E0YSIKICAgIH0KICB9Cn0=",
        "lN+y1Mn/X8ZOAgEjON3puqGfg9bX/lD38st9oX4Eb10bYKTUvFElwRmxZziv7e8J3zzGAiocDWh+g/GYonr3AJjH8YO+RpGrrgV5ojO2kE2AwIRFLjD/zJrNAa92l75hR1/h7rrWa4N92U5+/NnUuoOJr0EkdYc+gpx3pjMqA1yYO0EXxNPC1zzCpkMKFfWuqMj5MVCKVq3u0/+sP1CgyFMLQ3hE2Mqb5P1E1iv71JJK48b1ZVHaIFfMbhxmMYpMaPPG8EVWuE21TsjnKPFKt/bBaBhuD6ub1wHjLzte6BCBbxBVm3kKQ4V8WlaGCAXCHURHx8WizljJkCd9WCjcx1YAEwELZc8rpA00o7+NZigwclfSPXoGBgVfeq8t+9UGP6ZxtuuyEBLgwyzCN+xznILa/xl60ONdeQzMj7ZQ/BKiMaTiKGcUHGuSpSTzd1Vay6LtjcYHdycSxOZUwLe0bVFnye/uLLyZKLcJY4gmW9SGWCB0Gp10W/u4s+cYaMO2QekkX/TLjWf/K23Uwa6y0e0OGmuI/ESTOokgdkD7HcIj+0uateAIlQ03j2N+RLBSqAQpussy8aXnoQv50dcscwsbZoC49p7aRaIywBDeqjmcxrzmY/hjdXx34VOadoDUv/vaJ9KiLATXBhDiTNges0YdsAdw55T/NvNIag0HetY="
    ) {
        rotation(15.0, 35.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        
        offHand("mcc:island_cosmetics.accessory.cash_filled_briefcase")
        mainHand("mcc:island_cosmetics.accessory.cash_filled_briefcase")
    }
}
