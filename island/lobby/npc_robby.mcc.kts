import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Knight outside of Lime Llamas house. Duels the dragon Salt.
    playerNPC(
        absoluteVec(162.0, 79.0, 666.8),
        "Brave Sir Robby",
        "eyJ0aW1lc3RhbXAiOjE1NzAwODk3MTI4MjcsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWRiODllZjU0MjI2YTBiMjU5ZjMyM2FmY2JkZTJiNWJlNDIzNzIxZDI1NmIwZGJjNGQzNDcwNWRkMjliYmY1YSJ9fX0=",
        "l6nOluUDAtFn7rz9XkWAH+JwEli+h4v5dScjPfsAXyJ7h3BUoajaDBvGiRmk4PYqoPfyXwtVnKvpzoYVzeGQrWeyE7HhtLH8dGcoZfkJqo9bJSALrQsxz25V08mKsgAvk33riwE/fvMr8QfGZHo2EswuRN8pexw+RlTF9pMsyR6FpffH3Uh6eZysmeofj8ZVWE2Sreu6tKKHpFN0S5j8TcjWJfdKWVPmutLM+ZLn5qiRHqz75vBZ1A4xPFI3lk4Ou+TrDtuSnrvUZHaIHVjKBv+51l2AtnJej47IECwti1ocn4Sv5sxrSs4zebXyqMLGoTMsqagFYX+IAKbBTpKzGapHiBZV9K2RDbEV3rrb+pNaOF0CaCY2gdVjIU2np3aQ4fpuYUSXnWxlVIccx244I39h2giu7BYpC2LTMXBXO96+KZST7mVokr69ndVnk0N/Y+pVnd6oyUGlNdOlp+KQM8hnnoCeafmiaZ7KCyM0vRF6DaIT0tLFzoGq4bh+kppwVIpGDugPCtXmW6ksnFmcq99z/8i9Sv/EpNuZQYRaxwUV/1Tk3f7u4q9RkNNdLA53QmR/Y80caXv02jNX3zZHe1WTxmw3QQ+Rzf+xFeBsJCJerUMmwZ07VXkjGcbWC44EsOJ0EYzrhLmtnNpEmp0d1nEu8iO4Mx2/0GdStzQp85A="
    ) {
        rotation(20.5, 0.0)
        
        mainHand("minecraft:stone_sword")
        offHand("minecraft:shield")

        type("ambient")
    }
}
