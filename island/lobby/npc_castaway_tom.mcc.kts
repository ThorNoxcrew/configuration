import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Castaway reference to Tom Hanks (Chuck Noland)
    playerNPC(
        absoluteVec(407.5, 28.0, 662.5),
        "Tom Noland",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyNjY5MTE0MjkwOCwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODg0YjUxNDRmNzc4ZDlmOGM2OWZmM2EyMWZkMGM2MWNlYmY0MDcyMjgxNmQ1ZWU3NmIwYzFiYzk0N2YwZGZlNiIKICAgIH0KICB9Cn0=",
        "syJnYPUxK3Yx7NjzkuDHOODCjnryBpcoPW1+qJksu2lLqS9ixcLdhI3O9b54nbLRoLB8x70Tlv583znijCl5xsNAGRcn/OCbfCfdAe6rTvw8ft2kXvr4PRDk8DOj7AU/LFvZhhOGNj6wmFlXmLBvRI3ZQbOzupPKK3ZVd+2DQhiEZXgtTPWP+FA8DRhAsxs/2ggjnR1wsWs+Qy7NokWgELMUUwZ6CmaItJukcFI/GfRlzS89+/4iG+t5ayw7/Mmf7WMvuh82cFR/L9Tgl5ghuP2KfTcUWwjwmPEVNZHG27d+vKEh/9OOCUWqp6QoM1NzvSoLxaeOE/kK1DZUJm5fZHkShl58evjHY22deIRbLyMEC9CB3vWV63STJct06okIGvi1yhwUPoFaQ0IPsS+gZFPQ/GNoIgQzP5VauOTJkSGJ2tmDORJU517n7+Vre8zX4teRvhYICJUEPYbnKw1LxME1XHSWKM+yjvIvp9DdQlw9nwpaPLT5sDf2Rm/I0A5ibgFInDtqx7hIr9CLPc1ci1ZS8GEqHcpODolmYCcCExAcFqHToFUReI9yKAb31kReqDHex8c17/H0fK8UFEL1BZ34CQA29ZXmZuBfBCBujJZyAiuJS14szTQTfd4zQWCTjQYMjX9chCYWZUDJmssv850Ma/P48MFHdQxZ8d17sX0="
    ) {
        rotation(-130.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
