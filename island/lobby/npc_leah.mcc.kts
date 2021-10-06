import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Grid runner on beach runs laps.
    playerNPC(
        absoluteVec(428.9, 27.0, 666.5),
        "Leah Xize",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk1NzM2MTIxNCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q2NjZkNGQxMjgzZTA1NTUzZjg1ZDBmODlhNjYxOWM1NDAyYjIyZjhjNDBlOWQ3ZThjZjI4NmQ4MGI3MTY2NDYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "KONP2nCkOeDhIEuNQLQHfv6u22m6Z1p6AG5HU3/ObefCWtpyrka9FANaxqh8IYYBYJinsd3LgU/3sMeZ3xEYVc/UBeFEJW93JS3NWATGvPFBC+ycOq5VfiMtdeaSd1ig5OD/8wqnQJcVlUJKykBS+uKzWzSJ8tJi/Pl/W7NH47PmG/EZefZPVq+Z33sMkwRLr9AU1fCQtFB6pXPFkIC9CtZ7P5C7kTlnj9cxMu2O3xeRqHOUvwrUq1ZgHFAOrBB/DC7KoSXEaliJ/Bh/fHSX4yGt+qXNeippfxqs4oleWZKjpLfym68WxXm2l30LypT6Snb9O5GlG1hoJo02F2b8V90LknY+kFAgC0R0knr37hg2D8SnlVAAucrmj3bLckWC5FwnnTRtpptbWSBaWXwJnbxBSyB5FrzNfH+TnGzzFtwTaYD1ONQVKi0FCtttVENWQsDDg+6ungp6io45aZV9hCJhTQLqch4Rywv4Lcist5DPi1G3q7zGpcqFRwzC9wsMHiKZfJxzkYSiG26btSDTenPVTdIMArA6XaZHWuvoMRG54Rbr1EwrYTGFlpUX39HNRroF8HAUqKCm+BeDYs12mpIljwjrW7S94BKk+NA5CNaaQlQ/A8HE+xxIjPpqDD6dJpF41Pj2S8LklcYj8GsoIfyGmWng6Ca9gZpOrCnwVWI="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(428.9, 27.0, 666.5)
        pointList += Transform(425.0, 27.0, 663.2)
        pointList += Transform(428.0, 26.0, 662.1)
        pointList += Transform(434.0, 26.0, 667.2)
        pointList += Transform(428.9, 27.0, 666.5)

        patrol(pointList)

        type("ambient")
    }
}
