import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Alex's skin roaming on a park pedistol in back right of HUB.
    playerNPC(
        absoluteVec(255.0, 39.0, 541.5),
        "Citymonstret",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMzU0MzIxNjg5OCwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzg0MmVhNWFiNzgxODMwMDRjOGE3MDQwMGU1NGQ4Y2M4ZTU3MDczNTU5ZjUyNTBiMzg5MTg1Y2VmYTU2NzhjMCIKICAgIH0KICB9Cn0=",
        "NekiBeBH/9JNzsE3QTnsv6WTOEdm+YUjLpaC+eArtDDeDzRCZr6I2TCC04YJIKmQ+S6Y92yQhxMn7LHxznDXRYa6gMhgU9/v+VOiwohFHTjLVlGljhc6FPaDuXSLJ+Lo2hvUxD77r+SzrF7g1dxBxKTMqg2Ant2rT8JSJ9NCSXMy8C5rhUL5rbScu4kZpyvuex4Ej2lw9tpgTNtKl+5XDhK7Mgtkfdw+97wiozJhbIDq3TFxdYRPU7CDoyJsK1pyYswpXB149EadpS5gkBEqU5FeOIHf606n6cI5BkE/J+w6qsEOC0VMesKiWMabkv3uyNQke7c+LCDOKfEkikIG9Hg75RphZ1Pm1x7UX4WpK0UMw0I/cd4j4+B15JPf6ACtbXLPxpkcr+NNoLR1iwUmH3xKfm4Hs2NBJqHFSkY0nlNdRh0iCjfoaoBOwqMy06D2N5c41RpiDCPH7GpGKzBbdD17xd+zni8MDSKvqzLhk3j8kYI7LOhwehpv7yTYo6cM5aIlXtuvEZ5Zt12RFbkr1XJDDXGGLMREssgw1mXN4yUadh5pY8M+v2aqTJE9ragEuUluPc1/wTWve5WUO+Isnft3gX6hGPy+Ll1kC8TL5gwRegQcLe6cmlAFbxXNKL1ioGlczaFNPv5/cA+69t9iA7mVApZXDrH++Zf/5wDDwAA="
    ) {
        roaming(absoluteVec(256.5, 39.0, 543.5), absoluteVec(252.5, 39.0, 539.5))

        type("ambient")
    }
}
