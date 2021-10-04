import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Prince outside his castle walking around his yard.
    playerNPC(
        absoluteVec(171.0, 45.0, 546.0),
        "Charming Prince",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNzA1MDgzOTI4MiwKICAicHJvZmlsZUlkIiA6ICIwNWQ0NTNiZWE0N2Y0MThiOWI2ZDUzODg0MWQxMDY2MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJFY2hvcnJhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQwYzcyMDcwY2Y5MzBhN2VkMDAyMWQ5ZGNiMjNjZjA0OThlZTE5YjNhNzAwNmI2MjlkOTdiMTczMGE1NmZkODIiCiAgICB9CiAgfQp9",
        "dDlvhENS348EqlNC6EvnETVPhXikCBKXIfq0Sdv9rWgOr9Gjw3qsV79UdxPLwDvyts7af2mqAJX8ZZIUva7oYY6lPYF0n2/9TkaQ2JoEobyOwuB5Ueztljz7a4zykZSaii3MXtLWOl89Rj56TwPrGJAVzUUatPOwU1bhZzUTNT1mNUG/XzgGgUE68im1nfRde0v8XWz2mEoRAJvvjN1rgWxPtHlZsqhiwlhZxwIdDNDA4pSV+JZxS3o0uPoz/VzrUsJzKYd633r5XWqe6xqyS9BNEtwz8pCX40d5OIl7H170tzs0hTpTHHxiPYQ1CxCtDXwxXkUcS6hJ5bG3bGufXXAzeGK55XPN4kIp8fkl0TseLM1tpzl4ZZrZScN176XZ6qg1kwIb0g7VZb+4vxCUMj1UYO1JIzwESTni1JMM2ruFj/6pdXoIniRqlH8BP1YE89yWeqguTt/KoKxyCnM9lVTCag2328Saifi2JpNAjsKbuNAtphhd4Ldgijz0LtqqroRDYKr9ZleX2UdKjdvfxvO4qfdbftetV1fXZ8ZSxFBjHUNY0fbqZI6Q9OaZ2m9FYYcpTN4QjNHO1yYJbh6HM8yeRnSa9bt8qDzSCizJoYLwbT7VYpSlYdMHl8rocou9fYJUeizT4bd5AGVxqkbEEqVe04Wg6FC/mcppfyAzLok="
    ) {
        roaming(absoluteVec(176.0, 45.0, 550.5), absoluteVec(168.5, 45.0, 544.5))

        type("ambient")
    }
}
