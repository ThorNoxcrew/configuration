import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Robot walking under scaffolding near Green Gecko housing.
    playerNPC(
        absoluteVec(197.5, 33.0, 712.5),
        "Min Ion",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3MzU3MTg5MSwKICAicHJvZmlsZUlkIiA6ICIwM2E5NjQ5NDA0NzI0MmE2YTQxYjljNGJhM2QwY2E5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcmljZXBwcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNzQxMWQxMWUxMTMwOWVmNDc1ZmRiNzJiZTBkMGY5NTU3MmNkOWFjOGU4MmY0M2RhZjhkODUwY2EwOWRhYjgzIgogICAgfQogIH0KfQ==",
        "LslTplbyJFgM68qlvr8t/kkluFHwSIAS8rnLq0Owtnxc0DkqDkOLTtkxTxi0vOCEVfa5bUUXqMwQ+mxpZH4eXsnzlQsh2VuJ4ppVVAtkRpSEPzQrqI1RiKAA+Sb/zWn7wkNFd0aj4hafSTbMU73xJoz+gcTHAo2ahs/CY7p9N7fD6/t7rl54znJ+afei5zpbtSakFq64GEdSr2boA7gruMMG9Bks1f6K9/Als1zXFZXk590wVe5lqtAaW9MkhvvXTyS/sJdriNjpHZgfie9+6H9AwJuen2ejBjENM2Bj5Wzr0V5/HEGmcm8Isbg74gLNmmkvDXylLm1HnHUdD/kPSdblPs0N+5MHlDjGvPCdvMSrmNq6OdKZ25u1zL8CmSOyXiA1+8LgFXmfrodEmy1RHVwHVyKBjKOLSext8bU43T1dUi0g7iVBL7g0Ulu4z2FZvfmAry2DBn8hmJplD092erjjgMfPdPTy7OAedQsOEJRAxShN5ZllVgGrB5jRnxSvUs4ltHlGQhN/6Do0o5KqmRxTDv1fIKY1WLjMu1bJ2VzQ/IJqO8Mh9an9e8bZhWvnZnYns5ZpqSqRYqvj8u6Cvjg8F8woveKBW6+GVGJk6gu2OlBt8d4HtpaesHt+iBRXGfmXvpBWuF6KBSOR6u9MhJz2F4EP57PSALp/PohSnlE="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(197.5, 33.0, 712.5)
        pointList += Transform(197.5, 33.0, 720.5)

        patrol(pointList)

        type("ambient")
    }
}
