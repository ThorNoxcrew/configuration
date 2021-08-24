import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(350.5, 35.5, 518.5),
      "<glyph=mcc:icon.emojis.sweat_smile> Cory Walker",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI4NDAwMzUwNCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZjA3ZjI5YjU0MGE0YWNiNDI5Y2JjMzU0YWZjMDg0ZTJkYjQ5MzhjNTAxMTU5MjhmNjlkNjI0NzNlMmJmZGQ5IgogICAgfQogIH0KfQ==",
      "TTp9HzBr7FZx20T5kB2melQ14vRB98yuY9d4/hfQecfDvBipqnc+UOoZ2Y6LNodVTVxlpTpyG3DPUNf6YKIQtgoZl5tGEVQTXPaWQiHdvWoWu0fbYL6sjESflpfg43N2tpoKWv5nmIsAO/VVMpTPIw1s8X67HNxEE6H/RyxOsDzwfXJKXnCSTv+Z9/jP5lDpalUwkJL170nWyVC8/92RnGQZSIgOV+motAY6+21H855esp3vvU/XE8ZgT8mQyvzhDOtrnoeRiW+aOmwUqsz5BkbMJrzJ4AG7TCoaHSboSav7HoS42CmsDSruw6zxFHHrsHx7/2GTu/fvepS6g/BzCbDji8p9dyiLzYoeAm+Vp3/qogoxjrYJPcjEWCRG4f0ZDI8wq1GbOGEb2oQ+KTnOVfPQaDbHb4IB3UgBaoTEGCFlzBwr51JHDG0WOhC0EGV0hva/Pdvp3ECZkD0Znl8juvYi5KTzRouJTbMtMcfIDSdltbVBtmZ7WmvAW0tUypfeA6V85jeCK16zN9MKSDJ27XUo8IxbGgDH0NN5Xj09f44Dz7yZVOgQ0PsKGMnHp7JoSLN2KbGcJ5cd54ivva+PNibLYg0NBUx4UMLtFQknS4NPZRCb24VBkzonc6v04SedrE8O1D5X4KgHNE8ypcXTv/Cy++x9x/OIuR+PjOSqA/Y=") {
    rotation(75.0, 0.0)

    val pointList = LinkedList<Transform>()
    pointList += Transform(349.5, 33.5, 485.5)
    pointList += Transform(288.5, 36.0, 483.5)
    pointList += Transform(282.5, 36.0, 474.5)
    pointList += Transform(283.5, 34.5, 450.5)
    pointList += Transform(292.5, 34.5, 441.5)
    pointList += Transform(351.5, 31.4, 444.5)

    patrol(pointList)

    type("ambient")
  }
}
