import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Officer on block corner talking to officer mark.
    playerNPC(
        absoluteVec(346.4, 34.0, 494.2),
        "Officer Miles",
        "ewogICJ0aW1lc3RhbXAiIDogMTY0Njk2MTE3NzIzMSwKICAicHJvZmlsZUlkIiA6ICIxMGYwY2YzYTBhYzI0ZTUzYTliYzQ5NmNkMGFhYWE5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGcmFhbmNpc2NvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RhOGY2YWRmNDYzMWE1OTc3YmQ2YzdjOTQ3YzU2M2FmZWNhYTg3NzgwNDRiY2FlZDFiZTk1YmQzOTJhNGI1ZTMiCiAgICB9CiAgfQp9",
        "d/9iHVJUCIcTc+vbb1I9+GYsyVEzG2TqL2cKn0Cl6aewsdddh3GzIJytD8Et/9bOt2ECuaYx3s1yOjYftdLTGN5juHj4GnA4gaWjxRWqz8ckjrSRSqJYui+lF8vctNZ6z3P8SwBwJwd/92pOLDpL9FrM+/dyWtcTGZhjPOPIIh4wGFH9mzvydt5Yae5eGRBGEetuaBTOrEKKzpQ570YtO3BMWMx5oxUGUEOkzZ1VHun3zSWOzkuOGTNerFk0klyTb7P2g8AaAlmaeVr4V8rN1/uHJGEktlRL88Y1FN6/0HIYBksuoVbtwC09F8ovxokTBg3o2ylO/D7pEdYSdv37g9ssTduh3hKTPLhQNmBBBugHLVoI8C1r6gIyleO6SvbYqAllQN0NxGXYY7kHtSo9rkyW+fo8ZQvflDBd/+qYUDWmbDn1hYq2g3nFGpvqDYaEgA2EZlnMR9imOVVAC++oWl4g35Ed1hjx6H56pjUl+pDBMAjryQ74asneVMW1814Kqsayx4oywCHkGEJNqPxI/2KxcQ31a1cHn2D0HapMDc7HOaiDc7L81kreFSAlHlZ4rwrd4yjNUG7l3Q689X2Ui8njJHnbFXeiVMXwXMuKZXXdZhfO7jRxsvUsOeC4lfrx6H7E4hf1a8/t/c1Pc2tg0JvGwW+CqnRyLInhQ/nzMcE="
    ) {
        rotation(-135.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.police_cap")
    }
}
