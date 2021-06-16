import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(390.5, 37.0, 554.5),
      "J.P.",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzg3MjIxMDU0OCwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNTI5ZjA3OWRjYTVmMGE0NDU4MzFhMjBhNjg4OTMzMDEyMzkzMjdkMzU3OTY1MTViMjYxNjM2YTZhODYxMWQ3IgogICAgfQogIH0KfQ==",
      "DGnx2+KiKtyiveQHhixg38hFtTbe5VOxA/1hcDnUKJxPnpkXXXx91W/NaF8owi8v/3srXNFnN2TNV2pwbEoA4kMFy7MZY2TP2Ah3MFieahjX8dHe0D/8rQjFLoYYAQTe9VNSDuoPrwOuPZ7IEwmYyITzxihWvvj5uA4zR4FR11Yw7XD0ZEAyk9Yi+TBE2EfbTuS6Dvru95I4Z8LdUhSzueH41X+6+Tdvs3bPcc3MarztuLHEVQpLewGG58YsY4rA4MEcChKdhLIlF5Wd7JDQKsMYRC1PGQDyFPJjAu78h3/nQ6tvgD6CXkG56Aaui0wmpUJFllrGeKaxYuRgi5V9MbC6cCQBASTgB3MMfCVTz/Z5SpPNa0Km4kMkPnHvnTIyqX2dxONPbphM1dg5BGTgr9sq40dIC9OyIA8I6danFuoIQhhRHf+o/icpwSr4M3EfBeUJoy4nTqqnHKWUipcyw9Ary0rL53vqdbEoNaKmC1/O36QmQ6VcaLcU7KOI0kHUYF6+BigK3cJnRKtOjJoLL/B/pao1sQDo0gmFo7l6Kt3ltmzWWrPDkGQI4fu8NW4sRYGPB7DlTnfSsNGh6QK5dck2hUDc8/+pzIr8y28VGOec7gJROtWoh1idci6B4N7/195uXl6tM8+RHntJ6hBdkQV1Ztq/SwHdfx8V0tz8Fao=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(10)

    /*    proximityBubbleChat(
    listOf(
        i18n.translatable("first.translation.here"),
        i18n.translatable("second.translation.here"),
        i18n.translatable("third.translation.here")),
    4.seconds)*/
  }
}
