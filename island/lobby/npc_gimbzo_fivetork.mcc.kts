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
      absoluteVec(354.5, 34.0, 456.5),
      "Gimbzo Fivetork",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNDYyNjM3MzU0MiwKICAicHJvZmlsZUlkIiA6ICJkMGFkNThjOTNiMzY0ZjgyOWRjZWEzMTAzMzE5MTgyMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJfU2FwcGhpcmVfTHVuYV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Q5ZTUxZWIxZjYzOTlhMGEwZjdhNWM1NzBjMGNiOGJiYTA5ZTZkOTkyZTE5MDc2MjZmNTEzOWFjMjI1OWI0OSIKICAgIH0KICB9Cn0=",
      "DZXQKz5UFg25SpT4IkR6i0T2BoYre9mDe46CuBuqjvIrG6eYE+PYrRbZKTv0p8dW4wms9c2KNSt1QIjWDWLqoK61EJBFQ43Nui/ds9U+d58xTk/VImoIYFdtfFzNEddMhP2jc91LSlShzi9K93gPpZShH/FsCwr1CVJtA6qAT5mC+iRM3n5bXAkkW3CXM55GbY5BDv9oHlPXh2J+FPKCvvg6u50ZBOdGTsr4EvfMn51gCX/k5LqudR7J77PtaNvyhCLjkr/FT0fAgSLeyFtLBursDmhbpNe1ZdVpVhLuQI7Tp6URGv1SyZxmW54zgWfJe61bgeS7Cm/53q3nWJ9RdcVIsO3d9t/BRQ3DhjPE8WEEQKB5gmvwqlBO5d7bL4Ggm1KlAvk/dfkV+DTMNCeA5cSqS23bHvA3qQeXASrXRltQ6/nM1uUQ/KCUXABJ2fOfGgH30amgHFutEI+tSxNU6+kvqECBqrWz0vVQAdyvyNERRd2V1e0ZILPBlp1yCNKoz6qG3BVGumeuGUzrwnXxMnJtfNGpyJ7W7/P1ojHZPy7a2nuiaKpzFPB6/WYSyKG1jxstDeEl+CHNuxOS5S912wYPuXbZPyMJtdrgheYcdi0gTHUlvoMakSThyCf2sTbnaxNnYJuRclCvIfGhJdujvwmh9/ZwJo2LSdBZJJwuGHI=") {
    rotation(75.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.pitch4")
    type("pitch")
  }
}
