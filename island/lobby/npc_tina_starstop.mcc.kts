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
      absoluteVec(330.5, 34.0, 470.5),
      "Tina Starstop",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyOTYyODg5NTIyMiwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zY2U5YTE3ZjRiYWRjMTM1YzZkMWU3MDZlY2UwMmQwNmVmNzQ3YjM0Y2Y0ZWY5YjkwYmE4NjBlYjY0NTAyYmYwIgogICAgfQogIH0KfQ==",
      "Uzfgti88AhmYilwFfk9yWjBwj8ubuhg6DoU891wQR8Od2pMw9UINnpzaQ27uPwT/5EXGkh96Qt4+1Xhhz/3WEJ3QArSRj0Z5dgMgDDG5HW/O7n9nKv66qiuJSCkIvVbD1cwMDorKrGPTWfEz/tI3ZIjgJbhpVZubB17NbaDuNTG4Yc5dXtfcJecE14q4xGJKQ5NyOJI5+BIflRXPkSZLF0y4SSb55r0kb5BABRXC8KbPp6jzj3p7zDuiO4ilTkmGXXIZdYuJUYdd0KrWXsDDSHd+jclDkpC2/bLa4zKjbDw+hZyRfr1OLoaYXah8u9ysQvTtvJIxXHUJX8E04+EOuLiGK+ae/QwAt06mLdgtnoUuFcFCXIxe0U4sUbVqnJ2pRI72IQSzoc7lovI/7DAobIhmywFb4Iiqq5+ex1+RxtKtNa0cAmdGya7fdOga9F2SQ5qxnvKDvthxPRl7YoDPHj0MGCjO9VO4YrmKwHmcHf4SESsZGXJicYaQZOpq/yeqAT59j0EJ4Mbyk+GXdfYC2xlQQvm7U0vLiQ1HVhkkYGr0cAJtb1VnXCa+02DT3Z/eRlTFD9t2aa7xzNz8P5RE+oMtbwOedC+Tw8kjfPTVhg4alOTl/P1f74/5myb5CZOnFAfGPinQypMzaFy4Sghd0Go74AUoodpTkkPyTOseDU4=") {
    rotation(35.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    helmet("mcc:island_cosmetics.hair.pigtails")
    offHand("mcc:island_cosmetics.accessory.stick")

    belowName("island.npc.ambient.tina_starstop")

    type("ambient")
  }
}
