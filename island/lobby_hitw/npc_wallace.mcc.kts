import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // NPC looking at bottom of HITW factory from main floor
    playerNPC(
        absoluteVec(-234.0, 34.0, -781.0),
        "Tester Wallace",
        "ewogICJ0aW1lc3RhbXAiIDogMTYwNDA2MDIwOTc5MCwKICAicHJvZmlsZUlkIiA6ICJiZWNkZGIyOGEyYzg0OWI0YTliMDkyMmE1ODA1MTQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdFR2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmZjk0Y2I0MGE4OWI2YzMwMTQxMGMxMDc4ZDE5MzU0NmRhMDk2NWJiN2Q4NzQ5MWExN2QyYjA2ZWQ2ZDE1ZTAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "CjRJG36i2H/Chdh4I/gpoP5XEh9P87D+OgJ99oas/8YUBzs/2vuzT/Ac4D6lNNVTFU9pdaBSoNhsz23mnGs7pPJOE6xfSfaK4dOQSOW2YuCw9G0s37rpD+tej1jLSQd2q6B1kQxRBFifU3FjoLcUEAwBvwSA0iASdUjIO6/NK9qzN6Gx+BlFBrcnwOGvqfqK24kBPiZLkVb18ypmpFoaHOpW0tfL+tox4Z2zMhH5/168OAN8+X1P950o/tCBeiKGlkuIMgSKc+3jxWAAwrFuEqbscowH/tsq27GadmjBFsNG7EczbIZ6dZZfVdmHrPJFBpW7K1hoAeWP/52K3djsSgjUJh0If5dKDbIWouKMdJJJo7w+ksdLCuUF0EUpIAQZ8GYAadjeaQ27YuXCKKSpPrDVG163cuIeL8mRVed/lnN3x2XDmqNfUXyESvsSNE1+Emve4BKIVdao7m4KDbpYKz9Cz/QCOI6IsDu9I/r5SSRfnaLOGx8BznoeXtt8OW7qgo8FLDT5iezOq3ZAMtWYCt63pWK6KHGGLahbGdOmsU7Z06fiwj1gkEgMGY3NvkaEGoeGk9pqJQ2fM4JTjddyU6DIdCXajmn7EwNCZv6oOx+szfJ3pX4yVMZZyKf3vvNmNbFWYSTZNZUY4vsjJ6rJiZzVVfk5VrRjiNFlyjaRJiw="
    ) {
        rotation(180.0, 30.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
