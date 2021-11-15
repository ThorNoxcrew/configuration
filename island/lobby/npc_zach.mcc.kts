import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Patrols in construction area on left.
    playerNPC(
        absoluteVec(392.0, 34.0, 647.0),
        "Zach Rashe",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMTExODExMzkxNSwKICAicHJvZmlsZUlkIiA6ICI2MjM5ZWRhM2ExY2Y0YjJiYWMyODk2NGQ0NmNlOWVhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYXRGYXRHb2QiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmIyNWEyMzdjY2IxYzljZjEwYThmOWFjNjUxYjEzMDFiNzVlZDc5YjM2MGE1M2Y1NTExMmMyZmUyN2IyYjM3NyIKICAgIH0KICB9Cn0=",
        "E1mE65m7xHZOqxLl/+wZdYhQ2rmr6ykJP6tzsQhW4q3cWIUe7mRNxwvdozmJDx3cwi3wdenUKTzhNuhLD25fdZoa2FJagSi3cJDV7CgOSMTwJUtVqbU3KUqtazKQwt99sF/fhpMUO+p8xc1L8zhIrxuMG/pp3MEpAFX/nDkquV5J9czWVrBndrUtNOS0cC6oTZLdiAQu2GRVNhFYlD4EWcqExwdVsR8xEgs1V6cyo0r8izLSJ/W8wGFtEIxznhBrlaxqMpNGl6SHVvjEeGjoLaCEk3z/jZlDx3K80+SDD4gmyh61m//safrVILg9aJ6KOT20eEqvndofMks3vw+bWYt5u2t5dJiCTDvGW9oXGmkGWqbzXM9WX686ZhobrhGaLPKIQXrtercuH3cco5fq2UKtqxjOo50BOmjqAjmXi29XMj5QR7J6qUBvffoS8vizjUZz36UdfQsvGhp9GtTAsHHLhafhrfpBBnUa2dHQXY7WTbwtmlcFXwqhRvG3OG/yljuGilPcO9E0OhknyIpF10GwMGAtJT36pzuHu9h6SM7h17K6ziHaGhRPxJhLZUER+d4gRGGqRzmAtjDHSL36fJeZpvVcxsR0xGkmpaNHerIVVoClG57D3EHOXfbk2n90D9snRPh0qtD+kbIkLfqwG3Q+//KPTClqfNRxobmtXXM="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(392.0, 34.0, 647.0)
        pointList += Transform(392.0, 34.0, 616.2)
        pointList += Transform(396.3, 34.0, 619.2)
        pointList += Transform(410.1, 34.0, 622.8)
        pointList += Transform(412.0, 34.0, 622.8)

        patrol(pointList)

        type("ambient")
        
        helmet("mcc:island_cosmetics.hat.traffic_cone")
    }
}
