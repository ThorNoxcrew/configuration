import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Knight by MCC Banner near accessory store.
    playerNPC(
        absoluteVec(345.5, 32.0, 439.0),
        "Sir Tiffany",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTg3OTY0NTUyOSwKICAicHJvZmlsZUlkIiA6ICIzZjM4YmViZGYwMWQ0MjNkYWI4MjczZjUwNGFiNGEyNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJjazM0Nzk0MjM1NzUzNzMxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmYTVjYzFmNWM4MGU3OGVmNjVjYTc1ZTQxMjhiNjQzMmVmYjY2YzI4MjExNGJkMDc2NTk0ODVlNzJhNTYwNTIiCiAgICB9CiAgfQp9",
        "IaWchEBhvBo7JjXLFHJrTX7cneZWEbmVLHh64+s+GhWncxvcQn2iM2hYVbGzTgqkQprjB0Kf1PzjOVf24uZYuJuJBhF0dH+wcNFYt+bvfubUpYFZBpTy3GTLKILK+UOVJW+nTJzfvKWQkbzZehKmcmLKOqg/BpD+FacWQG5/xNyKTBK+4YwSN/aIySdKl2K7k8baa1cQyi/7/w8IK6M3F0ohX3rfOEa+myNm8jGNDOBvaJojjQBPrtswhiu6l0TqYzCnVBPun+hQHA8u2tKBz8LWUMaYDqyEqvMjA9AoTPqytB2e4IYCbYYUQrNajrwPoWPAfXriELkfQEnuLXEJ5OQpzDJZzet/Y59dptr0y+1D2XP9DNZJLbQN4ybw7NxItk43DS7NnqKi9qPrlSTHCO5GptPYebuFgX6BZBsYOuL0cFnKGqMYWbWmEyng6d8SqWULgFDGoj8zSPkg1edJK9qhluY5npyEOf3j+SwX54Mvyg28GxYFLaSXGVgFA0C2/FYvaDVRakPiMgjRnA9Sd45YCBy5EI3VJjZGm1qOFLw4xmA22J06NJpPBl54ftDmigf4mUnxORNckE+LB+yE2THFoV0oizY51CzoZRzAd9vdfVn2w3sZ4s35hFYGWD8IUUV1Vsat50PGcLJrmSLZyMGbx2Oi0t5WD0p17PPyxwM="
    ) {
        rotation(-50.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
