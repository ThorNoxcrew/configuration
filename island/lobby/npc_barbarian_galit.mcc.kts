import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Barbarian that patrols the cliffs outside the main hub area
    playerNPC(
        absoluteVec(254.5, 81.0, 626.0),
        "Galit",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzMzMzMzU5MCwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjM4NDU5MDJkMzZiNDAxMTUzM2JmZjNjMWNmY2RkYTQ3MmFmZmNhZDFmYjk1MGE3YmU3ZmRhMTg0MWViNThkMSIKICAgIH0KICB9Cn0=",
        "pO9SytfC3dBoQ7+S1dqUeJEiVF4jPqJNrG4FsZzZGrzFYn913tedZKTnQ12kaugsVBBsuHIMCcxYMilab/g2DyOdkDM68VslU7fdXCt+XEDROU30uVoKSzAPnOP7VetPtKpGApSSHqh4sYvGXYf/2BtTQmqbmxq45vm+1CeQicmfQvg5U7JMY7ZKM/u199550tEmekRRdvHVKHjPzTo0pdZIMo2ohtExZ4HWMGeWmBAa7UC/HB87av6dhv42uNFl3ZgJ9VbgkO6ap525wHrbAv3IMYBtrInscUbWcnlMpVci72/kI5RqPMwyL6fkpsbSCwtHLZlHXET6zVm87IuGdIIzWoCA5LG7ZKBp1SOjt6cTQzzw5VKJhabpHkDp9jQaTQ1aVXfzDxRnCsVTuiIopJlwZhxtIkxtlBKZbKcWfTa9NBdCKHxkv1pWoHqqO3qifzCg0C+oHJ/AeWVO4fxPTgXzA4wV6KyX4r5wzJEpjfn+AAZyCz4yhB4Gby1pff1pvQ0yRLboiP4lznZTdKIMOI3KOvK9xymJ7zHiG902Wq9dnDc2iTEd4AJb2enElwQIdbAO4hNzN9VhevHbOHb5H8ZmZ3M7oAbvBwZ66GmijmfrzuTasDoRYAHNddi4nswOZyb7UhsZ90v8IFHxihiVBeHe3SPioTXc3upKWaWMd6M="
    ) {
        rotation(-80.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        val pointList = LinkedList<Transform>()
        pointList += Transform(254.5, 81.0, 626.0)
        pointList += Transform(248.6, 81.0, 619.6)
        pointList += Transform(240.4, 79.0, 615.3)
        pointList += Transform(221.5, 76.0, 615.0)
        pointList += Transform(217.8, 76.0, 619.0)

        patrol(pointList)

        type("ambient")
    }
}
