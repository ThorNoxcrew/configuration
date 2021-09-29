import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Space cadet (looks like wearing swimwear) roaming around the beach right of HUB.
    playerNPC(
        absoluteVec(410.0, 33.0, 430.0),
        "Tun Tun",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjkzNzk5NDMxMiwKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmI2YmZlOWEwZmI5M2RjNDA0YjkxNzFiMzc3YzgzZmUzOWViNjhmNWYxZDY3MGEwYmVjZDgzYjI2YjRiN2E4MiIKICAgIH0KICB9Cn0=",
        "jyeY7A7Xh4YqvhbugpoLY+m1hY0wI7SezIt8EDWfb/jqGGZp27TY42haqQOsZnHVAYtXWMnA9DKOgUVJHB3GCm4pnIt6qqyY6KvMrcxmPndBCYt1hBeg/p7bsE5miiiqJvTxkdlt5wErSndN6fMEWsQqgz5L81njvfAwHX60F3rBWlwurb2MYqq/EdG2gjd9hLLS/pNGCdz6L46wIs1sMyoe8MbueBtCaQDYE2CdhWRQvOnWchOBQ48st7iGoD/NG2zDZZ3z9fy+OtKR66P2bM5JNVpKd90syxXEQ8fQOQIpDzsZFSuD0d4V1RpsuL3sY8M4Tuni45Gz8QklplM0rD+fmHVm4Vf2uQwcY2Pg2aBFok87o/6JT4/sB8T3WHCobxUs4+rTDcnqd2zMsXZOKxI4AypRhmZZlty1femNuAHyqV6jXSA1vW1KdUYwxW/yQuyTiE4uvy73NyJZcFFLGkjggxlAZbhUJyW6lv4l/nsIO/aqD3ZPAjM9hzhJrYBs4Ghmq2eKGHAi3QCGOhoN12MMPZl7yZoXX0bBRNwHyrS8AShP5/NOKUdS6Dkm2WX53a+9UXlf0c0/mB1yeTt7RFFcWuarhKiYkrUvS3QEGl3El8Ob6a91avCvOaTrKl1DzRKFKqVvQh5Jpp2RHG1tCnomJCko+BE7VdBPl95aEHE="
    ) {
        roaming(absoluteVec(416.5, 30.0, 438.5), absoluteVec(409.5, 33.0, 426.5))

        type("ambient")
    }
}
