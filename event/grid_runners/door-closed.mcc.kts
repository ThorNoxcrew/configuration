mccScript {
    fun RelativeScript.palette() =
        mapOf(
            'B' to Material.BARRIER.createBlockData(),
            'W' to Material.WHITE_WOOL.createBlockData(),
            'R' to Material.RED_WOOL.createBlockData(),
            'A' to Material.AIR.createBlockData())

    suspend fun RelativeScript.first() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    RRR
                    RWR
                    WWW
                    WWW
                    WWW
                """.trimIndent())
        }
    }

    suspend fun RelativeScript.second() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    RRR
                    RWR
                    WWW
                    WWW
                    BBB
                """.trimIndent())
        }
    }

    suspend fun RelativeScript.third() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    RRR
                    RWR
                    WWW
                    BBB
                    BBB
                """.trimIndent())
        }
    }

    suspend fun RelativeScript.fourth() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    RRR
                    RWR
                    BBB
                    BBB
                    BBB
                """.trimIndent())
        }
    }

    suspend fun RelativeScript.fifth() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    RRR
                    BBB
                    BBB
                    BBB
                    BBB
                """.trimIndent())
        }
    }

    suspend fun RelativeScript.sixth() {
        batchBlocks(duration = 200) {
            restore = false
            drawY(
                palette = palette(),
                canvas =
                    """
                    BBB
                    BBB
                    BBB
                    BBB
                    BBB
                """.trimIndent())
        }
    }

    translated(0, 4, 1) {
        rotatedX(90) {
            rotatedZ(90) {
                sixth()
                fifth()
                fourth()
                third()
                second()
                first()
            }
        }
    }
}
