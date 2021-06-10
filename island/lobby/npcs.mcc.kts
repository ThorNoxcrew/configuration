import com.noxcrew.mcc.commons.server.util.sendToAny

mccScript {
    // Player NPC using a username for a skin, first string is the display name, the second name is the skin to use
    // You can also provide the enc
    playerNPC(absoluteVec(352.5, 35.0, 554.5), "Noxite", "Noxite") {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(10)
        interactBehavior { npc, player ->
            player.sendToAny("hole-in-the-wall", "island")
        }
        //roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
        proximityBubbleChat(text("When can I add NPCs?!!?"), 5.seconds)
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
