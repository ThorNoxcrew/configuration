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
      absoluteVec(371.5, 34.0, 496.5),
      "Buzz LeBlanc",
      "ewogICJ0aW1lc3RhbXAiIDogMTU5MjU2Njc0MDg2NSwKICAicHJvZmlsZUlkIiA6ICI2ZmFlZWI3NzgxZDA0NGQ2OTdiYjhhMGJlYTU3YTVjNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXR0TGluY29sbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMTZmMmFjNmM2OTg1YzU1ZDRlYjliODI4MTlkMzVjZGEzNDM2ZmI1YWJiOGIyODU5ZGI1MzEzYTMwZDZkNTJlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
      "ZfKKvaeFO4P5Q2cXj1s4f5cWNoc3232ewIEu8VrQifcM4jsd2u+7ItlFAWxsTsUZ8BiWDSVNOliJDlcy6H6teoS7Xo/ZrCuQV1DO4sP7fndhuQRsMUUHWED+sFGAk4QQQ9aOEVG7UWMpFOfiedGo1iMkdeGKtMcJDKqw/TYNfZroqNLM1bxiyW7Gh+u9ZFRQT60H60JuNpcDUkKqWejoLtwL7ofqE1WaO50vOIOb6/LeZu/fqwlsrynGDfoVIpgNvEVwKoDpTDk6fzNftFQ7ykMYgurtCBaDJ8REWUzTtj/agujTUvS/7LCFfSq6HjRqPEphTjbry18DfN5bfH+hUOZ2HLzZ6+pzMkNZVxOT9/9eDqfMaAVCwy0bo65+r/xIIvujGbPSXB03vIJi6tDiWnHuqCa1smUZPRlu8dKBk0ytgaCVL1CpPBfu0IqdGEwoA0MS8Uy2cMsHc4BXOhdmUcTNyGvvtZaPxWwKf+KD/UhjwldE7lh3KGsuWTuVuGPLbG21TQrEtqM8nA/OVXl7kc3l/dtBFDCiTiAipQVeUcq5Ge9DtZcWyBpvu/GsEuxJP1areR5A9w/skE3CbrtbXGB/eYjYS5S55Uoa5+utCoytuOiy9t1vmoUyyQTCdJmWpaKTHCRf11n4hj3Rz4Q8OcUwPvyZPdKy65BA0j4AD7Q=") {
    rotation(90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "barberShop", player).open(player)
      }
    }

    helmet("mcc:island_cosmetics.hair.fade")

    belowName("island.npc.shop.barber")

    type("shop")
  }
}
