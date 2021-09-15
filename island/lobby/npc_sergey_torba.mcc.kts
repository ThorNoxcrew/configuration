
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(372.5, 32.0, 454.5),
        "Sergey Torba",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjMzNjgxOTc4NywKICAicHJvZmlsZUlkIiA6ICJkODY1NjliNzg1ODU0OGU3OTJlYmJjNDM2MGYxNjkwNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJPY2FuYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2IyY2Y3MTE5NmE0NGVjY2FmNzRmNDUxZWUzYjVhMTY4NDFjZmYxN2RkYjU0YWFlMGQ1Y2ZlZWNhMDIzMzcxMyIKICAgIH0KICB9Cn0=",
        "d06kwubT8rjmMazuSl//KQrnd7trEH9J48QAuv5y6l2g/S71Ct0494MFUVcU5dbUW+Ov5amZt8UsyArfIG75TGpsdX/m9nub4WXn/y/5jBk8Hn3WRIlG1XIU5p/KfTg8C1C/bUuIT3onbB4GP1s376XFRvve6J2Za78kRpiBeFb/PmRVX3S0XNNaDyu59+3ICmdUH3zkeQbyP8v8n6SuP5C8d3iRk4YxB+rnpWzsoMDCVj5s6eAmjTYYs1r11xk15OpxlrFbAFew0F0qVx90zEt8k5wX48WFh7R/yoNqVOjI0awNh7p9VNCc4JKNDtSZQVVcqxC1XVnISu6CwWhXNKc6E+MsZmOEUb3LPAqrJil/dPZCgykUctVudNiINdMmTnvhuLZd7OPJrDJDpMKfJ6F7IoLTxSQMYjb2yKFOl1l8dRybTnsIvWiRZiEP8eEPj6Lpm5kp46M44zuACScF6Lz37JVH3xqnGe3dVmOtmkZ7X+VBs7fFkzR34EWyf1CPavUb7MKIh4modLSgYspRPauA0bxZPDvPjMjALX5s1k3SiTIqfJU2gfuovXyQpz5bUrCaGtMCMhNnEuRS9abyyjrBPrgLull56buKGMRVGfNnuCRtkkStReI3I5koVFyYwf3aec7ek09asMwq5DT8GNu7916jwfLKEE9yRhF9RM4="
    ) {
        rotation(-180.0, 0.0)

        helmet("mcc:island_cosmetics.hair.afro")

        belowName("island.npc.ambient.sergey_torba")

        type("ambient")
    }
}
