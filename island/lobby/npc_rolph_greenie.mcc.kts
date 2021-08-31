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
      "ewogICJ0aW1lc3RhbXAiIDogMTYwMzU1MjMwMDg2MSwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U1NTAxZmNlODY0MTlhNjkxNzc1ZTFlMGY4MGE3ODhiYTUwMDM0NzM2MmJlY2Q4YThjMDVhYTEzYjY2MmE1OWEiCiAgICB9CiAgfQp9",
      "WVgYznVPa3u+zKr4OPuEBzlXBrc0UZN+V5rvX1ZR0bjGA15quiUkQvtOv3WsVYWCoR6H+1+80E4brfv+QkeodnKTsDR0ZaEYEUeW5p/rxjrX90XkpybrPKUjOlUtfuPxzP+vO/2R7jn5HPerb9MZGxu02TqBEqtAHG3p9plV6BIaYXl6rG6yB5Aif7iKJ5yBcE518XPssE6yng5/yzCURjhnRR1G2MSUYj/Uxpx4GOMx7ey7j5GHe9IbWUSGJtUFL04dbKLX/niDVhWtOPZaaqZo5VzecBHwbHjrhh+jxSzgtWy44davpwfKUV24oxvAq8/tUGEq2epU028DrFnwFKpEn0p9rpm1ktPkSXb4heTUxPw9AoDDKYAYEsHLpW7kkzmrgYonkWuXTfGhleFglkaeZ6qEBzdQORtW28HkR5VLWcUyImlduxuIniNIagTCz24Kmjx4vEefLID8Tzb6M4z/Id8ZfjNPARqzRjMNovavQWiAKrSEBp6UKEB+YUaIrZWB+oZftbbVDiuXENN3adN2ebVfSxodfO/oVijd3ZpovNm0L8/dIsY+MIhBV8H+bcWjuUWGalD8ZaR1lzPOcn4MmBA6hpBqWf/nY5G+aNowibpmZ6xeW8r2nOJ0rto6szLqJDxx/pGUL6VHGVSDsPOiKiVRRg6Kd7Np3ozbk14=") {
    rotation(90.0, 0.0)

    helmet("mcc:island_cosmetics.hair.schrute")
    offHand("mcc:island_cosmetics.accessory.cash_filled_briefcase")

    belowName("island.npc.ambient.rolph_greenie")

    type("ambient")
  }
}
