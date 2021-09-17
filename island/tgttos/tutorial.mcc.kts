import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.base.text.text
import com.noxcrew.mcc.commons.server.config.injectConfig
import com.noxcrew.mcc.commons.server.game.modifier.ModifierTitles
import com.noxcrew.mcc.commons.server.i18n.sendMessage
import com.noxcrew.mcc.commons.server.i18n.translateLines
import com.noxcrew.mcc.commons.server.module.container.Container
import com.noxcrew.mcc.commons.server.module.container.injectModule
import com.noxcrew.mcc.commons.server.path.camera.CameraPath
import com.noxcrew.mcc.commons.server.path.camera.CameraPathConfig
import com.noxcrew.mcc.commons.server.path.camera.CameraPathManager
import com.noxcrew.mcc.commons.server.sound.SoundConfig
import com.noxcrew.mcc.commons.server.text.font.CustomGlyphProvider
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.title.Title
import org.bukkit.entity.Player
import java.time.Duration

mccScript {
    val cameraPathManager: CameraPathManager by inject()
    val container = data["container"] as Container

    val config: CameraPathConfig by container.injectConfig()
    val cameraPath = CameraPath.fromConfig(config)
    val modifierTitles: ModifierTitles by container.injectModule()

    val i18n: I18n by inject()

    val player = data["player"] as Player

    val customGlyphProvider: CustomGlyphProvider by player.injectModule()

    player.showTitle(
        Title.title(
            customGlyphProvider["mcc:gui.black_box_1"].toComponent(NamedTextColor.WHITE),
            Component.empty(),
            Title.Times.of(Duration.ZERO, Duration.ofSeconds(1), Duration.ofSeconds(1))
        )
    )

    withContext(Dispatchers.Minecraft) {
        cameraPathManager.start(player, cameraPath)

        delay(1000)

        SoundConfig("mcc:games.global.gameentry").play(player)

        player.showTitle(
            Title.title(
                text("TGTTOS") {
                    style {
                        color(NamedTextColor.GOLD)
                        decorate(TextDecoration.BOLD)
                    }
                },
                Component.empty(),
                Title.Times.of(Duration.ofSeconds(1), Duration.ofSeconds(1), Duration.ofSeconds(1))
            )
        )
    }

    delay(3000)
    withContext(Dispatchers.Minecraft) { modifierTitles.showToPlayer(player) }

    for (line in player.translateLines("island.games.tutorial.tgttos")) {
        player.sendMessage(line)
        delay(3000)
    }

    // Send standby text
    player.sendMessage(i18n.translatable("island.games.tutorial.standby"))
}
