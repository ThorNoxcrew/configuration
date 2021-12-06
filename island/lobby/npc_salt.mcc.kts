import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Dragon Dueling the knight, Robby outside of Lime Llamas house on rock
    playerNPC(
        absoluteVec(160.8, 79.0, 670.4),
        "Salt",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTIyOTY0OTk3MiwKICAicHJvZmlsZUlkIiA6ICIwM2E5NjQ5NDA0NzI0MmE2YTQxYjljNGJhM2QwY2E5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcmljZXBwcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYzA4NDkwMTIyMzg0N2RhMzU0ODJjYmRlNmVkN2RiMzg1NmQ2ZDVmZjkyM2FjZmZlN2E0OWViOGFiOTE5Njg0IgogICAgfQogIH0KfQ==",
        "KsWoQSgj5oAETRJmaxGAoCJ2G0TZTste8Nc5UrGBfCaISFWTn19iYqj5vk1j3bs7j3Pkh49uTZSTYea5sZqaub9SV/3nV+Bptcyo3ntTNETDtmDUWBP9vnSaHNHtQ7jnIu/Cn3M1VaBuJM2fUu+57STL81f2RDpfCznkoH7pbLhfmCfUAvS64FxmEUAIEPIr+Ow7d9Gk9xNulMkuh0eCZCvQW3c7853vONd1eC40JWUPbMlIJ5AjGbDYOdk4wejJbyN8aIQgNmwjgCPfVyxFr1e3bSLcLRzxMzU9ZXn1ycYjmAd18JazPu0z4DGZZakLqQ68DqkVySuUYVeFXMSDAZz6X3pZrPHKeV8/UlKJPt68rCEVwNkJPMSaX5ZpSrxJ76RbLqIOkglbbYT9ZgpF9RLSy2uilzUTLpnQLre4fmUH3a1G4x/4E671HxM/aiDKqUgptcxD533YRh74Nfi9QqLKW4kgool3P+HW1ZuRt1b+95P371mvrO0nQB+HwnZ2ieDWpIAoj5zpjMIu4DPP+9m9tqmpmlAJXMfED45OfitJeGsj1WTyVC6Q+Qn+dNii2q05tez4BRcpYDeoonfXixil7OpBapjJe2UEiNlX+9xVIO80aRdYcuYXM3/1tvIu1aRXAaF9ovHRWKEeHLETs9tKJZZmfo1cy5dgfUUjvgs="
    ) {
        rotation(-150.5, 0.0)

        type("ambient")
    }
}
