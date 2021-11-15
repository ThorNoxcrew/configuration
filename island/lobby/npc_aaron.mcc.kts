import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Outside Red Rabbits hut.
    playerNPC(
        absoluteVec(247.5, 43.0, 472.5),
        "Aaron Abbit",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxOTA2MjEzNzc4MCwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZTY2OWYxMTlhNmEyZmJkZjk3YmZkYjFhN2ZlYmNjYzc0OGUzMGRjZWExYjcxNTM3MjM2NmFkZmE3NWNhMzJjIgogICAgfQogIH0KfQ==",
        "GqQjsF2f3EfWUdo+NU/KLKkuWb5PY9zz+a/Y03G0AFTQPWuVxdHAucfldgfxPcWQXvaKo45iOJ+VnWN0PFsu4o5ncVYmACmZXJlQWVI8aVhMLfu42uj6FPo4v/LSo+W/8D912fI7DUe6RzyWlYi4qVD2XxStCNSUQwqSg2+O6yAK38vfdaZjqKguMV0EUkQkgCrZPNpNyLULzDV6e5Ll1xo1LyEQzLawHs3HH3gP2y2iQCINhhJiYZhfLcqJKe6VuEiIgTo8FFX0u829xJ3OlEvQ5pemjNqo0Mf8XcvpykJV9re1E5kjEaqQxHvJCucUyxX9oB4kq0pSICq3oybkjqwt9YoZjJnAlekyoajeL/aj2+30hxLT19J5bYQ2UXTLlqsIvwINna7vGaKkVOii68V4dmNTzZoH5A6WxG/LUqxG9kflhICabRrLru9ZedlxlfS5LUL1yiXarNz2DRvAQ3WTMeh12OLE1ZcRpTlr5F4mSMoEkJjYbq66wS5qvEYzPGDYOqsnuZT95sys83aAlX/Tii8VWXIs1INeAJQT+GWsjxFssv9Uuiq+4rVZADerowdAmefyuEx8FrGX/oAv9o2ROcwzLAUmpWMKLrLzHcKJlSEFk6u+TkeCX+2x9jKu9Uc+ouPag7gc+Wbh5SF979E4FYiukSbkNUbhA4eK7uM="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.bandana")
    }
}
