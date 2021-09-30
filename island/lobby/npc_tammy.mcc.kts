import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// NPC living in top floor of house next to HUB entrance.
    playerNPC(
        absoluteVec(384.5, 39.5, 529.0),
        "Tammy",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMzI2MDE0NzMyNCwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODBjYzZjMGEyY2UxY2NlZWYwYzRiMGNjNGQ3Y2JjZjAwODZkMGUwZWY2N2JkNTdkOTU4NGU3ZDBlZTE0ZmFiMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "vwBjiATleofzeSJIaUF4jXVjF5cVlO3o5/+Dbk5qKkgT4FcTsqWfWSzkGsogfD6VVfcBINUZeOsJQc6cgWSCTwV+1DSYZrEk3Ltn1/CNELDVygHn0xXGqbqdbMyZmqdTuhUjz5/jkKFogx4tQmciToqur/qiwPMUcUT7MbEbIFCXazdH6e07H4o6eCe+pO5r7daDgJOB9cutsQhWKzUnXHx0Luta2Hip9MGbdCgDbMuvaGwJGluA9xhbWhAZ5C4WyjnlTO2ztZ2CkDdqkIEX4CsdlVqYCul6q69jPnQ35OO7hoVzorZmjMX3GRZNf8jZCWWQN7FvCznIOAX1f7oYAMFBg2fajhwOb7Z3GBGGUYEEjzOo0/C+LNO2Es8qdI0CKf/SwdQ0oDvDJUxJ9rrPElwWOMklciLUVFyrHWL2Y0VmD3x4cRu7kNfWh7souiciD1KV3HaljAYji85pEyX9N1Xg1GulNGv08xxaZ7xttuiQCCHtkeeJi4Fc2jWl/4BBBLGXzmRDewZjvOb5N1k4uY/Aqo5V0r9bCCz3n/Zur6Gv+ArtyY3N93Le8XlHIIoYouh0W1+mgtIq/KJdH6MT1aRjxikFGp+39KwBFn1GdTC6yR2uIwvReUzg1Dq2oU0UsN0uhwS0CgQobQ77Mgt8ejQwRfHCxhLTnlqYJLvoEaw="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
