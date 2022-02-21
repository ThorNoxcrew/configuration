import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Robot worker on orange beam of HITW factory
    playerNPC(
        absoluteVec(-751.0, 49.0, 1290.0),
        "Jump3r",
        "ewogICJ0aW1lc3RhbXAiIDogMTU5MjM1MjYxMTMyNCwKICAicHJvZmlsZUlkIiA6ICI3MmNiMDYyMWU1MTA0MDdjOWRlMDA1OTRmNjAxNTIyZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNb3M5OTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQyOTRhZTAzZjIyYTVjOWExYmVlNTBjYTM5YThiODExNjc2ZTZhMjQ3YTJjMjRkMjQ4YjZmZjYyMjhiM2JhYyIKICAgIH0KICB9Cn0=",
        "QtwLkbasxcXb+qFCMkwsUB9FCW6KmQRmXPt2X9E66ndmJ/zncuUV6rOXtkaHi40mx1aaeEWKu29FOrdG0EEje4HvxwM4Qk5QOIV/tctPqCOvHCwAUsQLtX7pTK2R2EphAx2I22TWjSci8gfsGBXovWIZXbpbvi5O0TLOtL1zyo8txf/EYMONqsA6aA8fQpye3/7iwWR3VseK8joumahMom50b6pTXHixaz+pGI/yAypt34sATWPeWIQZk9b51+OsKPYwe4aPy6uY62LSbUBIjA1PSvUzo7CBoO1wSDXBmGQOtityWP6Dy7fto1zGVzi0kDa9Jn6AqgrSM937gKWVdRCM87PR0gM6TE43mqpTUAYF+hxKMGq9gWMurCW3JzZa3SeW49wENq7IftfkPxuTih6J5RygobS6SF0RC+WT3l/VpoFAxFBTnL3tY41Y3zexuAynuoKZX5AJXB140nbcDTFHvXMPfL70ZNa2FQZET9Wu/HlsxSkqwYcbI7K9Z8eFYXqYVkkw/QB52CaBnZhYl2maqx3Rz4rzYKhZOaBBaJWd0SeGZANYcyxPuGSFw41+p4KXBZ2fpb5OsnGtxu1L0+6xjTJumcr+aIPpa3Ot2k4/Xwm1xck9QKW+C3ROWCrE2V8gOWJk09ZPhJdrZ2kJk27874UidQ5KH8FRot7mtQQ="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(-751.0, 49.0, 1285.0), absoluteVec(-751.0, 49.0, 1296.0))

        type("ambient")
        mainHand("mcc:island_cosmetics.accessory.robot_arm")
    }
}
