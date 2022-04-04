import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Overlooker of central hub area on right.
    playerNPC(
        absoluteVec(381.5, 43.5, 533.5),
        "Mysterious Ninja",
        "ewogICJ0aW1lc3RhbXAiIDogMTYwNzgwNjQyMTk4OSwKICAicHJvZmlsZUlkIiA6ICJhNzFjNTQ5MmQwNTE0ZDg3OGFiOTEwZmRmZmRmYzgyZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcHBsZTU0NDciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTk2NWY1YTVlYmZmZTZhZGJlODg0ZDNlMjkxMzE0NDQzMDI5NWQyODE2ZmE2Y2U0ODczMjZkNTFmMjk2OWMwZiIKICAgIH0KICB9Cn0=",
        "hf/vdto4a+vzMJWo87wgd2tUhTxQTfRUV5szn7CG5rchpql/iMj0wn/T6+dfcqU9Co/8+dsaDpZDOhTn0UKwHTTj0jmqWmkdLdnZ/z4zowKkBZVOM9bMc8qW64DfqJgE0yVyCvNLpOAlwyqWzP/eaekbmDl/6yYiu7VKPpc4TviDnzVkSKb/YXUSbOVDsbzsjDa5ihC7btM3+klvxrdGWhHGN97yZrHfy7iHLpPR2JDYxbjdYIdY/o/McplUfa/kjbnSMoBeXkd4qx8cCxhWuuRLoQTGEuBtNm6VhrM+3cTyArCq3t9tbh6IRQ/aZdEkbEYoiTSPlxEye4cI4ZwkE/ztgvAHYjXJLKJBZYQ079QewwUhu2FKRTYExvNBzfOZnpV50Czcs6lXBsqGkLw+5oeum75wvI/D6vYyx6WZGpkizopk2YpYHLI2JsOjcioGpjXcdrf+66jg7KZBu6WCn2/AIL+375LunUIQ0D+t8LBLHbJNjuYSt5xIUGAQaE4ppyMjl8GH6QBfKYAganDyp4eO+wd6kvlD8F6+hK7bUXDm+MQJ8QzGm1KndtVQvhRFey10EdVOFHP6Lnb8tApX3yg3SfNTc2aNXFCTCLlkvjGb+0z2RMrKwkEfNtH+yiwO2NX39zpnUyA7N0Ot0i6lzI9uxxzv9JL3vZznifZfpYk="
    ) {
        rotation(55.0, 15.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
