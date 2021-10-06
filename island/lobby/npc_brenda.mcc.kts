import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Woman listening to outdoor concert and talking to Kyle.
    playerNPC(
        absoluteVec(359.4, 32.0, 443.5),
        "Brenda Vendetta",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxMjMzNTQwNjkwNywKICAicHJvZmlsZUlkIiA6ICIxNzhmMTJkYWMzNTQ0ZjRhYjExNzkyZDc1MDkzY2JmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaWxlbnRkZXRydWN0aW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkxZTEwZTRjMGMzMDBjNTE2MWIyOGMzMGQ0NGVhMzgyYTBmYjIwYmMwMzU3NmZlYjQ0NjVhMmM2ZGNiYmNkZGYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "ESBZcs7DQN43tii3VOsxwlh4T4sygB74Xj+4bC3F7Wk6/ZiVb2Fq9Sd4LjYQQMN+2Wo+H8nHmBbt1Qvdp41PeWbcOeHftUoDwj5Y4886MT6YvEOyU5cg2QZzbRtnmp5MMWmglBop87qDucWKJswKadoXKkMr35J8jSwwRG9NX9deemznKYREVKgW1pPSNLxq86QWJZYI9VfDvhjvJaKci5nI3yZW9mqowMbQ1G/TWc5ZAImyqgcl5tGzsFXmXfApc619hNQfWPPMhC0C2RyXTnmPLOEE44gOzXc2zNR9SxCk7NFvy6VTbivmvIiEdWGyIbGW2XWjrJn7gy/bSoaVOhAmW8Ib9qSAp/XiOHgykf4uEOZYOlyk7xCfD0sIemZHon/xy8YyOY5kXAXXCTXG2X7/d95HGBDq3IBuz2AHROXBMNtBO8KoMhqqhkrfev37Wd9MAX7OXvAGznIKDmZ/zBQhnUyvCweFiTChirtl2YQwQbaIXzIUkFJxgzTHV20nwCbKrHsPFCTwNt0pfvd27TZSlBYbRuhqXkZ9myZbEhgzI4Qn+llhTXOlX9OhTqUeLCN3WVU/jCwmfhL1kMgXijLPsbo83oor1KTpgiBE67BVub0ZHoV/naCKROtQmGUdIh89Y7EIGGzhccHwUK2urC+tCRZuwMzLcU9yqxaWbPs="
    ) {
        rotation(70.0, 0.0)

        type("ambient")
    }
}
