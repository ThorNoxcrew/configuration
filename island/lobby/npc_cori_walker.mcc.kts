import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(350.5, 35.5, 518.5),
      "Cori Walker",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyODgzNzc2NTgzMCwKICAicHJvZmlsZUlkIiA6ICJmNThkZWJkNTlmNTA0MjIyOGY2MDIyMjExZDRjMTQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnZlbnRpdmV0YWxlbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmExODZhZTc2YTkxMTMxNzg3N2VmZjc2NDUxMmIyZmRlZjIyMGZlNzY3ODI3YTBkMmYwMzdhZmIxODhiMmE3MyIKICAgIH0KICB9Cn0=",
      "prggWnIyNoDsIOa3dFu6aLAb9PLCJcoJv2vybbucI92DvNvMht2KUyUzGjHm+I3d7ypLQUK/kt1NXEELdPAAdU+3hsX2q3mfgZH7D/uJOWVB39QlXixpp5YmzGdAfPTGyA+KTnfHb0tvbpJ2wjFyxzhdqOm8++bMhqzj21bdTmyUSDxhKivCvYLtzn+h7wxynBXs5jawNURhWtbptMbAiyzvAKQPMYbSzTEExy0QX7YWT21zs+tdoQ4buBeHTh443ZOPtnmk8abL0Ea1DYNBaaEHeAJyezrXJhq6WNwlijI/UJJ/2rkpM1vavCq4rYL8kNJZ5JtS9sGkP58umahduZCMvmqQifBYzeGxdE07A1n+9MC7ez+kQA+GF5x/ZgkvfX6Js/KXQIVw6G+nvhrouJPPF9G3HuL+UbSvaODHI1odnQGYmzSEJVscV/lVED2tkON3pQTK0OJz4g9IFDxdTA0LVxUBtH7/H1YyEfqluJJraRQnV3iSLTAWl5q3vQu4Ik8Y/10OHNHBhDHPiHxHnCK3oeEafevxN5LhTLrOvJDvXlGs2DLqm3bkIk5QEs+GbLvdcihD9Gr99LHVtOEYZf83dspLRRX9V9RQfzhRwP2ZenzAHwcqMnTN9RN6Wq8o/MJ7wpNjFyblWmSQgjOPmy10HN4h2uCOt5/pgcEi/e8=") {
    rotation(75.0, 0.0)

    val pointList = LinkedList<Transform>()
    pointList += Transform(271.3, 66.0, 697.5)
    pointList += Transform(279.8, 61.5, 691.5)
    pointList += Transform(286.5, 61.0, 691.5)
    pointList += Transform(299.9, 59.0, 693.2)
    pointList += Transform(307.7, 57.0, 690.1)
    pointList += Transform(315.5, 56.0, 680.8)
    pointList += Transform(322.7, 54.0, 679.3)
    pointList += Transform(327.0, 54.0, 682.9)
    pointList += Transform(335.2, 53.0, 681.8)
    pointList += Transform(347.2, 50.0, 670.0)
    pointList += Transform(372.1, 49.0, 689.5)
    pointList += Transform(372.2, 49.0, 704.9)
    pointList += Transform(377.9, 49.0, 709.3)
    pointList += Transform(372.2, 49.0, 704.9)
    pointList += Transform(372.1, 49.0, 689.5)
    pointList += Transform(347.2, 50.0, 670.0)
    pointList += Transform(335.2, 53.0, 681.8)
    pointList += Transform(327.0, 54.0, 682.9)
    pointList += Transform(322.7, 54.0, 679.3)
    pointList += Transform(315.5, 56.0, 680.8)
    pointList += Transform(307.7, 57.0, 690.1)
    pointList += Transform(299.9, 59.0, 693.2)
    pointList += Transform(286.5, 61.0, 691.5)
    pointList += Transform(279.8, 61.5, 691.5)
    pointList += Transform(271.3, 66.0, 697.5)

    patrol(pointList)

    type("ambient")
  }
}
