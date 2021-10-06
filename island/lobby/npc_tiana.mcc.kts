import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Kid playing dinosaurs (yellow) with friends in far left hub area.
    playerNPC(
        absoluteVec(378.0, 40.5, 657.0),
        "Tiana Grenouille",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNzU0NzU0MTU4MCwKICAicHJvZmlsZUlkIiA6ICJjNTBhZmE4YWJlYjk0ZTQ1OTRiZjFiNDI1YTk4MGYwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd29FQmFlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ2NTZlMDBhZTcxMjI0ZTYwNGUyZTAzZmNiMGQ2MTNiMjQzYTk3ZjhmYTFmOTRhM2Q3MmNhZjIyZjMxNDFjNzMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "UmEDRIk9HoRfXEolR4AQI61ezcE+5M9fb51Gd1wKthl2H02j0jp10bdaWlFrMa/+XweRZAFH37brRjWvIV5eETL8iRx1OG0OEU219L/MnevzLWgsJa/GjvJIxra/czL/09HPQWZLX5a8WU4tin6unWEJxVhJlh2zbNa/UtcLFQqJorbuWF24QdlF+5UC7tuEhNOVSRfNGbKqAlFkp+fXKfiDiIqahHtVElcAxtuPz9oK/Q0JAB2B0IdTeROzV/qxbnxl+FF86HLOF4sJ8ZJ1+i0/CKtSf5UgAwO4fkrZ7lpZ4/Jn85IHqV3Z0ferSK6oDNbBJKy8M/zspmbTbELa0PAm4jDnGTYIEe3d+1fTOTWYqnf0PwMn2tEoOdnsUGVZHMm96CcsUjYFwPkcZPkPyWVbSdjwhYEAkxnRZkZ4oUAwggBQULRtsbW0uvNNxleiRWru9ihesjJh6RXQ+iK5sSruWafvmdVxhnrx0ICd4XHDDyFdIRXr7D5391CdWSFxIkW70hQL7w3Y7cS7ZklXKDzWRFNvLbzQTMtTFeKpAhaOlArUsxj/r8UQlG2Ic4V5GlvKzSd/oDp8jfnc4GovWxmaRURoQdM4iBrzsH22XKjT3N+i7J8FbTvbHcDbWIEsOb6lOjaz0MprO5KoUEZmy19TOvq7wY5RviGHUQrHa7M="
    ) {
        roaming(absoluteVec(382.5, 41.0, 662.5), absoluteVec(377.0, 41.0, 655.0))

        type("ambient")
    }
}
