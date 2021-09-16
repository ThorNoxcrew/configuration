import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands on top of a building left of hub
    playerNPC(
        absoluteVec(312.5, 52.5, 600.7),
        "Mysterious Ninja",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTgwNTU4MDUwMywKICAicHJvZmlsZUlkIiA6ICI2MTZiODhkNDMwNzM0ZTM3OWM3NDc1ODdlZTJkNzlmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfX25vdGFodW1hbl9fIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M3MzNmYTIxNjE5ZjU0YWM0MTdhOTg2YmI4YzYzMzNmODE5ODY1Y2E3ZjBkZTVhMjJmOTVkOGY5NjFhMjhjMmYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "sTqLgvhF5H758dKVcF0N6D4gGWVgbJKBPIrNtuSdhSYeLf3t9pY4q81kGik9CaZugi943wc3P6svvkqp/8rm4TtoXkhAVAmxVzJjcmYQ1rM9278SutRyZVyoWjkeUZBMsPQnbJ79qIXTN+sJvNeE/vqYZWop/MjEeEjXtbJ+NjpobRbFVL21whxTJmvuaVjL6kTZiqwXKQZwK94+ZMe63LLih7oBg26lCJG/iA6vkyczVwzdq9+sKsaBSQONbR8FyCfq7VEGiSIdfgXjBFX9oRJxtaSkJKrYWtBFctUP1+BnB7k3ByC37jyvhoknpZtzxYUtebomWld5R5C+tCE1DfKqUworNOB1FuXrlOZQcPf8rStocbqpJ7hdZzfqoBHSC0bzdMouFymVsFweV0EgrRyFbX2Buu6Ckb7PDkgfau3MkneACHgwF6LDQvlwkLJm8mI0NMGXZXc3aNNZL8I7KkQYbLuKSNlIA73dHTujaftWwEiICZxoDxGGXGm8X4Q4KQ7I2hAIwxtOnKaEbZ9/exgX204WrUj3CjaNyLzfzX0QMy/YDWM1/8AY1Jjn3qzw3U8Q/JK+8MW2w1IxeShlwmdDrNPnxOiwvc7StreSIqAIH12jW/XsV2KfHzvbur2eaFgjTyVFG+1JOVJvuXRlCm5s8odthy6HHURVhgSFdeo="
    ) {
        rotation(-50.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
