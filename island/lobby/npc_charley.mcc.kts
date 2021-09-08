import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Runs between Yellow Yak house and lighthouse.
  playerNPC(
      absoluteVec(257.0, 72.0, 703.0),
      "Charley",
      "ewogICJ0aW1lc3RhbXAiIDogMTU4Nzc4MDcyODM5OSwKICAicHJvZmlsZUlkIiA6ICI0ZDcwNDg2ZjUwOTI0ZDMzODZiYmZjOWMxMmJhYjRhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaXJGYWJpb3pzY2hlIiwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ5ODVlMTE5ZDJjZGFjYWIxYzI2YmY3MWEwNjVkOTdiOTk1YTMzYjg2Mzg4OWE0NzJkZDI2ZDdjOWEyZjI1OSIKICAgIH0KICB9Cn0=",
      "uCPY708HKVTRklPd0jhWJWlCX8caCQLqvMTXZeQ1Cw81M/Se5NT6/3O+qMG8B51ukB9il2lRcaQDmX0QeWbH86RZ0/JANXlZjqX6MzQ/clgVT55H15G7h0cUMRbHdgu1qvLbGIpZecHCfw4PR0kODFdv2Ldieak2RZtQElkehUL8sZsnwFiGwoyJ83sDMlgckegOPiDcf/Jh9VZPgXkbsV94b3ubN+NuJBBbRcXd7Uf7Cdz+PmK9dlXQm/Ut1ZHJa9eV/oCfkt42yUwcfcWCSuDxn05+Cvc/Ih1WC++gKMSMp0oQ6jh5byAioRoRNUXJVGbUIONN9w0VJQJJzlBY/Hc+Kj4CRHTyVbAWdN5hBJY3BBebZUtYriJPtVNyhH940H2VwQ7MvYqNn8OxbjnC+guFaXhi/q8s1nfoL4w33zUUEwjtGE00ZsjhxSZy9ey+zwwSfamzqRAcErA0l1TpBfsSnVp82bP1n8QyIFl9O28OxG+Zh7qPy6kwExjFKDnIYdDd1xRWtWUdokHgnOpZJ95lZW83Ar0xjBazwGV+KEj9T7lzcWrDm7TgFAsdtxKxiVkdzaHb5thcPXHcUjZbMhIH9NNI2Fna3/VJVIs9upW/MVQ1NahNU930R1csW0ZRfegOaNqmDN7Te0nD+qPTBphb6cvyS8n77TysKlTTBpc=") {
      
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
    pointList += Transform(372.2, 49.0, 704.9)
    pointList += Transform(377.9, 49.0, 709.3)
    pointList += Transform(372.2, 49.0, 704.9)
    pointList += Transform(372.1, 49.0, 689.5)
    pointList += Transform(347.2, 50.0, 670.0)
    pointList += Transform(343.2, 51.0, 677.0)
    pointList += Transform(335.2, 53.0, 681.8)
    pointList += Transform(327.0, 54.0, 682.9)
    pointList += Transform(322.7, 54.0, 679.3)
    pointList += Transform(315.5, 56.0, 680.8)
    pointList += Transform(307.7, 57.0, 690.1)
    pointList += Transform(299.9, 59.0, 693.2)
    pointList += Transform(286.5, 61.0, 691.5)
    pointList += Transform(279.8, 61.5, 691.5)
    pointList += Transform(271.3, 66.0, 697.5)
    pointList += Transform(257.0, 72.0, 703.0)

    patrol(pointList)

    type("ambient")
  }
}
