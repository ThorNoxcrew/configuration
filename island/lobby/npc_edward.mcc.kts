import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Football guy outside diner. Talks to other footballer.
  playerNPC(
      absoluteVec(340.9, 32.0, 402.5),
      "Edward",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk0NzE3ODM4OSwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M4ZDAxODJlNGMzNmJiYTI5YmZlMjFkNDE5M2U4ZDY0MWQ2MzcwMjE1ZWMyMDkyMzMyY2EzYjZiYzllMThjMjYiCiAgICB9CiAgfQp9",
      "DcHDht61baQR/rDxwYPaLzExdnGGM2z+D39tViS1P+vKlqetYIEw0HVUeFArwuVudKlzVmD5JEosJSGDRhZl6w8tlbYn16XQTW8mBnf1dNMWObM3GhoZBLChfIkAOhHAuLP6rqjJM93sC4kP+o9OEszRfmBDoOfVAS48u9PN7lc819P8HdaeO3QnONXqj1N/6PDIJbTPZ+gfAXGTzVF1ZacQcNf99zGwIArAOKgkpBoEctBrxe97X3HfGQHpAe10EjyG5dKtj0Y+tJp+akAc0rrZHgpM2tO/lmriiwvANCvlLJEuWQ3jsmZFy6m+fuiF1uxasW3fo2lLkPrAgW1j0qiHPW7olPyuNcihSBqXiW5y0rE0LG2MbPodNoBvmYSLE3Jc5cstkkfZ3ykZrdLgVGqBC/J6iT1fDRWC0iCZhh2POcMIL5PSw+V2U/X0UKaYrDJYN3sXi0cy/hzS5UC0ZEslTQzNv67qRXDFno3FhLfUoVEG6fZoy+Z/6/CPVRuaqgFSLOHfDNAKsU4VOy+en08qoA+G9sKnGVVUkB7ENire/KNVVIbHwzjHaoXp2CKXYgqeEl1mRuBD7dyDs4Zh4BFDzXk/6BWgXzT5Rff1O2+uZuAvDnVcqFCtECq2T/p8jx5XwANr2wmyh7fXfgLZMsON69nAKh2M7du629kT1BA=") {
    rotation(90.0, 0.0)

    type("ambient")
  }
}
