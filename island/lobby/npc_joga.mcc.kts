import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// NPC living in house immediately to right of main hub entrance
    playerNPC(
        absoluteVec(378.5, 36.0, 530.0),
        "Joga",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxOTYyNDg4ODQ1NywKICAicHJvZmlsZUlkIiA6ICJiMWMyNWQ0YjMwZDU0N2Y4YTk3NmZlYTllOGU1YzBjMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJvd29FbmRlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZjY5MzA1MmFkY2NkYjYyZGRjNGU2ZjA1YjlkNzI0Y2EyMjc5NDJkOGI1MTAzNDJiMWE1YmU0NTNjYTUyNSIKICAgIH0KICB9Cn0=",
        "S8wx77c4n2YzLJFanBKZT+sIdoW8z2MGvr/jp7Ik3JUeHKjokJ5jIGhlJMfet1ArRNDh+6q0Lc/r0T0p8hgY8MXun3iRZKfnJ34ZQpVWLNX5EqfeCBjigUJK6XP9zE261EP1WzaX1ErYAmrjJhd+BxLIeqBBDQ8L9leES0UnI7ZyjZd5/e8zpCU2sShUm96A9zaF0+3B7FI/aWWFKZC+2XAueZPVR4L9/+G8a1oh2+6UjOeUbQqXBazaJKV0UEu36i4u10VpX6GdebFRe0UGC/FZycpaCMsAzKI1TgqYKsu+fJj2/4jwk//vnlJoYJz3zGTiAbSQ9xIfQZqAkz1Nge+bJYziwKPRQeK6Z5P9LMQBZFNPvIC3PWur3Wx5t4XyZzLMUk2P/d5x3YQx605MQxIYETLGGK9Mc8vdVARQP6shxz3MrGOQuqu1ao2muJrCP1IyEF8yjU4Cv6gn4sz+PJBO0Nsob/Ikpk+YIbT3XxH6DokRLPTFZvPeAj9MaTHsWlmHJ93eFAEIjjNDwkdtjFonj4uuGzRtFb2H/RHb9+9D7PPuOClZIpIby0JGBnr4l6oJ23L7YPpWW2O+w/Pd9hnQGWPyjVVDAL6wlzqgN0fSj64oRU2DWFNTYPTAwOGPSIAbwfooxyxqQYNdgkZrAYayr26CqgSbaq5HJIFTn9Y="
    ) {
        roaming(absoluteVec(380.5, 36.0, 532.5), absoluteVec(377.5, 36.0, 528.0))

        type("ambient")
    }
}
