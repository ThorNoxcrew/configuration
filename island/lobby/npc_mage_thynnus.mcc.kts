import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Blue Mage in the underground coven
    playerNPC(
        absoluteVec(123.5, 26.0, 396.5),
        "Thynnus",
        "eyJ0aW1lc3RhbXAiOjE1NzE5MjMxOTI3OTIsInByb2ZpbGVJZCI6ImMxYWYxODI5MDYwZTQ0OGRhNjYwOWRmZGM2OGEzOWE4IiwicHJvZmlsZU5hbWUiOiJCQVJLeDQiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJkZjJkMzAwOTgyODU1Mjc4MTk5OGY5YWY3YTVkMjRjYjUyZGFjZWMyYWYyMzQxY2JlOWMxNDAwYTdlNmE0ZjkifX19",
        "AZax3cMsPDvz5Uk3YQ2IWi2p9euagfzZV9mOFcfVvQYBqnVbLN8rqASa0ANcV6gkWaB2KPCeVDac+KfwV2yog1TK/0a+10j5NBXksif5OiBxGANBZMx1a741aCFiXuNPXaJjEG/Q8plc0tuyoJ5D01V0Bj1y2blPkBmm8KJ5no/Fu7O/V6A0XZL4O6GjEo6E0fFCxvZ+Wwf2eyw6fkDQrxG76dBvedhnbS7nMve4+M6Et+PqboYHTvoKABbrrVcFmUYQoEN3q5J56mtcM16QeMxwNApoB5o3DbHC80caXW7drwRkPUSEJueaduWtoOCFXvnPsDaLsbZrDNTe6ULhMBoCwGnikTS96CeKQQiAx6YhWa/s1X6hBDe8EhMNdvk+x92rqdexpfVuIVuGZyohG2LI0TSYFr3OVt6ZHZ2EZHs4dPcRna7+Tjq94JYpkw3OyCH0/lZ4VJB5zu8FJ7h89osyKEgs6T0ZJWYXTsjMZs1SyR4XcyqvnBD1t1jHhzfzZKPXLR8+xO1Cczi+OAwD2sCAHD2YiDYskWqxGWUBnztMKEJnjDC8OHmsFABA1C8Mf1PGMzCNpW1qmMy6DuPFPqIPIavEWOaghKVvo3MXgeoIEWpcJ53S5SwF3jcrPmpTCipw3KtONhk98adcY4T2Fl5r4LWNCHS1m+l1rIChd98="
    ) {
        rotation(110.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hat.wizard_hat{display:{color:1588950}}")
        mainHand("mcc:island_cosmetics.accessory.wizard_staff{display:{color:1588950}}")
    }
}
