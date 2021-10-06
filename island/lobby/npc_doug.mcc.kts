import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// skater Punk in alley right of main Hub
    playerNPC(
        absoluteVec(339.5, 36.0, 506.3),
        "Doug Unk",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNTYzNjY1MDM1MCwKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYjYwYjQ2MmEzNTY0NGM5NjM1MDFkNzZjZjc1ZThjMjA5MDI0ZmFmYTNjYThmMjVlNzU1MWFkN2NlYmNhOTA3IgogICAgfQogIH0KfQ==",
        "NM+FqcANrAjOEq3Ry7Vm70nZjVjLkzN4x5hSVCYEIA0c1O2iRgA592Dneb/4eqJWmOBdGpE3IOMZ0Tj1mxS1oaRhTPcvkH8Y3VmPzIsK04xQi/lmaPfWe0RFHA3w0eJHwKuRKyIF9drVvygRGSHOyKj7JAbW+V7BN77TB/BlSObyK9fNHONYvXeeaYyOdSiQPRaNbktfTxAJ+4S4vAsJWZRJGkPydg//5ctQs6HwxHtCTdmYSh8Xu05Klu5kkWeKsaPQk3ANUgF6UE0upefPKV9fJ0CkguimxwQuyVY77oex6K0jmZJcVDsb4Iuto15bmoVsKJPGhKLfI83rBSBM0QpBO2GsLjp4FMVDR48wD7NV10ehcoP/xr8rjzGmJUoJQz8Bh0Th1dxHffRsCxNJhptktSmxObVbXCHHEPQ5xBHQ/lNMmEm1f2O8+yPDo88NXUZ2v/mdezuugghMF+f/8n3fWjKsosTtm0VD5s+uWvRKGtBDR9xBHwQ/bvioPAtT7MJ7seGj4GoXSPVQ5bfjygVVT7e3e21sKoOkmgrzW5pTFaADOj/KMbg0KOExmDTT2IDtNGS+GTc2rw/pS049x1Hcrs+r+jbU+GIUtqzOH8p0fGqEKNIghWrinYZ7X3jqsjXVWZiLBiRRurFnOuBbY03ej4qyVL+zrs6cuE2OD8A="
    ) {
        rotation(22.5, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
