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
      absoluteVec(315.5, 36.0, 495.5),
      "Kia Linguini",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyOTg0MjkyNjMzNywKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zODFkMThhNjI1OWFiNDRlN2U0MDA0YjI0Y2RkZjRmMmQzMTI5ZDRjYzUyODRhMjQyM2VhYTQwMWEzYWVhMTc4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
      "Bj0CWytr9YTsqIEUhbf6tGOBO5RVYgXr7rO4fT8m7CvDoDcNWGQxEP/QQacChOo5SWzkti7pOLAnIuI1610aVeZQtH16kLgCyJ+J2BVCyUNWF70wYj6yq1fzc3zoDCh8lUlvm3J9/nC/qGft7ucgnBrnOdvvSzAya5PrCDRiAiCDaOCB3SREggpXO3iZqsNDyeASVJ2SgS3U//MG2gUo/n/Dv73mdbJ6B+p+wUj1eY30lQcDCtQKb93ZNaO0pqrF2OWlo3gbm5qiaOb0wVJD8VYdKjTvWeV5rTeH09bHiL83VRQ/p5ZrSlI2EcrI0eoBf4xpn5BDnjLMrWIec7UJMa8HRT3qiCz8AOaZa2VBynGm0PDVrVJxslicZizp+TUVxzQd+m13L3O6oBc90PVjiDvTqr481C6GSvuuJoFebjcVGUff/IqOSSYVqWJjcPWcFchqu/UCwR8E1An6ITrt34JW4Cgb8oKj2Z3K/LMDJdv1AJ6+jfYdvMseqEPFXivtuF0sD2Y0TXIerdMNMTRzgg2eGpox2KmpuoY+UwvUtpp2wYkcrs4GQofi3KpodzordtVqchXzxmKbh1zR8JyJ+/id30sQCfPuY2FUxv3ski9/fIIMd6xpf3VxVJtpiHEwiTZ8sFm2hXYQsVNN+/OkRud+0+DaN537GqmlrTch0y4=") {
    rotation(90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.furniture")
    type("shop")
  }
}
