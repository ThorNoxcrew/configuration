import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Stands in food truck near kiosks for Parkour Tag
    playerNPC(
        absoluteVec(248.5, 88.1, -782.0),
        "Kigo Foodman",
        "ewogICJ0aW1lc3RhbXAiIDogMTYwNDA4MzU5MzAyNSwKICAicHJvZmlsZUlkIiA6ICJiZWNkZGIyOGEyYzg0OWI0YTliMDkyMmE1ODA1MTQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdFR2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3ZTA1MDAxZmFkMjYxMDVmNGI4N2ExN2RiY2E2YjhiNGQ2MmFlOGI4NGYyODZkMWUxNGM1YTY5ODVjNDFjYmIiCiAgICB9CiAgfQp9",
        "qC5TXLSTaF/JRMCNOHxfBV9jX93ZmBOAPmfcZRDnZ5ss6z+09iMCbn6MxwEDzq9JnqgwgfQmGvQRv46/dFH5zfSiyoixO9IzkAIoNdNT1MyyVS01Oz/1XzB2zWqM7gvDI69kPTBVDi0NVcPS0nR8hhVkj7iYSIRLSGDJP0Gvl+AlDmzJsr/pC8twskAHB/kGxfF6ntC1nAuUVzbEDT/qI+7HS+O92Qyf6/OM5NDC8RKi6H9yu7aE3BC1IVZT3nwfuee/OW6eERfDTNwK7qYRyzY9b93imtrsQT2hs2rFS65iaqvdJgB7Srhyh5LDEaNhxp6ioJRayvCpiYmYmqsemgCn9hi2aF1H/ME9+YQIBs7nevQJzBEUwsBzltyLBlxcLY30drakZI/XDHPZhJH74NEOy8aZXKwKgN7AVdqUuGEid5DEfzoHIPGb+kp9T6lozex6VgRebwJZe6R5dHW3va+08tE2VQY0EPcvC3HHX7n9+reZ6zJCV/uj03CFHNP9Hw2Yb32B0WqsacuRhZGCcCVnGCdTQ62HWQDbPyNYjFLaUaCKSSSr8yKfeJcz5SdQ6e+iUBsLCL9H6tFqI5QOG/MRDwsh6/LDmEyhUT/XtfKI3J1P1j+198em14d6FHeSpTABy1SU9R0dR6AoBtw8d5YmjaKD7Y9ld4jmozwCvFU="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        type("ambient")
    }
}
