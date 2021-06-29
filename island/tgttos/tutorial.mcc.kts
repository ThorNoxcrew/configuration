import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.server.groups.PlayerGroup
import com.noxcrew.mcc.commons.server.i18n.sendMessage
import com.noxcrew.mcc.commons.server.path.camera.CameraPath
import com.noxcrew.mcc.commons.server.path.camera.CameraPathConfig
import com.noxcrew.mcc.commons.server.path.camera.CameraPathManager

mccScript {
  val cameraPathManager: CameraPathManager by inject()
  val config = data["cameraPathConfig"] as CameraPathConfig
  val cameraPath = CameraPath.fromConfig(config)

  val i18n: I18n by inject()

  val playerGroup = (data["players"] as PlayerGroup)

  // Start camera pathing for the tutorial
  withContext(Dispatchers.Minecraft) {
    for (player in playerGroup.onlinePlayers) {
      cameraPathManager.start(player, cameraPath)
    }
  }

  // Send lines 1-6 to the players
  for (line in i18n.range("island.games.tutorial.tgttos.line")) {
    playerGroup.sendMessage(i18n.translatable(line))
    delay(3000)
  }
  // Send standby text
  playerGroup.sendMessage(i18n.translatable("island.games.tutorial.standby"))
}
