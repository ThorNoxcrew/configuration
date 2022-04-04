import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl surfing in the shallows
    playerNPC(
        absoluteVec(159.0, 25.0, 380.0),
        "Heirani Tetuanui",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjc4MDMwMzEwNCwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFiMDBlNDZjOTA4YjI4MTZiNTRkYzJhYzcwZDQ3OWM3ODNlNTZmOWMwYWFjNGUwMmYyMDc5ZDAxNGNiMTAwMiIKICAgIH0KICB9Cn0=",
        "SsgjCtfTphlrBobAX0fqC1nWp3IBvMQNeoE98IOmaqSeaNO6hm2Z2cknmO38e1I+hP2mr2aRvVyiOWq+qghMirUTrmk5WjKMddqMgzn0HW5qDOpXdHtQU1GB+JyuX9UvGaxt0rARGQbq3cD3JgdoI/M5hHKrLy/zW1uuXXnBsWOrq2Fre3l0G74PRkxhHeg4ObtnSRXE81wqIhxVIqzqV5Gys9nxV6+dkEIZuerlg1SbNvRLoumfanrzzBp6VVwIL7bT6MaGVOG/Y4LcgL/0C187fHuQ3HPtzFSXPPBxrX6s3CFBAn1/ttEq3uRqw7YR+IPFQIFVK3ABNwjFuoXv2MhutJDtsaqZMHdBBaaO7RCHt5TBIg21yHMB999LJrj0ugwqrvh8bXeKzyBmgcpeDcUHMaiFhjeoMS5tV+Djejxqx/ezjB2cZo5oz8hWdxVEnlRVAP6fiBzNZlC4Z2VvGfmXZb4qY314Po77QYd9TZkPt77pRh+DD5Icw0NabAsUyLD0xFv20BKPuot2GpeSi7AAD46o1NqOun6aqTOYb/aomil6HdQYeDKQRMA0OEc3gHU6smaR7shja9xNzTogLlmIINm+c/MtEwR8IoUNv4eoMt2KKJ+PCUPlAjgqfazXN8/VGMI0cfM+u9WIymzpUrV9oS7CjrBvj0kdDlGir7Y="
    ) {
        roaming(absoluteVec(157.5, 25.0, 381.5), absoluteVec(161.5, 25.0, 374.0))

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.surfboard{display:{color:13927886}}")
    }
}
