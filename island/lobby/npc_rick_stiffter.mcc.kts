
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(277.0, 34.0, 402.5),
        "Rick Stiffter",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NjA3ODkzMSwKICAicHJvZmlsZUlkIiA6ICJhNzdkNmQ2YmFjOWE0NzY3YTFhNzU1NjYxOTllYmY5MiIsCiAgInByb2ZpbGVOYW1lIiA6ICIwOEJFRDUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmIwMTFkNjI4NGZlMjQwMWE2ZGQxNzRkZDM2OGViZTA3MGE1MDcxNGU1NzhkMTE0NDA3NTIzMWY2NzdjMzcyYiIKICAgIH0KICB9Cn0=",
        "kzwnHDMBQ5Z3ZIcXKMpOO3xHbTxXAlrlc6OpJ8+gCEmxDzcxrzy45M1UOQtpfE9S4FnRJJfdvbBSg6rN9/jp/B56SXypuJCJAy6BYwz1uY7Umkn7NSG20xvVQVB68olrf09HBbjA7a0Rn1g8hhFpzjiUxSTPK4FS+Wk4NTwyvDC4wqBpgDG/Mp0XVw1zgoeEbaV4OmiQmIrkHNhNRKDNY5b/N3lHI/bglDyrdxRMBpbZaX3oIMjOAMHl0SgrL4zJ6cjcCFGS/hQmH01TRm9Gtkm891IaBreI1UUgguWJuJATF1jIChL/JZZG6kZnZhU2Sb1947KITiBt/yLeuxHJjYTCJ9+W95e489FTlX1D86Fu5R6Qr/Dp7E2sIeMpmq/eFYJ9PsjYk9CsGhjky3MPY6OnZvT7g3gHWdfUsvzDRmRpdtVCJkIHWLPnwdMoZ+D5ARogxgUKRnkSgSXISG1y9aPpBGydkUsFEj4SVPaaGsSe6BoEYX18L6e/nBcwxjypv+S5H529xXYAcW+MIBwXofCGuY++NUYBiwyknYbFw/msc+Mi/zXPiYvbGXDWmr3zf5CcBfUJ6njdvWr3Fdw/RR09W0wacEE4DuSBEy428nEzPGv6JxlVpby2XzRVXB/GsR3HnJ4YRZ++3lOpLW842yfTP00TRqnt9ywOGsUXnxU="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        helmet("mcc:island_cosmetics.hair.handlebar")

        belowName("island.npc.ambient.rick_stiffter")

        type("ambient")
    }
}
