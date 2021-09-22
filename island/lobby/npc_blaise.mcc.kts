import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man at tables outside of diner (table of 2).
    playerNPC(
        absoluteVec(340.5, 33.0, 416.5),
        "Blaise",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NjI5MDMzMiwKICAicHJvZmlsZUlkIiA6ICI0ZWQ4MjMzNzFhMmU0YmI3YTVlYWJmY2ZmZGE4NDk1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlYnlyZDg4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMzZDJjNjk1YmNhM2Q0MmMyOTVjNzQ0ZTI4NTIxMjBkZTNlOGM0MmJjYzY3ZjllYzBkNGQ2YjFiMWJmN2M2MGIiCiAgICB9CiAgfQp9",
        "DYpZ8ytEcgfeS3eJAc6miYGs/4uPKQWqHaRVTb0y0SlNxhT5/uLL3/WFm6TGF4zU0x1PXvp2QU85l6k21AMWnTeyhWwC9vNRvtNCePy7YI0SqneunkGcHgFJIhghbE62iAUqEGhWfDkAtUp1Dt8/YXwZrziZ9grVlmOmZyfFjXPH8AlaNU2CUn+B2fNwRMOet+R4m/nGHdjpj3FROgW/fNHEnQWOS8TjtwZBoDhS7ygI2XhRhPUj5Dc5vs8uLT2M6rZnM9GAHuPgL6H6na0Ki+BoxG21k1lHgd+r3iP8htHMme/XsmmMbC70E5jo0N/qDi/Lfvysn46BExHcLx7C58QZ+dIOEkSDczRCfZHOHgTuqEviy3arqahUJaAOjQBNz2Xf0GeWq6pmzpk6znJvGKCuABg0VuGRN3xk6Osi9vGgBpFZipPCsCg/438QEJXQrZF5md0Ump4WjYZPmcTA3oHeVEWG1OUju4dxoZaNX9ZNizYVygQhii1eBnW5ZAieVBz9JNsAOwCdn4IGbnUdKlk+RzZK9LlWs+VUbSeVGjCIw7DznQtCCgQVaib7yBMHWhFxa3CAmK/uLkIGmtj83gJJACJFJQ+4S5agXYrGEmPZFHjGCqsUKs6nYQRCSO3OQmhgalUXVpNo8VXJQjq3mFaghTixGa61H5roe6X1hqk="
    ) {
        rotation(115.0, 0.0)

        type("ambient")
    }
}
