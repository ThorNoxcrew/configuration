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
      absoluteVec(330.5, 35.0, 499.5),
      "Charlie Toothpick",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NDE5OTk0MiwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NGFmYjY0ZTkxYzk5NmI5N2Y3ODE4N2IwMWNmZjliODE0NDE5MmUzZjliMTEwYzJmZGM2Y2ZkZTQ3MzAzMDA1IgogICAgfQogIH0KfQ==",
      "fZZOG2iSy7Voq3LpafnzGIBBsAfbLFmxAHekxAfaeIuF5ai8cxY/yKakc7auIhVi1SeB4pK+gT9WftOLs7WgYCvKQcODu+F4gcJ/6PHg+fLgsRB20QZoTxbm82eszl+liocA2Akc8uoN480rs/Tchuyu4OP2ayPC/xdXitM4uHY6dvQ+u19QzKHv1tTxlsUFWlR5hN4hl1LdG5T2puBhu7+9Fx3dQ9U18HZ4nOb19H5Lfhvri5enkbjcZPeDpI3tvdCzXFAtKpi+lJ9dlWh93jCJzlicI/lu4LWqFxRH/xzNxSFHwxn3ZQuueU+5mZupkS7p3vU4aoaqZcgiKZrLEJr5QltlBjcE4K05Ybhn6LSnH2e8dz4f4jXvbabtg40jNOd2B3dyUCqTR+BScUUL3fcaH0/G2ZPD+CLhmbOjEg13FNzVa49PJXsNJABl0ZfQCxsWdge3rBzyui8yStyTE2rwYTZbuTTcy8RhzW0RaHhXdBzsk0tUMnVnRFrWUlPYR88fQ561hLmveiHK08UskAXzFkaXtP4/hdEgpYYou4cYjhjfAByoqJvBVtoNlaXC8vlpn+hNFZ0e+Y2as2UZwbsyLwqpDuqjYfR7DXqHYW2qF3rFKg7Ht3nr28e/lGba5WqSZJZ9Ek08q3pLNIw/1zdkZUs0jCyQkAjmExRgqyY=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    helmet("mcc:island_cosmetics.hair.prince_charming")
    offHand("mcc:island_cosmetics.accessory.trash_can_lid")

    belowName("island.npc.quest.material")

    type("questgiver")
  }
}
