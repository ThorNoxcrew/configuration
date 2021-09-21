import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Barbarian that stands atop cliffside outside main hub with other barbarians. Looks out across all others.
    playerNPC(
        absoluteVec(234.5, 85.0, 616.5),
        "Hebotai",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNDQxNzE1MiwKICAicHJvZmlsZUlkIiA6ICJhYjlkYmMzZjk4NGE0ZWI4YTVmY2RlYWMzNzEzZWFkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDeWJvcm51dDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjkzMmJkODE5OWMzMjRjNThiYjU1YjFjNzJiZjMyYjE3YmQ5YWQ0NWRlYjc4NDBkYzVjOTAyOGNhOGU0N2QwYiIKICAgIH0KICB9Cn0=",
        "CYdl5E6apP3GKUTuR4lnS1ln7wZOB201aGn9pJhRdh1dYbjgHOd1g9FYj3bvcVjLAmcPSdm9wEdzexH1ownDnB9DW+8+kOUDl7kgfIDYsl1ug9ZIjssfW6rOr2ctmK7XyX+XXlwJNmMglm4bj6ovbGf24zDEe/YAWAinz0dUbmMEz8hA4ONkgIH6h/igth9IndttwH0id8UjuWEku9wWDH6QeSvTJNPNosXBBDcpWHH+hoQLmoMoljGSMQys8LVfl60kRNCchescJTQD3JpBRh8awPHhExphSKk+2zw6L7ci7sQ/wHjb32YIK3QYoDvJVYdvmfZqhFf87TrpyzT05ivktPgOA2O5kzxt4U5Je1UgrL0kay1LP7Fk3R5hLevvo6ErLPfalIEodEjrxNTVSpDO58WTod6Kvnttld6oUrpLFzH22p5CZV1fIUlb6YzqGTQVxrFrQUgWSNKUcjWOGFo3ekWisfWx99PCNBvZjzr2CKBa/BEYwRTVVtkkitY4OG7GV1fjgbqMCh6o2f9mRi4S54wEGJUV0IKp/SRvlyxoH5kRvUYMtSbl24dVr2hxpxCIrRpAoKf2qgPkrqQr0ECMLmSHIgHvsxFQ8wgMKeyO9giHIi4huHCWQHuZLHB/jH9WQ1tlslHoLd2jAQaOxXwWHhXnaVA22RgxAgmX/bY="
    ) {
        rotation(-80.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
