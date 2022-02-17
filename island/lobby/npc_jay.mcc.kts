import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Uses JayPeaSize's skin. Roams main lobby
    playerNPC(
        absoluteVec(266.0, 41.0, 616.0),
        "JayPeaSize",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzOTE1NjU4Njg2NywKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmMGRlZDJhMjk2NjEzZWFmNDc2NzM4ZTYzYWFhNTRhOTE0ZGM2YzYwMDJhNDMyNzhlZmI5ZmEwN2FiZDBmZDAiCiAgICB9CiAgfQp9",
        "CCz2nDLdrWZelM0Yvcq9e9mq1Wl2MMAfkMQs7ubQV6oELLW79oBpjslZDJgD62wRCGw4rtlp55pOwc4P9N3zWv4R3diaHr7oHsQHlEkIQTBCkJ1WNUPRAz1NrnF6CPeGbnHB7uogsQMvwRV5TR4e2M3m5lSvWsNjOiQOUzROXHqxbFHBAGVO0IYPE+ltU9E6jp/m2m5sNy/y7IZv+48aEhFuTsbXtCUm1Ay9eSXHZJGiIO1+rkCnlZ2OCReupnvhpKGHgMzl32P3e4wM2t6+efZWLNkV3jrqH/0bkQ9jybw6hoOaL7XWBWX9xFkTTPB8pH3/Px4R9RQ7GI9jGEQlARf+Ey9P8PFk6yGhO/1XbLUKIU/G+11v/7PXjpLqAYeptJPwKI19jf9FaZBVXwoHFc6Icw/iuOJgy9Gi6o6QtvWuAKYtj5WiRMX9TVwIoeGN68Rs6Z5/nWf/BFicZftpV/RwxoPlfvpRipznXF2jvfpbvoVmZExEBYKAaC/8XqhuoxT929k7r/s9tdkjs3/IMb0nDNR5uvCkOl/FxGxPypfSXGLnHKvKJPoJ90NZ0DLEP17bBCMSAw7lFPDi9Ax5DYmslPHelXkQggmmdfbms50I0sLrH7yoGU/ctlwubdqvim5DSNct+45nFM40OgYXQxEvo8E4b54Q4gFAl0uL2LI="
    ) {
        rotation(0.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        roaming(absoluteVec(267.0, 41.0, 615.5), absoluteVec(266.5, 41.0, 622.5))
        type("ambient")
        offHand("mcc:island_cosmetics.accessory.boombox{display:{color:5276382}}")
    }
}
