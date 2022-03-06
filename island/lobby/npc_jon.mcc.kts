import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Football guy outside diner. Talks to other footballer.
    playerNPC(
        absoluteVec(335.5, 32.0, 402.0),
        "Jon Brady",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk0Njg2NTg0MSwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RiOTc0ZTJlZmE4MWQzNDg4NDU2ZTRlZDUzZDdmM2VhODk5MzAwMzc4MzI5ZWFkYzVmZTg1MmUyNzc2MTQxZDkiCiAgICB9CiAgfQp9",
        "jazcbiye/nBq+yqL4PKvGuGZatq+YVOabinkvkmpuJ3BMvOfURoME6qW2Y+IyBCAr6hM0NGZmc3YKcPN5QsvTVo+QFjbwpqenVgs0aZH+rIU8OlnxIjYbh2NSU9PLVcDStIzc6vROyIYo96IESCoTJC3tk0YaE4ujAToONJnQIaLFRreRQq/TUSol+cP5LZBWXf6IQNJ2M0v2M5+1gTkP57HkfwkWZuJUFznNDu0T+IhRQ1gL9q10Xsd3vF2dN1QlxzbtmSIp2Hbm9glDDr1WCRr7n6vXh0Z9jm+h01fIsBkVUReu6+2f0r3MImx1XzELJlpd1qctzP7X9yAq1ADpYswMyTkbSOhiwYhVe4GKQLu5C3npvZsg5esLW03FnzuOj6iX8JDEKxBISZwj+Aoi61LIsROFUjIrWHlYpmIRpSYa+6xfOBgs+7+nI13TyXJg+qTklbIQGdOfDuv5n/79ubc23LWIjPjPPhUr7ikXyag/LXq8tTUbQCiO1ux4OrGe2UsWVrIVKlWaBLrf6MP8pjzTTiKMDIh1GhtCs9FLAjgD30+pBtfeXJjKqleL8kQglNLWExxDvJWnSoLeNxOr6nLZyxKvqcK/ncHosJxGdBhJ8mbdSMB7VXW9uL2vh3OzokLNO/g3RlGB4FDN5n+bOoEoEz/lkHILvrGb81a914="
    ) {
        rotation(-90.0, 0.0)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.football_helmet{display:{color:15675713}}")
        mainHand("mcc:island_cosmetics.accessory.football_shoulder_pad{display:{color:15675713}}")
        offHand("mcc:island_cosmetics.accessory.football_shoulder_pad{display:{color:15675713}}")
        
    }
}
