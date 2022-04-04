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
        absoluteVec(284.5, 38.0, 510.5),
        "Doug Printeeno",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NDY3NzY3MywKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYTNmZmU1MTRmODRjNWNlZGZhNTNkYjE5YmIzYjE0YTc4NzNhNmQwYjVkZTBjYzhiMjM5N2M1YThkOTE5MDkwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "AgstSh+ipRjn+B4lQ+aTEgS8b3Cfbgr7uLUWcIu0ouQH07U5hHI8WFAN380l5x21qOTNPvQ83FFTDJw1POFupyEzxqgh8qUX8X2PFixQ8a41yXm+1xHokUqfmhD+FhcZ49HKMU/Dyy+x7QpzzNxN4+qjK3E7fzt4rWCky+Wog0pveaXWnXy6qH/S8C1Eoq4slfHQTrubhKZ20ti4yf8w8WMtjoWhf9UmNWVKef3XpuGTjTvXWBFNCOsp3Xrn/BUlUK6wG/bpiSur3z1PYV4IB2D9iOmstHdO7SWbUghzdZ/ywLnIGZUdPQJfANA1G60eOzC61P5u0nwJt+VDXSnjvyLYP5mT6wzLG4Z4A1+gAVejtT68mPsEfvE2zp38D6yJU3J78QWhdM7LeRCobETNPWvi44VTLoPRYPIhlEXaPd1WTKDS7cvzSsVOVzfOmE3hooFwiytCzddyXVA2dQXF4dBa6joVaAYoJeiLy5l7dEJJJCJWmjzjrt87x4cIL+bMROslRxDY4JUESaNNzS8uNvAEA6nk80fmiBExsiWDrhR/QDIocblJbReHLZEwi7SINgEkr6IC8SVJ7YP0tX/0hjbT/kB5bYW0W31f6Ir34//vzE6ksCLtvKPbeh+mM7ppeBj3qtE7osPT6DWxYFNByPay3kIHguocykInU//m2o4="
    ) {
        rotation(-90.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        //belowName("island.npc.shop.coffee")
        //type("shop")
    }
}
