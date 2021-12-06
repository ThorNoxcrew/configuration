import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Post Officer second in line for hot dogs at the vendor
    playerNPC(
        absoluteVec(319.5, 35.0, 493.0),
        "Yi Min Shuai",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyODIyMDA3ODQzOSwKICAicHJvZmlsZUlkIiA6ICIxNzhmMTJkYWMzNTQ0ZjRhYjExNzkyZDc1MDkzY2JmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaWxlbnRkZXRydWN0aW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M1OTJkMTkzNWIzODRjYjRiNDQwNmY3ZTRlZDJkZDA0ZDJkMDE4NDM4YzI0YTc0ZTI1MzAzOTFkMmIzNDhmZDIiCiAgICB9CiAgfQp9",
        "NCixuYdmjNB2DxcQO9sW8UgeuNsvocw5O0qHNMye2W1mGTVaZPsOoCnHENsm1mgqQttpXx6FevGW0hZPZV2uRblBXLsyMZJOavUB6EQiaJ2ptKUeXGKKefNFo+3BYTutgjKKdVx7iOzjMuzFZQ9YMRF9x24p89M1dC94FklBzejGwHFAREgMAAolgNPXEzEdCDNX6EMFRlwNrgSkcvzIsMwyRDGyrHr3xIDkfZKmQxmUkwktiphUwLGXpOX5q8jbtXwkL9SnvreG1nfNn23TFvOmksItbwqQTsFHO6qRWjeMC0S2i7uB3JmhYGsRa0AeEwOPcW6etHWguER+8NlBkJ0yIly6EvbUufmLE6+kGCPdLPmzIWm00bue/77Bh2RDQb2gmOp+TEh+rMKjxGNmmp3Zz/w5JSrs/cDOcKYMjH/8xuyfCpi298LRo3SNgCJRPH5xvAwfDE94eIPzeVHAzClJaRak86yNiVKLaXp3xV0No4ZYC8n/DOd174QV6myZfITrK4KvhT6QwfHfnZ8tG75w5/XXcVOdRqYR5Rkq/KnAeFT0DMsT95serpDlj6Be6GsdxNIEHJPBFox2/Z1QkAb9JKX+/PZPRFFzSHy1l8HYFce02xxqX5bURKM7YdMjSvDVblOwf/6REv6zy9uZfgzgG6y3Bw5kz5sy7Q4VpVw="
    ) {
        rotation(-130.0, 0.0)

        type("ambient")
        mainHand("mcc:island_cosmetics.accessory.hot_dog")
    }
}
