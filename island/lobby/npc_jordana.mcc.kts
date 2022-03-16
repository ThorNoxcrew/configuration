import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Sits on bench on street outside diner.
    playerNPC(
        absoluteVec(345.5, 32.0, 431.5),
        "Jordana Ramirez",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0NjgwMzI4NTk1MywKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M3YmQ5MDIyMjkyN2VjNTE2YWMyMWQ4YzVhOGE0YzMxZTUxODE4OTJjZWFhYjUxNTgzOWEzM2ZjZTEzNjczN2QiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "H9YbnKCP0h4oszrqOdIYZMopeQTrNJBAcomxcTvroNiqf4RW0YtuPE4CsGs20+f5ZY5loEyqXP/RXiEVAnVzKIsb0qFDFLNmZ91waLWr8AXl3RyedGDMFwLHMFDSSsGR8W2Phgfcs3nE3bDMwrE61azlnLOOnrZatcPX6p6apjA127FIGyPGE5vRI9EvD7Z5677b9d9jxIQCdlE1vfP8mukXSMjyiQPlSu+fVKlhQrTYekqeWy26brSe221VUywT8Ne5I8JGOpQMtNnyGavOpv9kqq8HJ+jwiUuYjDgUaAedUFRqr4nw1XLkAeC1gAaYiej2Ni2Hwts8sKMOXPfm5vKUshprhxQ1+BeRJrYMo9jjYalqgfvkqJCAvOfOzgC29SWJ3e8+J5eoKqRWfUnPCB4nFIc3NlcDWMX+MaTOyVM+XTwumuWAOjgrR44TvbCsaAQmYuYj/1M1nhNZgxfExIb8e/6tYvAbn+2C4bo+bIqaTc87ZMcEx2ZRG/DRKgO7z2IGuY7V/fU5R1O9L30W5uhXK2F/AvRb2vmk2hLSlvxWWt68snUYpCsPjUoLaumTfRzOSWiNF8wYT9wDThvKwODHHV7t0uTHcTY5hsdpb68bO9CE0whqF4SEc2QFbak2THVf1tsD2CpU3lYebKYqADsyjdqGUAAIP+slgWU/oXU="
    ) {
        rotation(-140.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
