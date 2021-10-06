import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Fancy man roaming the music store.
    playerNPC(
        absoluteVec(361.5, 32.0, 455.0),
        "Snazzy Man",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMzgyOTc1MjI2MCwKICAicHJvZmlsZUlkIiA6ICI1NDU2NTUxMmJhMzk0NzM1YjQ2YmQyMmE2MDMzYWFiNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQZWRvdmthIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRlMzMzNjBhODcwY2U0YjRiNDU5ZDZmMjQ1ODIxYTBjMzgwZmFiZTAxOTdhOWRiZjUyNzEzMzg3OWJhZWI3ZDAiCiAgICB9CiAgfQp9",
        "STQ285Ry5alrfpcH2vJC+tToyCYkC02ZypVy4L1g94FmvLGqIUfcsJop//gNyZnpN/TMKnk0GSk5D8o4oWia7s2yUBtt1auqPRxpvkE9/7XwoZ1StoKIP99Tqse6PkcT/tmfNCSavpJXjDfLqTRoPeoMPjkIu5NMRDiVc+BgRzHJZFB1kjytmUCGcnTipzXX0ioPsAmzXndP3F8DLiF6pAuAm9uh3X0HEJZX9p61rxrf0Hl45obE6bfxjCZcOZLro3kW+ElPDgaTtYmIqb+1nMwtZivlL2r/1vK7GbGTm5h7cfn+F8w/e3ZA+wt9XLtOrb22TCX5FAEXD98LHq9+XVTE9T1I8ozk2c3PhpmtHgzp2/0BiFX5tRe1n+QulfoetfQMNXhD+sErhlrHiSDn0NV5J8uzTfHBkkRqK8Sp0z3lA/n0Kp7lV2BFHyfpe5z+dt4aJDRXanpYNolgsCG3ilVO7aOtpITPa6i2MYjjF9j0zm/7PNDy9U+NXLQNxShNRaNVVEirn09RZsyDNxzjPAfNCH+YecBvfpVX2v77DXMz6eZ6wboPanXy8IMWMGKdDa2fe7Q29UekdoawNiiocx/LcAUSPokNBpf93U3BhIVwKZtioO0q4XCxzzX/s9dS77Fi1XbPmZSGxpaa+ZyDa4/t94ge8xaX+xJ6Kb1KIBA="
    ) {
        roaming(absoluteVec(362.5, 32.0, 457.5), absoluteVec(360.5, 32.0, 452.0))

        type("ambient")
    }
}
