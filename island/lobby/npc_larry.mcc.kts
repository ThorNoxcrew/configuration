import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Post Officer second in line for hot dogs at the vendor
    playerNPC(
        absoluteVec(331.5, 34.5, 479.5),
        "Dr. Larry",
        "eyJ0aW1lc3RhbXAiOjE1NzA5NjE3Nzk1ODQsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZWUwM2Y1MGZlNzViMjYwYTA5YzhiNDM0MTUwYjdmMzJjMzMxM2U5NGE4MjRlYTM4YzhlYWVlNWZhN2Y3ZWZjIn19fQ==",
        "CoMG0zNT/whJC4V+4nNgPO+CBD6e8oMJGiG7AIn1K10kgszDYluSSDCLLnDOq5SfPlThYBIFVVAfEWQ5hEoLkZT+wbGku4efGxkFl3hhrr8LV5OGLjwc0rzGl+GelxiuIxm7NgHAbkHgI94lhqvtYySLVoui2Rt2FCpWKLfrO4wQ/TipeCasPOY/7KqifLj/ogB4/gctnQHUazSbc97SedyOgLJ2LX627OvZzlWyoMMCcIj9n8y+NXfd5WnFhkhbSt2n3fA/tplBuX07or3M9Q2lpkn1aXbY1Y1FPBBW+/3j7X3Yn2GeNcDJDmZr4IxwErEti87Hum7nRTTGp98d+RqmxRgN5WR/Nxw19O9bO2ZXNjunidIaZoVr2rQcBKGBBu6kMfumgMKVwSpqCY2F3PHI/ajre3xj9gCKh5+Zy8vmLIQENG4PGWF97E/BEYZeZTehQ731iP0rQ1aOxE64bu7pRFHVfvJqHwx5G0xtOqce3wLguH7eOXCrw3DdBKb4yBnK6ccGBF2TDxKK1qBj+WJ08ojzyEH37zvpuAFUQbUNLpRbG3redAz/mlOjJFeqGOJVClKaE/3zF/gNq0pL4EO4GHbPgacS4rSpOzPwWbyHe4REM+z2bELCld/J8meI4L1c00ZsulGbihRjqd3QeN61yLFDlGlRimwKCiHFI2o="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
