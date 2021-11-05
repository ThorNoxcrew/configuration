import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands on corner in shop district opposite John.
    playerNPC(
        absoluteVec(294.0, 38.0, 520.2),
        "Noah DeBois",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMTIzODE3MzI1MiwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OWFkMjMwNWI5NDViZDZmYzFlZWNiNzU3OTFkMzRhZWMzNTVjYjQxYjllZDMzYjc4NTA0MjM2ZmQxZTRiNmVlIgogICAgfQogIH0KfQ==",
        "l96tbDWghgq83uxAjecJwpfJhmhmfRlHLY+Y9rHVMHqDT1BnVFOlISQ3RezgIc8IUIRfUSlQJAVrlctgGiYELZ659Yl3S17xdENVnNklpqlQPONcusMAR1zlCjMbg8RGbrfe1ew12K2gbrR6045xD7rP4fZalLlJZZCtssnRap8uhsMjK2BXh+dDu2GhAgmpzN6caW21aNx5dVLV3siYyijrlEdMybFvGUoAz4uTnSI8adMlDHJaHLCcmRjPLzivNoNZmBqe0jRBxx5Z0HE0uuJqiQZCyZUFEpUlh0sJ4aL37t+DX6lP0N+WqGIGoSLQuFw1khwGEIqT/XQQkzK6lZbv152Vr02lSuqgA6JuW7mlcImHlcPzfuex7OooXeJn3PQbT32fYstv1kxhheK5xvMQ+2Zc4/mbK+XGmdIB8bF2IEB0LS04IR6JRTDksXsiBRFUTBAKCOM94RqIPWyoR5EkeCdOY+0QY7kuFWcSxJkwEgxcH3qMynON524H2KuQm47jsCnTbJSAXHjrmMS6b9+EfTV/PxsSiaWzv7XhkkEhGd8iiQ+fQhk0WUi50ubyx6Iij+1qp+zSwqq5JT8HnXWEcdE/x6Xexb5Ep4h8SiNFZ2sObL8sd0VvuFXxkRlQznkssFqQBFDB72noTHaL7aWGp1Sv56wqHDQIIDzZreQ="
    ) {
        rotation(105.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
