import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Runs between Yellow Yak house and lighthouse.
    playerNPC(
        absoluteVec(257.0, 72.0, 703.0),
        "Charley Ghosti",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDA3NzM2NzQxNCwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk2ZTE5ODU1MjUyMDAzZGY2MGE5OTZhYTk2YWQzYTZjMTE5YTM1YmMyODc3YjI1YjVmYjZkZjIyNmM1NzEyMTAiCiAgICB9CiAgfQp9",
        "tplkFDbgMPOeah02eMAAAsHRGD7JwsOELFSG+3iPGvdSxCxLWiewuA79uMno5AEdK56P4SKwf14y0N61sGMYGbRItg3SR+vCOBOjfM3wgD+hwR/CGLZsYz2G5TV6rTvWlrA1Fc5c8e+u5CiiScynXW4Zyua0lQjxFtgHywx1tZuw/EGAMTTlDcJHAobNpK3/693UARIZZv2aNMYC6WIH/1AO93seq2ywao1Q0hj3I8Cv/t+fHU/S+iePETfukI149n6CvaGfcZui9pcS2cT8RRNlUEvWkoFzVxAecDdilWMaOg0C/2lBrWFfvUHxJUNscLFMgZzrhfbBGAtfXNrBl9CJCsWa1NXFgKlMyBoiybQoBlnCehAVyicFLA/D1rA5yJKCmRd8P3cebxJ1k2kdnImyxJbufT6DMzrSrvF+zySg3782yqrostuJKTCM08flIuRdHxhGCTTc7AKWsMwoSlBEeO3L9bkGB4Jghsjt/URKEhkuMQF6qUEW14jER+x+XtKhn9NX1kN9svHnT2sv/G+/DL4gV+f+jifY0kmt4UvLWR5Bil2l6u8eFBUVXgqGXr89+d2sv4V86+foowD82k7f/04CeKK8O5V3tpW2jWoOe/06dQbow3vjTRX4Cq4zKpgSwiTbIcMDmDbF5CzRu1fg1jiOa47wA8cfH3NDAQI="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(257.0, 72.0, 703.0)
        pointList += Transform(271.3, 66.0, 697.5)
        pointList += Transform(279.8, 61.5, 691.5)
        pointList += Transform(286.5, 61.0, 691.5)
        pointList += Transform(299.9, 59.0, 693.2)
        pointList += Transform(307.7, 57.0, 690.1)
        pointList += Transform(315.5, 56.0, 680.8)
        pointList += Transform(322.7, 54.0, 679.3)
        pointList += Transform(327.0, 54.0, 682.9)
        pointList += Transform(335.2, 53.0, 681.8)
        pointList += Transform(343.2, 51.0, 677.0)
        pointList += Transform(347.2, 50.0, 670.0)
        pointList += Transform(372.1, 49.0, 689.5)
        pointList += Transform(372.1, 49.2, 689.5)
        pointList += Transform(372.2, 49.2, 704.9)
        pointList += Transform(377.9, 49.0, 709.3)

        patrol(pointList)

        type("ambient")
    }
}
