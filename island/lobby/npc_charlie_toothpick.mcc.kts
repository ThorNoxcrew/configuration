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
      absoluteVec(330.5, 35.0, 499.5),
      "Charlie Toothpick",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMTcxODQ3ODIwOCwKICAicHJvZmlsZUlkIiA6ICJjOTAzOGQzZjRiMTg0M2JiYjUwNTU5ZGE3MWFjMTk2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUQk5SY29vbGNhdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ODlkYWIxYWE2ZTQzYWQ5MTlkYWUwMWI3ODU0NDUyMzhjNzhkNGE3NzU4YWRkZmU1Y2Q1YjY4MDBmZTE3ZTczIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
      "PS5tvaBSX8RsLKUJ9N4SA+ul5FO4iVTVKlfRIycNFzUOub4Wh3uIhs+0JNDoW+7ZsUufHtKGHD8rHVPofZykO6qNpCcPzNqXH9tkm3jXqGu35qX6w65FmzXD5EqhEKaSwqWoFEeh1Sw6cAPDE1iFHxFzIVygpYeyn0rlrEYc8ONA9zInLDzekg1EbjiQcchgdlBWcWqXkLGDUejqjgAgkJKgOVdGg0jkpPVe9KTYXXYI6OpWEe5lm2gMRZu/BGw0i+HMPvRzkGjHFzx47WJJ5Cd0qkEfhiRk+DZYWOeFD8id3BxJjcRBwQZpoLCnn0IvGGDVj4sUwpsl481cIbosVpvr9x2VBkGJG9AFYOte/8w0Jo9Szqp0trfl9+qoVr4U7gLrElN4kRrbPlfcpEA7BiyEz/xo++jY1aG0vpBcWofphVuzcxE+Xk+KGamQjpexHHdESaw29ISdeUmEWHGRfiPTDScKESPMunVbOwjPDdv1ZsiRshu51w6sq4Pxz1TTpDFiCn0JZKg1xwczblddeZyFq9Cr4+mveAVCpngzs3TlBWO6Dlm6uCUTI1vWRONy/DcMJM6Y2802Xm4iKKDohGxHWU72JjVmGwVFgWgarHqTeckG8y5kVkuleAKUhgXFmIq1RmvVmWFy35JyDAMC+bKuasHXjlBRkZWUZJjDMYY=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    helmet("mcc:island_cosmetics.hair.prince_charming")
    offHand("mcc:island_cosmetics.accessory.trash_can_lid")

    belowName("island.npc.quest.material")

    type("questgiver")
  }
}
