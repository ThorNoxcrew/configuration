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
      absoluteVec(305.5, 36.0, 417.5),
      "Jezz Beffesto",
      "ewogICJ0aW1lc3RhbXAiIDogMTYwOTMwMTkwMDU0OSwKICAicHJvZmlsZUlkIiA6ICJiNzQ3OWJhZTI5YzQ0YjIzYmE1NjI4MzM3OGYwZTNjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTeWxlZXgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODlkZjZkNmQzYWQxYjg4OTBmNzA4OTJhMTJmNzNmZGVmZTZlNmQzNTAzOGRhZTZlMDFmNGZmMDdmNDQzZDFiMiIKICAgIH0KICB9Cn0=",
      "X6MGp6wgtrjCZ6sWgoElmPNXjVDyLxBxidFZowlnYUEWTlLeDBBK06OSLUz5HJqfTbWIZ/NlodpOASDZ78jH7Kn8hCv3mh2vu986MLRRUAWvGc6gVB21k4/CgVQWNIwwJeqmbuPYtOrBgs0ApB6HGQN/4aEAoswNxiSiW1paEf1fnrhbfy/2pKN0JR+gnQpr/sboFf9ehKq+iZuSnzhbnJtW5UoH/g59e9zgrimSIy1hB/wPXSZbMZUhHr63alY785RHFqwoJ/QXRaDcRrP3gqtQSL5412jpTFpM0O5YRJEhkDmwwrq/HW7tSRvAsGfd3oEqQjuwxNU0oUKBhS/WUaLWuTyGkYF8AA0QHn0P8kA4wOWdgGsWxDgPJ2af0Kr0QHyXCiVM70HCbrCq9DnhygI14rQmtgWVDYADGr9Ig2+Cz2pZYOvX7VeElmCG6dogpu4J0NvKzhKYuD+WG5VtsYnT0LdZBcqyLp3Ok7Y2YgMJ0nMSTCQ2ekg+dXdnejtprFFp2LT2NWQ5jPTrGQ6Oov5ViR6aCQKeFDFNJnVZfd3mOEVZsIDL8iaeE+Q9KntIRhsaUUns8OG48FuI+6HHPAwlgnjtcM5DJa4BrruMbrJ8qAH3OgTg8zTfJ5hxH0tT1ZTuwhmWFScv/x30HcAalMNcheQHQd1d92gWyz5lBp4=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(3)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.bank")
    type("shop")
  }
}
