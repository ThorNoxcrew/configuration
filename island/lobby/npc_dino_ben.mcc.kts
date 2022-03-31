import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Kid playing dinosaurs (yellow) with friends by fossil area.
    playerNPC(
        absoluteVec(173.0, 39.5, 428.0),
        "Ben Saurus",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjA2MjY0NDQwMywKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaWVydGVsdG9hc3RpaWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2EyZTJmMjM5YzRhOGEzNzQ3NTE4MDYzNGZkYWZmZTM0YTk0ZTIwM2RhMWMwN2FkNmIzNDNkNzg2OTRiN2IwMyIKICAgIH0KICB9Cn0=",
        "pLtcP7xcu9qs2C7mn8PhRsi2kvQi0moX/9IYnJ7uQDdNV88R6v6doH2vJnnM/NE7o7Wga1FB8EaORd784q2a73qkWRwKEiW/AbZyDOk8WpP6TVgRn/cpeAmmTEJ3oCdITh/7ivA41Vkn4i1+F+mVyCnjvV+ON/V/k4oscA4/UU7Jza0mvEvg6GJBPfpgjfsUX2rHl9eQXeWvlB0u4YgAQmQMIMApY+GxYFPVqD3zb/bpzbAtXgtcxLYMAUGUClZbl+mIdD0HPcV/FjEH38zoqnq1jqvYo6xczrqEEonRWKPUndmaMox6Xbsq7fsZxHLCDnpkfQEEzqTKF7CXH8EtMs6Qa7RrJdN68ezOiQzcIcLCm+q45odz4C3S6EpWZpEYcJeOg7WcgIsIsNjYgcUojpn6BKTipVBxCqamgHLO7sIAhMPuiB3b2uoeyPP8EqiP7A5WPzWNc2N1JKIHIg3+odMov0/JOYz4iMnPCLEi0WChBwi11tQeas8OwE2sVXPsL6fH/9Ol8muhi+Wi/HnFPe/0Df86kreu+vk2EFl9t9CSnzJhyxEArVM3jfVqcegXqlCDaxuGAoB96S/TYhjZoQ9hiY2+wZ3NZPVTv/Z+HnU49Hl1FdtLCY5E+7pxorsFyjseXZJsTbRlIBbgz4y7HKF6Fc+vX7bOHQix2NDJ+3A="
    ) {
        roaming(absoluteVec(172.5, 39.5, 425.5), absoluteVec(173.5, 39.5, 430.5))

        type("ambient")
    }
}
