import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Grabage woman roaming construction yard left of hub.
    playerNPC(
        absoluteVec(405.0, 34.0, 627.0),
        "Witt",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjg0NTQ0Njk0NywKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwZGYxNGI3ZmUxNmQ2ZDhkZWQyZWE0ZWVkMDI0ZTc0ZjEzN2FjNzg2Yzk1NTI0ZmU5NDYxNDc2YWJiNzU0NzQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "a5VGi7KAyIdIclQs4VW3QSefvH2ZuV5BPWXYKYW7BJALrBtqbeuZpOfs3i8BW8YjZJbdqOEFOY6lJQLw62mu2oRYJuhhyCP+SCt1ZodtxRq+TwNmANO84VrBuuLkLLkOTh3uBI3cDFH5TgNb8+aeiLvjHKYcFLXN9TOMe7DVbb56IiSPkiriStnihgW70wKc0ZygoJ0gkL0RGpxxhD05CD3CQJOyqH5C9eYm3NbBp77pGIUifA6B8/do2qP1VrQ0tzXmXG1IM/KF4NIStXXWTKhTVI8/y/UrzSPWLaYqsiwRdJX2zVe806CzKcSmoSvQb+sMYSRhV8SWM02z1jSHqU89hnxDcMfrVnZt6XB1qkIvcXavXf+d489458Ncf7rsv1M4cMeARCwbLCyh7UC4zwTiaZZg+mYfAuzBXRrB1cZBONzXqKrVt4zDBlTZozru7cLB02e0D6oBZwxUnxee8YKQujh93v62BW5V9ZOkTeOQefgJSAHtmEVEdYzoPGQ/d71ylvmOEY+4xNl57G9dHitBVvlufvR3mM+/R6eaUpnjT+PfWq+NkJv+D2hjBgyayX9JQwPTa6XDJPzxz5JVZ/RM8fIxjme2mWECdGuyhSko4+6NfZL4kMweGIsA/aUmTL9a4JfHg809HdzxlkvRnb18WP768Uo9UHORN0kvnzk="
    ) {
        roaming(absoluteVec(409.0, 34.0, 628.0), absoluteVec(398.0, 34.0, 626.0))

        type("ambient")
    }
}
