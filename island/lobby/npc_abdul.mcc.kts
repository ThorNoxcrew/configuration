import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Creepy man in cave between Charming Prince's Castle and Lime Llamas house.
    playerNPC(
        absoluteVec(168.5, 57.0, 598.5),
        "Abdul",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3NDUzOTg4NSwKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCdUlJZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTk1MzliN2RmYWMyMGY2MmVlNTQ2ODc1MTM4N2VhMjMyNzQzYjUyNjY1NmY3OWFhODU2ZWI2ZjUzY2IxOWUzZSIKICAgIH0KICB9Cn0=",
        "jsDHaBsBCOpFZYJVKG6fHPGlsGdTsaKjUV6jbhGPwVBcqCIxpA9fjeCYpHA53E5oaCpVrk3mRDA86Rp4hdpZozE58Bj5DnGyN4kiuyns0pk51eaiEWao9ZurOvBW7/hvtSfJJuOb/6woXRNVFGp7uJJY7DWdEc17TgpPsIEJsI46FZZr0NMZWkpwsQT39LHn/i9QzQbbpjRWcDiTpYt/kaWEfZkzPI/7iiKLxue6pjwKyvqteOQd+ZMN/hDOPFpEnnOpct2Zx6CHnNLS2GvT4iW73pdB8WThet7oHKoPMBaIqxoIje40GmbU2S0182OvTadGhlJCBlUJHKVXQu3l2a3Vxr5Ph8ODaCYOp6BnaCMXVeIjz1ZNSg/pAJvS9AifEkiXdvcanQZCBW14t3aix5EO+e3577CMUBbuXE4uNSadS0+K2e/yn2HIfQLbltEweWRbAC+GCg7uPE420AmLRxPPzulUJFSxCbbEpGQg8z10fNogRTeOTjCxbaaZAr3ONdA3VJ+Y5Wk4Yb53bDKu6WhODEYO6/X8NcZBKJNoNcaHRV7DvKxYHxkRls0Poo/1i+ZWPyVJgy6aD5shcG0Nm7B3Y+35SlotRWx+atzAxuSqkIyB5zVKcUBBWUyJ/mqOJ06ZEUr7u9WE/xiOXxtS9DYOOQ6+vfobReYHpdt1cBI="
    ) {
        rotation(120.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
