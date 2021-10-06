import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Store worker on front right of island.
    playerNPC(
        absoluteVec(372.0, 36.0, 435.5),
        "Francine Rista",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyOTE0NDkwNTE1NSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEzNWJmYzhlNTYxMWVjOGVlYTNjN2QxZGNhZDU2YTdkYzJiZTM2YTQ4NzJiM2NkOGRlZjU0OGY0M2NkNWJiN2YiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "CTfZyGhz3Lp3XL6XAxC7jtLO1A0E5tH6J3TDOToOf2a8a0aUcYVtPzfoRx449aXeOqjQkyg3WOoZzPudgL3ceOKG9hn0P5yzmaDGpyY7RGcDJWxXh3Ilbs3aRspu2DBrsg0rMzCLirWfpSuS2ZwuGuZT1RepZmNFkSSCsqXEJCP9pbmP9HQXgWwoFs1Sz8EuwVSeBKT+F6fTQQ+1jL+2ZGqTyh1JfkUA7GwK1SDNkVT+wqORLjX7eGfY6yJtUSczfjwlU5mmPZmxUE8vFozoCUBgG21nRx5v+Osmu2gwiWMC20+vVgZJxnuVr75hvbNDD/gB/oh52i/fvcpWzWmUrx8z8vCGTFZZ2IzGALleb9gwV8NxBml2HG7LrxuoRruDQd6yblFdaC8T9uuByriNStHAvPGmiRJ7vt6eo+m81R6iJ2sDBYLaJjkRxl1MUFxdeF2XLck5gq0/6YZc/Pk8OJe0C2wtvG3b/+6zfA1LxC9Y4u4YSMgXhRIONol25kihnLxVOvgBI3ZvpG1gkYSbloan3ah/aAvJkclVgGF/wkgZQqlUzmnw49VyAvoc1TBDq3OTsTqZ4jscLkITtYCMX+xC6bllVUpNO8DUvE9PW8nOhGSi4XWxri61dRTQw754T7tBrF/xhaO5MQyvJe/Oi1epvFaYwQ3V7Z512XydKKk="
    ) {
        rotation(-120.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
