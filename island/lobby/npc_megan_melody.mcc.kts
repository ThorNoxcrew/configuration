import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Girl roaming in the far back of hub in the wooded area near honey trees.
    playerNPC(
        absoluteVec(112.0, 32.5, 516.0),
        "Megan",
        "eyJ0aW1lc3RhbXAiOjE1ODA5Njc1NTQzOTIsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ZWVjNjhiMDMwNDg4MWQ3Yzc3MTA3ZWE3MzI5M2U4MGJlNDkyMTA2ZTY5YzMzZTAwZjJlMDU2ZTU0ZTMyNjZkIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
        "ko33BBcLe8Vxt7qAPqyfnNBBBBBpuMqLLbdglEya61FaLocEbuCgPasUijtvRiik+GkfdQyVe6WOLQ17PY0LNwm56BElQHVBjRRrfMW6CzPl6U0EVTAa/hxCQsPfQWMuEpafXuoy6Qnn0TOY3IRVeIvsjFm+GBNNr3ns1IxmLc2wETiNAjJFWR9pc3ackLdyHF4n6Ko4IRRy7EDZq2zQGbKKckUpy7usgRZq8R20gZZ0A9zA3ncIk1D4bLOXHX9rio6UEukIayAwKkYuUt0O+QP8CdNmr1/iNJdOSzwZVCsalCMpTIDVgSVylku1B2cdFka9dycQQVY92UjtVdACdXXPJ15DUj6kLmpg5pcLsRtvOSRBkzDxlwlGj4zNPyCFfcZwm63bttRCfe0lGyMrDo3BjEMSc7vngEsT0zvtmQGsP2G8UXTZjIm7l7ylVmW8mWs3uJbRYhfKJ2iOY67ot5S0kHggtcFnE3F9uCRn5L+obzySBXs5LHcaSqa+0k96rIESqexVdc2/DetbCJR+0IbQAjue2oKJrFck05Cu3IcLx9EhtAZjyzVw7vBxSJGcLiGygqWW3CZEBqzR/FXgm86nBCeX3qiZuRUvoAmmgs8oEbOF3WDCaNjNpqkWz1AYpUe07EThkoj2m1mwDXSlXToq2h2IATR+pseNRVPEM+s="
    ) {
        roaming(absoluteVec(117.5, 33.0, 523.0), absoluteVec(110.0, 33.0, 505.5))

        type("ambient")
    }
}
