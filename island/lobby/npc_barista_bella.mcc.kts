import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// A barista on the top floor of the drink shop looking out at the diner.
    playerNPC(
        absoluteVec(303.0, 36.0, 431.8),
        "Bella",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjg0MjkzMzU0MSwKICAicHJvZmlsZUlkIiA6ICIzM2ViZDMyYmIzMzk0YWQ5YWM2NzBjOTZjNTQ5YmE3ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYW5ub0JhbmFubm9YRCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYjM0YWJhMTkzMGM1M2ZmNTY4ZDQ3Zjc3YWRlNWFjN2MzZmYyOGNlYTE0MzI3MzY3MTA2NWRhMWUzNWIyZTM0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "bkvQB7dCEyzLzeUFM+g35qAMzpfNVP1+UmcmmYBhin2DtlaiILX/Fazz0FDvIwGCB9h4mVqKdW+0YYcMhe+RCrMM70fbgSIwlzFYACEqeUkMSsMRplnMrZ+7YPoRUO/OR3M0sle84CnbQvg4j+0CfogmveC0e9f3nv9tKjs0BujsSa5ytEuL6uCEFZHT0omnoiSIQNYtApoJbFO48NUJXvMC+cq4yNeF4FvLbex7ClJgCl4lvCPcjRnI2b/NYuQeLbxBVR+14mhLcwDXOyvBu6p8RlQOYHqJkJ3FbppvXFyKTAoz5T2H99Lnc0BSoaCleq26mpCJrYOsVg7+qJJGno8GLtZWzhWa8g3hz23+pNYTqecdBVaXJKs/vt9DaVjOTUcDHWVgDtwTUZnlDSEMbtu8XNML4cPVyYCjnBL+5BcCZ/UlIEfKE/fgkVglj0fTw7yObFynXbSzqPW/5jpWbMMvkY3XCCXRtfm7tN3BmJVUk2mHHq8T/IWKAS6QpRytShRmo4OPc7rcNI4MpX+/bkf4TPtoSWIpQdwiJ9kgI3KvwIPHdO370vXI9XgZKhFj7Bd7ibRTscT92eNYYEYAFLomvbKPlkgMgFHVPOPsxc3dAvRdGqvILmkShX3qObY0Szef/h/dA38gqLQmiDUJHnJP7fRCtrxpCqj7GaEGcAc="
    ) {
        rotation(180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
