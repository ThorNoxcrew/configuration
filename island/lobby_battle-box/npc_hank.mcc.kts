import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

    // Roams next to Brawler Dean in a sort of mock-duel. Named after Venture Bros characters.
    playerNPC(
        absoluteVec(1312.0, 31.0, 104.0),
        "Brawler Hank",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNDEzMzk5MjEyNiwKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ZWJhNjU5MDc2YmMxNjFkMzVhMGJkZWRmMjEyNWY3YTViZDhkODAzNTNkMjQwOWY4Nzk3OTYxY2NmZmQ4YzVlIgogICAgfQogIH0KfQ==",
        "HZ8lTS4zQoCb7PHZKNWsowXE9rIZN1bm2If8e6/y9XlkzdKHgcNMwFsklpeBKwowWR4gKubkBkF8G4Dhm3fKhj4z5Qp9s2VdIks1wTN7QG1CyUHVA3mKeo7K5DGJqsxZAaexdX/pZ9A8kT+sGQ5xmOnrQAtZss3qKGvxs17uKKXz8VSKuzBI24tLTQDWwqHHVB1up9HdhHvatskFmb99RnTtrZWx4tRyGhw2ap9qfsU164u03DNIMcyi/Ato83sJkkBfFM78DrbDHy2nN+MpVyMUjIRZ42/iTtMUMMbcATWge2VU3vIbbmQGYjx8bIWrThT2ibVnw0bBQGPn6nUEreFDD7XGQ6B+KxCoE8rq4aDj6NNtlqtSHsbSJbBF67eWYQw+ltRqNXJLPTe4MkUau0wX1tHUvKoDsAZCC+TkMj04EgFQmzG9dy+gs8d8CCR3B42FQtoxcPsuI6RaOAc00bo8MuKGTqIaKFH4RjkhGNqqTSl25ZtqDqK9FGmebJuLgk3Rz2E+KqRuolTjH1G5akcNV12bZWcXPA4UpLdV+DSqVEEXRDI/4DjO7UuRck56n6NpICALMPUiFyCoKEMVKZZSFXm0PS4K3F5d6xIl5FfMrJ3lZ/ffH/e83fPwaqTvz/0Iid1u244mpks3tNKBueKqDf+de+NJWjSPp9SNEH0="
    ) {
        rotation(180.0, 0.0)
        roaming(absoluteVec(1315.0, 31.0, 103.0), absoluteVec(1306.0, 31.0, 108.0))
        type("ambient")
        mainHand("minecraft:wooden_sword")
    }
}
