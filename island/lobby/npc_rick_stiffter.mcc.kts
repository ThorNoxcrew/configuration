import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.ShopGui
import kotlin.time.seconds

mccScript {
  val i18n: I18n by inject()
  val shopManager: ShopManager by inject()

  playerNPC(
      absoluteVec(277.0, 34.0, 402.5),
      "Rick Stiffter",
      "ewogICJ0aW1lc3RhbXAiIDogMTYwMTg4ODExODAzNSwKICAicHJvZmlsZUlkIiA6ICIzM2ViZDMyYmIzMzk0YWQ5YWM2NzBjOTZjNTQ5YmE3ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYW5ub0JhbmFubm9YRCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZDYwMWIxY2E3ODVhMDE2MjA2ZDE3NTM5MTE4ODdlZTVkOGM0YTFmNmE3MGU5NDAyYTkxOTM3NDRlMjFiNTFlIgogICAgfQogIH0KfQ==",
      "F4NZ33sUZtcs8hWhvy5OQYq8ptqWXlbpC+Stb2ZU/2lfHnUEDdNk4RwHbrLSOE03KFW1VTwqfnbuHWsFuqnlK8yv5CFOezN5JMvvAqvluo5aClmT8r19C+Ery2iD6y+o0NaBZpyYtyh4AuPuWmHz/RH6csnpxWb2Bny6GbXSGVe9jhHfZpbyGAVYorRYbmfsuQ0jNEziMwsAeArq7GhTt66EEeYXOFuyoFWjkTUCtPuTNLnXW9sw/YGoSi7bypUbRsV/Y95FvfcZS1K9cVXukpKIjQFXV3bW24T6RSolS9R57ILMMDmgRuh0Z++wnxwfXijoeR4ySFW9Na5sdMpFgpSGPE7il3K7SFroQyy+xrfzjVBVNLAea4JzOjBjIM5MP5Gk88ZkzJTxqz8QNqbjUiKWLtD7skbsyl1BgWxPzkrzAlvemaQ5v2BPNrJ/m3pYm/xmhAwnOGuJyozn5yxuGI4RHAK4T5qjKyXpiJPqKLZddiFGl/h98ZX3YWG56fY8u0cUnJqx1X6XKoIl6wyvZLb72xgjwvhLWjmaDpgHv5t0nI5+DiHrgDiD9Zj1SE9tdVqv9+vnCqxCrF39OiQHAJRtJrbzJtIysvVFmukghFzS0uUaTN0rplfUtlR1CdpVo/l10m4vilDHA8ew8MZJZXhw/Pq+qwy7AEGm+qvlMfk=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    helmet("mcc:island_cosmetics.hair.handlebar")

    belowName("island.npc.ambient.rick_stiffter")

    type("ambient")
  }
}
