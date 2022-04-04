import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Kid playing dinosaurs (yellow) with friends by fossil area.
    playerNPC(
        absoluteVec(183.0, 41.0, 422.0),
        "Taylor Goetia",
        "eyJ0aW1lc3RhbXAiOjE1ODY3Mzc1Njg4MjEsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZiMTk5N2M5MTdkZGY5MzYyNDU4YjAzNmMwMDBhNzQ5MTE3ODFkODY5MmYxY2Q3ZmViMmFkODU4ZDI2YTgxYjAifX19",
        "rtNYpnTmzUhY0kQ+gtgE9N9ZLCRSDqKqdcWWF6axz20zv/hLz+wB8HqxMEUgC7Wz1dSGwF10kll1i2/k1hwbbHvPFfGHG8g9wPoz96/3WEfRjNrn9LG9nxQ9/c8v+peOTbMzzJVgz2VzYDlSpcocE06rMhbanLYEwvp7I0hracNaBMYMkd3Z66UPcLfFA+kMvGfdkFlXIQzgfZy8+MCFYvJKMLD/VJzcw8C8B3w4fsJLoz4BhHq5TawcriX1ZwdlfGAxzAObM+1wjk8LBlEncETHKCXICMRxDzwdXbR+uMz4m1paXnMs0S/L8tSwr/jeB/Pa4jVPpmWTcWLML+DHRzXragfOIiXkMjzQTtZetzoNxU6eCLSdqplj7N0cCeTcyCi3+7S+hFQ1xfoTJedhcC5Dcx/OtFxndFnmxerNL8aXz6mDzFD101b1Q9JPJiMtnpADjUMtAJEVpU+FNOZxZoBv7EAh6dso6IctXsFspi+gSAsMUGsDjghz/pT2v4+eb63hcZLG8yTGoLmgJzgHGKyy3Zq8ixfh35+/TPSF44RRNv0pEiQQ/ZhCL5gQF+AuAF62X7JbycJTKMJs9c5ANPzY5oB3aFsyphnXY0opb1uyZZlxZzEYua1lSEAeSpW8u1ZNZRuiMWjLXlDI+1tV1+mIIpFRGGKUQ/S8bW1DEQk="
    ) {
        roaming(absoluteVec(182.5, 41.5, 419.5), absoluteVec(185.5, 41.5, 425.0))

        type("ambient")
    }
}
