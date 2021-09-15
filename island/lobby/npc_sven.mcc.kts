import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//NPC using one of Thor's skins sitting on a bench outside the outdoor concert.
  playerNPC(
      absoluteVec(345.3, 32.0, 430.4),
      "Sven",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMTcxNTc4NjMwMSwKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjQxMmZmNGUwNjM4M2UzOWFmMGZhMjFjZjNmYjc1MDY3NjMwNmM4N2RkY2Y3MjZlMjQ3Nzk2NjM1MGMyZTUwNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
      "BXsHQ15P29DIf8+27Q+vjB4i+bPA5piDdCnKZN8ZUq94BF1GaXKfLj4AD/j1FYQohfvI/sLCBxZvIFFKBh9gQ8Q1x4cjkjhRxqrGm4LVAX9a4fV2HKimvTpPdGwUhA/sgLqAR5qosfy04wqbjQo+bjq7XdoT5v1MB47TbKWwIk2F4H43PWGPbXQlBEupR7zW4OlnT3vIT50b96aoYiUpOyGVC5EvTMZEWRRdTCqqFw9w73GUqc9qcVCg+neFECwaY2+l+NNvuJ/4Z4LQqqFv9g4gtg7A5t+aSTLAl/ujl0jO8CE/7iCXOvshPWcUC7J6jatG4J+KVBlkUdi3f0KhxqZ+A59u6r3BNJEVB0s+C+30mX6XWqGIlCBzHRqn9yyvu8GWNP2Ef4HLsxTNXYrki7/uETlmH/RIvTX0SlznuhSyNd6XV68LC8X59mBuAK7TGErMr4t5te3Rq126R85g/rPb3Ryz8iFZcQpScfgN3spp7MBkZRZr10ByLrWE9yZsRv+9KSY8/MPDCmnzusQEIoJzB1fLqJGPIhhyj89+DcB48yyYisGJUh3ONHJAQ9RSy4ABeSMU3NB7l6gPQzOT5qxPtLs9dzUdBSGcMdr5ndbWAa5EW14bzBRdqubmWxbhPkvBMB7NCExv3IjLDCvjN+taV77f1G3R5xK5qlDZzjU=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    type("ambient")
  }
}
