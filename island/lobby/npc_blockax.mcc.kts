import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Definitely not the Lorax walking among trees in a cliffside just behing the main hub circle near a waterfall.
    playerNPC(
        absoluteVec(165.5, 28.0, 729.0),
        "The Blockax",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMDkyNTQ4Nzk0OSwKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MmUyZjBhZGNlZGNjMzAwNTI5MGQ0YzlkOTBlMjNjMzg0MjEzNDllMGRjODk4NmE5MDQ5NTU2Nzg5Y2Q4NzY5IgogICAgfQogIH0KfQ==",
        "ioLKG59eryyl70Hxh9LimO3wtyRVM5wu+M9C1zKvA/tnlm0Ivb0e93Ofb+3nCrz4eaM68RuRN8frRHnYZPOrN9TqSJJHh+myLIxQDvgAtLMGeUd0dolwn/4j4ldpKaOoSXcki+UpqdCwY5WYEjIOwRfoZGsUXVa6uhcPi6BsQkZB2n8EY4cKe4xA49NT2muukbuih9kQg+ZMMnFUfGCpdZDLnUL/iEHgVp2/DSHvpjt7kMvonsWdWYRnXaDSkbqGkX8AapPkHf0YbTYKbkMT4XE2UDmGmEJo06+gSwDNOM38RxRiI6mui8p2a/4xLc4FY8lCOIXzJMcWgTXtKbJzB9VGsfyUdvR5RtwjYmJxGYkKdlxPEZZWYSa6U1c7CErxQITEVmDKImwTP1t+fhP3MxEoO+Wy9Nfb63I52gjXH1HUIxvhXiosIir2miod+0P5nHAm5AbL45ISF6fFiC3DqsUC2AcW/13w5ri/y2OekisVBqmgJesk5YiUhdr7fIxguXmSG09C/pJePG7i+lTJmADzRoADcJhoCeq10MvT+zjCi7aRhaOHIfj3jPExYYMQHVvPOvbkH4MBVZSETWevMl7tWccEE9i+KBaAp9tqyuwx1PSpnqS8YXuTtvg0HA2h8Q1lo4Te6y5bn8NgCfKl+DrMRhHY5zhxyDLVmu/9jJM="
    ) {
        roaming(absoluteVec(224.5, 65.0, 590.5), absoluteVec(223.5, 65.0, 587.5))

        type("ambient")
    }
}
