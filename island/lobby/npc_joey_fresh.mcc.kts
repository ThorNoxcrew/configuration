import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(389.5, 34.0, 570.5),
      "<glyph=mcc:icon.emojis.sweat_smile> Joey Fresh",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI4NDAwMzUwNCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZjA3ZjI5YjU0MGE0YWNiNDI5Y2JjMzU0YWZjMDg0ZTJkYjQ5MzhjNTAxMTU5MjhmNjlkNjI0NzNlMmJmZGQ5IgogICAgfQogIH0KfQ==",
      "TTp9HzBr7FZx20T5kB2melQ14vRB98yuY9d4/hfQecfDvBipqnc+UOoZ2Y6LNodVTVxlpTpyG3DPUNf6YKIQtgoZl5tGEVQTXPaWQiHdvWoWu0fbYL6sjESflpfg43N2tpoKWv5nmIsAO/VVMpTPIw1s8X67HNxEE6H/RyxOsDzwfXJKXnCSTv+Z9/jP5lDpalUwkJL170nWyVC8/92RnGQZSIgOV+motAY6+21H855esp3vvU/XE8ZgT8mQyvzhDOtrnoeRiW+aOmwUqsz5BkbMJrzJ4AG7TCoaHSboSav7HoS42CmsDSruw6zxFHHrsHx7/2GTu/fvepS6g/BzCbDji8p9dyiLzYoeAm+Vp3/qogoxjrYJPcjEWCRG4f0ZDI8wq1GbOGEb2oQ+KTnOVfPQaDbHb4IB3UgBaoTEGCFlzBwr51JHDG0WOhC0EGV0hva/Pdvp3ECZkD0Znl8juvYi5KTzRouJTbMtMcfIDSdltbVBtmZ7WmvAW0tUypfeA6V85jeCK16zN9MKSDJ27XUo8IxbGgDH0NN5Xj09f44Dz7yZVOgQ0PsKGMnHp7JoSLN2KbGcJ5cd54ivva+PNibLYg0NBUx4UMLtFQknS4NPZRCb24VBkzonc6v04SedrE8O1D5X4KgHNE8ypcXTv/Cy++x9x/OIuR+PjOSqA/Y=") {
    roaming(absoluteVec(393.5, 34.0, 567.5), absoluteVec(386.5, 34.0, 573.5))
    
    proximityChat(
        listOf(
            i18n.translatable("island.npc.joeyfresh.dialogue1")),
        30.seconds)

    type("ambient")
  }
}
