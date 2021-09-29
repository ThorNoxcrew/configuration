import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Biker girl roaming around flower shop left of HUB.
    playerNPC(
        absoluteVec(350.0, 37.0, 598.0),
        "Bubblegum",
        "eyJ0aW1lc3RhbXAiOjE1NzM5ODA5MDE1NDksInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZTE5N2ZmYzI5NDU3Mzk1OWI0Y2NkMjVjOGY5Yzg3Njc4OWM4YTVjNjg3YTljM2ViNGJhZGI2MjA1OWYyYjdmIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
        "YcfgX1Du5ba3SXS/aE4pn4Y4IdhpPGNZV4oB0QAn4+1uT/aeavJV0A52ARMEwQ5iJzwojlye2KOpZrEOI6B1GSV9fut3lmdLfloUNXV7QMfkfhL8PBfxaKZA8MzlX6aTIi5B+O4NIiSPFved4BjaHfWgkXxqRJhLcG8RFTTaHF4cJ2PWPW0eke4l3cQIhpsuFd1Tgr3mHEHfHgmQdtSvEDwnsUoY8e/FBaFHzrIkBAwQ5iyeUnCse5iLWMq2e+nn/+rzqUGF/hmUMnmvlB3MMkBmrOYj2WU3N16+nu+mtrqpMf19ulunwHIWk3TeJ3GmpnBg+q3zk23oC9DFlSNLIBmhTYCvaYo9On/8nlR2a5I5uatcncaRygjsN2GT3m705r6ntSadmpLmX0nm1YQv6DGYeevE2EMPSOjEyOGMxQn8ciQjGjjRC+FFIyKtmknyc32MtlWNTDAWnT/QQgocJOZr3Fm5x4Cp5NTdXaI1HClOkKpXurf1x8dLyb+SfkpVQGgJfpjWMGyHbihxmIqIQ8ABtkW/YC5HqXC2J8hTOzOQdhk02iC8zst1mSRdDlpCFhr/lXvsSW0njOhsW3lRUTYVH0uamDSPrjp1Dbc+esHL86ezoGRFD3lN5PKrcmLS969WTguB6TmtElbZ7rhBXiPSbnMNFUTHtjiauF5F3BY="
    ) {
        roaming(absoluteVec(352.0, 37.0, 595.3.0), absoluteVec(345.0, 37.0, 593.5))

        type("ambient")
    }
}
