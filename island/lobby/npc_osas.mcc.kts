import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Police officer patrolling outside main hall in hub.
    playerNPC(
        absoluteVec(300.0, 38.0, 536.5),
        "Osas",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyMDI1NjU1NTkyNywKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NjY5MDJmMjJhNjQxNjdhMzJhNTYwOTUyZGU2Zjk0NGVjNzkzNmJhMTcxNGM3NjM1NDBkM2M1ZTNjMTFiNzc5IgogICAgfQogIH0KfQ==",
        "pBzOhVvplwwRzgSkIe+VbtPm9IHU/7Rr4yyG3mmX2FQ6BW9BSLz6Rh/IuThuTy9y1hicKgr3BKa0qoDDjgat54OKYFYZDOBrH+suxq/aAntwvJliQINZ/AVzDn50IxbTGUmmyJYCt8MGpO9zgnXSyH2rEPxjpRPm7mJPU0vpDWVrqXuf1ETTAuagECz3ix56niiO2Y1LlzCEIebnwujnHyU2/DtteuuB84lQfgzAAoCKZfLgL1cPKfOQ1Dz392iQRmOLEUON1EESdbCXWk4OiGS3ep8zR5P704nlkpoDFGJIgjXl9D68/hxStPXS7KWv9m3M6N2R02YwCa+mSqD7gR+tgZZtKLvT/wKKxgZrKO7VWOiC23SFcMItcIMz4V456FQQ53VxsowmQS/r29OBvmPDi/sXOiriMAtgD0xLy0hwjJWC+4PdSFEU7qGCZpGKeQbHj6lrhWoMCKhKhADtfe7y74pc0+1bNwssiG5nxEyhkqHH9GPpSMLktO5C22zodaGG3QBN8kWCUa1jrj8jh/i0VfaGs669+V4iC13P8IhbERAZAKwekEgx+aQfpx19u1lEI4IuzfbveUjnzK47NSQthIKiZHrMJb+evL8yIpgeSQS6UbVyXkRkedhb/skGeJ+MqjiLkbM9kFBQNIB7XM6rIkod1gP+Pyx829li5Mg="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(300.0, 38.0, 536.5)
        pointList += Transform(300.0, 38.0, 531.5)
        pointList += Transform(298.0, 38.0, 530.6)
        pointList += Transform(292.0, 38.0, 530.6)
        pointList += Transform(287.5, 38.0, 527.8)

        patrol(pointList)

        type("ambient")
    }
}
