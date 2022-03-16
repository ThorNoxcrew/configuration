import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Officer on block corner talking to officer miles.
    playerNPC(
        absoluteVec(346.2, 34.0, 491.4),
        "Officer Mark",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MTIzNjQ0MSwKICAicHJvZmlsZUlkIiA6ICJmODJmNTQ1MDIzZDA0MTFkYmVlYzU4YWI4Y2JlMTNjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXNwb25kZW50cyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZDc1YmNkZWEwY2JmZTI1NDQyOWQyMjljNmNhMTllMTY5OTJkOGVjMTNmYjVmMTgzNzBlZGUxM2NlOTYxMmI5IgogICAgfQogIH0KfQ==",
        "KbkZ3QkPVp1B+6XXf3/y7I2Y3KvLQS5n/sXgGWhwDw20NBYWLOEg1Bvdv0M4MMDlHA0IC/wJrrn+8LYRaeBy3cpGsilHcusLMNROQOuMkUNMip9ALCMGmt+AbzC4Ma33Xza90HJMFR5cpfhZHKmAFAgCBXyYVzdNME58rOpvXXCqb63me4RBZGK8iFRLEjBdR7QjUDZLpHphq/1iq4ubrbCrp453zzXN03edZVrpAL6eWSSRSvJRcIl5V0tzYeQfSJiMiHcowx3y2Jt8kZ1aYcdm4juDMzbpNbagNByP5Mg38hPeaqUUQcbQ4czfDW0vowqTP23DjEGEGCBODsh9uidOPMD6B9g8Dp4AU947gnnJ0B3cwDT4DchFUihDvF3TxBWadbGLA06ShRoCW+pyTVId86sqlPs+xAIh+8QM2Gb/axYJltSaLjVEECKzfh7UkD7N/aRNjYE/ae+ATwvmu/6Kp3W4Rbyj90VHk3Pl+5Vd9YVjxxlkDAF6lVxYfQdLIvQE3Lz2SzGSmtbbmWkrFX6TZWqZzBWOH9RFXSxWLOv7Vqrd1iEXQdv1yVMbXfBQ6edUTmqVSnA0YeYehPVymK2/RlNU1D/rrpJEg5qnSOGPSUv+74QuAqACZYObQ7PxModKkCuhDb1+B76Y/VEQtfvGT7YFcCq3lUm5txFqHiw="
    ) {
        rotation(-45.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.police_cap")
    }
}
