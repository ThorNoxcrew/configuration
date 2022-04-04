import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands atop shrubbery on a building to the south of the shopping district near the beach.
    playerNPC(
        absoluteVec(372.0, 56.0, 447.0),
        "Mysterious Ninja",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTgwNjMyNDUxNiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU0ZjhlYTA5YTczMWU1ZTZjYmViNWViMzEzNTY5NDY1ZGNhOTNlMWVmZTE0ZDUwODU3OTE0NjUwNTIzY2IwYWMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "JnnDwxx+n+mL4knF9+yep/eCnRr4xGYOuWJKZi+6HiGcqQ7EKaJFrXG6VbCrQ99PGB2CkzMj14Q06v60A4OKNpJvLkUMp3KUFlZjZdFYW7zkFdkVLb6C4uOFhw8WCauKhwgB9virp5fkP7bR8L/OgRchOM6onEce1x8VMxJA1UGHpOF91hKlEzLd41ISLeRpGFcExu+s9skVkqTcs3/UB8wZUXs5PKhVeGAm6aEZoEkPrKZIm2RPZfcLc16mf5FY6JfJxdq4DnDPKspnyvf5Cliw9F1glI4re2nwIJtVaOkq49idPM/pYbbLCOxoIqwgWij9dhNBRXoCqeWOGZQFJ4W5LuxloRQCABqOjrjezLkksFVbuhcUJ10mxsD5gTs9/oiV/rUu4/0Sso6Q8SG0e1WYu+GEzi+toewYIEIIrxyZ0iT9+1CeEIQZbDgZrSRiPsqwCgDSLsC+KTVTQyOREMyeRdeskhh20z0JITL1MmgNlFkTXHeym4BQRyW4iLp7clj8eixkS67RtJEUWYeGq1pt7E+q+1bJFTL7ioC6Au2jyLRRSmk16OdOo2+FVfKipgNvcvlK/YuUcD+BhTSCJM0hOzEKVDlz2dXESEMG/CXGnVq0Hp1nJY7KQR3GfJfwkqY5PIWZcKtysHxCwnbas49ejySJihfYUPZ3SdyYPAw="
    ) {
        rotation(75.0, 20.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
