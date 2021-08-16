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
      absoluteVec(367, 34.0, 503),
      "Pretty Uppy Lady",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyODYyODg5ODAzNCwKICAicHJvZmlsZUlkIiA6ICI5MzJlN2QxNGI1YmU0NjQyOTIwYWQ5MDEyZGExMTQ0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJqaW1teTIwMTgwMTMwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmZDlhZmY3ZDA5MGFmZjdiMjhlNTBjMjlhZjhkNmQzNjJkMzRlZDM3MjU2ZjcxNjI3ODA5MzM3NTI4Mjg2OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "vMZWO1ZgmDgLk1+aA0m4eWvh/kdpG6snyrYDB5K1QUc9bW3fA5rb+iha6DRrq1tEBlhEID+X8F1mWjNCL19Cwbsmy1371zVj1dIyD0VDTE3FzCUiScFEFXe0HgNyxse5/A3Dh6Q1J3poQ7IPdWm2zDr9cNxYqdIHeu2uK7YOt2jEt9aUyL8FyOj7Hzw8t1gmPXRWhQtIQh4ViJ48/szvbWbDmvE9qK22N4taAfU1RCG9BPBe1DLp/wA2qQ6OGM6tNdK8yPTkSiTb7wYMRS3xwum8VmTZjS9R5NRW+FBYkcCW4PZjSd7Mr4qeF+au996BiwZUI6iPAgnoYDcIWChDG4TMH06Y6WOI3Jaoc/Z3BTPKOpAPB2ybEyHo3kj7Nf3hcYX5+u6QJjwYn3NNYyO2vh0rxEG9s2wxn+W5u+l/xVfuVPbbzd5RahGRvIrlKPrWdIPMbIFqx/A1aWmSH/9EyHPv1tMqavaMdiBM5aoOZ8VpIDpmXxzFgw7CiXCt43NnIJtsIaJhpuJIbnhk224P9ArBgUIXKrc48nNkyCpm+tOqK0WrduZYq7kM1A300HSSuQrQLBox3Jegoa98Irxt/2DclhIEza2ZDRmETGHvgXSrsRVEPSLKq+s/S1XTHkXg4Efo4wVsvhFGa4oqbAfQ4QgAbZBkcgNhk/i3ipDXmHg=") {
    rotation(75.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "barberShop", player).open(player)
      }
    }

    type("shop")
  }
}
