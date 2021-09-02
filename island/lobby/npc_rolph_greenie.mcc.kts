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
      absoluteVec(311.5, 35.0, 463.5),
      "Rolph Greenie",
      "ewogICJ0aW1lc3RhbXAiIDogMTYxMjM0MDcwMDQ2OCwKICAicHJvZmlsZUlkIiA6ICI5OTdjZjFlMmY1NGQ0YzEyOWY2ZjU5ZTVlNjU1YjZmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbzEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg5ZTI1ZGIwYWExNDc1ZWRjMmY2MjZiYzUxNzUxM2I3MDcyZDAxNDRjMGJkZWQzZTA4NDZlMTVhMzE3ZjRjNDMiCiAgICB9CiAgfQp9",
      "QbzOOh+g2cX23L+ndB2wS8Ha8AlbAeUhSq/ptda0pueWO0WmCwLDRkgQxeBHE3zlHU+FlBDm+j0BTrfrbJhu6DCBW1rLBywYwRVaIT5PLSfVlaKfmHCxcVEowcdJtEY4LXwdBhASpX++/XgtsgIuMohN1ONs8S0ULRNOaNQ7TfcyRZeY2Gnx4A8YamFVHlafXo2yTl10Hn43CJStgtUE/8RMlqwBLkVXg4J/t6I/tH4qnXI+BTNuf53Ezy2ic5k0UTpXFnbGGrEonG8kVeUaVd89UC2Kg+WYkd4p9xsVt+OppsiokMP499+d9zc8sUvGvamT3p8hSCbG/SxIarAZookbJx39/3TfC54+fk3w3sJJNmaPz1azz0MmA8HDYSi8fZkqNtBQpqRIQa0jm09G3sPih4zyYIqLMdpcTvMJHImNQQgwMH4LWbZ0BBT7cgKKWSMUY4B8D7BrzyB6Pwk80guJrsBzuPPk/OqIFP6NaSJ+MeEaoWoHNCzVcljql6uLTWu4Dr/MzhcS1i5/5P3mYF1leAFkxCfu8tEUTcc+mX7ICvvBjb7XFPgm4Vc+1yAk0Bh6A8hakEVNFiY6HT+J8tfnbWTBcziYRbYJPQaBnLY2KxM7tLt8KDBk4sIaAazGtoz7mwJpf5V66PH8LQncZtoCcRLyngJ/MvZp1aVEYGM=") {
    rotation(90.0, 0.0)

    helmet("mcc:island_cosmetics.hair.schrute")
    offHand("mcc:island_cosmetics.accessory.cash_filled_briefcase")

    belowName("island.npc.ambient.rolph_greenie")

    type("ambient")
  }
}
