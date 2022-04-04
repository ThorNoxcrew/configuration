import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Pig Fan talking in group left of main lobby.
    playerNPC(
        absoluteVec(340.2, 36.0, 526.7),
        "Pinkie Iggy",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk0NDY0NzAyMSwKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NTc1ODUxNTY5ZGZiMDhjZjZmOWNmMTUxOTllN2E1YjM1MTkyZjIxYjBmY2JkMGNhNGI1ZjQ1M2ZlMjdiN2VhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "s6b+5V/dCVeOuuImv5RYVVv52yxL3iFg+DaOZwNjRHVQTWXrfE6EIqse6cVwKUoqToGte1fnVr5b0j87ir2oKxCA1dccCRjIqaX7yDVar80o2uYhQ1iZ42bKRjbm8T8FRH5qcSasHdGWnlFlrm7cZ9gT6aY2jype1ttZGYAH1/rbS/xncrgOrMfn6VZ+meETJHMruNAWvoTlU9JUrAWUfarocPwUrDN7vJDQk1Z6xl4rElLKmnEa5UVqsL5xKfKniUf+sihbuCQs3Gf27xfbaiKJTUK0gucHJPi6XsQF2ZCUo/W6CHAutAJvWw+9q+p7jHRUOW3DXtOoERPp2qQVjHbm472zKNlT+oRcVYJDEm0SAuzsywxJaeQflYl9aeeYDs2Ljx6sdysVlXIOkfhkbisEGblyKPa3ptlin0LoA3YOuRBSfIOFG1FcrMGrZnbXLyLnZ6yuDMe9XXaOMpdc755hHxEoN3xUiw+Qmz+irHqDRT2y00UZZ7bCtf6bHPm2QrJHr1aFsQDPx/GYdtfu4P6/lg01jIo/qg8EfiGTE/Ey4lHVYbtyn1H2I31QH7re6FQcB917kGjCWyhdmydeYOKXGPDAaAL/gpOu+mfM8uXKCrUCds+IjJVqcRQmB+tXk8kKvDxlfzszlmJAm2IW8LUBIOqYPoEJRMiu5NV3EhU="
    ) {
        rotation(-40.0, 0.0)

        type("ambient")
        mainHand("mcc:island_cosmetics.accessory.fairy_wand")
    }
}
