import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  // Below is a Player NPC with the texture and texture signature provided, you can get the values
  // by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's
  // API limit :)
  playerNPC(
      // The spawn position of the NPC, must use decimals
      absoluteVec(395.5, 34.0, 587.5),
      // Translation key for name or untranslatable text
      "<glyph=mcc:icon.emojis.scream> Vin Petrol",
      // The texture provided from https://mineskin.org/
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5Njg0MzY4MywKICAicHJvZmlsZUlkIiA6ICJhYjlkYmMzZjk4NGE0ZWI4YTVmY2RlYWMzNzEzZWFkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDeWJvcm51dDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIxNzFhOGI3OTZlOWUzMWY1NDJjMmRjMDdkMzk1OTYwOTQ3YWIxMDJhYjBjZGMxMDBhMTRiZjA5NmRjNjUxMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      // The texture signature provided from https://mineskin.org/
      "fXTeAtVRgIA+7L329SZ5tNejS6jj4N05w1+BdBHRk5WcfAstzNB59sZCpUdJfG5FQjowWd5uMpD+GLwG4pskQOHZJvUkDFWxL46ZxQatAqer4MnSgMMkVhW79tKw5WpNad2pC1uiJMxI2QzjntMX2u1fu82JR84pNefT74UWUOsr4ZvIrN+aXZ4UMNZRj9zUsemu+ssWxm0APT3V3xm0ed3Cw/iv3l/qBmWfsbXZ80hU4PAl1SWUSwKIvI/8b2QKMTO6HNv/Wycr8xo1syzTknXtYvaAgO1HDiTBxUQuLhB9mlXxAVp+qCCB4IqdxybHekHAFgPbAmBMay4WjLkc8eDY4WexUirBmbC7gCN9Kq70XkEtbyy83xZ41vKjlCaeP2uPQLj4/7FCShzEILXklqOoxQCuKkJye1ziLd+v8KRIdXa8kozaA/HyuSiXTTtlCjbdVOLoW0DZbk/61blDI1wD+B/rN4TY29OMqi92cpJplvQMkbILuv+DQquIsO9+swCjEKht3Y6+HfHx9wC6rffmQEhw7l60DjX8+rdQNT6KIJQz4XguKCcYj+mcRJDGh18j49wgGEsm0RdArmMjG9yI4C7CYwnQy0YMAS2PY4e+8eTtdn5UioeCuHioOKXNCjI+kEPkxEW4aZ09SJThZvlPcDhQbl7//W9fnPmdj2Q=") {
    // Set the direction the NPC is facing when spawned, use decimals for this
    rotation(-180.0, -4.0)

    type("ambient")
  }
}
