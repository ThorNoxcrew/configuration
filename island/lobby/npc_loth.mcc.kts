import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Spider Fan talking in group left of main lobby.
    playerNPC(
        absoluteVec(342.1, 36.0, 525.7),
        "Loth Webber",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExNzY2Mjc4NCwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85YWQ4Y2Y4MTY0YjZmMDRkNDU5MjZjNjA4N2FlOGVjODg4YjMzNGEyZjIwNThjNGQ1Zjk3NmExYThmMzMzZjEyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "l9zsyXQtwBD+1kidoS4l71OJwaP0Y7yZTk/nzFVPWBHKODM2TSpGtl/AbuFvaoO7B7sVHB/86EMj094eEmvh4/pk33URAbUc5SmJp4Hy4Ha69pBSb/cE3d8NPiD96PLzVtYhHVSoLYTZemzJ/xzHEAg4GJmE5JHScCb1S1YClxu0WqdhbUphDXXX5Xrcb5wnifRvXOSwzjaU89FObKhfftFDvb4Yo3Y11Hy0H2FU9ZULVsZlzqe2YTSm1l5bnAXzAsRwpC3iQjA4uYZ8jG+d5r311370oaOe9k6hcTvyDC37cH0oi+dcr9LJfLg6iKsYWl1hXeb7fNJxW8Qz9T4cA88+HlgQw5ySgsZ8E9EbJruizQFxc4xFtk/UByQ/w30WosG7ucuGpyqz4JhZGcKB9NycxKYKpct9eyg9hIKGgW9tz6EKKOZaJkExYzg7I1BuMgCpUkbUjqHBGSKa331iJqzzgP59Zwl7dgwUq16q3TbdK/f9LzHEUZUXsuhtsS2yeLA6EauGG/Uk42CnwxLLBRzMgJBO5Avo/uC3RHf1FRrxNtWTkqQFR7bmbeyKYzHdBLc4oEncqLl2EnmLqD5CDwv+csdQn8REA9/2ZzZjQN2VNLynsmDqhNY9tQOfvzFPSJx1Fymg10MNsEh/hcuwZgD6oANHbbHQlYEdynQgHLE="
    ) {
        rotation(0.0, 0.0)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.curved_demon_horns{display:{color:16007844}}")
    }
}
