program {
    val startTime = 5

    val positions = listOf(
        vec(556.0, 92.0, 572.5),
        vec(533.0, 92.0, 572.5)
    )

    var iteration = 0

    positions.forEach {
        var reflect = false

        positioned(it) {
            if (iteration != 0) {
                reflect = false
            } else {
                reflect = true
            }

            reflected(x = reflect) {
                // hello lasers from eoymcmc past
                absolute {
                    val z = 100
                    val time = 30
                    val lasers = 30

                    repeat(lasers) {
                        val pos = z - (it * 10)
                        val duration = time - (it * 0.5)

                        spawnLaser(pos(0, 0, -5), pos(0, 0, -5)) {
                            at(startTime) {
                                teleportSource(pos(0, 0, 0))
                                teleportTarget(pos(0, 0, 100))

                                interpolateTarget {
                                    pos(-100, -2 * (lasers - it), 100) at 4
                                    pos(100, 10, 100) at 8
                                    pos(100, 8 * (lasers - it), 100) at 11
                                    pos(0, 0, 0) at 12.5
                                }
                            }

                            at(15 + startTime) {
                                destroy()
                            }
                        }
                    }
                }

            }
        }
        iteration++
    }
}
