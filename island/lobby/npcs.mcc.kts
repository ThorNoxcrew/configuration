import com.noxcrew.mcc.commons.server.util.sendToAny

mccScript {
    // Player NPC using a username for a skin
    playerNPC(absoluteVec(235.5, 70.50, -220.5), "Noxite", "Noxite") {
        interactBehavior { npc, player ->
            player.sendToAny("hole-in-the-wall", "island")
        }
        //roaming(absoluteVec(230.5, 70.0, -210.5), absoluteVec(238.5, 70.0, -226.5))
        proximityBubbleChat(text("When can I add NPCs?!!?"), 5.seconds)
    }
}
