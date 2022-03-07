import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Part of trio of girls that listen to outdoor concert.
    playerNPC(
        absoluteVec(358.5, 32.0, 435.0),
        "Alice DeMaggio",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMzQwNjMzMzAyMywKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YjFlM2FiN2E1MjVlODdiMmFhNGQ1ZjA3ZjA3MmQ5ZWMxYjVkYjE3YzQ2OTBmZDkxZTJhZDhlZWYwMDliZWM4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "fkbUTHkLQz3sQb6anorS7q3c9VYWmgJlctlDknnXjbi11IU6rwSGLtV3jIDR2HhiKV/7noK3OhEiXKaq+HGikX4M34TrunhPnuHQKVsI6alUEObvJdwRdM+lndxR9XvZxDWh84Zas7wc0iRXs9A3Q+ilA40PU5qSMTwT+CCQqUUq1UGEgtAd/FjWYnqA6kcNO0/u9WDYcd4WCrV/c3UBdl5IIH8l2H/qjzJBK2dWf50Sy29HCJyV7COKW7XRBtZjgJR+q538qR7b/P6y4zst1D/riCy59CKt6MhBmTEDSY0FCxroWZtVjH5haVV3gX45pznkWfJvz/Xp9zdp/WhVlBHE6ZcyAn1AvBhmBVVspne3SMKfg4MR7v9sb32b8OGfN2/CGdMrtMVtJIA2deq1wzu6ciPuOKaAUY7OJ9/vdjs6BGNcAs0UOv8fdmR8WThoe8f+RSeBkcIfFD2kNfk7gzIXbUOM2TRYvATYlilXmVbBZ2lWISXHrIPxufq3jnNAO6i9ll+TDo3UlEFJTWNP87s/kmN8arG2bM9LlX4coWbBkHGdGgRK6PJ8qJklqIGapjNHBffGuvVlYfw7fafOeH+FoKbDrXNoJ04uG4qbiP5OQ9ZpCMgpbyrH/ZbV0xWgN5RnMypZly4hIbmRWC3+GcCrFvw6ARHoAsuUwg+D28U="
    ) {
        rotation(40.0, 0.0)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.cat_ear_headphones{display:{color:14430830}}")
    }
}
