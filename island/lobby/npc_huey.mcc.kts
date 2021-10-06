import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Inside Auctionhouse 1st bottom floor near back.
    playerNPC(
        absoluteVec(308.0, 30.0, 461.6),
        "Huey Ambler",
        "ewogICJ0aW1lc3RhbXAiIDogMTU4ODQ2NzA2Mjc4MiwKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zM2MyNjNiODc4ZmRkMzJhYjIwZWM2ZTRlYjUzMzY0MGE3ZTY5NjkyNTI3YWRmZDRkMmNjOWMyZDI1YWU5YmU4IgogICAgfQogIH0KfQ==",
        "PGmgO4PJBqOuyF7Z08mNx/5qINXJ5Ro2scRgtp00Zw7I6yQy46FeoEDMpNJa4udJDZlF63u849eZ3UewHxm1fIxpSHQr5b/p69V3BRn+SWm55nKi3K7bGG2OgrXQRUu3CV11uDviBdZYWkQO0u7UYFmyO9gLQJVbNhrsPQIHnIx/mAJM6tT/0I0gTlDAnYmRX/JE++syAVU+g04PQnDV9qst4lL7S1GzpNYUi3nk0IeHjEx7MbV5WgC+Kb8aEURxKJhF9os3U04fW5v/jczr9kMFC+pMCaaeT2vWniJGHLaXlQep1ft+Fnk+mAH0qtrR7nZrNgTbRbJZmnkCjpfLOhfC2KWkpI+Uw2rQFlZeDroSjqrBzaMUsebT1w5KV7yxhM041n1WOY9e8RxbYRyPAJT11IybSSOu3Qgi6qp5zZ18mY6Ms/+HlzkKlyPaygBwj09kNJ128x8a7w3BZziPxpEdhUqTKDIF1dHDRV4nJc/+ri1qfEGLrHO02rQNP+ZnIacCDavb/uX+tqy4Q8gT7hR4cexHc9hPaK99Wey7cStImX056hbtUaJuHr/BnPxOYnNZuV9zFN+w47yYHsAiouWZsCJixNJHjXeGJoyCvDGIc2pTLgMBM2VRpAGW1sJL4HPuzW4k5l8mTzR5o+Sz/m3SuBZSSjtw0vAAm7LFfSQ="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
