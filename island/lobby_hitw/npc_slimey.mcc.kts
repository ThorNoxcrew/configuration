import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Robot worker near slime vat
    playerNPC(
        absoluteVec(-234.0, 37.0, -746.0),
        "S1im3y",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzODI4Nzk4NDI4MiwKICAicHJvZmlsZUlkIiA6ICJhNzdkNmQ2YmFjOWE0NzY3YTFhNzU1NjYxOTllYmY5MiIsCiAgInByb2ZpbGVOYW1lIiA6ICIwOEJFRDUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ2MDZjOTE2MDBhYjBiYzAxMmI0ZTMyZGQ5Y2U3ODRlNTI5NDAyNGJlYjJkMzQ3ZTQ3ZWRhNGM3YzczOTc4MyIKICAgIH0KICB9Cn0=",
        "hUr2LEK9Uu866MKF2Rbit2pk9WZyfT4zrSgV414Met0ekQ18jq4pBF+GaLvzYDacHOmx7emOiKZplnyTinYy2eQn19UVitmt/rn1VzjrIzy5U4VIpiUTfZo0rNP9+NAEs6tZOV0MV4TGolFrxxJ5/zxf16X/0pB9z8CrhP4jyejb0nUnsu0P/o02xDR+jEoUKUPMyw8nd2lN1alfcvj8vQVbyjdaxvtVFCNMS5I3/OJogzStrzoHej98qipGD0i8nR9sRR3K9GjY8FpB6G0y0trLVPsACdC7FcxcMYCFfsPty3y2uBOP+3stDt8OfwYawLwJ+Wk8ifAS9ejm/6C7+CKSX6PbUUUqX1jGBY5tG1bVRTTk41V3OB3R5NPRTZl8EfGI1llDfZt1XifbPn7U6twSsnm6DwPtyzTCU7gGsOTYp6Kz0i+vn6ij3BGZJIvZNimLHCybGDtLG5R1tyJrsm/KF7ZGXcbdznEUSQW1l8f/eh9DiaOQMHo6Ly8KSO3RTVOVZ5eDMW95zTWJ84iZ+ovw4SWlim1EGJUuiAxr9Hz01OtL4o7tQWl8ddtM2nyOxJhPCWzNrpWeT6TIyHg+4owKSG124xEL9HESgm3AyKoQtUFW6xl1hycDYOdCGsd7UlgvZJ9SIOOLf7ghJ3br12ExK69VplPj0OeEK2x1y20="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(-232.0, 37.0, -746.0), absoluteVec(-237.0, 37.0, -746.0))

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.robot_arm")
    }
}
