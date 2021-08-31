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
      absoluteVec(333.5, 33.0, 424.5),
      "Pip Squeekers",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDQxNTk1NzUwMiwKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI2MjQxYjc1ZjE0OThkNWIxOWJkMTUyNDhkYTFiM2JlYzQ3ZmJhMWI1YmNkMjJlNTMwNjZlYjg2ODJjZGRlNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "Ziy3Yb6xoJDFRUQk9tqEHDiwcZLqv451rrsUBpURL+N4RCDIn2JQxyw3QTaGyiz5Anya+qB+S4eehpz1e4DUdVnYvW9jF+POsQbUUosQ6dS1AgrtavqGjdQO9Ij643AEvrErkXLvBXZ+eyyrFekrVd2w3GsCqbwxQ6/yLbdbJItY5XiKeRmVqgUyi/W3HXToayAsdG7/054qWQnnNakXtrGcQTo02ZKyYaWE7nEsg5nGxxQnKOUG3Qx6AZ3Am0a5W6PqKQZjSOLwc3QiU+FhDkbId4SWOcpeMUJn+Xvki34jh2lhuhEWqXfwnyy0n08q7Y9XhzxePlQp2O9p/cauLVVV0DJj8UVX3FYUAwQgWGfgvJXybuR6gvsl8/tC6d6E/H8+hCcJYQzTJNqS5U8l8/ergl/J4XcdqNs3rOIDV0ivWx8gb2zy/9clZ6GMOCfyyjeJnoJT1BWT5HBqOxO0iNIco5PQTV1FtIHJgNr5ScwTVqizaPFW4Hhip+vaS7q2H/USwqMpLYVcf58bwb60ogJAe2QKyUeHVCImWGSB4bGGZdgufe2pF6eYo6O/kDQyIMqFF8amqSNaBwPxPCoyCwUYH+U/9ZbFBQz0n/eTnDd+i2XH3pL/NduOx9HjQDfKlSDugZUrB8ke38sWkfs0XpwC9kBhAkyL3AzhVrXvuKI=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    helmet("mcc:island_cosmetics.hair.hipster")

    belowName("island.npc.shop.coffee")

    type("shop")
  }
}
