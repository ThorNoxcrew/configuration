import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
    val i18n: I18n by inject()

    playerNPC(
        absoluteVec(288.5, 37.5, 495.0),
        "Roamy Stepton",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDA3NzM2NzQxNCwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk2ZTE5ODU1MjUyMDAzZGY2MGE5OTZhYTk2YWQzYTZjMTE5YTM1YmMyODc3YjI1YjVmYjZkZjIyNmM1NzEyMTAiCiAgICB9CiAgfQp9",
        "tplkFDbgMPOeah02eMAAAsHRGD7JwsOELFSG+3iPGvdSxCxLWiewuA79uMno5AEdK56P4SKwf14y0N61sGMYGbRItg3SR+vCOBOjfM3wgD+hwR/CGLZsYz2G5TV6rTvWlrA1Fc5c8e+u5CiiScynXW4Zyua0lQjxFtgHywx1tZuw/EGAMTTlDcJHAobNpK3/693UARIZZv2aNMYC6WIH/1AO93seq2ywao1Q0hj3I8Cv/t+fHU/S+iePETfukI149n6CvaGfcZui9pcS2cT8RRNlUEvWkoFzVxAecDdilWMaOg0C/2lBrWFfvUHxJUNscLFMgZzrhfbBGAtfXNrBl9CJCsWa1NXFgKlMyBoiybQoBlnCehAVyicFLA/D1rA5yJKCmRd8P3cebxJ1k2kdnImyxJbufT6DMzrSrvF+zySg3782yqrostuJKTCM08flIuRdHxhGCTTc7AKWsMwoSlBEeO3L9bkGB4Jghsjt/URKEhkuMQF6qUEW14jER+x+XtKhn9NX1kN9svHnT2sv/G+/DL4gV+f+jifY0kmt4UvLWR5Bil2l6u8eFBUVXgqGXr89+d2sv4V86+foowD82k7f/04CeKK8O5V3tpW2jWoOe/06dQbow3vjTRX4Cq4zKpgSwiTbIcMDmDbF5CzRu1fg1jiOa47wA8cfH3NDAQI="
    ) {
        rotation(75.0, 0.0)

        val pointList = LinkedList<Transform>()
        pointList += Transform(288.5, 37.5, 495.0)
        pointList += Transform(288.5, 36.0, 483.5)
        pointList += Transform(300.0, 36.0, 483.5)
        pointList += Transform(317.5, 34.5, 483.5)
        pointList += Transform(325.5, 34.5, 485.0)
        pointList += Transform(340.0, 33.5, 485.0)
        pointList += Transform(348.0, 33.5, 485.5)
        pointList += Transform(350.5, 33.0, 478.0)
        pointList += Transform(350.0, 32.0, 458.0)
        pointList += Transform(350.5, 31.5, 430.5)
        pointList += Transform(350.0, 31.5, 410.5)
        pointList += Transform(347.5, 31.5, 406.5)
        pointList += Transform(335.5, 31.5, 406.5)
        pointList += Transform(325.0, 31.5, 406.5)
        pointList += Transform(324.5, 32.0, 412.0)
        pointList += Transform(324.5, 33.5, 420.5)
        pointList += Transform(324.5, 33.5, 443.0)
        pointList += Transform(321.5, 35.0, 450.5)
        pointList += Transform(321.5, 35.0, 463.5)
        pointList += Transform(321.5, 35.0, 478.0)
        pointList += Transform(305.0, 36.0, 483.5)
        pointList += Transform(289.0, 36.0, 483.5)

        patrol(pointList)

        helmet("mcc:island_cosmetics.hair.noxstache")

        type("ambient")
    }
}
