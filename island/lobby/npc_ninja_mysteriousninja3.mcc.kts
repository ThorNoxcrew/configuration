import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands atop a tree outside of Joey Fresh's
    playerNPC(
        absoluteVec(307.0, 52.0, 480.5),
        "Mysterious Ninja",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTgwNjAzNjMzMCwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU0ZDViMWYxMTQ2NjFiMTUxY2ExMTNhMGRmODZhY2Y5NmIzNGUxZGRhOTkxYWVjMmY2ZDBiYTFkYjU3MDA3ZiIKICAgIH0KICB9Cn0=",
        "mOUgble1Zoxicwdu+aNureQenVBW5AIY8bBB1Pb5T+75+mOa5BLMasnIX9Sm5WQp6gtejCjd60wip+7r33HTY3do8CV5OqBKoQyDmopsnu/yzor+cmhTaF9BxAvu7KGtjdEzTc8rNGwLmw2Xr3LMeh/bGRGzCYebtPjp2r84/p74prBFSzMeAAzCTZZGQjW3cOg3JMWgc2zy4eKUrnLiD55PwAMeCzUb6anlzHMQwFntgZ8/qpEHrdeBdvrh2racEGCAwf+rtEMVpfOieaJ86OBier8X7sypv7c7Xxbfy/3jhC/mKYkrFNXaoRXG45I82TmBIgHgilV+As7rblVTDw11coDvjzx9Is5EF+XU5KLHflK57mmx6KVwGE4wqd33eiYXrP/aMRnMSPrYg4shxQ8kjvhMnpGdXIefWrjG14ZpeXcJhV9pDLzjsCW5HEXCBfnOnDRHJVCtJ8tNx3ocHEZfWBHd1xL5BNfEsFOXzGlTOt6oN6kkl4+5t4saRIw/eraXeRLzzqksehrrxgm3zQUAobNK1F+/i/HXNUs/d58PAVV7M7hvOBQkenyqA9FvFiOY2Yuj1qBA6GluxlQqi6XP/wqbc+Gn8vC++dTHdJI2jYSRDBrrQpqkf1ChtHslZxw3Hmk3bTY5XA+TodQ4b2BfZZw5OD24Wr+TEw7Q1JA="
    ) {
        rotation(80.0, 30.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
