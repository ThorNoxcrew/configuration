import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(358.5, 36.0, 536.5),
      "<glyph=mcc:icon.emojis.sweat_smile> Roamy Stepton",
      "ewogICJ0aW1lc3RhbXAiIDogMTU5OTEwMzEzNDE0MiwKICAicHJvZmlsZUlkIiA6ICJiZWNkZGIyOGEyYzg0OWI0YTliMDkyMmE1ODA1MTQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdFR2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdhOGFiMjI2N2FlNDQzZTgzYjA1ZTNhOGQ2N2I4Yjc2MGFkZmFhZDMzNWM5MDQ3MzM4YzBlMTc3NGE2NWMzNzIiCiAgICB9CiAgfQp9",
      "eq6hsb6Dk+MwfNKGH4WzJiJ612TJsVA+zhrPf+Zpn7fvvk3TwPEcdeSwAfGgxSHgEYGN5RKCPxRIPE9CzXO9dQl58CIlGvKPDzMg2GHEnhQ/ayyRBJrbtb6+ID1IPnwGFgw8N4qiBMN+fIRe4oLRU+9U+ptNTcznysSjw4TlcvwVuH8tkw8lxzwhnWSy2AXMB6uZD2U9W6yfmOW9q+QolznXXjYjlNtmFiaoDP7tk2yLkPDatujtL9g39uGV/OXR785/lwWMvlpVcVzRTiGHcahV3Xu/gkZIA5pVoQjFCeijti+a8qtHBQWhZFfPPVGOsgBGeSJUNFMMGYxS2i0hSe6tkvbJ8YUDoU9YaZt2X4b6UI2szpYnaCNAJdaqmedGgvFxwU7G5Z+fCwi52HM2uR2W85xZEKy9A1iDcv5EDGIQOdVp8ubQArtTMH4Q6xqy32aDkVOytuNs2kCxII7FyJcBdechN1/LCQjwtIORQOIofQ2QShWsfIiLhtfwLNBQLtHDYPP97KD203CFdE39UaJNSIUSo+iqUTHpBmmUzwivJTTt5EZVPZr9crR0Uo6oucN04XX2y8zv8O8w1zEsxMi91Cqpvcr2mXN30UI9X4mXidGTxn0dq5rZtBDKMc5al7lbkocPH5gZeRE7T15U5DlfgCsTyz/GgOKSdQKUN5Q=") {
    rotation(75.0, 0.0)

    val pointList = LinkedList<Transform>()
    pointList += Transform(347.5, 35.5, 519.5)
    pointList += Transform(334.5, 37.0, 518.5)
    pointList += Transform(333.0, 36.0, 508.5)
    pointList += Transform(331.5, 35.5, 506.5)
    pointList += Transform(333.0, 35.0, 499.0)
    pointList += Transform(351.5, 33.5, 498.0)
    pointList += Transform(342.0, 33.0, 476.5)
    pointList += Transform(340.5, 34.0, 461.5)
    pointList += Transform(316.5, 35.0, 461.5)
    pointList += Transform(313.5, 35.0, 465.5)
    pointList += Transform(319.5, 34.5, 484.5)
    pointList += Transform(322.5, 35.0, 502.5)
    pointList += Transform(310.5, 36.0, 502.5)
    pointList += Transform(295.5, 37.5, 498.5)
    pointList += Transform(288.5, 37.5, 497.5)
    pointList += Transform(283.5, 34.5, 449.5)
    pointList += Transform(300.5, 34.5, 442.5)
    pointList += Transform(324.5, 33.5, 439.5)
    pointList += Transform(324.5, 31.5, 409.5)

    patrol(pointList)

    helmet("mcc:island_cosmetics.hair.noxstache")

    type("ambient")
  }
}
