import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Cultist walking around Gecko House beach
    playerNPC(
        absoluteVec(169.5, 26.0, 743.0),
        "Brother Brine",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMzQ0NzI3MTYzOCwKICAicHJvZmlsZUlkIiA6ICJkYmNlZjMyZjI5ZDc0Y2UzOTUzOWMwYjBhMTE1YjZiZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYW1waXJlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E2YWI2YjYzMGI2MmU4ZTEwMTU0ZWY3OTE5ZTFiZTg3MDU3MTA4MjFiMDJkMmZlNmQ1ODViMmQwOWZkMjQ5NmYiCiAgICB9CiAgfQp9",
        "B4l6qo0ImYbD4v2leqjjfnttsSzsSAjkwP7pdt5pH7Pg11NleZ0EAp2Uydi/qbPijP67FQ/vjzlmMuawHooWSW6hgmzBFNoDSQKOcK7g/AgWKAy6d8ITsxIulv5OZDLADlcaZ+j4faCRll6X2el8qJCAPTZ6dL0lQ+Jl2wQstt+3f4pQnrFeGus7949lw8vqSKYFteKpDs3/7ZR8CzHxEoxYXxbLvhr+pBFQOvDY5SvI9Ini8P8xXgzUHwaKLxvAGVHIpX2aGTkiAj719N1CgIj7mNnH9n+QhF0jIhlsGlnOtTV3Dg/Dp/KrIjc2a0PryFO04g3JcyC+2n9C+beVso8K/UPcyX+g2B3KXu2URcvv77wki/JhbsT2inw7X5Dk2tb6xzLJ0pjMMY39dWaMqmyT757eCRAwuPyvagqs1RjHOdtKcrZobZCVbS4T4RBn+I3VGhb27ulpP6Eo//pyRyXESM4lCOjFZno+kTNVFH90BM2bjo0lzgTU7qXh5rytqaxxmlgYv6ZRUCYKNMCQr3y0QxRtZHgP7zTLwcFwTFZePGE/QWLqCTvykABKSv9oIrWyXLJEW4oE3qEGJrX20dkgomdodLK6/Fap0JvrQdqw2xAZgI+orBDSzZyMNhgamcHGYxAS1YQ9b4KJodOYrEuqE0fcPgGcNOwm46TLIec="
    ) {
        roaming(absoluteVec(171.0, 27.0, 740.0), absoluteVec(167.5, 26.0, 745.0))

        type("ambient")
    }
}
