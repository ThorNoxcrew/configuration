import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Stands in front of mic at outdoor concert on right.
    playerNPC(
        absoluteVec(364.7, 33.0, 440.5),
        "Louis",
        "ewogICJ0aW1lc3RhbXAiIDogMTU4OTE2NzUxOTkzMywKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NkNzg0NTZlNzE3NGM1MWVjNDYzYzE1ZDY4Y2FiMTI3Njk1MTZiMDMxMzQ3ZTg2MmE3ZTk1YWQ3NWU3MWQ2MjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "wKaxFd//O4iCZlkDwv5rPNS3A0aH1qoMUcsjPX9kC502KfIOujDZYxWr5DPrd/3pDlcfVvZnqSWOqvXA2buCVnpKtz2RhzcH/EikRIzPGRoxyA8Xe8bGAgLDqOMLhB3mBFaInNDGmhjm17G8oaxkPVoU3mz4uwclPo5omNYYF+COzrYbG5/AK2Ampx6xaTNblAPPftzErBOk6k+ptNu2lezC3rbTLP9MW6G+W8gsTqJ7uKbwXZG0bHhZxWnXXyu42GXxG8k7/KdtX1cJi9K2LTAI8RoA1+zkBLOP5LASD2qgRlbK4c1+ePJRerqbADzoo8bpEUfUrll6P7LiJU/uG0cJwsnMdN5/Twn0JCBrlHAOt+/uam9kH/7uyryYxCxtq+eyiJYfjLqZeFVQc5hUlN3fEE7G9Old1g/0Mr1IlDJezO++St/zYUVV2llGZA5vplVMjh0Zw/aDVcSo76zEGCp3eu3RqcCg3Xpj779qIX9/e7P5CA9jqssl6hgHsaoQH7DNXS4yc9s43G1j4TpDJqcGVUD2ALbKD4l+TH1cboUW5Z619lrnraPkebD4VEFrfi9n0PcaMS6n9ogxWv4tG0WAQKKw1DlAo0zTwX4DeImJQjSmLBH3GvSaVkHB7KYHJ/eeCqRg6YM0/n9+EJy1faIT0F9Lc+wqJU2YaYCatqE="
    ) {
        rotation(90.0, 0.0)

        type("ambient")
    }
}
