import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Woman roaming around cafe in back of main HUB. 
    playerNPC(
        absoluteVec(378.0, 40.5, 657.0),
        "Poppy",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxODIyMTI2NTQ3MCwKICAicHJvZmlsZUlkIiA6ICJjMGYzYjI3YTUwMDE0YzVhYjIxZDc5ZGRlMTAxZGZlMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RhNzU3NjZlZTE5MWE0YmM5OTE0MDQ1NTVhMDlkZTVkOGE1NjM0MmRhMmIzMmNjMWM0OTA3NGYzZTRiOWU5ZDAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "KQ6bJViJmaeKpe2OLoA4TDFcM+LKjqNyiAxY19gQxPV9p63mXAX4YUVzcxZmfid1XRHbzh8eV1+85G1zIF0HAKKP1WynTH7/YcYe0nYRSOHAs2KTduqrbaxCX/KtBDQpRu48LUN5cEby9m+aARuYMqc/J+d2JY7nciBLdhuQFfZ2DD3cLOSfS44CZcWeDr8F+dT43Tf6Bi2Kf09G3FxGRG04gphAi88FxeSb4Q/sGq6dPdfkSZzMl0jLHmtmllcE9hMc9M/HfcIEOAKTrJflSCgxcS5r4cd6MccOWZ0I9FcxVcj49m0nC9HpVBVO6ebZvoAkc3uI4SVJiIEgMI0O3yPFtHYpgEURAtauVqSLucBZBwUUI53UQvBcK9bT23JpBhnmvdaB3bExQOK0WukLUl2ZHy/fQhDlvJV3gaoz2czgYxtUvmDqKwUtI8wG1/kcSAqTOjMytC+m4LQrE60XUS+uo/BeZ8wIfrMdldZdsOsM7wmLT0cJN7irgfqIc+IlAm1rFrZoXJj9enAQgRjkSiFH6yymEf74H6xs2swBl6H9A+ai8DZluvmSmpzpQUXQmPXcOmMxAvTWH6tHuamFuY4cg3AeWQnSA1IvjtUgqvvT2AA6AWSDIgf3uknYdd/Q3jK5mDkgk+aUR7/Y4SM6c34YbYRRcGpgErQB8HXEhzs="
    ) {
        roaming(absoluteVec(258.5, 38.0, 571.5), absoluteVec(254.5, 38.0, 569.5))

        type("ambient")
    }
}
