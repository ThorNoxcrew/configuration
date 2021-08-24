import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import java.util.LinkedList

mccScript {
  val i18n: I18n by inject()

  // Below is a Player NPC with the texture and texture signature provided, you can get the values
  // by uploading a skin to https://mineskin.org/ doing it this way ensures we don't reach mojang's
  // API limit :)
  playerNPC(
      // The spawn position of the NPC, must use decimals
      absoluteVec(390.5, 37.0, 554.5),
      // Translation key for name or untranslatable text
      "<glyph=mcc:icon.emojis.sunglasses> Jack Lumberdo",
      // The texture provided from https://mineskin.org/
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzg3MjIxMDU0OCwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNTI5ZjA3OWRjYTVmMGE0NDU4MzFhMjBhNjg4OTMzMDEyMzkzMjdkMzU3OTY1MTViMjYxNjM2YTZhODYxMWQ3IgogICAgfQogIH0KfQ==",
      // The testure signature provided from https://mineskin.org/
      "DGnx2+KiKtyiveQHhixg38hFtTbe5VOxA/1hcDnUKJxPnpkXXXx91W/NaF8owi8v/3srXNFnN2TNV2pwbEoA4kMFy7MZY2TP2Ah3MFieahjX8dHe0D/8rQjFLoYYAQTe9VNSDuoPrwOuPZ7IEwmYyITzxihWvvj5uA4zR4FR11Yw7XD0ZEAyk9Yi+TBE2EfbTuS6Dvru95I4Z8LdUhSzueH41X+6+Tdvs3bPcc3MarztuLHEVQpLewGG58YsY4rA4MEcChKdhLIlF5Wd7JDQKsMYRC1PGQDyFPJjAu78h3/nQ6tvgD6CXkG56Aaui0wmpUJFllrGeKaxYuRgi5V9MbC6cCQBASTgB3MMfCVTz/Z5SpPNa0Km4kMkPnHvnTIyqX2dxONPbphM1dg5BGTgr9sq40dIC9OyIA8I6danFuoIQhhRHf+o/icpwSr4M3EfBeUJoy4nTqqnHKWUipcyw9Ary0rL53vqdbEoNaKmC1/O36QmQ6VcaLcU7KOI0kHUYF6+BigK3cJnRKtOjJoLL/B/pao1sQDo0gmFo7l6Kt3ltmzWWrPDkGQI4fu8NW4sRYGPB7DlTnfSsNGh6QK5dck2hUDc8/+pzIr8y28VGOec7gJROtWoh1idci6B4N7/195uXl6tM8+RHntJ6hBdkQV1Ztq/SwHdfx8V0tz8Fao=") {
    type("example")
    // Set the direction the NPC is facing when spawned, use decimals for this
    rotation(-90.0, 0.0)

    // Create an ordered list of points
    val pointList = LinkedList<Transform>()
    // Add points to the list, ALL values for this must be decimals
    // In this case we are adding three points
    pointList += Transform(389.5, 34.0, 561.5)
    pointList += Transform(393.5, 34.0, 554.5)
    pointList += Transform(389.5, 34.0, 549.5)

    // Set the NPC to patrol the points, with Catmull Interpolation
    patrol(pointList)

    helmet("mcc:island_cosmetics.hair.viking_beard")
    //chestplate("diamond_chestplate")
    //leggings("minecraft:diamont_leggings")
    //boots("item here")
    mainHand("minecraft:potato{Enchantments:[{id:binding_curse,lvl:1}]}")
    offHand("diamond_axe{Enchantments:[{id:knockback,lvl:2}]}")

    // Bubble chat, randomly selecting one from the list every 4 seconds
    proximityBubbleChat(
        listOf(
            i18n.translatable("island.npc.jacklumberdo.dialogue1"),
            i18n.translatable("island.npc.jacklumberdo.dialogue2"),
            i18n.translatable("island.npc.jacklumberdo.dialogue3")),
        45.seconds)
  }
}
