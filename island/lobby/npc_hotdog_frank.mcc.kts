import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Hot Dog vendor outside of Bling King's shop
    playerNPC(
        absoluteVec(325.5, 35.0, 478.0),
        "Frank Würst",
        "eyJ0aW1lc3RhbXAiOjE1ODY4MjM0OTAzMzQsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hOGE0YjNhMmVmOWRhZjhiYzNlODU1NjllY2I0ZGI4OTBhNWVlMTdmM2RlYjIyMmEzYzVkOWZmMmQ5ZjZhYzIwIn19fQ==",
        "kgiLlggdO4Ohoja9zA4ZsdrwM+MxJl3USO6za/zPIvSJma/HSUw4GVsBm2WVQAn3wdDkYI4mMoz9hZJl5na8eY+vpZXHlpUMDlBMYvgXKPhTwWz1/kmlVdysj0D17jyoT0e3zonR7+Y9FPzMdosoMpW4zyB8TbonmXQ/CbXWoIzUA+aBBvdCamtnxqiwPU1UpcoI0hlg5d2V2xG96KNFO9KsZ3YjAHK9Hzb297mmBARF8nttd0ZYVWkMLDVSwMP+c8vvbRIkQUkDDcmHTQ4Odwgwnn7mujpeZwAXoC5Qt8l0s9bfOhHk4fftOFqGz/zX3XtDIfeZ8Y46vp66DqaaRzWqMhkbwK3V34br48oIwn3SZzl5VzjLpUXssxvmRw+DuypJJ/7/3zIeq9TKx+E3wPIEfPLdIUTcLuc4J6qlXQ6ZXSNFOTn3ZqpAjiDASvYjyVnvTZhm/R7t3F+CpO4u9f9ok/55nItfnbakcaq/gdY+EtwjnaZKmS5cXT9ZVaZIQp5kz2RjmqHeNsUYKMXlVznBwkVJCd7zR1yzPD/p8p2hJhxFC6fPKNdLtmokZc+L81kejo5u46BAVdrlwmoqThV7x9O1pGH1cH8IQmtgsgtx8mEZekrHbAtLlaBraY/78prm3vLPTvLvp8dCzL1JtA7ee3dcF2z6m7sYkd7awAY="
    ) {
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        offHand("mcc:island_cosmetics.accessory.burger")
        mainHand("mcc:island_cosmetics.accessory.hot_dog")
    }
}
