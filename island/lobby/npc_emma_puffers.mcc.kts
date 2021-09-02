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
      absoluteVec(297.5, 30.0, 473.5),
      "Emma Puffers",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NTc0MDY1NiwKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU5ZGJiYTZiYjMxZTYxNzM4MTlkMGM0NzUyMTIyYTMyMWQzM2Q5NjkxMTI4NzQzMGZmMDJkZWQ1ZTdjZjczYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "OtweM1npYiQTr/EHIqZ9DzeEJAr3mK0lMYVT4B7C8Jj4LCFr6+D92LP+0ZYlOwuHYLGFAJEna0xs5VebkiY4M7AUpFb1yAbPxS8u62cI8A0Cf644oBQ16OqjLAtRsarlAnzOxN7g9upsQoXIfQX8W7u7k8bB02oEqVNP7CtrGG1DRZ8T4bGRG1d4VV/EFVg0nTLe55oWgCVK6hz5tUSKzK1dgL9xPFS/NLZ33c2x478O6WaE1YfuIbfkzvz2bB6aUJzziyVUCSDrvQJlLBelmZyWW4pB10gRmHujvVLnwDq7mSIRwnpswAyxg3dIPwGiWUcNxZwYxTiqCWizDyUONtnbtF/Q9JRNjbOxMAmwBe3XjCPiQwbeJdZ2QTVjWhkuUOgjSO0PSGIKo7DialqLPrzF85d2vCrm86EutQD8jyh0iao/wm5RCQ40SYOeQZm9UAxuYh5T8P7Za7cQ5riPPlTaU25c0KWt7M9cFodP9cybb32BzDakQbVk3B3Xr44JyvjR3tr99Rq/IGkxEzGJfZ66Af+SQS44sqWn1ndxXkd72ZH4BOmSnjMmUEuAMxGRQx0RuPaxDMe+2V3vQ4BOE1Ha1krjFSFqJmdji8tVIK4AjKd3gLJOn8xt4jceAHGUs8jsiwYJm0Mu0+OYQNVV0rnGqcOIQFtRb5qLCJxwvXE=") {
    rotation(180.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.auction")
    type("shop")
  }
}
