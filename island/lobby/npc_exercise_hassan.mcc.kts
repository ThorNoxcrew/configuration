import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Grid runner on beach runs up and down sand. Only male skin among group of female skins.
    playerNPC(
        absoluteVec(435.6, 26.0, 670.9),
        "Hassan Qua",
        "ewogICJ0aW1lc3RhbXAiIDogMTYyODU3NjA5NjY1MywKICAicHJvZmlsZUlkIiA6ICI5MzI0N2IzMzllMTQ0MDBkYjk5Y2ViM2Y0NzA4ZTBhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBemFyb3dfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyZTljZmMzN2Q1NDhkYmIyMWYzZjY3OGVkYzY3ZGEyZWUxNzI2MWEwY2M2Y2ZmZDA4MzNkNjJmODI2NWM3MSIKICAgIH0KICB9Cn0=",
        "fdoL0xoSeLh5BMp4iCjApz4JVT2RFczDqLMcFB4ZzzWMZvAtKhRpvlMx/hAFuLqe/hulVHr1CeMG/HOxDpmbI+omziQiw7PlgCE8z3O2DgS8M8ue7QeI5FCqwaJ2M7H92+0tfs+ug6phHWYGlUSRMrAtBrU1/htM2Az9JvvlRgb3eMTMW2Z18+PZacWpi+W6+mL6ipWsqFujbAWsPKXv1iBQsyYx2yxdNspIJGxJ0Gx4lWLKcqRMgBMDQ0XFnDqGkY8OqbIhtsCt3tU7hT2dm3jzuVYligbA2UzFn13x5TH/S9gOseoSAwy7wE5DDyDIBYFIs1lDfFZKP9VcKGh1bZiPUPftEjqcA1mtfLH7VMh9qQUXM8ZQY5lEoxiKDbXAWQKfh5P7uBSeGM4/JH7Qu85b+B7a9kDfljdG4lMoNUC5Pw1N3Rkr2Sv5UPns55hbiepbFF24oYG3KS/gk9ZnZaj77CDulYJ6fLppUniBUY0hBCoaHkdInYgQDTyrcYiLM5Oce0PC42FjzKeTF6KOPWWTlZT7CBmaG8quLPS3zZrdB8K2wHn5TQdUlIuvAcWsx3lI3c4y7DQ9hJquiRERsCapyJJjDyfYZwKxeFexCI21/xqM41SvgWgg8AHWDBHmbpHM7xLgXRal5havE5gZHdOyW4pxFPUYZnjCcgVuvdM="
    ) {

        val pointList = LinkedList<Transform>()
        pointList += Transform(435.6, 26.0, 670.9)
        pointList += Transform(429.9, 28.0, 670.9)
        pointList += Transform(435.6, 26.0, 670.9)

        patrol(pointList)

        type("ambient")
    }
}
