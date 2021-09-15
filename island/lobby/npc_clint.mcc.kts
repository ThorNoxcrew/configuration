import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Diner singer.
    playerNPC(
        absoluteVec(311.9, 33.0, 393.2),
        "Clint",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMDk1ODI5ODI5MSwKICAicHJvZmlsZUlkIiA6ICIzM2ViZDMyYmIzMzk0YWQ5YWM2NzBjOTZjNTQ5YmE3ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYW5ub0JhbmFubm9YRCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YWEyNGU5YmY4MzYyMDhiNDMyMWFmMzMwODU2ZDMyNmRhNWU1MGZkNmZhYTRkZDU0ZDVjOGVkZDFkYTZjZWE2IgogICAgfQogIH0KfQ==",
        "eAqHJE4cziBEeTSxe0UFy1nDoKxE9dc4hXapPU7rxAmf2Pu9CdbcFh8AeCwMJg+bgWHWZjH5Uw5s5RaCez6gjL51Zjz8O/cbe0NQChHGXixmj5KvdhApT9K3Eh4x7UHGZC2LB6/X6DKiaBA7scPvuq7xw41sfPJLvcLNhx4f3dMWzMz7Gugc7WrDiBxrZXR1A6Pl1KYRwkSZnANjU1Hhe6Ql0+SA4exELnyoQ3ziD6QvYGbbjTG2zNVoJ5b05FpRkN35bNAukDdsFghiJfa5i5I6PDHIjP2/fu5jfb9eNjdlsFlt6c5OFIDKjpbAgYkpEJ4A+I8w1DRUe+aNomERCKPpxxzX/gMGe8Cwl4+2uAz4J7JUhJ4s7DIBBsblUOnf3eodPCIxwremYwfi+8K/h29ex7eiwg5hi1/nCvV67VTTlsS9fV6rGuooLeZ0blZVoINcvl/aXVochlu80ysmCLjBYeTgZztXgUTWvD2Hur3ypkVt6ILxvb4u4k6JQarae84t2OTqLldiY6XmfWEG+P2vJXsuR+M+ydlQmT0OpqmpP0LaTSflTJFZG2jwxUHcN0+0Pb2bymTd8045PUxPVOQK/VdwNTWXFcNIKvezEusmqUJ/BGbeVWXnaVagNtggiPZDJfHnlQLk9H5y411o1Wxg84b5oAk8ohYSkj0Tk+c="
    ) {
        rotation(-155.0, 0.0)

        type("ambient")
    }
}
