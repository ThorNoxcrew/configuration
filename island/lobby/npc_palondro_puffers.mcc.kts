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
      "Palondro Puffers",
      "eyJ0aW1lc3RhbXAiOjE1ODYxMDE0MDY5MDgsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzMDAyNzU5OGUwZjE1NzVkYzc1OTA0OWFlYjMyOTdmYzQ3YTZmZTc5N2Y5YWY2MWIyZWYwM2JiNTAwNzExMDQifX19",
      "Yji8mokXcgMWyy3aG7q6IZNjMmK/TfXsUBF32tm658QitFKT4CYrqhRH9w4LgfyRGeuGaZsYYXJudtahxXy7Cpeud+wKXCS04gyImah54AXJuHThWyaEmYTFQ5EWxntqX5+K233leFRu83QYdLwwklHwViBuomsk/TgDbJDKKrDDsOglY38h7jJWtJb+QGU/qzcox3cWQYu5a3PukWEo604l5Us0veO+mLad+icrScqBPXmGiil53WjncOY9k82ua8II0sQbQDLDIatCbuMrbub8ZBwPUXv44AJiaOgJ7osFwHIWo+pIlXcqSHGPGlOk9Rme4/hSoLFLdINbHlEYFaJRzhAJCBBIkR0k9jEO89BPAB3efJcanLdkbPpPLiuGie5ByUot8sm1XmJ1/Wzbr6WWN/VdmbiSUKMYwL90wEYoOdcRS8s9cODFZuavGx5iBkQKYQ8iWegXBKBKr9zvbc+a/SsnFxDiZK3gbp6jGbJQoaK+Fw0gKcnp/hdCYqLyPB9xkQbmnY01GbyDHTY+LyScZNqkl4Lg1pO+h0C1dj/D/B+UogQsimc0R6FI0H7fK/JfJeCx35CY4YNEJpzHJVm1f43Aq3TCUyIvF/h2TzdO5ioKqUYZvDo2IujeitQY++VLdbLtGwMzZdr7RHDmDPhAITlMRAdrnkl6yyo7bXw=") {
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
