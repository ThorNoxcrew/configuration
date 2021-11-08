import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Runner along the docs on the right.
    playerNPC(
        absoluteVec(418.5, 31.0, 487.5),
        "Quinn Haley",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTAyNjgzNjgwMCwKICAicHJvZmlsZUlkIiA6ICJhYjlkYmMzZjk4NGE0ZWI4YTVmY2RlYWMzNzEzZWFkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDeWJvcm51dDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQ5MjllMjA0YzIzM2RmN2E2OTMyMDI3OGYyY2FhZTgzMDFiMmM3NWUzODJhM2U4M2VhOTZjMmFiZmMwYWFkMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "vDAxs1YxTozynBt09JfUsb7UQSKONF/jCpBpiBkGSkqmRMguOSmmjKrW7zLMuIk4UhTsOMcz42kYG7xzgzIzRbfJPgXVE2Cv8lo6cn/7qWleEZQb/7Ib936Q8ADXVTC+EnDj+mWCGiOiEtggXCYDAS24PJxkeLTIsxM4gsxXtO5c11yKVtySpMUo7ZpLhjbuWQ+3ckItoJTQf/cgX87WTE6i/Ji+9TPAt+olLgXcjUqlyS94JbksbaZFOJ5MmcueHTaHXY9DTyqmB6vAybBbhqfzGlf0sw/M1ZVmv7uljFbkHhT4UsxCO0sRMMtF+V++FkLxSRm4zBxDMZToTN8fVs86Mln0MtSryFuu1NFIbilsZTtfFfwJlOdQZrnU5KdH8jYKbESm9HXIkmlPh24rF8F/2fL25GAAHtbji8YzMItV/vEwmlCar7kXA0XU8bSeU1KQPRKrcFLLKVbbA3DW2Gc4eOrJl+3BnW4XAJIoleVnjwL7TFZR0jpyjr0CvwuLy8v3r4dj+AGiO9UDrkOm8gBTas6uq0rhcIIW0kGHe9LcaYGlJ9/1TjqkOTD94YCjitjzsM3GdaJoUobj5R5DlJr8ZXXpJTxuinmpRuuYOUtwx7oc0zNjUzzHjOi8ZPROmr5wLTS2p6tici9w0c4ulfF8BFy1l/OdJyI7iA+/Oew="
    ) {
        rotation(-140.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        val pointList = LinkedList<Transform>()
        pointList += Transform(418.5, 31.0, 487.5)
        pointList += Transform(406.5, 33.0, 487.5)
        pointList += Transform(406.5, 33.0, 456.5)
        pointList += Transform(412.5, 32.0, 452.0)

        patrol(pointList)

        type("ambient")
    }
}
