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
      absoluteVec(367.5, 33.0, 487.5),
      "Gimbzo TokTorc",
      "ewogICJ0aW1lc3RhbXAiIDogMTU4OTA5OTgyNTAxNywKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NTM1ODA1Y2Q5NjZkYmU3ZmIzMTY3ZmRmOTU2MTkyOGM4OWJiYzQ3ZjE0YjliOGZlMTczOGZhNThhZDE3OGFmIgogICAgfQogIH0KfQ==",
      "HuCn0ZQqnnr0gGNQKmFsoz4iLTAuuBwu74i05REJwH44iwA4BbGa8Tx/ieoFN86tcpiC2aI3jjG0aTKI4HSiCR09DqmVoQ6fcDNEfu4YS+qJX+H9+NwCsl8PxN3l01waxq5KuNHbyxT/9XXFjijwGzn24BE75jUqj9zIG2a6834+z/6Mk6BZMwWFzQKJTZstuMTDAFyjWvqKbe6gRMZAzzZWCLnWt8XtocJ0Z+QXNpneDQaOxNyBSwzy+7aD5aYuRwClQeDJFleJ7Nr1xnJRUUnRkTOOhugj41hZ0TR+RsvoJl5TEanAvCb9t+Tjir4+TvXJjjMEqL7DnDBUdNj/+h4mU3edaT356sXjQAGwmS0Ey1KmKQqJ/SA/l8X1fQWnHcwSi7xbN9dUPeA3FwQfIYEyKW4olcDUy+tuP34+JFGwrs7E6hnnnGoraQ1c6CqIfgzKwlsZ5R/3dHfCSCLboAejDtktQJaJ+TCiD7XlNAw6c+wqgf2AtnvwvxtQJQqiXFR09gnMZG0UEJ8x/rqm/LdhCS787prd1QvPn6SeqQ4bqjQd9ewDuoSPpV040iNvTaiTY0YeBaTuc1h7SKPECDk1+BjrmahztrL59+9eyuQ5BEe8SX/OPEBPsZQMO0B95+7AwTq0xiDRylkkGq/TEjvskpJaT1yFh91zcT6AKpk=") {
    rotation(75.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    helmet("mcc:island_cosmetics.hair.professor")
    offHand("mcc:island_cosmetics.accessory.pipe_wrench")

    belowName("island.npc.shop.gadgets")

    type("shop")
  }
}
