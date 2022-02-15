import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// NPC near Blue Bats housing looking out at Sarah Olivia.
    playerNPC(
        absoluteVec(144.5, 33.0, 622.2),
        "Henry Lee",
        "ewogICJ0aW1lc3RhbXAiIDogMTU4ODM1MjM3NzUyNiwKICAicHJvZmlsZUlkIiA6ICI3NmJhYzRmNGZiZTc0OGY2YTU5MTg3NWZlNzU2YzJlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCSU5EQVJFRSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83YmU3MDI0Y2JmODE0ZWRiNzM1MzkxMDFkNjc1NGVhY2M1MGM3OWViYjQwMmRkNGM0ZTI2NzY4ZTU3NWM3NTY3IgogICAgfQogIH0KfQ==",
        "k4trvljaC1P3oPlgvw9EXBS9FKoBezor1f9ts6fKTyZgUeNiw+5brBI6jUibIWi4w8psN5FwAUFR+mjdIn/mL9lZUULgOOtMtRX46sgRi+oaI4bTH1PfaNpyfc4N58lN9cH8q4zwdYp3k7z5xRfhUfXBLhFaS+gEWJ9ClHE8CHh7Uyadr1W8Zbg7cZ37CBJ9X8Cgsiy1Z5Q58FLDRJc3r/7mlBg3qlAZB4TrDABbOhP4nvckvRDJ54h90qFtd+nje7VCPAi3874ReQol/NZ8ojZQgdVaxYugz1EVNnzGBcoCJa6ah4KGUcCp2Od0pBLhzUMz5JB4+KRonK02gbEUZvvMyEPKd1K9811R2weMG3I3oUVZPD0cyb8qaQOxfIaTNOrEdMe7XHVigSoWwqwUDhMR9QLKs2q7Oc+k5aym7nLCExNvC/LHICfG03kh1NKntovCdf5JyITTGSQYScxeiMAVcriwVBud9gKl52dLurcb9E4tUMOoMLfYAYz0GMT7XNVFgMQKQTvmr/OiWxXAAVbEImvvIjdOCPJJlY763+NgbO1jAELUpAWa1Y9TSGAFoDYU5+rbxR7YuwePaY/kN/zagXj+4h+rO4PmSPdWgTOuI2b+rqjKVJPhbBPKcI6bm3AnpHf6ntT5QST+jKlGTfX/5cNqXuF1aYRpQU6To8E="
    ) {
        rotation(19.5, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
