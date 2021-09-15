
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(304.5, 36.0, 427.5),
        "Kenneth Paltro",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjQ0MTE1NDM3MywKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNmEyNmE2MTRjY2ExYjgzMTJhNGY5NWI0ZDRlZjBkOTY2YzcyMmIxMDkzNzFlMmJhODMxODYzOWU1Mzg1YzI0IgogICAgfQogIH0KfQ==",
        "XYXD25nZFEdUymJNicPrljPcJcZkNwCuwfM6bw65iNIPmot6E1QkH2RsNF+HTN43kuDzCaKeRM78nPtlVwabBUyxzAok9KqV4RFvy1DdKiodbhmuhBLn5k1GWN+q/l00lhnoalcWAWT+Y+3fIzjW2FdG1ykLgYIJdIPMd+1/31BG5TtYpH6XZ8y2wuNrXBMMXJY4xaOITjwG6leq4GG3RvjmUh7oRBO8FrfpLduLqD/P/e5WpT9X8H/7LbPstTPiKYksiY9fB6QwijBUAW8M980fQt1axv2x5BMM9iyc5n9T10BvDaVb/TocAcd0XGM2IP0+6Bh7qOJ6xjdaWrSiAH4fwdmk2IEUl5O4a3khkTJDFKiO0QFHVsRuDJmAPOPKcCL/cSM1DgjOaK4RiUY2kAGwL+nMbKCV0n3ywRIQL8BKgbiMJPBQLvv9mXlJN28KeWdXGX5XDoBPtbUA4lMRuPSkTJlV7tE3XKZwYXqBmqNj7OB3g1+D4a45Av+RqQzFufHslGvhW03/tEw8DsqSDcpfjLQQAkW5bEAHfCj4FFsFHMnrl+YxDIVj86A9meoNRNavR0mpspL61Frb8GTIng0DgAKIlc2H2W+XCYmeqGRojAAkGytcSNAxofB2UXM5SKoxJL1YcFkLmCYdsuhelE9S9Tg03AB28PAoDsrzIvY="
    ) {
        rotation(125.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        helmet("mcc:island_cosmetics.hair.mutton_chops")

        belowName("island.npc.ambient.kenneth_paltro")

        type("ambient")
    }
}
