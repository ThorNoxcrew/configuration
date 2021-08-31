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
      absoluteVec(291.5, 30.0, 463.5),
      "Mark Cuzz",
      "eyJ0aW1lc3RhbXAiOjE1ODYxMDEzMTExNTEsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmZhYTlkMWUyM2EwYjZhYjVhMGRiYTEyMzAwNjY5ZTE5OWRlMGUyMTcwYWFlZTI5OWYzMTVkMmEwZmMwYTZkZCJ9fX0=",
      "Kcd+9e3kaQQ6vAqSprIiiF1uzEBAE+UVAXcodqvhvCgt8Xhl2pPCZMt+Axs11nt6g66As/a+v0pIDv1VMtQgb60r8+U0rcmzgocdQaTGvDRA/api+F81XxEK97ySN4n2fL0Zo3tvaVs9bMXsDVGDPRTSzXSX+PKYNFOQGNGdOMOmVpZ6hSDzXacsKKbOVLLQhWM2w2V4AoddVaDFYUyj62m4NRnUCGfyOsOw1xjSqrH1RAvjbf6XzEi9gqNFQU+ZqsN9dIt12KXeD0XWEQAmnSScGRpwgI2of7uOiJMxsM4ZzQC6eQUUI4ba1KZEtgY/qi8XTtALl3J4K6NxfQ/lmM36JDt1YvtmFkvHuWsy6cCdh2qMiSp0TDTd0HY/GGZJ1r8Rjvlg1oteAVptxSBD8mMDacOnndiHnmwCY4YHB7sp3OaKdl+r5hsS7uI9HKQi1aLFKhaSJjFEU4GrKaaNwQdsh1TTlfIQ/G8MkRi4WvPcsTbawVE1XeAfjHkK72cSgj69QJZyVbCp1rcJmtHhQ4Xhb0nvTpmFclqFyImU02rW8qkP59s1QCIzpJnhukI+h9BoV5tOHt6l11EFdMEc7vVp6VjlKJcH0At35BlkEXG+3RB0/1KkLuIlF2jjnvehJd1fl1Ia9XA+pRHu9ivtm5ilBYlJcCAU91NvsxA+FZg=") {
    rotation(-90.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) {
        ShopGui(CurrencyType.NON_PREMIUM, "gadgetStore", player).open(player)
      }
    }

    belowName("island.npc.shop.auction")
    type("shop")
  }
}
