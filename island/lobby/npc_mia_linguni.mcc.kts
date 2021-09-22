import com.noxcrew.mcc.commons.base.currency.CurrencyType
import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.island.base.shop.ShopManager
import com.noxcrew.mcc.island.server.shop.ShopGui
import kotlin.time.seconds

mccScript {
    val i18n: I18n by inject()
    val shopManager: ShopManager by inject()

    playerNPC(
        absoluteVec(302.5, 36.0, 506.0),
        "Mia Linguini",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyOTg0MzA2OTQwMCwKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk0NzIzOTVhM2Y1OTgxZGUxZThmZDg2Njk4ZjZlNDBmNmIzZmU1ZjZkZjEzZTk1MjliZDZhZGI0Mjg5M2Q0YzEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "JycGPkmNRF/4HqrxO8yCU+9B5QarNHHFQOB0aOsborttBYkTLqFn/dDcDK6Nvv4ofPRR1W3FR42vfjS8eLRYxf51zcAf5ayp4paNhNc7WIIh556m2TxEjjJktTDOMHXrJ1yoMW3SMmTgUANHBTSdPkVlH7BEAqgNlIvE51Ruas9q4gzYKyjPkYvni6yAwD0DoW6/0gGKFbC24JHdBlicJyhhK7U32DN7wL0iSbT9eNpq630PKvkvccBVffgx+Bh1AUm+XrFvOsuMxkTB1e0Nsyx5D8V6cp/NEa4sAkq802CtClGR2xGxCTAqzhSvcpdzalASmOX9vQw6L3DF4bt3rUwv8gl59Hlwkt/5AzBNVPT4/tsRA274Fk5cc0JngEME/q7PDBvizfisdsVxvb+KGoAvv9/+dOyfdRP9SCml6c/nN5nrhTTXctmuHfGQhVBSRf1zS1hFdgVESqLE5jqlIwoaz1tyeKoOpVCggpHjsa8ka1vrqA6IAAImBqsMH5tz1MXXQ/pXOzd75L0F0dZ8bGcysIv+9IAFN2BCaosiadQ/quxjbiKOlhAFdBaX5dK3NOozcVeRuhwvNhMM1Wn3XP+M1rL7c90xtlODT5ov3lisXIWF1poJrerEsXAS3LZD6ZFlwhI9Ujpe1l8RGw4QPv/qVWssbrEW868SWoygvN4="
    ) {
        rotation(-110.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        interactBehavior { npc, player ->
            withContext(Dispatchers.Minecraft) {
                ShopGui(CurrencyType.NON_PREMIUM, "furnitureStore", player).open(player)
            }
        }

        belowName("island.npc.shop.furniture")
        type("shop")
    }
}
