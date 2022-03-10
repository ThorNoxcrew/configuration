import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Construction Worker Stands on corner outside furniture store
    playerNPC(
        absoluteVec(294.5, 37.0, 489.6),
        "Construction Phil",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0NjgwMzA2NzkxNCwKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYmU5NWNjNWI3MTgyYjM3ZTI0N2Y3OTk2NjVjYTUxODliOWI4OTAyMWJlMWJlYTE5ZjkyYmIyOTVmYzM3NDMzIgogICAgfQogIH0KfQ==",
        "GhWWwAKrmOfT2Tb4v34UK2GUfNMQGT5MbiEpy6Y3tVXd03ZTs8Dk3az7JQ899ftnDFLslhJZNDyzFcRSmGs6ufQEGLPXJIP8/vU7oey81HZ23jktNuh0HXD0t0aQbmgxrrx6vwquypTilO+5JnidlPS1braz3etTnYBFrRPOUHAJKUEkIYijmfVTDR+DY9LdyOiDA1tj+K8zY3v4zKe0qy3AA9/lxR8dlKszWEA93SlfX6yMXVZuFhOuaLDKlsnFZxlVIZIXi/r1Qf8ShwmE010AT4j5/9ia7jlXb4Vw1tgM2JmGJ5cKXlGEsoMQF45HiMxDDAXWijBv8/ebn3vaZzEKiQdyKgj4LUAFdG2kheDKN6CCAhW5QWRkddlE4Ndno3buEmu7TkjAGVcy5gRFBG2OyZuUNYty+vlKc89UwXTNFAUJolwXpLLip/FlTxXrDES9/oiDkkrhwjhQlsxJP3Z9EwLgD7T3yghnWMPcTFsHkvIn/qsfZrWzXotT9zTmIT6A9LBBl1E1mRSCQGGd/SoIdOTE4XNtFAuLckhSbamm9SUjshiuKiMQC7MgRUXo6k9HGP1kmVJXN8V9HVaApSL3QIF5CppUxv/wJFjlr7W7JoQfiht7CANVZ5QF2e0oEuSpX36v9nnLlJhXJlreqa07DxstiAT1RUtPMC0WBoY="
    ) {
        rotation(130.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.pipe_wrench{display:{color:7713279}}")
        helmet("mcc:island_cosmetics.hat.hard_hat")
    }
}
