import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Grid Runner on beach runs laps.
  playerNPC(
      absoluteVec(425.1, 27.0, 663.2),
      "Mary",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyODgzNzc2NTgzMCwKICAicHJvZmlsZUlkIiA6ICJmNThkZWJkNTlmNTA0MjIyOGY2MDIyMjExZDRjMTQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnZlbnRpdmV0YWxlbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmExODZhZTc2YTkxMTMxNzg3N2VmZjc2NDUxMmIyZmRlZjIyMGZlNzY3ODI3YTBkMmYwMzdhZmIxODhiMmE3MyIKICAgIH0KICB9Cn0=",
      "prggWnIyNoDsIOa3dFu6aLAb9PLCJcoJv2vybbucI92DvNvMht2KUyUzGjHm+I3d7ypLQUK/kt1NXEELdPAAdU+3hsX2q3mfgZH7D/uJOWVB39QlXixpp5YmzGdAfPTGyA+KTnfHb0tvbpJ2wjFyxzhdqOm8++bMhqzj21bdTmyUSDxhKivCvYLtzn+h7wxynBXs5jawNURhWtbptMbAiyzvAKQPMYbSzTEExy0QX7YWT21zs+tdoQ4buBeHTh443ZOPtnmk8abL0Ea1DYNBaaEHeAJyezrXJhq6WNwlijI/UJJ/2rkpM1vavCq4rYL8kNJZ5JtS9sGkP58umahduZCMvmqQifBYzeGxdE07A1n+9MC7ez+kQA+GF5x/ZgkvfX6Js/KXQIVw6G+nvhrouJPPF9G3HuL+UbSvaODHI1odnQGYmzSEJVscV/lVED2tkON3pQTK0OJz4g9IFDxdTA0LVxUBtH7/H1YyEfqluJJraRQnV3iSLTAWl5q3vQu4Ik8Y/10OHNHBhDHPiHxHnCK3oeEafevxN5LhTLrOvJDvXlGs2DLqm3bkIk5QEs+GbLvdcihD9Gr99LHVtOEYZf83dspLRRX9V9RQfzhRwP2ZenzAHwcqMnTN9RN6Wq8o/MJ7wpNjFyblWmSQgjOPmy10HN4h2uCOt5/pgcEi/e8=") {
      
    val pointList = LinkedList<Transform>()
    pointList += Transform(425.1, 27.0, 663.2)
    pointList += Transform(429.8, 28.0, 674.7)
    pointList += Transform(430.3, 27.0, 684.3)
    pointList += Transform(429.8, 28.0, 674.7)
    pointList += Transform(425.1, 27.0, 663.2)

    patrol(pointList)

    type("ambient")
  }
}
