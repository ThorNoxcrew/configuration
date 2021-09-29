import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl pacing outside a port-o-potty on beach right of HUB
    playerNPC(
        absoluteVec(415.0.0, 30.0, 406.0),
        "Elle",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNTc0NzA1MzQ3NSwKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZTJhNmVjMzQ1ZDlmNDdkNTIwMGYyNWRkMzgyNTZhOGI3OWY0ZThjZmIwN2NmNDUzM2UxYzc0MzFhZDRkN2M5IgogICAgfQogIH0KfQ==",
        "veCjwkkisX33syRW+rZCdypgO6uN0UiZxlRaPYKS7HUrdm2mtY1IqnZQZmjt07NABmOZUMdTEunTgUMfGxxAEYqqy82G95R60vjfWix54WmhILpAiprl2lGvP/9E7sfWNnkChNw5Io8d8NF9Lwckt5655vEqCEhLIot214Lbwa/WoZhbdLU24GnjHVeGsLnDPljCxyZi6Ys39dh30q/8od9WWTD3PXfCbgongVZbyovJvIfnOUY7LkFBOO2zC91FPwpSDLOV8UrNrrJKxYzbXGRuVEqHBD7cGlu1q3k8HyuK5QXeqyHNhCkp7LFgVcncsk6zx3EbLNmEuvc10k0xf+InrPVrwmAFVOOSq1xhVd8CRecNzBYs1puIB7QEMFJVevIvO04i+8YJOXxtpHQ5nLZabMe9tybhrFOWMkq6zD6U3DIJ/9LpJ4sQ7XEWdJe+VVhF0/dMqEWIs4cTf6NaVAoc2XmcMMjtDZwtSkGKGdJBalyAjDBVAuDjbesBWuBD+xT6bmDYcIwNjs7E6jBG3YP3g3NKhXs5rRivayEtyxU6Zu2wGOK9TMpx5w+FLHdyRWStNgX2vhT6y5Q0qlMPOgqcFGPeeJTAEmJPzcoxDSm1pX7Z/VdKRQ4BysssyiojYflFW7zLkX2RLRSjt1uBvDog1IHgLFwUtqlpYJE9Fto="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(415.0.0, 30.0, 406.0)
        pointList += Transform(417.0.0, 30.0, 406.0)

        patrol(pointList)

        type("ambient")
    }
}
