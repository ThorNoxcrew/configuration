import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// First in line for Hot Dog Vendor
    playerNPC(
        absoluteVec(327.5, 35.0, 479.5),
        "Dennis Acemen",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMTAxMjAwMDMzMywKICAicHJvZmlsZUlkIiA6ICJiNjM2OWQ0MzMwNTU0NGIzOWE5OTBhODYyNWY5MmEwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb2JpbmhvXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMDJkNjNmOWZjYmZkNWJkODQ2ZTg0MDFmNzgxM2NkZGU5ZWJjNzgxOTk5ZGM4NjY1MjA2MTA5NmE2YTdmZDQ5IgogICAgfQogIH0KfQ==",
        "THvQ+zXrXarTILst7sy1OoE17IOUlvVLSAZOSwzxfltiJdiv8wtN79nFu0C6L8R6C7ShyLKIAaPDCqH8WUVDwuT+bdNOgLogCzspSjydKL89+ltmlJlgTMPkujebimlNB7FOLF41+mpqhTskE3DlB7EKz4stPzlUdDd4yZ9XZ7PjEULfdnuXrQg4prwfmxf5RWpS5cD79Cf0Xk8tXgE/BGJcnp7sOSxBXS6+uw7HSm6u+nbDOJx6XkA0+oqgtge4v32kgM7FMsya+MbTACqQDyr7faEemZ+M3cr11bhZ6HmRvY95pBUjZKsO9qYZR4qTNodIEntJiq0+KLieZVDj7iLY3iOjeUZGE8C1CtfQrcEgrKIRR5kEW65O/YYyESz3OAUyhUp/TDocodxDAGCg/qP0ZyIOBeI2mhmyN3fUAqpYU0DMLBZQD6VAvXGp+CFTXV5MRNdNotSPH0FEIGyG83X0TYZcyEwaw3JhvugcXMUSJN61+KODBO88Srf48LeCVVV4tXrRh1eXaFpSXOKgcDUKRydr/CP5nrlyElDr3LfQQgrHBelRcfbCQV8/4ellI83DHxPrlWrUesqA7uYwoGAEyhL03nt1UylE1pLpNwW59iXAdXYVuAFGergLvaOnKq2rIsdrUiOMT0QDvw7I78RX/hRu7rn01HBmahQXPfA="
    ) {
        rotation(125.0, 0.0)

        type("ambient")
    }
}
