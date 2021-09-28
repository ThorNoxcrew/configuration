import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Pilot standing outside the blimp near HUB
    playerNPC(
        absoluteVec(375.5, 55.0, 520.5),
        "The Blue Baroness",
        "eyJ0aW1lc3RhbXAiOjE1NzE5MDQ3MzQ5ODAsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MxMzBkNDhmNmEzODRhMGQ1ZmE0MTJmYTYwMDEyNDNlNzQwMTk4NjdjM2YwMmE3ZGQwMDNmZDVlMWYzYmM4YWMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
        "lOnD84WRVJVfkyZVPfeAwsY0F3kDDzfUy/KIXw0Xkh8rWvJlU7XS2MS//3I+OamJ1BCGZs+4CMx+RFwEFktz/64p4y8jW3ALyWf2dbs8y+U2hhWfn6/H28m7Lig+jRV6Xxesb8hbIbxLX937myfkDv9nXCy8Rm8GyIKFnsyEwyjsj5xH1+frfY/NoWzkemyF/MPONjxiXnKK1JdQ5i2pMcrSGzFwdJTcpmToFdTJGJ9GMhuYyQFCvToifTuiEVN6bjg0m63Z4GyRhrkJRmSe2JFgUBBIWanxMLaChjRDp3/Z9tCRx//aYcChhoup8U1GH8VpRfBbMyej96Snb5vGFR8mtFbBRLG1SOWrGsrDwphTcKGd3vIC3HTy00Rb8jnaieCTbfnY+DwcX0m4evGwZpXGf91DQcHGitNYO1cyQwn9etVnfyl8aRZJwlmpFFfeYvKJKhI0Ryw72X7IZbV9A/i2xBsReMI2zzRRJlSI7InR+dtC7m/RnxD+8u+iI2XzRRF2MJLmnO+fzpH1yxZaWcCz+Kwc1xszyZecmvylPwAV1SmmGtWxEXBY4srxXH4cRnJ9a1YrXna8uAoZRUoY4mJhiZXjCDT2f0POcCSunu2//71SonmkhqUGgE7ijsgkRpcegTnin2Z2aHfEfrspOpse900o39uaDNsgBS3hwwc="
    ) {
        rotation(180.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
