
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(330.5, 34.0, 470.5),
        "Tina Starstop",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MjUyOTM4OCwKICAicHJvZmlsZUlkIiA6ICIzYjA1NTdlYmVmYjc0MDdmYmFmMjVhN2IyNzYwZTZlMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNcl9JY2VTcGlrZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzdmYmU3ZjU5MzNlYTQ1ZGM0OWJkNDg3YzU4N2Q3MzE0NWJlMDA1ODE1YmQ4ZTE0OGZmMmYxNWU2MDlmZWIzYiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "ThHLUOm72QA987Ie21avxiSuV4qFvXJO+1xtFmfvy2gtMOUbEEw7zSX8ek/m9JFEgNzLqHLrB8WfuC41uEWeIEumZwJdvD6E0gqoG2aBysloda73WQm6LtWap9QpYPL6HZ/z644EHafICYDODch8Y4B0E3g2yA9Dm4IfPWi1r0IEBhOP5KnLCvcG41oWyw1oVreBeZrHx2nN0vmXT3jrrMUWQablhjRGaQqmkfB92N00+REoMt+3pdbLyP5Ju5r8cB1eGTiL5791JQ+W0rP2CfcVirS/s1k8DHD9a4/MkVZUdJsBLiIo/Jz9W4mlJkjFrnG4XqNwXYekrqjw+NeoQycrrTf+yUqxi+Nwi1H55ghN12AL6ylmW/93PfCj5tunSr5wr8O/mECZIVwa1wEj+z6/G0VEvflOvyqV8BldmAYA3HHmy+OGZuCbjLOnIUl+MnBa4CMVdQXpFafesCwtMzKXTvX2e4djBredkEIlN/ecgm9CzIDPb2LPevNcUs3LuX5PwcCrGIgP5pmhKh3DJMn1gdBFrUC/JAn/d/ITvhKp+I8/CoHCIZ33l4DmonhxloyAwSU0HHPD6eKWWRCH9WjhAbsRB9k58wvZUbAhPSDksVpTJRj5t5u2fRnK0WxjlEs7kAekD01oUTw6N8PLNECXUwy2kYOPvtbye/tHtI0="
    ) {
        rotation(35.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        offHand("mcc:island_cosmetics.accessory.rose")

        belowName("island.npc.ambient.tina_starstop")

        type("ambient")
    }
}
