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
      absoluteVec(338.5, 33.0, 413.5),
      "Stacy Bandana",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDQxNTc0NTYxNywKICAicHJvZmlsZUlkIiA6ICIyMDA2NTVkMjMyYTE0MTc2OGIwNjQ0NWNkNTliNDg3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaWVzdHlCbHVlXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82OGIzYjZkYmJkZTgxN2QyNzA1ZGNlMTUxODY2MmI4Yzk3ZjEwOGI3NmQ5ZmM3YjYwZWQ1ODZiYzIxOGQ5OTA2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
      "rE6nADz0UlAxc3hdwS9lIwO4Uqs7/Dc24L6rd+lYxQOyqApr45bXHDHb4iLIdz3FOF3h6GhR2GeEB/8h3IurWUghUCNBl7kE7u/tIDZB6MUhd/pku1b4rgME8Coni8EhdKJ3o8I9yQsHESrNPynAKalC8gMRyAsM3IGVCsTyKZq8Z366Sy1GQrE+FLrWysO2JHHhYBKUd9ZgMGpKTh37l1chXc38EEhPhiQzgZi+IgIoG+IgDk4DBKjqLVS7y8c4wDxire6/f4kjsSbxVKfpb87FwBdejJNV5IzgiTXbXg17swpnfjsnMxsJpJJSc+mMNgB8wcEby/MbJi6ZdWRCGip+aXAwsXPJPaY0dJsLWRuLKKXTIyVoWsjbKtv+7ij4CySiZERNOkA8fPKKmnzuCzCF8onoKV7V3rYtd0F2scqdwFAOuhLWYhzEuq9vagc3Gbb6iTADUbyAyV5FoN+DfZQp1+94MyohgoG+IQcvH4bNeWaCFZvbSXd8jDfmkGip8Yk9tYnqVcaeiZqg1OntjIMsRM3cfpnFqSVpr6HxQSeGLk38aFoO9RG5oerSoI28po4o5TdZYP7XHR3u288gdCv9poqtU90+lRq3FskOJDdQE3by2YX9vfiJjnX05vQh+ZUBnruPU2cmMMwiHvNI5fkGAEMArIjuZ6UoF5WL7K8=") {
    rotation(75.0, 0.0)

    val pointList = LinkedList<Transform>()
    pointList += Transform(332.5, 33.0, 416.5)
    pointList += Transform(338.5, 33.0, 418.5)
    pointList += Transform(336.5, 33.0, 427.5)
    pointList += Transform(339.5, 33.0, 430.5)
    pointList += Transform(336.5, 33.0, 426.5)
    pointList += Transform(333.5, 33.0, 432.5)
    pointList += Transform(336.5, 33.0, 427.5)
    pointList += Transform(338.5, 33.0, 418.5)
    pointList += Transform(332.5, 33.0, 416.5)

    patrol(pointList)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.coffee")

    type("shop")
  }
}
