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
      absoluteVec(323.5, 35.0, 501.5),
      "Samwell Finster",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNjM1NTM4NzMxNCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYzcyZDkzODVkMWI1Yzc0YzJlYzQzMTY2ODAzNDk3YTMzOGVmNDJkNzc0YWZiZWYyN2MyNjA0NDY3ZWJjNDkyIgogICAgfQogIH0KfQ==",
      "cA0Fw6L53emVybo/RcklQ7DGbmOtiQZviJ44xQX/0nfOV+qGnIjJMNrjoNDAaXm4NwyKh/FM+qDct/ogDwuWVb+iKBSmlVzqBSUal9osQ8/X0DD+ZoIi6iwGHSoxX6J+NSjLuDwZ05TeCdVzfOyM11/3LSLnXEaB2TRSopj/rfXAFzEnWelbzHgVTm1tiLT/DZ0G8R7B6LxT+Rv8Ub7Kqs9yaobrvZtOYCaaFVWqjSh+62tckxo8yMIlQVhn9M/k5mqh+ptQjNrA0PGscWNxHNzBr+2mo90my49gPdNb9+aDRCcXD6urPx3nc+zTMHpR96PR2O/lNcY6B1isbm8FaPsSRQ8yNvuMczttN+znaBOyMKe3e20CWXYREZAXbWVKagPTKUaDQ7c3MhsO+lgumfDkBndTyN/Id/oWVjOm5HiiOUU7WYOJzHO7uf7aNNJdUuIv/ak9glJprrDmgK9Z/8aEDs+NPIlyZDYQLal9Ru34gXcxG7ny7xQWRyE2GSgebv0gfCHC3oLlnMDrx3Bzo17od7I578+aXgPIpHByfxviX/LJzkhBZIWrSQ5Z4KWUC5l4wawDPsmjhAyCxdD80wES1sO4DpbapaCfICBGcXL0CkBIEm1NGa0PHes3xJ/kZqI4tocVkEM5S8EfFD4eMUqb8mYLolE2jbH7IhEfSWY=") {
    rotation(-90.0, -20.0)

    helmet("mcc:island_cosmetics.hair.hogan")

    belowName("island.npc.ambient.samwell_finster")

    type("ambient")
  }
}
