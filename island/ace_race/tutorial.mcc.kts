import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject
import com.noxcrew.mcc.commons.base.text.text
import com.noxcrew.mcc.commons.server.game.modifier.ModifierTitles
import com.noxcrew.mcc.commons.server.i18n.sendMessage
import com.noxcrew.mcc.commons.server.i18n.translateLines
import com.noxcrew.mcc.commons.server.module.container.Container
import com.noxcrew.mcc.commons.server.module.container.injectModule
import com.noxcrew.mcc.commons.server.sound.SoundConfig
import com.noxcrew.mcc.commons.server.text.font.CustomGlyphProvider
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.title.Title
import org.bukkit.entity.Player
import java.time.Duration

mccScript {
    val container = data["container"] as Container

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
        delay(1000)

        SoundConfig("mcc:games.global.gameentry").play(player)

        player.showTitle(
            Title.title(
                text("Ace Race") {
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

    for (line in player.translateLines("island.games.tutorial.ace_race")) {
        player.sendMessage(line)
    }

    // Send standby text
    player.sendMessage(i18n.translatable("island.games.tutorial.standby"))
}
