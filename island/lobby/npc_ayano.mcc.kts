import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.server.module.Module
import com.noxcrew.mcc.commons.server.module.container.Container
import com.noxcrew.mcc.commons.server.module.container.injectModule
import com.noxcrew.mcc.island.server.cosmetic.CosmeticCategory
import com.noxcrew.mcc.island.server.cosmetic.CosmeticLoader
import com.noxcrew.mcc.island.server.cosmetic.CosmeticManager
import com.noxcrew.mcc.island.server.cosmetic.CosmeticOwner
import org.slf4j.Logger

mccScript {
    val i18n: I18n by inject()
    val loger: Logger by inject()

    val cosmeticManager: CosmeticManager by injectModule()
    val cosmeticLoader: CosmeticLoader by injectModule()

    // Girl looking at flowers near main fountain
    playerNPC(
        absoluteVec(324.5, 37.0, 566.4),
        "Ayano Ai",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk0NDY0NzAyMSwKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NTc1ODUxNTY5ZGZiMDhjZjZmOWNmMTUxOTllN2E1YjM1MTkyZjIxYjBmY2JkMGNhNGI1ZjQ1M2ZlMjdiN2VhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "s6b+5V/dCVeOuuImv5RYVVv52yxL3iFg+DaOZwNjRHVQTWXrfE6EIqse6cVwKUoqToGte1fnVr5b0j87ir2oKxCA1dccCRjIqaX7yDVar80o2uYhQ1iZ42bKRjbm8T8FRH5qcSasHdGWnlFlrm7cZ9gT6aY2jype1ttZGYAH1/rbS/xncrgOrMfn6VZ+meETJHMruNAWvoTlU9JUrAWUfarocPwUrDN7vJDQk1Z6xl4rElLKmnEa5UVqsL5xKfKniUf+sihbuCQs3Gf27xfbaiKJTUK0gucHJPi6XsQF2ZCUo/W6CHAutAJvWw+9q+p7jHRUOW3DXtOoERPp2qQVjHbm472zKNlT+oRcVYJDEm0SAuzsywxJaeQflYl9aeeYDs2Ljx6sdysVlXIOkfhkbisEGblyKPa3ptlin0LoA3YOuRBSfIOFG1FcrMGrZnbXLyLnZ6yuDMe9XXaOMpdc755hHxEoN3xUiw+Qmz+irHqDRT2y00UZZ7bCtf6bHPm2QrJHr1aFsQDPx/GYdtfu4P6/lg01jIo/qg8EfiGTE/Ey4lHVYbtyn1H2I31QH7re6FQcB917kGjCWyhdmydeYOKXGPDAaAL/gpOu+mfM8uXKCrUCds+IjJVqcRQmB+tXk8kKvDxlfzszlmJAm2IW8LUBIOqYPoEJRMiu5NV3EhU="
    ) {
        rotation(90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.sun_hat")
    }.also { npc -> 
        val cosmetic = cosmeticLoader.getCosmetics(CosmeticCategory.ACCESSORY).get(StringKey("accessory_gauntlet_of_power"))

        if(cosmetic != null) {
            try {
            cosmeticManager.equip(CosmeticOwner(npc), cosmetic.invoke()!!)
            } catch (e: Exception) {
                logger.info("Failed to equip cosmetic!")
                e.printStackTrace()
            }
        }
    }
}
