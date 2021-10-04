import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Kindly old man walking around outskirts of HUB between blue Bats and Pink Parrots houses.
    playerNPC(
        absoluteVec(135.0, 32.0, 610.0),
        "Tom Dimpleton",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNjA1NTQ4MDU5NCwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjEwNDhhYTQxZTU2YmU1MDAxNDFkNDcwYmFiZTBjNzIwYzNmZWE1MTE4NmRjYjA3MTA2ODFjMDRmZmJjN2Q0ZCIKICAgIH0KICB9Cn0=",
        "oVsVSNGAeIPcagA9ZOPPGOOSXRq/UxUcgVmU6K45jAhqlScDtTP6IQlEjnhWd3jA7KJjuToPxliYkSBk1hs2IYgAFdClGiy9stCXRnBat9NHxVPhyyPUmzRsONdOOJEW64YdSckJZJWnXZEtGwCGU7M4kub53b0r+4/M4gIIB0tp4cYc6jG/jvtdwMlMpIGtxX1o8AJ8kWt4FnN0MqLsahlx4PhJid37kk+176ufSzvgU70xM7SkRXNFHKIeemWCHmX/qc07AMza/ud0btmZUwbwDAxTg59Nqez8CJ3rSSloQSL9PcVbTSpXlQ2nJ6MrhsJInVvBg1+4qBm670vCwBQGzOEaMHORuQ7f0yZ/2aG6YtYmq2MmaYIxu+uUTkrACCyJnBS/TxB0wrfaai48Ht3cikf+Wun9k52mkckg/hzb4XqOBZG6yrAJ2valBQl1f31bSBIOruvYIqcpQ5W1QzASoyfew1fGv6B3DpG2gtdF2Ext/U+EVsPB3NNTpx5PkIQs3shDVMPW8mM62NwRQWbkdP+ScAO1mZQvU9JTlA+zLtEFn1LL7mgP/a+ZLg8zUsc9EOIwWte99w7B9XHiwhkcXmZWLIwy8nmOVdX9+e+Radr+BtrixPJf28A0bgq3c/wmA5HnF4ev3iIfHkJIsP0ZDAG5yUuYN+0dCeEOhYM="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(135.0, 32.0, 610.0)
        pointList += Transform(126.5, 32.0, 588.3)
        pointList += Transform(118.0, 31.0, 574.9)
        pointList += Transform(113.7, 31.0, 557.3)
        pointList += Transform(114.6, 32.0, 547.8)
        pointList += Transform(121.8, 33.0, 540.2)
        pointList += Transform(112.9, 32.0, 517.9)
        pointList += Transform(111.7, 33.0, 508.0)
        pointList += Transform(133.1, 38.0, 502.0)
        pointList += Transform(140.8, 38.0, 493.6)

        patrol(pointList)

        type("ambient")
    }
}
