import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// head of the chicken npc
    playerNPC(
        absoluteVec(348.5, 44.5, 578.0),
        "",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0NjgwMjc4MzE0NSwKICAicHJvZmlsZUlkIiA6ICI1MjhlYzVmMmEzZmM0MDA0YjYwY2IwOTA5Y2JiMjdjYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdWxpenppIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y0OGVkMzUxMDY4Y2E4MzE2ZWY0ODhmZWI1ZWU3MGRkZjcwZTY3YWJiZWQ0MTczZDk0NjYzYWNlODliZDZmZWEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "xFhC6RdJ1lpK+RnXQMMULlf49U07RmZvu/HRrJ/7B7SmTgmQ99iOy4SHByJy4eCgesV6fc6J3Kq281b4xENCWtgyL/3PWKkHX6WxNFEEUiLS4bKc6MaferfyGoyVUT/ZezL6Oj/g4teFcYzi8ExJ1cC2erDULARynWGXHsBvnD6PkmDRZDuu7rv4K6TT1vAQ2+QwRr5wf+3ZgBXW6kU+pHeJbjW5v9jgNN6e2JGhrMl1jv+IRPG9t0Ips5tbEiALbQxqkbGIcT0klJ0l5pKk7LawWSmgtuzeYeRNRXz1SsvoVUaSPUei/K2B7XjqXMjBfnQ4fyU7FYkYVxDIq4rSsAndYE5m0+z0JbBVlie58xy/CvDv5EfdJwU246ouks+PiXvRbqQbT7Rndxe0rLIS2HSikMuWaQYx1YpTJ/vuXC0ob1x/fIiJZdBRg4zW2j6Ahv7KfEzUKRv7bQ6XxNtBDKh0+cqearZFHCRQ5J8GqnO4XDhAh3dEkp3A2SWvA4uc/ivi7HMgvDaF43F3v8UAuZKm3/vqnApYhWJZV8dK/aWJRSBLRMDYF23mB0ijF9iCrF4GxmuMGmUPiAbnWX6zAnsxHw13NjArGkweHnK/mZDyqWCW9XQ9VNDjqqB9CjLFIJUbcFaz9wumEUhcgg4RL7FkiaXTnih4w/YhsdQbIAM="
    ) {
        rotation(-110.0, 0.0)

        type("ambient")
        mainHand("minecraft:blue_candle")
        offHand("minecraft:blue_candle")
        invisible()
    }
}
