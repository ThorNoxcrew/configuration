import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(358.5, 36.0, 536.5),
      "Roamy Stepton",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDA3NzM2NzQxNCwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk2ZTE5ODU1MjUyMDAzZGY2MGE5OTZhYTk2YWQzYTZjMTE5YTM1YmMyODc3YjI1YjVmYjZkZjIyNmM1NzEyMTAiCiAgICB9CiAgfQp9",
      "tplkFDbgMPOeah02eMAAAsHRGD7JwsOELFSG+3iPGvdSxCxLWiewuA79uMno5AEdK56P4SKwf14y0N61sGMYGbRItg3SR+vCOBOjfM3wgD+hwR/CGLZsYz2G5TV6rTvWlrA1Fc5c8e+u5CiiScynXW4Zyua0lQjxFtgHywx1tZuw/EGAMTTlDcJHAobNpK3/693UARIZZv2aNMYC6WIH/1AO93seq2ywao1Q0hj3I8Cv/t+fHU/S+iePETfukI149n6CvaGfcZui9pcS2cT8RRNlUEvWkoFzVxAecDdilWMaOg0C/2lBrWFfvUHxJUNscLFMgZzrhfbBGAtfXNrBl9CJCsWa1NXFgKlMyBoiybQoBlnCehAVyicFLA/D1rA5yJKCmRd8P3cebxJ1k2kdnImyxJbufT6DMzrSrvF+zySg3782yqrostuJKTCM08flIuRdHxhGCTTc7AKWsMwoSlBEeO3L9bkGB4Jghsjt/URKEhkuMQF6qUEW14jER+x+XtKhn9NX1kN9svHnT2sv/G+/DL4gV+f+jifY0kmt4UvLWR5Bil2l6u8eFBUVXgqGXr89+d2sv4V86+foowD82k7f/04CeKK8O5V3tpW2jWoOe/06dQbow3vjTRX4Cq4zKpgSwiTbIcMDmDbF5CzRu1fg1jiOa47wA8cfH3NDAQI=") {
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
