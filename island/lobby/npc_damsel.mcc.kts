import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Princess walking in circles atop cyan coyotes battlement.
    playerNPC(
        absoluteVec(202.5, 51.0, 332.0),
        "Damsel",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3MTAyMDEwNCwKICAicHJvZmlsZUlkIiA6ICI2NDU4Mjc0MjEyNDg0MDY0YTRkMDBlNDdjZWM4ZjcyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaDNtMXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGJkYWJiNzE5Y2JjMTdiNzkzMTFhYmRiMDE1MGFkZmI0OGZhMjcwZWFjOTM4NjA2YWMzZTVmNmE2NTlkNDNmZiIKICAgIH0KICB9Cn0=",
        "EZYFy9l47ZsKAtZf+7Er1mAJp/Eb0ER7inBZHH6aGG3TpojHJLBmzWHQ4VkyYuyYbaZtgv1NFug0wKJkHvef5cY/b0ta+S5/De3LrQcbF6T7LWAH7HXDFx6C9Ush0TeTGYnNmL7ZOjNH3F0nO0AfhQNhNkXAdzkr8OLZdKxIzhBA/beEMePwld9Y28xPpvI46FS3jv4nfvoazC8VpORlXjaBoAHwcU2SAKJNOAYBltbsWtDKau6OoqRsLDkI79Xy/iJ0CQ6VzDK7kYArmRnz4xWoE1rv901/CWSnqDufN/ImoxiVVAAlgXxmdDjoS6u4vIQxJg7aENpuPG6j+LHiSclu5+W2orYqknJp65aDExnwwyN4kabls3FAd70ZU6toAtYDhv93icCJXikGKqY+4W/k9u4cWZOCkIgYxPguvdJeFOh6PXskA0yFiObABV8vyvVwFKs1PonbfRvlimR4KjUfwrbiojLBDUA52yo54TBzbVmIoarn34rawZghceOXmUyoa2bofY7NFct5J4bd4W/iOy1lnnBd0goQHGWth1S5oPb/jYZlpHUZAgADCt5suUK7v6sEfSCcIEahExQfAAzuA9JX1BmlM2tYgUH224zZOeLP+K3Y7biajWZJMpxNQ/ccRF5v1iI6KtoO0rIxidsJYMg/3a+9omNPO/G7BcY="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(202.5, 51.0, 332.0)
        pointList += Transform(198.0, 51.0, 332.0)
        pointList += Transform(198.0, 51.0, 327.0)
        pointList += Transform(202.5, 51.0, 327.0)

        patrol(pointList)

        type("ambient")
    }
}
