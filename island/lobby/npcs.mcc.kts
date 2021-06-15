import com.noxcrew.mcc.commons.server.util.sendToAny

mccScript {
  // Player NPC using a username for a skin, first string is the display name, the second name is
  // the skin to use
  playerNPC(
      absoluteVec(369.5, 35.0, 554.5),
      "Join HITW",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzM2MjA5NjgyNSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1NGRiNzY0NjYzOTI3YTFmMDE1MzIzNDMyZmFjMzQ0NWE4OTBlYzVjNTU2Yjk0YWRlZjUyZjZlMTllZGRkMDEiCiAgICB9CiAgfQp9",
      "CRWRcMbC5u0E/5M+9Yjv2766/Jz9RFHzQqAETfeAxGwV0J++KeaAWUugtdC2LfgzgYHaZ+rbT5ZzaL6MBwzhcilqptEwjS/SrX49mE3iKx+Mrvm6e96yHI0qy7qs998sD429R8nFtmEZ6JDfxao1eDwS2tMAqmuI4HTHY5jF7iHPtEUIwHwxO7XHIsUAmNxJ4K4izm8qb4r511zAm7cwFI4YbP0EyTIPwqCfkCU480lDCweemb1yPKTnwl/gz85kULga7/nFRk8Vsir3fDphOJ22dDSRYVPfjlbqUz/wQo2mMkKfMG6BOXilo3657DGxshzP4nGqbxbwHTnM4vDpNNeC40qHdwbmb1pJz+4c/vKMzSfcqynQ0EIMn/BcmJW5hjIj4AeRGR8M1Cc5wwr+uVvkIxW1kAXQoPjADNp3DBh20XDSFzx3zQkZaEW9lJSjArhA1RZMvhGa5nN9WiMTDS4DQNSTSwnnhRauN4mS+PFMVq8hRFO9kvucc+tk2TL5nTiSzhVPoHdzem/OUUY4ayuLx2TvHgFB0EjOrHaDG5F6Zz9rCfbx8qTNAcJxQ6OShDp45p8ot+Cb992VUN/YKXTAVOAOATPkCQX8Z7AxQMRGKr+T86GuNiGUESJXlZLiwtVbjcIRIbRtmnW0HNu5qqkILlKN340bl8etrcfi9VQ=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(10)
    interactBehavior { npc, player -> player.sendToAny("hole-in-the-wall", "island") }
    // roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
    proximityBubbleChat(text("It's super fun!"), 8.seconds)
  }
  playerNPC(
      absoluteVec(392.5, 34.0, 549.5),
      "Join a faction!",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI3NDczMjAwOSwKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZlMTZjYjQzOTE5MmNjYzNhMDExZGJhYzFlNTgyY2Y4YThhNmY2MDZjZGQzMTBkOTI4ZDIxNjI0NGJkOGVmNTIiCiAgICB9CiAgfQp9",
      "ZQ5nAwWIapz31/Z2IcCQPPLUQtck4EuQBovOHo8RHsR2QVC+mHFyS+XDwL8KIaJ6D/9Og8CWRp0xzPphlWMI507ycz42PbySzN5A448/4VhVyTHJmtvFPluRK4b+51r/UjKFIzOtwCFYLh4+C00yw7FWZJzW1IxPD1GcD2w7JpwILJUdlDZS5uHe415hJTFgT+pRQhuKzPaI/+a3vI78WGbC3SlhOHuTVnZ4N8Ndar6oLY26BH6Jpm6yFgIyMES2goBdi84pxxAqmifj9Wzth83EnFKrJvY+bYOY+E/arEaxcMaVKcMa3glTJFEZFPqZ8xVHv3OKVPvm+OlcEQ+jntw2gwQ5nnSQHzMn2BboiJxy7rPIJ5iWIdeoiTDac8xgEPCKoYeqP5ogFGQfypRcIVzDaxP80Pi0hNXoOXNs/P0PX40bsi5Hu5zcW9VG6EKfDaVN71U1G8l1AaVxKXcf3egzIF03FoHBOZrYMlfWhSl+X2Wg52ES0JBgSupzkusl/3kqBwlHMcXvdT0dErJOUqroqepJ/jXpw18c0OlxWWtXKAQtHtypzB3tH5qqsQYLy++1cWn6hh8dGkZg0D0cFjuHyIhS7AqePG7kj6TR1xs/wnz+gms9SzTZLR43dby4/sVPJurnjc74m49Wq7sE37p1YqNh+S9/cIZWUMy4ek0=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(50)
    // roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
    // proximityBubbleChat(text("It's super fun!"), 8.seconds)
  }
  playerNPC(
      absoluteVec(393.5, 34.0, 554.5),
      "Epic_Landlord",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzc3NTYyNDU5OCwKICAicHJvZmlsZUlkIiA6ICJjOTk2NWFhMWM5Y2U0MmUzYmFlYWZmYWMyMDMyMDY4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJFcGljX0xhbmRsb3JkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUzNDU5OWMzYzBiODAxY2ZlOWU3ZDIwZWJmMTRmODYwOGM1YmM3YjZkNjQ3MGUxNDhmYWQ5ODQ4NmRmYThkNTQiCiAgICB9CiAgfQp9",
      "vF33cJFBoHokvuXBeKsmn4k9ydk4tprlzzAN+rN0+zMUMDOLEuyLON2SXO4+loChK0n/hg7lo9+r4PgAZwP3KPyetsWbUoyynBJSCHvgfEet9pqRpeaWN0XoZZ0S0oB8+KD8n2woSIkd0+CnxfsRaw+wn42bTxHdHnXSOgxlRm5Lr/4RGYQHNeT9PAO7tTXv4t8+gBmCTrYwyKj8qEgp8VWF9vt6Urh/Tb3hObKj9ym6l5xdJ3I98g3VItzcOBMBm/pXYxB5ebLaktI5Ndw4Tv/88Qzt5ukUke0t7ifsuj5o8Drjy/kHqvI3+9wxnOV4xvnxPtqBjEg1CLAGonhbop71nKm0CBYnEgF4gxR3HbJIOp9EneSSxa5uoVENdBWzCebbHcltl+qeOCvC9JfTwNqEsAM85KrinZ57j/HZ2dMFPWHVfHJwv3osKsyEr9EzUo//Tp3jj+8sxFm+yoiTMZ3KTyXwP8pql2RLt/mqakhjMM54I130qbu8IiEX1MLRVJjMlZ8YWnxK4bv7Q/91On+npR1ZiaUp93NIQ1mFgUD0VZHVozyb2Thg8+22C9oEmBMmA6wVwZEdGNIunih9A1Fgh07jxRuhFE94aQcjll5K70btFGCEsvzrDlPTVZXGsrRwha2nfof7Tih9yvHbFCIr2npMN8SrOddJNSnNJMk=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(50)
    // roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
    proximityBubbleChat(text("Hello"), 4.seconds)
  }
  playerNPC(
      absoluteVec(389.5, 34.0, 570.5),
      "Joey Fresh",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI4NDAwMzUwNCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZjA3ZjI5YjU0MGE0YWNiNDI5Y2JjMzU0YWZjMDg0ZTJkYjQ5MzhjNTAxMTU5MjhmNjlkNjI0NzNlMmJmZGQ5IgogICAgfQogIH0KfQ==",
      "TTp9HzBr7FZx20T5kB2melQ14vRB98yuY9d4/hfQecfDvBipqnc+UOoZ2Y6LNodVTVxlpTpyG3DPUNf6YKIQtgoZl5tGEVQTXPaWQiHdvWoWu0fbYL6sjESflpfg43N2tpoKWv5nmIsAO/VVMpTPIw1s8X67HNxEE6H/RyxOsDzwfXJKXnCSTv+Z9/jP5lDpalUwkJL170nWyVC8/92RnGQZSIgOV+motAY6+21H855esp3vvU/XE8ZgT8mQyvzhDOtrnoeRiW+aOmwUqsz5BkbMJrzJ4AG7TCoaHSboSav7HoS42CmsDSruw6zxFHHrsHx7/2GTu/fvepS6g/BzCbDji8p9dyiLzYoeAm+Vp3/qogoxjrYJPcjEWCRG4f0ZDI8wq1GbOGEb2oQ+KTnOVfPQaDbHb4IB3UgBaoTEGCFlzBwr51JHDG0WOhC0EGV0hva/Pdvp3ECZkD0Znl8juvYi5KTzRouJTbMtMcfIDSdltbVBtmZ7WmvAW0tUypfeA6V85jeCK16zN9MKSDJ27XUo8IxbGgDH0NN5Xj09f44Dz7yZVOgQ0PsKGMnHp7JoSLN2KbGcJ5cd54ivva+PNibLYg0NBUx4UMLtFQknS4NPZRCb24VBkzonc6v04SedrE8O1D5X4KgHNE8ypcXTv/Cy++x9x/OIuR+PjOSqA/Y=") {
    // roaming(absoluteVec(393.5, 34.0, 567.5), absoluteVec(386.5, 34.0, 573.5))
    proximityBubbleChat(text("Hmm... Where did I lose my keys?"), 15.seconds)
  }
  playerNPC(
      absoluteVec(381.5, 36.0, 554.5),
      "Test NPC",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzc2OTc5NjI0MCwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc0MWUzYzJhYWY4ZTBiYzE3YmNjYTg0YzgyM2QwOWZmMTFmYjQxYzU1MGJlZmJjOGJiMmZlMGQ1OTU1NDc3ZjUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
      "jaf45mvWUl9H3onEqSOfwWz6a9VjH5lC8Y85wsTP2+fIZpaoeNOkpdeVaVeZLkKA3aVT4B2SBsNqG7QTpIgDhYx0p1+tJtOYFf2BJzuNTZV8jPlTOSTSXgV+YTFFKvXtAK4TVRC/hkZucXAbKHBjieXcDYZmT2dWQynx32L2tpj5L3YcD6J6X0EIJ6rmVQ7Ft3tOh2+xWTR0efAgAYVen2MzRaQFEVswZCsXvhMnncq2E2zJlu5p1jSsR5UR30ws7S366EHuFNQnB6jdddhVqTNtVBPMX7JYMKSLhPE/vKpZSqzz7nBBvVWZ4L7t5urLneMffiRyqrzyW8XZNaOsKTRywrSAF2Lt+I9SSRqqoWmVOeBo5RB5D2plrzH2teRgHccrZzrViBe4kz7TJwEvRXa4E3i/5ia/4+0OJfVGiPp25oiMc9uc/TKOxYgSnh0vWXi9Ej3Q+v/JKESRKWKbqLAcL/yiXZSRD9B7gqHW8Z49137UMenxZ0guNegnK7YytbIq9janlG/wYU5+zi9Hy/wytX24nw0jmj1U5F5XQOUASt+d9HJzNJdKm4YjXS8IZ8YXO85rlPO8TvkKisgIrirYyIWpEsCqJHUk2Lq//kqdcomBZ+0qYQewWVaooz9REYKx3TcxCEkY/N3LzEIdROkCnSTJxeP1SS16IGLjsU8=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(5)
    // roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
    proximityBubbleChat(text("Test yoself!"), 10.seconds)
  }

  // The below NPC does the same thing as above, but has a skin that doesn't need "fetched"

  // Player NPC with the texture and signature provided, you can get the values by uploading a skin
  // to https://mineskin.org/ doing it this way ensures we don't reach mojang's API limit
  // playerNPC(absoluteVec(352.5, 35.0, 554.5), "Noxite",
  // "ewogICJ0aW1lc3RhbXAiIDogMTYyMTYyMjEyMTAzMiwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5YTQzYTk2ODRiMmYyMWE3OGRkOWY5YWMyMDNlMWQ1M2Q5M2QzODBkMDQ2YzU2Y2VhZTc0Zjg2YWY3OTVkZWUiCiAgICB9CiAgfQp9", "H6queDbH0bzixnju4BObPx5QQGl4XDs6EkCWr2ludz+dsfcwg8nb6UKIhVYDmY0QFsieHGTfo4doYJwVjG4GpH0xIsWRJfHFQuHR7L5h5Sc/dRppDUbrbxf/oiebchvAoOu/I+D9yDtb2YaUkHsa3s1KAkDza0lLR/FOlUBlp/Ww6YGGvqbbYfDkVfN1HA4/TYZzxjEks+/+VOJsqA11Ls7oiMDbAnCr2qBR9J1qcodheXdQbN/tPzeVXsHP94P07td1sMggipn9QU8FvEyA2QLY7aj3TQMF2VN6+qznjQZKBEREW3eTqqziTPbi7km9PsX2sxQXxvQb1hRaXUTF4ukm8U96CBX0OZQhu+XprvmTshIUPmhh2WGyzoNP/Tw+IAVFh13pBSp6tvcJc6IDT7pPxBTUCXQBcjdKOezeCnw/ajv6q29hsc/SE6U8eqg4hVZ6iVyUxr3B6VS0gQWWLka/Nt3egy2OmCU5VEXpdTgGCIYQI2/awQxRYBleS4AaXd7ydoqzJI431qJ8uYpY57zwjiigaV5XfoI642AeARlYfCkunCeJrStbTXbEvzX30dv+/CQfsNPpSSj64busyRH9akUnuhdBhbIzvJbvvL79NSpYg/4F1XXa/nMAek+Q7f5i5qRtVWUMjgvAXbMi/Q5NfCjqueRYiH+gRGpTjww=") {
  //  rotation(-90.0, 0.0)
  //	interactBehavior { npc, player ->
  //            player.sendToAny("hole-in-the-wall", "island")
  //        }
  //
  //	proximityBubbleChat("translation.key.here", ticks(15))
  // }
}
