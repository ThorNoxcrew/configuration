import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//NPC using one of Thor's skins sitting on a bench to the left of the main hub area in an alley.
    playerNPC(
        absoluteVec(378.0, 38.0, 610.7),
        "Danique",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTcxNTg3ODM0MywKICAicHJvZmlsZUlkIiA6ICIzZmM3ZmRmOTM5NjM0YzQxOTExOTliYTNmN2NjM2ZlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJZZWxlaGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWVkZjNiZDU4MGM1OGZmMzNlN2MwYmQ4MDFhNzQ3ZWQzZGYwOGVhNzUwZWZiZDViZjhlYTAzMzQ4NTk0MmZhYiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "ylBfPIgI1z1S6Pfo9ZLO++D0waHVyMt6zAEbMj2zrIcWR9yTKiRclAGidvMLBeVINkDocwo0PhyQ0NWXRBeOU2QAPU0eRNPHB/sFaVgh4qNjDKP1GPp9ZaZV3eWgm5Z2mL8eRURZ6HAOgr0bFK+/BH8MmyIHRrLZ2hD9/zT3ToxfuONFEXswd24Ugv8ll5wjb77pHuV/zp6XKIb/KalDjqDLoHFBxLlXlCV+EO7tGBtY50/Hlqhqy2ZwBG4MmnPMyMsfet2R6s1pOYEu5meK6+idEcWxjjG0nvJi95LPGRbb173QQbW73k3HEJM4yZzw2J5u4Zl/2ZBmP00YIuANC8tdt6RxGBnoVUsUWAQNw8Vhgb1R5zQQ4T6uFOYAQjKksr92eBZFyOS2uV15G0MOPAipGv7bA6kefN5xMJBmBmDbxEKy+QW9tAsELSh4ciVVMac40QXBAjyN36nKeHY42Nyi+I8DKv3d+WHnoUTyATkl6C4M9wtsopvHbRyGPR3sJUMUNrPP+arn7MeCqNUf3Ri3y+0NWNy4vXz2MvjvWffT2/OVIUFSE/6+amv7k3Xa/RXfAnxc6vACPunJeJQj51vle7FGwpH/SqgnuyifbYTR9SNYxpUWuwZTtvCWpoF+6JhCQYu8srTbYRLWm+lxQrgrSZJS60OgJvbTRzvbnnY="
    ) {
    
        rotation(180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
