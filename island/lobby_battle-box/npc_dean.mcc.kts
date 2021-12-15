import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Roams next to Brawler X in a sort of mock-duel. Named after Venture Bros characters.
    playerNPC(
        absoluteVec(287.5, 31.0, -407.0),
        "Brawler Dean",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNzA1MzA5NTI2NywKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTdjMzM5OTljYjdmZjNhMWRjNmJiMmZjYmIyM2IyOTdmZTkxMGZkN2IwOGM2ZThhMWNjNThhZjBiMjBlNzRjMyIKICAgIH0KICB9Cn0=",
        "vxQoJhmiER5FvvQxSXu3JIvA74XwZ9f8aJGO05bO1dnUEgExi626nhvjuoOeTB81asgJLb+iRtwMo2qhFDTcloYFVtsHbUrOImq4esRQiA5TtrTA0xqS/BKh3en8llk1CetLk4iJ/HR/W3Ci3tEpnS/hDQPnzF0517cKbdKcXplxokQ0xMLn9QmJlFH321UnQYJVrm1k7nH5+5lYzUkgmFRiGEZDkhACcCTir3rRgkqe5Q96Zw3mLnyR3b12m5owbZPuKTFvbt4sXSupQbu+aAhd52j0x2GiPNqZSF4eWIO6g+l5Mn5NIoos13jL7wq5BDmjGeA/xj/ZDKg/QuhbX8VqbQjvLb5PN7V4xKkEvCjltAMB49qkeO41dBENkjxxRFt9pMpfHLXBvn+1TtjW9mS6iPnJXtqtSSAjuWedEaAn980f+bAUzPOwMBtzHl36n9Q1BHU9113gAkTxw4BPMvKV9APEpyXFmKtLx7xNd+6ktVlCFZLnRU5odY4Wl1BT8NdEp481bIcqi9MlyvoiMyGXEOTzycDdBZl8CXM9fH7R4TEXV7qizLpcD4t+HjRbuzBUzta210K06894QozahmvdTFqmd933ws3h4vQVAoX6STXrDOlqpfz7sVP59ZH2d3sygcacVH43GVw3QqUr0GNl3quYdIS7E67vBLKehbE="
    ) {
        rotation(0.0, 0.0)
        roaming(absoluteVec(290.0, 31.0, -403.0), absoluteVec(285.0, 31.0, -408.0))
        
        type("ambient")
        mainHand("minecraft:wooden_sword")
    }
}
