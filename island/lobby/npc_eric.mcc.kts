import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man at tables outside of diner (table of 4).
    playerNPC(
        absoluteVec(331.5, 33.0, 415.5),
        "Eric Omnom",
        "ewogICJ0aW1lc3RhbXAiIDogMTU5MzgxNDQyMTY2NSwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MTAyMTFhOWJmNzMyYjg1OTE1NWFmYzhjNDg3NjJlYWE2ZDA2MjkyMDViZDE3ZDBlMDI5ZDUyMDY1ZWE1NTQ2IgogICAgfQogIH0KfQ==",
        "AZO9xHCwyHnEenevNBUAEBe8r/RqxJQEMdvopIfY/uHKQoBeuuQS2F+gpNb1NyX8vXG3VxOxubHBOOCdI51pAkomBrFI+p7y5/MD5ywnMELYONw1giWsiUnuvW1vb/7s3l54DasqmRak/RfpH1fQEScMhHeHfZYMz33sc0QfDemPzvp6y0xdyqsGOcVnmhNjub3l8mZOc22ZU5Bqynonbdyo7wqJTlndwkaHT7323Petd5VguhTzXNosw8KkTR538CavkYr5kUxOuKASUIQ2NqXzgUK5x88cYIrKXMpW0tDoIUDiJ4lPYKDZCUUxEsZdg+7Sdx2r0ID+YB8w2gP0GryCRgN0Yg5lFQeTdi2FjKqv9TqGd1d2BRluo6wyd09zmBb7ccuKJB2gROvKbmr4Wy4nHcOpiwBx5Gpnj4za9pmah3nuncl7G7dQv2nqnyFPFpMlwSLoXNegDDCA7YZd2ibq03bXXmqWYuTHmNZk+mwvP1doH+z+HAlXsG4AvjcolwjVYmz1wI6e/NlDoi+V4S5ekoryMH4/6L1a6LRTZpWyJmzKUK4uKgdAxCpczpGaRuSPW47dPSimzXgLtZHQsNUbj+VULp/eObnNJZlLqi1ItiXD+z1qvRRAy9UeczR1JXfuWz0FkibBLRKmtbZ1V2aYUn3ABhxZ2yegGo5iDc0="
    ) {
        rotation(20.0, 0.0)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.blockle_tea{display:{color:5900925}}")
    }
}
