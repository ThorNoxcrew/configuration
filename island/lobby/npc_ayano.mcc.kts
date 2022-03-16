import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl looking at flowers near main fountain
    playerNPC(
        absoluteVec(324.5, 37.0, 566.4),
        "Ayano Ali",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MjYzMjgxOCwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YxMmRmZGQ3YmUyNDA4YmUxZjAzMGFhNzk3NjkzY2M5MDFmYzUyZDRlNjIxZTUxNmNjYzFiMWNlNTNmZTkyNDQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "cS8zBcIxEHgYvKde1xTeS05k205U6wIlAQ2T7DB1IY0/OOqMOfHiWN/PVIAZt13M/ammUmycl6VyHa1y44lPngojUSyNZJH8IVOSWxdg5rriV2EmvLMOE1TYHxdmkL1zGqkJ0Ia+U1Qu01Zd7bPfhKO2AQ+MTXvf2KtLHGeaYw9JTsge0fx9UkG9ZwdiFoJZ+RhZeCViySW297NlFvVTcdqI1hNi7V16GnxSD8YTKEUlec4VQoZ0o43U6af8FimL4nPUHC4F/YDCTdCYNRP2bwuNmSCLeayyglouiMNrpYzwj5skzR8eqL9hRNkV1BmyBOr10HirFlqM5rmZ+mkzWQbgdAejw3lgGkX43fzcILP2VBM/n30eUiLAvfvVmygBoSNEt9Stv2m1IM+jo9nwfALbAK7HpHEYVFUl2GBi37+11Z/09rFCIspommH8a8xnVzMHkNfcdhcv3ddEb2uW/ENNpXgycN8+jXPJFMJiU+wVYBCIkgpcWw9Mo7bLgUsw9XOC0xHRxUtuWGcEE/GkZR3w54p5GhVpUshRYR/lEacfz56eK9wlQVmFKA71X/pEiL666A/QeefyMjxthd2VVdrpeXSHSksqwg9Djwi//SAaMQ+WQJStkAH1pUZQYrytfVhq/9j2drYMSCqjmBJhtqM5U/Azmh+fw0y27VtPZQI="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.sun_hat{display:{color:3392255}}")
    }
}
