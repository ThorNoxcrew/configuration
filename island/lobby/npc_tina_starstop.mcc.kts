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
      absoluteVec(330.5, 34.0, 470.5),
      "Tina Starstop",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMDIxNDA0OTY2MSwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NjBmMDhhMjFlOTZlNzU2Njc4ZDRiMDkyNDVmYzZkMDY5ZWM2MDg1MjY3YmE5MmEwNDNkOWQ3MWY1MTU0ZmU1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
      "q0dBUwX1v+4UmyVdeGNrOMEh/Du3oKSGhGh+H2EIfdt8NhE1yx6S2hdwtish3O3gUG+S8qCzMOjn19PfnMwOl4UOZj3+qSyeO1ZE+WL+/twKgPnuHwmQ5SVKj7OsbXsMErDMy15Qv/kchOsxiVOMcfP+olW4/jJfk5sp/RJaWoyA0tHXWBaTaMlpYoJ9WaBC2pVT7y5DR8gyJcsIInIyA4+vpWB9eUFQaJjZYNqj4jdZpN3itjruf5pKKihY1vK14mtefxlSxFeKP38bVZM1u/d75+4elKxUV3gIzM8GNNuf1qHmw73KWgXaOFKVBPYNXKeFl3r3SntIA3o/SobmyWrwVZp5GKlLzbOwSGMWhyyTqz2ad7qYiv0MLXzMTtAEhaqpHyFCajVEBA2GeBEKDB6j5Ac2b2K52DBPLvYBVb8HuzThNLZ7ja8grB5iZK1oBX3rD3BDfNdwl/aPVMNrz32ujF2yGfIPDNVRAWnzcOWtszXaf6d1LI6EbqmE+PuiOgSZ6xWpEnoVl4iINHpSG9PivgQLnmXRuRzByI98sTvRPK4FsAYN7dBadYqoTzSVqslnyt5T8FJunlSVTAyNojcxD/SyOV2i1S+tH6g0cvSATzP/wYuR514DBnD9ZIEQiATJcwL4oaFbgfcxJ5SKwGk0FGEvx/U/jj9GJ1Z3Lx8=") {
    rotation(35.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    helmet("mcc:island_cosmetics.hair.pigtails")
    offHand("mcc:island_cosmetics.accessory.stick")

    belowName("island.npc.ambient.tina_starstop")

    type("ambient")
  }
}
