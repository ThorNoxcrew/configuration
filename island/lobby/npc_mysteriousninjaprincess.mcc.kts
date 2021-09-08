import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Stands atop construction building on right of hub overlooking garden.
  playerNPC(
      absoluteVec(345.8, 46.5, 492.2),
      "Mysterious Ninja",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExOTg0OTE5NywKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGE1NjQ5M2UzZjI5MmI4Y2M3ODUwM2U5NjQ3NGNiYzM1MzU5ODBjOGVkZmZlNjcwZTIyN2I5YzM3ODVmZDc0ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "vIxMrrfwxelzmfVS23v4lSrwo+hYYwPFD5IpSjo1H2RM/eJkTULfZhxvpxvk15L9oNGgyI9aGzGMMteQDI+8ab0dz8LDyBHmdSPPtH+4n0k2Ukle3TD5GAysR1iwB13ct7kBlq7LnGbHtpoi2dE4D6az47pmgBSMM63ufFZWr2ikzPTpLqMJUhCB4FriH5UOjpAW2UY6Z5y1pYBZAyJYSTa1upyvefkRqdrnQHZuRUiai3NpRYQGAx0dOwGbKkDwbrrNcD4QAbrM4ALX/SReOQO+A+9uGeyAMiyRS3yexZ45XbllO0P9KYChTsuX/nh0gNjM2X5FKYb8/qB0pzqH3DeXlkfcm38t9ZZ/WlMaPHUHErvUCH78lPGfEDuhj3lauL3uE3VVY20fKezvs+ahcNrX360QUZ3t+LkZqQZchUCPgpFYCXyQyP+kasVq5z9TzVy6L2DNN0iWaMAzJqcjVUySW8uA2iNUgcjOmsKeJIhj+uYh90UfXInFQP3d7zTJQG+tDFcHTCmZovEPPm7wFE38p8+mm8oIgQ3eY6t3H3AcWR2nxO/zjB3MIl1T1lK77NbsSGDO5B3K6ApjX4vSfsGAHyFuoEbQA7rjhPUh86/2moc7utY27a6mmwJpQvwG7ym+3f7WSfU8yXIIvRnfnv3GSlQjR/s4Jq64YAQgV/A=") {
    rotation(160.0, 25.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    type("ambient")
  }
}
