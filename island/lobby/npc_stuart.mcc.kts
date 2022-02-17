import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man at tables outside of diner (table of 4).
    playerNPC(
        absoluteVec(332.5, 33.0, 419.0),
        "Stuart Rice",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNjExMzk5MCwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMmM3YzNjNWFiZjI0ZTMxOTBmOTE4YzMxYjUyOTU3NjdlZGYwZmRlNjcxZmE2Yzg3YjczZjUwYjkzNmZlNDA0IgogICAgfQogIH0KfQ==",
        "U4cxAPFJ23uLvmYL1iSEhhraBh9kM0ppz2U6l7E1J72HhZJ7w9mvNhL9Lt7mRwh2C471lDhsSgI3PD7b71ukmgTQjxNOR/vyaOFT5uIl6JVs2/hG2VZ015Y+lsEdHfX/TpKke5IcF8LWkDsoWSI5ofO/bxT8Pi6e1NFGG09kTTT0Ca2hTDlZ4E3vmg9uU/V8TqFncV70LrRcoNClRUa40UnIS/wxStpexomlqsGQvNdMMHMNMzqst4p4ZrfAP6akdV5Xmtta3XIr5bBYiiGTCy89RXntP7K4fZveyHjFq4bBJuia2KTxj6JSY4jQxb7tnRKOPzHzeGLO43XvR+4Nj65GFhZdt1ua/IwG9HamoQ8+cdVZNaRhXkVKshpbOTBG44iorQs2j7DGt5OZWoPpN9xero+ThCMKzef2Qk8uRb5GJH9kLTXpeqEOsyJIknAGvMYWvLA0IOI990yiO3CSPqq1IU542Xb8tikVdUTiSySHlcZzrUXix195iJ7gIIhDrjfaPq3CADMfEtZEbVBxQ9x1Cd4SvYzSsAwTY8ju3m05G2I2kWnwWNGFfaVlr4rnbEVaWc5UbSIIcBi8u+9De96+TBUDw2jvncAmXiXDDci1FlX9W1dbLwJ/EXt6NO9ywF44THbC4AQTvkqUz5kEHN+QLKupTXbL+5wsnQUyPyc="
    ) {
        rotation(115.0, 0.0)

        type("ambient")
    }
}
