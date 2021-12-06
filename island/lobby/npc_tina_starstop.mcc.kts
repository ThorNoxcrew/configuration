
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(330.5, 34.0, 470.5),
        "Tina Starstop",
        "ewogICJ0aW1lc3RhbXAiIDogMTYwMzM4NTg5Nzk2OSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNTY2YTU3ZjJiNzczYmRjMTQ1MTIyMzc2ZGM0NWI5ODQyODU4NjI5ZmNmOGExMTAwNWZmZjgxZTFmNDNjYmJlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "J2fq9dOVg60gmqDoMHtAp3gxgJxKAcjcPFXkiUFlYLNjpyvE44IlXfzeiGxwwbEJ9JqsDkIChJUgMxJsHrQgXyL609DID4mdfRjhGvXVD8ud6YLibec9hXuyumPZrTJaOKygoEQhDyt/JNzguJbzT1Cvspqz28TWBxax/TJnPMRriMqxsfrtakKVqFvCjQqrcGW1IBV7SrW+GrsYPQKtMPNeiHkEkW1agmJVNk86lv1ZxSgy7f4EHVMYDTgFRernebLkJNsgUZL17dgw1qUfy5KJaURHFHd6dV96gnBJ/0rYiqNTrVvQAUKvMiuvPe1IjEGEY2vBRfoRUfcCazOcQanZ8C6/ImzD0q9nPF2+1oLME6cyrl568tfBphXjGqiZVNBxmodeiQnPNxRtI9s71vfmKkEGRG3ObqMA+owNImlpN4w7S/nSmBXxzLJNvynD0bXBxRqSNQUJTpHfbNLPMRso2BCYm7E58oXkJZ8X+FDtN6AAPqt34SjjogCRBD4+MTQioAhIERcwK1HznKtWZ3BPNhjP/nR12hlYFDx13dDBm4Nj9KzfNYCHMvYHFaYdwWeq4XRGOrBW4JHXgqUyfOGdoEdhY0BjxGClHFxkzG7q1cVkr+DCNdbrWBJik8MxhqaMWKpmwj2oNQdQRyT/zTSvAeD/0legrBrbdO2gPqM="
    ) {
        rotation(35.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        helmet("mcc:island_cosmetics.hair.pigtails")
        offHand("mcc:island_cosmetics.accessory.stick")

        belowName("island.npc.ambient.tina_starstop")

        type("ambient")
    }
}
