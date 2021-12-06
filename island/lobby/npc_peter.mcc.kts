import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Post Officer second in line for hot dogs at the vendor
    playerNPC(
        absoluteVec(329.5, 34.5, 479.5),
        "Peter Post",
        "eyJ0aW1lc3RhbXAiOjE1NjAxNDg1MzE5MTcsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ViY2IyODUxYzkxYTM0NTM5ODE1NGI1MmU1MmIyMWY5NmVjNTM3MTA4ZmMxMGI4NjRmMjI2MzU0NDU0M2RmZCJ9fX0=",
        "sfKLop0XqdekGkdFFkK3lxospmO50bqfckuSHA8QiM8qGUxktaifbC8NRM8ESdgwHUjoV5VTvzn2ce55kDlkWZzs5pLMpSbzDSzs82xE8spx9MSjvUvh4WhIajvzuZUxOgi4nPUIMKTspVLynR4f1h1R8744TqWjuKzTNKdkvn0cKpyWDuQch4CoEaxUeM0iIwZe5+7B6SJg+VW6mBHcMyUtMF45qhS9dbBGD7j3ON+HFFe3eio2qwrv9Am4a/nyPJCjRig70QBIngNhChujcWNZG16QLU3riwuAxNMT1oG14ZYiwBu8OAvyquyKYbNW28uXioFF25oJC/h82FEQ3UjcSGl/U/U5A3mH0FjsjBmXWK/NLIBk4bZ0evMQA9elbKLnmhJRUr1I1cCm1hzY1H44xqG/DYqMbj/XAwsSumeQbS6dngIMF12F19N3eHjwgich8IdVgmuiP16nc7yzh3Q6B0pabz57THduwPVT/vy1yHKzUxx8kPgkiWPhY7hCc43T+nOm77+Q+Xjo1IJr5HCHiVbwLmi61CD5rBvenhFzCL1tp5BrogWdZb5JMa/9kX6oraAghfTf3osu0vU5DEADMWnAdso/5HQUPtnzjzrDwTKRGF80iMum0o1gKFu/yP1s5AaYpTBs+qMHrrN0YFJeO5oSJ17vLMF49AgKo54="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(2.seconds)

        type("ambient")
    }
}
