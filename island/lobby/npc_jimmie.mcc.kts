import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man on toliet on beach by Elle Wee.
    playerNPC(
        absoluteVec(416.5, 31.0, 402.5),
        "Jimmie Sitter",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzNjEyMzk3Njc2OSwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83ZTRhYjY0M2UxMTFjZDQzODAzOTdmNzk0OTFmYTM0OTliZmRkOGZmYTYyYjE4MTFlYjEzMzIxMDQ5YWUyOTk3IgogICAgfQogIH0KfQ==",
        "DY5DUEG4uFE1hQFs627FSNYktn9BrprWeRw9xaTkCqlIdAIJFgqkoWUeAoDiuxql+KsFvlQtc2LTBsGxG1Og+mrp84xwq9wFR+hr2jQu5/XMXBvY117oXrx5Ac7DNbVO1nkMnOAPMywislvIiflDnA9memRHwu8SWYvVmxElPZ8Iy28R1UxK36VNnAEgOqhFu84gYPd7moKypfVcIIa70ttXZGYQY72bRq1pzP9QnIhmfG8P7RvN7XA71sZImrL/TmtsbbupqypgINhanlkvepRvulx042JoPxH/H8lTln0nwjcMcGXu9CNA2v8k6eyvWeTv60+0QtrjEM0Na/yYtyCtf199nwWHZZIZY3+5RaFnB6RbxZgBm5iruglq/JxlmdRAIydgT88w1lbWXQ5dlN5JMNpJLdJhcAw2mEhue4/KS0oXYNScZulHUeGus7vpDweTGVUwMxJFpoudmgdoq9N5uosdTxiLGFrvTs9lYKKfOLszTPgRmtNGAFaeZIchLxkYY5kANtkpuk/49+yqlY6oN08oo+zjxPQxwc0D5PP1a0paRec318adGjfW63CsoXhNsA+4UVZ6uBifCMSufSqv6ao2rXEZj3PiTFvtIagNebs7WiPfwj7m8J05RZ1zLK7fdvqkGe02AXsK1jMN4i67b9qqzIISAhQfYmgpxLQ="
    ) {
        rotation(0.0, 0.0)

        type("ambient")
    }
}
