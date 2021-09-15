import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Part of trio of girls that listen to outdoor concert.
    playerNPC(
        absoluteVec(357.6, 32.0, 438.3),
        "Bella",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyNjg0Mzc4MjU3NCwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjRkNzM1M2YwNmMxNThlNzcwOTA5NDQ5YTUxNWUzZWE2MTliYTVlZjFjMTIxMmQxNTU3NzgyMjY5NTEzZmRkZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "P7norF8GdglDUf7RMyq199p3sOUR0QneBWpI0VQSrCfsU5KM4RckH/V2CMdQmZwZ74qT8PVE/WGGXdnx85dedc5djIbVCVXZ0rSDdZxoEq2sF01C8N/2CuZJEyvIiXIwGwq0ylz0PAt6MBiVR9wTFz5jVTQNr/Yq5ts5pc0/Ua+eLhliKadgiuoHjPKzTYbrcuhhDN/QZOSvg0iKXp81mWvQo3i2N11LSfWywLJWSb74CwZsKjB6bDSQ3nQP6lHLkw7NUW7twzZzqqsdvFzS1ScVDAEP7oMhwwU/bR0wA/n4MVf26h13Yj+2g1fypvh4Z/7kWsQJfFCbkS9rzAVOesSYLB/jEI2q1VFlz3751zlCzwDxheXXMoHL/rttXqeamtGjizDKjnrdyulfhOaKnyDtUCwZG6zGcThfunbRAO+F9Rh/sBwccV29xIYJbe784YMUy/cV+E2fSlMPOBulg0dBZOBgDP/b5wopsnlC4+ahMFmeSF2L5P965czbHjGHj7fme02F80al6LA/eybM+JuawaIGrnnO1WiVr+Iwrivg0stPVQYO21POtszpDDsEJb6e4JsWvKwat+VDpca6tGujURDlzsZYVjupVQPeb14tbmLVsmPNSNgo20Jz1/2M+3b7XW7hlC43BjWBRzrxwMr4OancUkzVUWbPIW7tfyU="
    ) {
        rotation(180.0, 0.0)

        type("ambient")
    }
}
