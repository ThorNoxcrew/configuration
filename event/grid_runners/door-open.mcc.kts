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
                    AAA
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
                    AAA
                    AAA
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
                    AAA
                    AAA
                    AAA
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
                    AAA
                    AAA
                    AAA
                    AAA
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
                    AAA
                    AAA
                    AAA
                    AAA
                    AAA
                """.trimIndent())
        }
    }

    translated(0, 4, 1) {
        rotatedX(90) {
            rotatedZ(90) {
                first()
                second()
                third()
                fourth()
                fifth()
                sixth()
            }
        }
    }
}
