import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Grid runner on beach coach.
    playerNPC(
        absoluteVec(425.4, 29.0, 674.9),
        "Nicole Swol",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk1NzgyNzQ0MCwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzNGQ1ZjlmMDI5ODY4OWFmOTlmNmY1NDA1MWE3OTNhNjFiMjJjNWRlMjdlMzcwMTA1Mzk5M2E0YjViYzNmZGQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "Ki+ztMYlmMNPzdqdG8ehtfcj7pMSufnelN9ZmtxowdbWkVeSOlojbpACI3suxRHQh746z0ZyMTHP/U9gFapQKhfac2vytgMtKSM7NA0aTxeZWC/TrmeJHnC63kWjb/n3HCQtLVzsYRq3WM1j/Thy2PaNINP7w2gVJhwFrIa84mo4qo0gUYEjwuCHnDFsPlb9D3UqZvuEqQ4ZpfDS7rZRRTuPjxak/lEUc7lyqGY50IBOwaDgpQK/HZUxYsPGKg/eha9ue7eSsZNlobCyP7uoVJ1GyBRYPt36selC0UlUd26v6AWowmD8P/uckZqc3c8krOG66vKtx9APPPJ8zAxSgfMSzQpVptqkeIcIAICHr3qQLWTJPifKvqc6zN5dCjzOb66GUFrsSJIPlWBUeIHkUDYpXjRGBz3KhoPwlhrJklQAUzQQlHfiVKR1EiSsilfHNlhQDl0jqBuh4nnQcna7UYH/hIdCUdapPY9cBftdE20a3kNRzpSPb53Pnz9deElxV8j/9q0BhIZGrXmJn+4C4fbHanHrjYHObz04D35dNBioXPR6IyCBP9lZRK/gCU/Pznf85YfteMHKswIJrHZORSmVKdtT/6BpxMnFMAaeZd1pFpMyQdtGyLrZUo0/NZvDJ8KGjYMRgrfUKGLr9Ug9tdX6E7iGa4C/EXqJRNauHfY="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
