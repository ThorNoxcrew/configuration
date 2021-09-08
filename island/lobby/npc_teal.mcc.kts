import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Turtle Fan talking in group left of main lobby.
  playerNPC(
      absoluteVec(340.3, 36.0, 529.3),
      "Teal",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExNzIwNDE3OSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NDI5ZWI3ZWU1NDNmZWM5ZjVkNDVmODJiNDZjN2QyMjRlM2RhNDMyMDc5NjllNThmN2Q3MDJkZmVjNzIzMzliIgogICAgfQogIH0KfQ==",
      "u7q++7Apt/iCvlfUu401WrxV6pCVUhyf8VfdRovQRp67HSRpagtSxHHU2wu1vw0BFRszq+AFJJy4s9WhAYU4thsRFsi6BoGAGOhy+S8nGTPF2JSyFVrkI4doA1ChUesWswk4sXk3vjyJX5rMxq2hluB/ZV8FD+GWUIBnt08drPWRMyVIHO83fd3Wxg+H+HcZx4aXCG9zB/OxesPyRa7aTJU0F3RZSGw11tiEghy8OW5gQQmKKwxGAD0AjlDIS6tkB/L6mVhwMFtj5N5d6+8vVPUNTj+AoD2v4CnAPHNlJj+0C4pAC8LZvrkrR9S8fxi7VuGbCQ0Z0EJP9ibmUVU37du7rrhICAYb+EgiGm4uNm9mAxp2nSFJXT9MfxuswV8V3ZS2NX7g9RUettuO0rRgPLy09S6mk/GzP/gjcTmVEsUd0LeAEabZPvMtDsegVBNoYUeYSIwSv1FPqxkDhkVzZnlaohR2HKm/iH0L7Ewa48vD4sszZES6Be3QX5hBNHjPgkY6glqYCQ2N565ZQYOSYSXNP2TIx9SzQ6ImDtdRz/r8mvDcfINV9GX2v6m7BgZZsT+JAr/u8xM1+U6xDYF9YRXH+34SedBn88d48nXUBWLguYEqKanrSbVUMpeoOZcaEtILccojG2Daoj3S+8OFmm5wSADazLPn+a4ExAV7Yx4=") {
    rotation(-150.0, 0.0)

    type("ambient")
  }
}
