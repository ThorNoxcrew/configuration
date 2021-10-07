import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Security guard patrolling on top floor of bank
    playerNPC(
        absoluteVec(313.0, 43.0, 424.5),
        "Griff the Guard",
        "eyJ0aW1lc3RhbXAiOjE1NjEwMTYzNzY5MTMsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ2ODQ5YjY5MjM5ZWM5ZTJmNzg4NmQ0ZDA1Y2M4MTFkYzJjNzZiMWIyNGJjMTlhZDdhNGYzOWZiMmFkZmY1OCJ9fX0=",
        "AA7eTEY5mngKmk1kLK9rA4tAOHpNZMA+d+5GUNCImui+7ZC8CQAHqzHjvO+q7kuzfEo1jdFww9SnsHVTiFsA99qCBinoarejczQZqYWCMgRbk42Ye5RzuHjl8OZ4nKBEkrfawjmn1RTPxtY5X4hIc2eY+/wVgE9l29BVKuFeQITccSjUFiXzrJTg8NrqGdtIhND81/nbJhjFxyUe1v6vLRdKCw3oJCTrX6oS8WabXakaoobJzy9qHWWkqfzWIytqGto8gBTulMICuQz8VK9pEgRLIAyj1l+ktbJTH+amQwLXDeOo11MMl+aIFQRH0BvBwk0orQ/WgkwZwFSUcPmK9gxJdWN2EmUJ8onIQx9QfiHFIR3TMGKIQB8P9Fzr0Ib2eVKt8EfvDsTrApm+1wbzkSrtKNC+GO8zo5YgvYU76TGS57rR971z5vLVHuqfHmmnQ5M2DmW+1F6J/BRN/QYektPBgNdIh/9/zF/8GbpnxJ3Z/FYL0eRR8R0Kzka9uYfMRofTlJ0D+3IrsbDxgdDwB/lYvVNDQsfQE9c3nZNFz0r/kj1VFGgpHNL8IRE0GUG7l/LorwPaiAjPj5eEuNMEUJRoMyMjz1WBX0TjLoudrIN5vP8VXyj3WmJDv4gAtomeusp4m0q2C7K5r1tgx20MWD90JYbSZpb7YCFaS1p9nyc="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(313.0, 43.0, 424.5)
        pointList += Transform(312.5, 43.0, 415.0)
        pointList += Transform(304.0, 43.0, 414.5)

        patrol(pointList)

        type("ambient")
    }
}
