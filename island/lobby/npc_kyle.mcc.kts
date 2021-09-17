import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Man listening to outdoor concert and talking to Brenda.
    playerNPC(
        absoluteVec(358.5, 32.0, 444.4),
        "Kyle",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjMwOTYzOTEzNCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I5YzFkNmNjN2UyZGFiODMyMjViMzMxYjU0ZWY2NGRkNjllYmU4MTY3YmQzYzVlOGExNGZjYmRhMGZlZjQ3YzYiCiAgICB9CiAgfQp9",
        "ZHmtpBfVOsuscPjvuZ9OCypNMkrjcZGTtnRBBXPBmlKmVCpeqnp07s0qrIeAP45Md2ihjHcmdPxoU553wunMZtytIJmuIOrWVYRtjywQ/R42RnV/8zfYceFn7MPqgzJc5kkeQpSxt1KHabEELYZZ92yoI++f0LupJimYY8mwpSM4QN09ALkQAQvXK98/1/qNJjsW6Foyrc85fEhWD+G77ECu+x7yK6GKiw35sPNoFmOV6dagAI5TJXS+YKUu+8JiG0qc/HtevGqa6/3tIQxXilogVXQ24FgG7RLz3ZqW96kLpmpp0RjGHAazFatSUSwE3sOg2pMiptnLybopeTUcdOlT9+pWErmamJRVT21YHneP7xYCU8qbrHztpl8SKFwCe8dIpf9n1XVs3txij2N/nXcg7ieb3RmeVBxeHrx7mFRUj29L+NaE6XpmgTpUIgsyXgD+vY8p1XPIJEKLiprcsGFyHtoGxz/my5KgbEZ7PE4LxozFXyw9gEftfFSu9VUo2eWZy7Ot5Yp1XElFFpAeiQTdMG3ffzSitZLinWIatGfKEjLGdTlgPeNKJzd16nmI5OT6o8PHDYB6ktSBMyR7fBgDjOOkJXg8jQaDlF7rOXzcszftbcs9Y0M0+Xswqr/vrQzPh6oBOrWKSdpGMX7RDQYhmLjEcRi7ZPg7a1lgLkw="
    ) {
        rotation(-150.0, 0.0)

        type("ambient")
    }
}
