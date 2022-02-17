import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Knight standing next to Battle Box gym entry
    playerNPC(
        absoluteVec(244.0, 32.0, -427.5),
        "Sir Percy",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzNjYwMDAwMiwKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmU2ZjE0MmIyOWJkMTVhYjliZTNjMGU3ZDcxMzM1YmUxMDY2MDYwMmM5ZTA2YThkYjk3NjE4NWM2Y2Y5ZWRhOSIKICAgIH0KICB9Cn0=",
        "Rtbdo7QpVx9mMl+xsTtAilr4Jz7EraRzvQQLyOXoWJYDvkN2ZzEu/83IfTntXhbp36ACMfBUpd69WrmUUh1U77X2hKr4kkCpnR1aMMTa6evCAIaV4eA5lP1Wut87ipeZNGoA+N2YQIEMTI1AIgUyUlb3W0gL31EGti3zhOtz4ZzRyIi6Z7kzJ0C6mJtMLi0LEawnkEJoL5AicLKwkufoKbpUYesXgYyU8JcaFP4rwTu1DeFJ+3MayL+znKBme9ysgOPjAVBwBIHe4L+mQD+tEIkVqna+Geyp4AoXHBOuPxIiY5H4n3G1IuumL+xOlqIIFUyXL0vlw4eHB7vonH0TuA36Cz8SILJKyEavVf8hJixAcyc7Rb0wQN1UQrRxZNzJkAsrjwwdNtCAeVnIKCQRkN+2VcUDtbRPlnpV47EmihxrvTtfAA9FeZiiUMOlZKnKbax6vVZYeXSkqxGuK8qbuwREQ60iJ70oqcKqCiDFMfCL3UPpmK5FezHl/52l1oTdLuvjH/WlQRWmb38RmJgzjlRY31wKAmulNpExox4tvVNtVMzQ06VpQy/AWQRna/GKkPHqrO4sSSBj6OfyOnHCksD0c7oR8G1xbYmrgRB63mPwBZDqZalWKvYxLD2HN4x8fXG+dsOlk7XHBbRvRlXe5f+fL3exObkwqjcmsBu57Mg="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)
        type("ambient")
        offHand("mcc:island_cosmetics.accessory.comically_large_spoon")
    }
}
