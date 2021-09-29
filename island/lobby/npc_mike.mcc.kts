import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// NPC roaming outside of Player Apartment building
    playerNPC(
        absoluteVec(275.5, 41.0, 521.0),
        "Business Mike",
        "ewogICJ0aW1lc3RhbXAiIDogMTYxNTgyNzg0NzU2MSwKICAicHJvZmlsZUlkIiA6ICI3ODc0OTU4NzQ5Y2Q0NzBiYjEyYTY2NmNkZTVkODVmMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYW50cmlYeEQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2QxMDA2ZWNjNDZjMDE0NmQ4NDkzYTliNGEyMjZmMjA2ZDc1YjhhMjdmMjQzNTYzZDQ1ZjZkMWIzMGYyZTY4IgogICAgfQogIH0KfQ==",
        "sdFlOaXUcB8nmQZW9F6wSaJWBNHmBpRnxl6HnQ5CeRGHx8WPzLE63O1dJQcAnePUsMZ1XkurSv1JFyk83ucxLkAm+1qPIVFFc1QGi4+AFZ2Fu1q3o3PmqWstwhP8tDIH+9KKa38SqiTT8LQicHbOh6BCW41JnPjps0IgertzjiEv/xx2PAdHtNHSHMfh6TjGGoOrImHYE+E9HbYoAfwv35nIB71Z9t1NBr6a1KKpL2Q5MJkEoioCcoffKCSVfJC9Sy8/niDKLBXDznC16xY385CxDIljlpHvRV2qV23lbI+Kgs4+jCjaXkVkodv1AxjWsqY/pGOZyiMWWsOdGFKzBVzQkowyw93xvoPFLWXMP4mGbJKY/tBUEuhKXKMcf5rJ6swQWBHgQr1Rin5uLghki+NtpamVk+E6wsknvFn767O0+U8JVSamn4Iu976xy4e9zn6GOHvffbMMv4+qRctSFseyU1S7+LepDJaqn8g9qHLUN9oSTETD+gsEkpCDFTjBCqkW5EY5KrdC+Geagxi9Z6VdIxF6QUMwNwycRzJ1ovBW22timY4VEEPMFya/PUBYgaWan5Yv8jDOW6JU5Km9DzKtoI04ZSCC4bTji2kA0HZFvbzJHTRyzaumnwViJY7vXvBo341hFVjWsvahpy8d0/Dkn+jBMTBrkWSrzqMt+hA="
    ) {
        roaming(absoluteVec(279.5, 41.0, 525.5), absoluteVec(275.0, 42.0, 517.0))

        type("ambient")
    }
}
