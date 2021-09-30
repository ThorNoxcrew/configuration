import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Grabage man roaming construction yard left of hub inside shack.
    playerNPC(
        absoluteVec(382.5, 34.0, 617.0),
        "Watt",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyNDgxMjE4NTY2NCwKICAicHJvZmlsZUlkIiA6ICI2MWVhMDkyM2FhNDQ0OTEwYmNlZjViZmQ2ZDNjMGQ1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVEYXJ0aEZhdGhlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYjk1YTgzZDIxMDRiOTlmYjNlZDFiNjkxZTdkZDI3NTExYWExOTg0OGZiMTY2ZmYyZGFmNWQyNmFkMjBlNjA2IgogICAgfQogIH0KfQ==",
        "Xd2VCGt0fUG5yNIdFn0FirNNfhRGxbnMWPoaMet8i/Jl4uCdDU1Y3gi84LYw+AkZDnryk77H9RvEHIQ9aQ18+m/UvDu89CzWSFi5i1q645ZrXl+/A2n8MABUlVLTX/3x80snJ5xv15ksnQshOpnvYG1Izqu67ukmhAdt2TjH6+GFisUuHjEFxM9BrxTw7Ht1EcRxqW1AW6+jWdAU4rhtc87EM+v+hiCEHJB4IMWngjDyjWeYGc4HBTbL+JKS6bTgSTnxS8Yy1I0NQdtzhiPDeCfpmzk6J47HNTIHsfebg0bJG7vnmWx5y6X3iVDx9guoIcOv3LuygG+a4YgOShhXMk/BM8cY08gcPTrOA3YuAFe3IrWlrWK9Au/eLaBzbmCmoQz1Q5ThJOhLJlUMG/OeKCIG2u30OdJLHJJskOmpby4K9epDO6XfRcc0/sK2qiQAsyhmQVRjJWnPpl1VL8GCFRhczdEHc9rN5VvMwksQIjq8/XYzV+EKPhDTtf2DTYAfoANqdGRXtpA5/wZFS9znWDf4Af/7hlbxWp5CfPY6Y786QUx/XMsjARSsQbGjUphqk21sr6fbhBCM4vk7HAEpyBlcqbEa/Ksx0akjo/6ECZpDhBoAuCVSrsmehNy4lK7zfMx2a3KqceGB17JrqNtuUHQPFKsULnix/eyLArrZ9K8="
    ) {
        roaming(absoluteVec(383.0, 34.0, 615.5), absoluteVec(385.0, 34.0, 618.5))

        type("ambient")
    }
}
