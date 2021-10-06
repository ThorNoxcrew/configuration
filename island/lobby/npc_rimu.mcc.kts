import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man on couch in library with girlfriend.
    playerNPC(
        absoluteVec(273.5, 41.0, 611.5),
        "Rimu Rou",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzODE5NDYwNCwKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzZkYjUzYWFiNzZmYmQ0ZDU5NjJhMWZlYjViNjI1MzA1OWUxODU1MWNlYmM3NjA1ZWNmMjc4MmE3YTg3M2JiMyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "hhIOjrhOv/ThZSGAigryX4SHOhd27Oz/Kojeolg8j9GlloJyyXH/JMFR/CcGD4e5oJ8Z5L574GW2wH8slcaIHcasGzLm1uL+d3/zZm1QdKupjtGAEV6NeuHXB8F05BBldH9HBO7V6x+08cafBGmc1TnPyEDJ0m0YmRccWiNTfzWDwaa6NACyLdPIoVcoRG4bFfgKL0iWzMbL1oZNMsd6pms2O4VW/nk+POWG7wOa+KDQjbi1rFHhRCcd7MwNsOW0TrbsZVtnyag6RlQEwk6gUqvQqICoLMMKnSOJ7YCuprhqYjSGrLmlMaTQb9rxcu+KdodcTePCaN2Q9GdkLPFQOx55TpJi/GS32225uwxkcz4E/Q/23nJMnYojqY/+tVNqsnNPZy2cJJi1of2xKBCfL52WqR+ZaLtlp+G/44c5Ak6MgLVawEO7hYYdlS3FzxVj/XTy9iIcU5jwibVTloh704QIVIWyDvigLYjn7TWMA/lOuh8N8ZwYQPnY7ejvl8uxhmsQhxdt8Z2Nm+932R+Z4mo/8BdddE+I6P/80/C/TahPLDieOX7KDZ53DImGIS2aGqkZyIxj82EaGK1CEeHniwSd7jYj+x0lpwedPQAjwoIQq5M/puUFCZ/VbqTo2YOUK1hQ7TSTCE6KiWpWulUqNXAsB5iqyrxmOrBITUpunJI="
    ) {
        rotation(-45.0, 0.0)

        type("ambient")
    }
}
