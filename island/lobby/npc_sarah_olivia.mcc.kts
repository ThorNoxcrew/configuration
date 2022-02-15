import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// NPC near Blue Bats housing looking out at Henry Lee.
    playerNPC(
        absoluteVec(128.5, 33.0, 669.5),
        "Sarah Olivia",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3MzA4OTYwMiwKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmY2YTlkYzExZDEyZDczZDJhMWVhNjU4YWNhN2QxYmM1YjRhM2E2ZGNhNjlkNzNmMjNiNzU1ZjYxZTRlOTdmOSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "UDdMPos7QMhY6Ic3XNf2/cKxdCafx7tq+0L1H6BiGHa0hLVsGrrtqX19OX2JFbo46QWKYBLyGL5ztJIdQ4TqheCevN+EElXj7mubWDuLzsX5kA/ND8qvLDhqAFw0Dqg2SNJF3MEG5gJehsTe8Et1jsRZjpOXZ/QPjmLlFEKpCFQ8xr55K6zTM0H3BYzuDGuHXxTv4bR8pNFB/oUc+E1+g5MPqrT80guDyRgc6QNOh/QgF0Dx2beQho80d1zGFvc/H/ksRwuO4t9uhqi0b0q8wHWV5hiMd/H7pN2WmqjdE4JXr/7gNGoyleS3jIvcpWP/yTb6idpxyhbYXpANg/3OdiwKoSwTwijXXWCZBO2VQlLezVplTKsNkMdJOXj8RPPea8SL2DmXi8Uu8kCe2jvu9FCQJDjKF69Hm+SM1mCi7AHBQpA4AgGu0As1TOTdncWYJug2Ju/7GQRqbR93wcUZiLSR22mbWDpViqrNVD0hvoC4/bdYPIhBeAR59X0T8406WYTwkYGFJUh2iiiyYocEJXhJqaPqg1yjFZQVaE/H0TRsTkLPVldyuBybTXzKj8fs9KQ1+w8pvqaf9TLoUu9SA/jibB+mGKKh/4Ttx+DlU9Hma/MprJoWezOkKHg+y2+4z7Rghs0nps4ikL8cv4oWxWMFtHatDM92Z2ecvk64E6Y="
    ) {
        rotation(-160.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
        helmet("mcc:island_cosmetics.hair.ponytail{display:{color:16562482}}")
    }
}
