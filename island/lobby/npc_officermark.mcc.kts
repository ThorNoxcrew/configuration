import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Officer on block corner talking to officer miles.
    playerNPC(
        absoluteVec(346.2, 34.0, 491.4),
        "Officer Mark",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExNTE3ODcwMywKICAicHJvZmlsZUlkIiA6ICJiNjhjOTNkMzgxOWU0YWVlYjliMGNlNzZmZDlkNjQ4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWdWxuZXJhYmxlQnJhaW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWE1NmUyNzY5MmU3ODhmMmNjZTYxZDNhMDJlZTBkMDM0ZTQ1MzgwYTA1M2VjZDlkN2ZmNGI2NDg0MmU2ZjBhMyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "aqymj6tsI/7l0dRA7pjBWO29FwZUwtMYHivotI1i0TuPJhk3Hkz8LA0ZI1Ut0sz+PlRGoLZ2dtEOBZbW0ZBO5KrMq1wfEcmniM4uW7SaxgO573KZ0am+DEaEHJr6BDiyhdkWiL9k421CUDFUA2FtObTTRYmz0h631ULLWznVKxIGVXYP8NofHMn2U7TP1+6wgo5W4cXUDfmgDo+atYnRqdfeCEHpCfB6ki+rYcHOSJdx9MMmbMMMvRt2XAcu5hBD5ESt6C7lj7926LlKxK4xlOiElRFLi7OtNLUQO7uYR5WrwV16e+SJyRJ5vncGXgXffuaTo0VvkGMTkeJUCGRBOnRLSrmLYBJA93oop8YY3LpDpffPgWIN8YayQ7ldnFDm6eixOGiey37w9pTWb0RLAUi4IzeBZiQPwbc67n7DYI8xVLa/RUSt/dAYgGpY6w2IIpNk4Vc4uavtC5hiyygsF5QMVqLznjPsMGFc+LLjdo2MeWWMFyzi25k34Dn8msfpAxOTOP9Pz6s/7thie8IquNeUwLJk6z37lFu1qeYO6qqIynMjbA32Qs8CLlLcoq350sBIl0K1mIkt1JrcL81p/85M5RYQynx3neke0hgF58ob6M1TxjJP4dXTU0xPKH523VlI4ox6wZ/ef9M132vi4w8oBPAPGksM2zPGhjAJHpk="
    ) {
        rotation(-45.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.police_cap")
    }
}
