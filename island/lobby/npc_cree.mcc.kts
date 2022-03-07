import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man at tables outside of diner (table of 4).
    playerNPC(
        absoluteVec(330.5, 33.0, 416.5),
        "Cree Delacroix",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NjI2NTU1OCwKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q5NjQyODkwNWE2ZGExMDk4ZDA3MTliZmUxM2ViN2ViNzc3NWMxNGQzMTVlNDU5OTZlZGI1NTkzYzkyODg2ZjgiCiAgICB9CiAgfQp9",
        "fuupqOrWDooa9IqdK9LhXpSvbdKJ/H+yL+5DcREO9uyZqIXmPDde++V4aq2xCo64puHuaK2KTiuu4hu5fI9vZ6S3ljAz56E1BkEQyIy/zO1frJ46/f/p/cz9NuCwpgQJMcj4vi97LjhVjU2tep1GmlaHwl4fzi4M4H5i+RMG828jntwBvtp/cd0BROj35oQyfRIOPkLaq33CyQbi811w0ot/N12iJmBbVMh+lO9PW7mdcnr/AsYM6YomLAhbsQhlmLnRecIOnx/mCvK2BswNNOpubnrrgW3U++Q1b+or+SFFl/8I7aTduSnQdknP+wWOgVC8aWhwq5VyUq56hjOiBnFSFS0eUPHDymwUbPDNscu3EqW7RuR9IwykRCIkykuzDT+qbyJYhvkOiti2UAkyVw/vA+tcORRH1yTVl74T4WGnKeE7EkHiH0ZknGX9EEKCYeWJMsV5ru0CSc9/axXfDCcQRJb5JzNfhdLTsU6d3w9gJIuVKkkra5qG/viEJai8LWMFcKpd2dFsg7Fxx+GvmCk7BDwcMwylMVhg/y0pmf0OGCuDhfV3PlChy3VkV4Dq4v+zshTO+xi/WfZ70oJ92RNTKQyHJVPKP4Lr1kha/IPrLwZgajSlt6pTbt4NoHKix0cXqxI5LoBw/lOiffvB+SwxkUy4frTKlL73n3tgvns="
    ) {
        rotation(-110.0, 0.0)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.blockle_tea{display:{color:5940540}}")
    }
}
