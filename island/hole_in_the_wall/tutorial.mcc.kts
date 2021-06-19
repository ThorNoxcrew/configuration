import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.server.groups.PlayerGroup
import com.noxcrew.mcc.commons.server.i18n.sendMessage
import com.noxcrew.mcc.commons.server.path.camera.CameraPath
import com.noxcrew.mcc.commons.server.path.camera.CameraPathConfig
import com.noxcrew.mcc.commons.server.path.camera.CameraPathManager
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

mccScript {
  val cameraPathManager: CameraPathManager by inject()
  val config = data["cameraPathConfig"] as CameraPathConfig
  val cameraPath = CameraPath.fromConfig(config)

  val i18n: I18n by inject()

  val playerGroup = (data["players"] as PlayerGroup)

  withContext(Dispatchers.Minecraft) {
    for (player in playerGroup.onlinePlayers) {
      player.addPotionEffect(PotionEffect(PotionEffectType.BLINDNESS, 30, 2, false, false, false))
    }
  }

  delay(100)

  withContext(Dispatchers.Minecraft) {
    for (player in playerGroup.onlinePlayers) {
      cameraPathManager.start(player, cameraPath)
    }
  }

  delay(2000)
  playerGroup.sendMessage(i18n.translatable("island.games.tutorial.hitw.line1"))
  delay(2000)
  playerGroup.sendMessage(i18n.translatable("island.games.tutorial.hitw.line2"))
}
