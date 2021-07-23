import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.server.config.injectModuleConfig
import com.noxcrew.mcc.commons.server.i18n.translateLines
import com.noxcrew.mcc.commons.server.module.container.Container
import com.noxcrew.mcc.commons.server.path.camera.CameraPath
import com.noxcrew.mcc.commons.server.path.camera.CameraPathConfig
import com.noxcrew.mcc.commons.server.path.camera.CameraPathManager
import com.noxcrew.mcc.commons.server.sound.playSound
import org.bukkit.entity.Player

mccScript {
  val cameraPathManager: CameraPathManager by inject()
  val container = data["container"] as Container

  val config: CameraPathConfig by container.injectModuleConfig()
  val cameraPath = CameraPath.fromConfig(config)

  val i18n: I18n by inject()

  val player = data["player"] as Player

  // Start camera pathing for the tutorial
  withContext(Dispatchers.Minecraft) {
    cameraPathManager.start(player, cameraPath)
  }

  player.playSound("mcc:games.global.timer.grace_period")

  // Send lines 1-6 to the players
  for (line in player.translateLines("island.games.tutorial.tgttos")) {
    player.sendMessage(i18n.translatable(line))
    delay(3000)
  }
  // Send standby text
  player.sendMessage(i18n.translatable("island.games.tutorial.standby"))
}
