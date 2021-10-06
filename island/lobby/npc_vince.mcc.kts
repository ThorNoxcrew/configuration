import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Patrols area in front of bank.
    playerNPC(
        absoluteVec(295.3, 35.0, 448.8),
        "Vince Coco",
        "ewogICJ0aW1lc3RhbXAiIDogMTU5MTQ4MTc1NzE5NCwKICAicHJvZmlsZUlkIiA6ICI3M2ZkNzU2NWJkZTY0MGQzYWE4MGUxMWUwMTMwMjc3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHYUJySWVMVnR6IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRlNzY3YjUxYjIzY2RiOGViMjZhYTJhZWJiNmE3ZGI5YjM1Y2I1OGY5YWMwNTZlNjAxZWM2MzM3MzQwODM4MDgiCiAgICB9CiAgfQp9",
        "jcxMFKwcrcMj8JsPILP9TbVWTVq7iHxJ8TJOhhlXU/p2Dfw17TYp3Dq8s85UNhczgrJMvReGQKJDMfxIWHCnme4XSUqCwD3GiNVdXhqCYgq1AL3RvHliqfNk0oD8g2aKTvkxyZnt6lW+pn0Ffm4vXjzgkXAE6pddmvxgrrOdmyVHXbzLJjIBOEqIJI1qbnkB/mlRRfP1GQcwissuz6tAvSRf2PHZNQBpsuMDyPWfxd1Vrhxh/qoCJzXbMexArFTeLgdO6vDtHBRqsIWsKPDScCVOIR6sYS9y79jNuPmZptf/3UKnBvQPqt5lnCr3LHBw6rgiGXgDgsBqfu2QY/R54iMYYSFfumUJIoCas69PzFHEOnF9CCLSvx41kspoqltKAQP2yJVk9ZLkgTZGze/bArXprg85gMKb1k2eGp4JYMCkaRoG9UTQfMa1WoZ2LYEyzdngRIujPzjzSZQXJB37wNu6utGWHLszKOPzsgWk3hC83HUbjgSxZ2yD4OQKLnFlQU11cOXsifAuZowv8royzse4QY+pUnxJDTh6Z82aOkqaru7BAanzqEEu7VJNyuV4ISRsrZfPCAO6x/1nDxpVIrrnY26urQ32DNsRnwuaiHNiZeCa8I6msmn9Az3vE4P3qYubFOkN2H4aQOGJD5YE3CbLnYDjFxzhSbc8HWlieOA="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(295.3, 35.0, 448.8)
        pointList += Transform(311.7, 35.0, 448.8)

        patrol(pointList)

        type("ambient")
    }
}
