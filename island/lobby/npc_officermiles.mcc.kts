import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Officer on block corner talking to officer mark.
    playerNPC(
        absoluteVec(346.4, 34.0, 494.2),
        "Officer Miles",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExNTA3MjczOSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NmMjkyNTc4YjJmMzdhNTZmYWNkY2I3YmFjMTYwYzk0NTk5OWQ4YThhNWFiMDY2OWM3OGZhMzYzNTNkYzBlNTAiCiAgICB9CiAgfQp9",
        "qRJVxcUu3z7qVWp76VILtLf0DABjQkuGzp6rWzGbduwcg1AVquQm1mmL5mlc3JS9JTYxdZTpzg7LT7tr7/HS/gwrNB0JfK3ZVbK077TxGvWx6z7VJ2HlxWuy7aLvFUgmjWp3qn42ShZt13JY+x7NcihTpaHOT4KIposbH94POYG+FbASMB9VJagRDt1QiLXCiZYA137DkmDKEdHvBuMdG3GyBcTF8YX65PkIlc8eTbjrUMq4IVPCkSfO5bHzyU4F13JNUfQmPTENtZKLnCkAXr8dX410GuzWnsjeXNTjoWteW/zwLi/WWZRQeQ98qPzrD7T8tzUUgt4w5oPUc902YjOsiGXILiQbfZe2NiD9/TERbVWJt3DN97gSz9shf9K2O9wZAZL7advINjq0tBX7NMUavY/ldI8kyLAEs0cuubtV7eLHC5L0fOI4VJixlx7Cg7eGIKnUfKi63KeuPSGCQc5wVw3n3IIpBFAIP4l9yj1cMlOLhrM52GyJ/tvQLFlBhVoig9CjUn53jWbPkH+KGKx4ev4vRXgSZTrAiWW5KHN1EzcixuYiVn1USkVvhqeHJ05SuP+24MOWvV0Tan+IS4Yf5TIPX+QEQbY+Da3xFumgUilkBuAlzAi8ABL6SVjhtHy0/aTfQHhxQHAUsQJHIDvXq+WaScEWWKvXWjMC/7Q="
    ) {
        rotation(-135.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.police_cap")
    }
}
