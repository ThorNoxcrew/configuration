import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // NPC looking at bottom of HITW factory from main floor
    playerNPC(
        absoluteVec(229.5, 94.0, 265.5),
        "Captain Charon",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMDIyNjY1NTUxNCwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NjMTBhYTM0YzFkNWIyOWM5NTYxODA1NjMxMjgxODExOGM3NjAwYzQ3OTUyOTlmNzAwOWNmNWJlOWE4NmFmMTIiCiAgICB9CiAgfQp9",
        "FONmJE9+zwQsnC/QnuBMH8R9ysohM/caeOCGhuowPWpUDq6HxE4+K8+GFMPFb4zmZagwHI32PutoGXp4qjV+WW4IDMDBRWnIRx7qST8go2JlrHkwrKDsNGhDqj9feppDySXv6eneVAJz49bVrZljq9/oxLpOOOdTVJKwwY7pX/yiRVEPD9BhZmstzFYgZ2UV88ud+AQ7NtfQ9d1zhcHZnrSxUjUGrG5tFs4mS3G+hEb+cJ/qL12ZpjjG3dqXC1Hmq9b1FxOmYUWgrkqaLBQpoE+8jD/PKmV/lQt3erRUrJVJTmQr3jHOulmZqe4vL+6glhuo1u+YqfkqLzdMQpJno+Yqj4wfzlJkOEjEWg7I+GkUKke0ty/un3E7TqszbJc92cuVjTiLKIBFvxMOWboo0HqttOIWZkktJE8ys0HHVNBCv0iYs7Bi1FYAfFrsIvz2TZu6kF9YZE5EKBvFOI88Igof86uf9KeAWFV13+s9T0eN8Bz62H2XONwoDnyHgKkdKHAzHGc2oZNfckQaUjjA5UzXafBb6R33SxW/47oOUwxEWv5SmMLzGDF8aHk3I+GF/yZFWlmjVPsUswf/VJbn13EwtHUkJr4eWRIUR+CS95QgLRgQlh06y5LEULzG9uUIOpv64zGNBUzZRHzbnsWq5+mGNQ0jiXSoA7F5XAN76BQ="
    ) {
        rotation(45.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.pirate_hat{display:{color:15409955}}")
    }
}
