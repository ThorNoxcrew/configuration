import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//NPC just outside the bank. Uses Adam's skin.
  playerNPC(
      absoluteVec(304.1, 36.0, 431.8),
      "Adam",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk0NDkxNjE0NCwKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMGRhMzRiNTBlNmY4ZDY4MGJhNTQ0YzBmOTg1YmFlZGU0ODg4NjBkNjJjYTA0NzdlNjY3OWIxMTIzZTlkZDg3IgogICAgfQogIH0KfQ==",
      "bntVeDSjN6TBbXF7KkrkhsO0FDDkoF3gzoGWvKr5a+cDS8/lU1wdcl1m1gVv1Z7tsHXNje7P61zbYzwO/c2NoxwjlNITqF1lsjtQwg0DRAiueqAeweaBIDP5+r3Agh5V3t6hylcPtILXHjhGUadHgoKj3p934sRYESdDmoJAlEtTyWklxHDTrGuEq5q8nPYh2RqVVF5Y7nADq3Mog6e08i0xhmDuctcZr4NsJCHb3z436g31O1o1tLVea2PS5ezimvPidjCVmSXj7x4NU1maFrBZBfqmVVY07Uin4OKK4SyBkp060pQG+PDNX3lVAkQvFdMVtcOMsFWH13AAt7pHJFmuWQJX3MfpuJ9e+RNWEhVIPvFu266cBCppswQ9i/Ih3ahe6wvwrH52xIxKMsYm69h7Avsrksycdu9KvE7Fxo4q9PfS5q7y1mQk4d5oWZyjXUWWm2y4+FGdyAo4PlV4zEJiH/8nWOWHXnahFHtvEIlnsdGWC+8ENRUkyBL9C4eT/9PCyM7oSSTWnKb0WvcskJNh4q0SYyt8gIncbBw/9eg/oYmgfXzJQ0wljzu+7td7HwEvsDTeLOTMqWZgVrHT6Sj9BxIi9AwgZuNBokUanGw+9OTYeuq1dOdzzdmHyjIpsi6LlNDGkivYJpO+jMX6jkUteTqLM2P+PsJrhN6ct84=") {
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    type("ambient")
  }
}
