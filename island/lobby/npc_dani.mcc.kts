import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Police Officer roaming outside right of hub near Bank.
    playerNPC(
        absoluteVec(327.2, 35.0, 455.0),
        "Officer Dani",
        "eyJ0aW1lc3RhbXAiOjE1NzA5ODY5MzU4OTYsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VjNmQ4ZTNmMWVmZWZjODg4NDVkMWZkN2E1YzcxYjViYjMyMzg0NTg2NjE5NzhmMzdjYThkYjhkOWVhMzNlNGQiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
        "OzL+cTimw2CKEFuWhuINf+UelSnzuvG2O4LdgFomG3ZMWvePfVT1jwe22riG/eJlCCVgb1kXrJHXt06P0whaob45ANx/cRknmuxKzgCpRsvq5GKq5O2GKjNnfw1Rz0CXc8ebU6E2FqOYod9CaE9bdz8lMCnYnUAPthpAV24f4+87gL9IBvhJMS1zFNrZF6S4tT6ByKZS1S1tc5HNBLgZbAkcFEY6iyHspwxxKAMwSxnOyFhV7DSfbgCWl0n7/DG19JaeROOUi9wzSgDTEgDDuM44DTYEMh9yHjYSRrx+gEeszDg+wkWc7jV1GKxi1T2fmqUMDqzpRuqGkK7AfBQkU7Rt13oR9zTEcN43B7Ui3BcA8iF/3JsXP7nXD7mkbcH7xl6q1yyEJ0y4QK9cUJSqVjWRFnGR6mmppVTL4fGiMLe5Evjzl7o7tzEAs5RuwWVLxVlyeE/6xnkyw5zB/2fFQ/LZRYivWqAfDJ3PyA48vuCR+k6ByHXdQjVvjDcPBp/xLWVmr8UQyiOO9BGyMT//+jpfmDqCgp7PbVL+VSopfLgGDpraTumF8Jm20RyuzXyuXvhXoU/FJ5reHd6SNEPtbTSibiv+cyP2bT0VE71DH4bgoE9cZeYIWKgPssJZQcygMZ3p7P4lIPcKYWJrW7kUWHcHEJdZLkB8Egjxh/uHUeE="
    ) {
        roaming(absoluteVec(327.2, 35.0, 455.0), absoluteVec(319.0, 35.0, 450.0))

        type("ambient")
    }
}
