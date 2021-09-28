import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Dragon Dueling the knight, Robby outside of Lime Llamas house on rock
    playerNPC(
        absoluteVec(160.8, 79.0, 670.4),
        "Salt",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMTE0MDA4MzMzMCwKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5OWVlOWU0NGJkMDZlZDc3MmU1ZDQyOWY4YWQwOWFiOTJlM2Q0N2VlY2VmNjJhNzY1ZDcxYTczMjVhMGViNzQiCiAgICB9CiAgfQp9",
        "nRm/DgfLhize6O71mEWA1VMoyO5T/FMTILTCg8tZ5n766hkiLsLbVuq12X5vzHdEhHGF6fxaSBvVlCO1lIRCsE8YlD7xYe66XvkzLOTprSfY68W4SuPUv0R0FY/N8oKqX+a+Vj4qUHuWpIDVzJlNgkEoz1c3IhDWimQlJzRsfWH+HvS+khQ4kSnC0wibpodQGXQc1fnirmqdVj+yTZFta7y7+Ri/K+n7kkNmJTPG9iDP/qxbtAifaNCg/zjo64xrB2DxaQpnaGCzpMcHSfshMGCqnUvtHfNiJDZngxv/MbRfeS0WVLTBDFjtIPC1+TvPzmDEjP2iCrejqBd5yxgXovvJ9C5BGYm5wPHWAAMobRgk2+QjwUL/i8cgEFOjXlE3TICqVfp6Y+LmHwu3zsvw6m/P1ZSz6vlQhbqOEcovvrYwGUNrWtR9+sYjx4a8/BkvOPXjeyD4PC0pKb+lOqLq9a+ktqhlTGmzAm2z/40PPrqk24wx3IbjVCx0SZ4ODChIbZJce6TpvCKUxMdjqgwa1m3PbnL0Q52Qu6nG/saTKO36axnwT3EQI0jDYCqHN1ZtyuLDMfYpZCl68d0uVBk5TbeUcyoGGU2rlO801CPNJQRDuLrMucGnXGotXDRVvDy2Wh54Y01KkPFKbORz1GbMcBTnjaqccbCYVkcr++4lWWE="
    ) {
        rotation(-150.5, 0.0)

        type("ambient")
    }
}
