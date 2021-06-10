import com.noxcrew.mcc.commons.server.util.sendToAny

mccScript {
    // Player NPC using a username for a skin, first string is the display name, the second name is the skin to use
    playerNPC(absoluteVec(369.5, 35.0, 554.5), "Join HITW", "ewogICJ0aW1lc3RhbXAiIDogMTYyMzM2MjA5NjgyNSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1NGRiNzY0NjYzOTI3YTFmMDE1MzIzNDMyZmFjMzQ0NWE4OTBlYzVjNTU2Yjk0YWRlZjUyZjZlMTllZGRkMDEiCiAgICB9CiAgfQp9", "CRWRcMbC5u0E/5M+9Yjv2766/Jz9RFHzQqAETfeAxGwV0J++KeaAWUugtdC2LfgzgYHaZ+rbT5ZzaL6MBwzhcilqptEwjS/SrX49mE3iKx+Mrvm6e96yHI0qy7qs998sD429R8nFtmEZ6JDfxao1eDwS2tMAqmuI4HTHY5jF7iHPtEUIwHwxO7XHIsUAmNxJ4K4izm8qb4r511zAm7cwFI4YbP0EyTIPwqCfkCU480lDCweemb1yPKTnwl/gz85kULga7/nFRk8Vsir3fDphOJ22dDSRYVPfjlbqUz/wQo2mMkKfMG6BOXilo3657DGxshzP4nGqbxbwHTnM4vDpNNeC40qHdwbmb1pJz+4c/vKMzSfcqynQ0EIMn/BcmJW5hjIj4AeRGR8M1Cc5wwr+uVvkIxW1kAXQoPjADNp3DBh20XDSFzx3zQkZaEW9lJSjArhA1RZMvhGa5nN9WiMTDS4DQNSTSwnnhRauN4mS+PFMVq8hRFO9kvucc+tk2TL5nTiSzhVPoHdzem/OUUY4ayuLx2TvHgFB0EjOrHaDG5F6Zz9rCfbx8qTNAcJxQ6OShDp45p8ot+Cb992VUN/YKXTAVOAOATPkCQX8Z7AxQMRGKr+T86GuNiGUESJXlZLiwtVbjcIRIbRtmnW0HNu5qqkILlKN340bl8etrcfi9VQ=") {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(10)
        interactBehavior { npc, player ->
            player.sendToAny("hole-in-the-wall", "island")
        }
        //roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
        proximityBubbleChat(text("It's super fun!"), 8.seconds)
    }
	playerNPC(absoluteVec(392.5, 34.0, 549.5), "Join a faction!", "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI3NDczMjAwOSwKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZlMTZjYjQzOTE5MmNjYzNhMDExZGJhYzFlNTgyY2Y4YThhNmY2MDZjZGQzMTBkOTI4ZDIxNjI0NGJkOGVmNTIiCiAgICB9CiAgfQp9", "ZQ5nAwWIapz31/Z2IcCQPPLUQtck4EuQBovOHo8RHsR2QVC+mHFyS+XDwL8KIaJ6D/9Og8CWRp0xzPphlWMI507ycz42PbySzN5A448/4VhVyTHJmtvFPluRK4b+51r/UjKFIzOtwCFYLh4+C00yw7FWZJzW1IxPD1GcD2w7JpwILJUdlDZS5uHe415hJTFgT+pRQhuKzPaI/+a3vI78WGbC3SlhOHuTVnZ4N8Ndar6oLY26BH6Jpm6yFgIyMES2goBdi84pxxAqmifj9Wzth83EnFKrJvY+bYOY+E/arEaxcMaVKcMa3glTJFEZFPqZ8xVHv3OKVPvm+OlcEQ+jntw2gwQ5nnSQHzMn2BboiJxy7rPIJ5iWIdeoiTDac8xgEPCKoYeqP5ogFGQfypRcIVzDaxP80Pi0hNXoOXNs/P0PX40bsi5Hu5zcW9VG6EKfDaVN71U1G8l1AaVxKXcf3egzIF03FoHBOZrYMlfWhSl+X2Wg52ES0JBgSupzkusl/3kqBwlHMcXvdT0dErJOUqroqepJ/jXpw18c0OlxWWtXKAQtHtypzB3tH5qqsQYLy++1cWn6hh8dGkZg0D0cFjuHyIhS7AqePG7kj6TR1xs/wnz+gms9SzTZLR43dby4/sVPJurnjc74m49Wq7sE37p1YqNh+S9/cIZWUMy4ek0=") {
        rotation(0.0, 0.0)
        lookClosePerPlayer(10)
        //roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
        //proximityBubbleChat(text("It's super fun!"), 8.seconds)
    }

    // The below NPC does the same thing as above, but has a skin that doesn't need "fetched"

    // Player NPC with the texture and signature provided, you can get the values by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's API limit
    //playerNPC(absoluteVec(352.5, 35.0, 554.5), "Noxite", "ewogICJ0aW1lc3RhbXAiIDogMTYyMTYyMjEyMTAzMiwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5YTQzYTk2ODRiMmYyMWE3OGRkOWY5YWMyMDNlMWQ1M2Q5M2QzODBkMDQ2YzU2Y2VhZTc0Zjg2YWY3OTVkZWUiCiAgICB9CiAgfQp9", "H6queDbH0bzixnju4BObPx5QQGl4XDs6EkCWr2ludz+dsfcwg8nb6UKIhVYDmY0QFsieHGTfo4doYJwVjG4GpH0xIsWRJfHFQuHR7L5h5Sc/dRppDUbrbxf/oiebchvAoOu/I+D9yDtb2YaUkHsa3s1KAkDza0lLR/FOlUBlp/Ww6YGGvqbbYfDkVfN1HA4/TYZzxjEks+/+VOJsqA11Ls7oiMDbAnCr2qBR9J1qcodheXdQbN/tPzeVXsHP94P07td1sMggipn9QU8FvEyA2QLY7aj3TQMF2VN6+qznjQZKBEREW3eTqqziTPbi7km9PsX2sxQXxvQb1hRaXUTF4ukm8U96CBX0OZQhu+XprvmTshIUPmhh2WGyzoNP/Tw+IAVFh13pBSp6tvcJc6IDT7pPxBTUCXQBcjdKOezeCnw/ajv6q29hsc/SE6U8eqg4hVZ6iVyUxr3B6VS0gQWWLka/Nt3egy2OmCU5VEXpdTgGCIYQI2/awQxRYBleS4AaXd7ydoqzJI431qJ8uYpY57zwjiigaV5XfoI642AeARlYfCkunCeJrStbTXbEvzX30dv+/CQfsNPpSSj64busyRH9akUnuhdBhbIzvJbvvL79NSpYg/4F1XXa/nMAek+Q7f5i5qRtVWUMjgvAXbMi/Q5NfCjqueRYiH+gRGpTjww=") {
    //  rotation(-90.0, 0.0)
    //	interactBehavior { npc, player ->
    //            player.sendToAny("hole-in-the-wall", "island")
    //        }
    //
    //	proximityBubbleChat("translation.key.here", ticks(15))
    //}
}
