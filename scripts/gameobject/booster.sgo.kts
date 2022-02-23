import org.bukkit.potion.PotionEffectType

/**
 * Goal:
 * - Allow game designers to script parts of games.
 *
 * Examples:
 * - Coding Ace Race activatables in scripts
 *      - Speed Booster:
 *          Give Speed II for 2s to anyone in the bounding box.
 *      - Aqua Tunnel:
 *          Set the velocity of any player going through it to 3.5 m/s. Extends riptide trident effect by 1s.
 *      - Dolphin Ring:
 *          Gives Dolphins Grace for 2s to anyone in the bounding box.
 *          OR
 *          Gives a boost of velocity facing in the direction of dolphin ring once per entry.
 *      -
 *
 *  - Death Run trap
 *
 *  - Parkour Warrior obstacles
 *      - Mineplex Winter Game thing Snake Blocks
 *
 *  - Grid Runners rooms
 *      - Categories
 *
 *  - Sands of Time rooms
 *      - Triggers & Events
 */

/**
 *  Classes:
 *      - Activatables
 *          Modifies a player state when triggered.
 *      - Trap
 *
 *      - Obstacle
 *
 */

// -- SPEED BOOSTER
properties {
    marker(MarkerType.BLOCK, "speed_booster") {
        metadata("rotation", MetadataType.DIRECTION_2D)
    }
}

gameObject {
    indices.getIndex("speed_booster", BlockIndexType.multiple) {
        val aabb = when (metadata["rotation", MetadataType.DIRECTION_2D]) {
            NORTH, SOUTH -> blockRegion(vec(-1, 0, -2), vec(0, 0, 0))
            EAST, WEST -> blockRegion(vec(-2, 0, -1), vec(0, 0, 0))
        }
        colliders.box("box", aabb)
    }

    on("box", EventType.PLAYER_COLLIDE) { player, ctx ->
        player.state.potionEffects.set(PotionEffectType.SPEED, 2, 2.seconds)
    }
}

// -- AQUA TUNNEL
properties {
    marker(MarkerType.BLOCK, "aqua_tunnel") {
        metadata("rotation", MetadataType.DIRECTION_2D)
    }
}

gameObject {
    indices.getIndex("aqua_tunnel", BlockIndexType.multiple) {
        val aabb = when (metadata["rotation", MetadataType.DIRECTION_2D]) {
            NORTH, SOUTH -> blockRegion(vec(-1, -3, -2), vec(0, 3, 0))
            EAST, WEST -> blockRegion(vec(-2, -3, -1), vec(0, 3, 0))
        }
        colliders.box("box", aabb)
    }

    /*
        Client Velocity - Unknown, can only be increased.
        Server Velocity - At most 4m/s in any direction, can be set, get and increased.
     */

    on("box", EventType.PLAYER_COLLIDE) { player, ctx ->
        player.state.velocity.set(vec(0.0, 0.5, 0.0))
        player.state.riptiding.makeAtLeast(1.seconds)
    }
}

// -- Wind Tunnel
properties {
    element("tunnel") {
        block("start")
        block("end")

        definition { element ->
            colliders.cylinder("tunnel", cyl(radius = 5, top = element["start"], bottom = element["end"]))
        }
    }
}

controller {
    on("tunnel", EventType.PLAYER_COLLIDE) { player, ctx ->
        val start = ctx.source["start"]
        val end = ctx.source["end"]
        val direction = (end - start).normalize() * 0.2
        player.state.velocity.addClientside(direction)
    }

    forEachElement { element ->
        ticking(time = 5.ticks) {
            // Spawn particles all around the cylinder
            val steps = 20
            var current = element["start"]
            val offset = (element["end"] - current) / steps
            repeat(steps) {
                world.addParticle(Particle.CLOUD, 5)
                current += offset
            }
        }
    }
}

