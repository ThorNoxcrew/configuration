import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Central overlooker by belltower.
    playerNPC(
        absoluteVec(324.4, 52.0, 523.0),
        "Olivia Stolas",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk1OTU5NTE1OCwKICAicHJvZmlsZUlkIiA6ICIyMDA2NTVkMjMyYTE0MTc2OGIwNjQ0NWNkNTliNDg3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaWVzdHlCbHVlXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NGZlOGVjNmRjMjlkMjExNjU2MWJjODk0OWYxZmZkZDE2MDU5OTAwMWQyNTliZGMyYzY4N2I2N2M0NjNkYTNjIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "YNSN4mn82kR9rUNdAGUvTgtLCT9t+ZZUm9iIir7BNcCDkyYhTU7iyjy7rfaDgZ2aa0VK3u4nriWiRy7J4i7pKcDbk8NRfyyHGiU6zNRrKmnbXQvVuGcYQHcpP8k95AjLztvWb8sWWgp8HE7zCVFsb3Tm8st1Osh6ko3jwx3fJ0ab5mnrsLHd9m9zK7cXBW8502hqOQSznp1El4TYdvfHBS4sWgk5s8QQW+I/3k+R8Zowl7JvXX7vqq46QNRz5LYzjFzCvTwk18e7gadA7aYg+A5EOLXJb6ykUQKpD9TgOpctmHNqAUHVv5M5PP5j6W0brmjQjk86owHk2lDDJhOqiBu99DAUA71uKnc+ppLgx6t90eKsdtSnAPrpjUQAXUJ/Y67QdClAqoznzxDOOiErQEICQClGRvIj9zhL3FqJZWF+zjFh0DuC++NyBM3111FswpAFlT1EmPcMdQ9jEPjF3G8rE3xAY08sK1PWLjv7qfqDJ6NMdq4WYyhQvFhm1RDCd8yZDz9FVll2oN76DDmekGNyGkuHOZs7AhnzWl2h/2MHN8D1TU3K9sybS2i+QFS0E1qbFuiEQvieugAFY2kHrfDyyLA4bUY1Jfi9Y7BbRwdSiRVTTTHQfbfQuP9NyH3l8Jzv4DuYxhoKTyujUBU/8084V1zrg7NeMK/DSqffsY8="
    ) {
        rotation(0.0, 18.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