/**
 * What do we need:
 * - Having triggers, allowing full codable logic on what to do after a trigger,
 * how long to wait, maybe a condition to wait for, how often to execute.
 *
 * Triggers - defined as a Set<Player> that is activating this trigger at this time
 * - Colliders:
 * - Player walks in area
 * - Player dies
 *
 * - Entity dies
 *
 * - Redstone signal at block
 * - Redstone powered block is powered
 *
 * - Monitors:
 * - Player picks up item (entity despawns)
 * - Block is of given type
 * - Player presses a button
 * - Player rings a bell
 *
 * - Need to all be applicable to multiple inputs! Multiple blocks change, multiple entities die, etc.
 *
 *
 * - Game specifc extensions:
 *  - SOT Sand Trigger chest
 *  - SOT Puzzle Blocks -> Has to be per-room trigger, something global!
 *  - GR room entered (so you can time after the fact)
 */

/**
 * Trigger types:
 * - Player trigger
 * - World trigger (block || entity)
 *
 * - Single trigger
 * - Multi trigger
 */

/** The different types of events that can be thrown to scriptable gameplay objects. */
enum class EventType {
    /** Triggered when a player collides with a collider. */
    PLAYER_COLLIDE,

    /** Triggered when a player uses an interactable. */
    PLAYER_USE,
}

/**
 * Calls [function] based on the status of events of the given [type] on the given event [bus].
 * Different activation modes can be chosen:
 *  - RISING:     The function is triggered every time the event starts.
 *  - TICKING:    The function is triggered every tick while the event is active.
 *  - FALLING:    The function is triggered every time the event stops.
 *
 * Aditionally a [rest] time may be given. Events are not triggered until the rest period is over. This can be used
 * both to deactivate events for an amount of time or to decide the speed at which ticking events are called.
 */
fun on(
    bus: String,
    type: EventType,
    activation: EventActivation = EventActivation.RISING,
    rest: Duration = Duration.ZERO,
    function: (Player, Boolean) -> Unit
) {
    // Important about the function is that it's not going to be ran live, it's going to be interpreted beforehand and
    // turned into actual code down the line.
}

gameObject {
    // Triggers


    /**
     *  - EVENTS
     *  Events are listeners that act when triggers change states.
     */
    on("player-enter-1", EventType.PLAYER_COLLIDE, EventActivation.TICKING) { player, state ->
        /**
         * - PLAYER STATES
         * Player states are a simple definition of a player's current state. The values
         * of these can be modified easily in events, either by adding a modifier, setting
         * the base value or adding a limiter.
         */
        player.state.health.addLimiter("immortality-zone") { value, context ->
            value min (context.maxHealth * 0.2)
        }
        // Ensure health can't exceed max health
        player.state.health.addLimiter("limit-health") { value, context ->
            value max context.maxHealth
        }
        // Every 0.2s 0.5 is added to the health 20 times over.
        player.state.health.addTimedModifier("regeneration", times = 20, delay = 0.2.seconds) { value, context ->
            value + 0.5
        }
        player.state.addFlag("show-immortality-ui")

        player.state.potionEffects.

            // Inventory is a special case and needs special care
            // Something to give an item for the duration of them being in this event, but we could also have
            // something that they can keep from now on. Do we maybe need some sort of per-room ness so SOT can
            // give out items that are immediately revoked when they leave the room?
        player.inventory.addEquipment()
    }

    /**
     *  - LEVEL INTERACTION
     *  For interacting with the world and creating consistent objects that all scriptable gameplay objects
     *  can share.
     */
    // Something to create and manage constructs and entities. This needs some sort of system in Control where you
    // can take away/give permissions to scriptable objects to do things.

    /**
     *  - COMPONENTS
     *  Component are behaviour modules that are added to a game object, often to call triggers.
     */
    // - Colliders
    colliders.box(absRegion(vec(0.0, 0.0, 0.0), vec(0.0, 0.0, 0.0)))
    colliders.circle(center = vec(0.0, 0.0, 0.0), radius = 5)

    // - Monitors
    // Block Monitor
    // Triggered when the specific block is the given state
    monitors.block(vec(0, 0, 0), block("minecraft:grass_block[snowy=true]"))
    // Triggerd when any block in the region is modified
    monitors.modify(region(vec(0.0, 0.0, 0.0), vec(0.0, 0.0, 0.0)))

    // Entity Monitor
    monitors.entity(entity)

    // Various specific monitors for specific block state changes
    monitors.pressButton("button-1")
    monitors.ringBell("bell")
    monitors.pressurePlate("pressure-plate-1", vec(0.0, 0.0, 0.0), PressurePlateType.WOODEN)
}
