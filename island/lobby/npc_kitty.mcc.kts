import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Cat girl in library sleeping on couch
    playerNPC(
        absoluteVec(289.0, 41.0, 612.0),
        "Kitty",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjIzODM4NzY4MiwKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZjZjUyNTBlZjA0YzFlZjI5OTU2ZTg2YzQwYzlhMzBmMDBkYmE1ZDk5NDM5YTBjYTc3Yjk5MTI2ZmVlNDM4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
        "rO3TRYY6KtUq1jaaXwidXnH4Q/LUfSEZtDz9WiYh1I1F+ahtBCXZWkwdfIyapnYXocPK3t+zlxucJ/DauQC31qNown8uEDft6YoOpnylo1Rnah+lbpwm6UP4nY4ZvHFE9f7iHUL5SWO5Fa1GLnKdvqZ1kgT5Df8Iod6GeQW5NNgm0QBe+RbSSAaf0mvexqRuFfLXM6j4ovcQWf4KJ0IvORF3m8YnqmRysCWTm8qH6Sd/Obt4geRjBPOWlOXXQrpJJ1Sat1TWf6wSlohFDN7Py+YTGAiB4ZnfG9NahdkfZ3fFoYiLLs0fq3f/QCHbtR9xkhCdWhAq5GJ0Vn99enoQRjFd5507W2x76XuRLf7EL9LqP2N0WVIQNgYlb3dZrEIBVUvzw38DW/HlAQgvStxObaN1GXaah+0J4eYHG4xneph4sGGPtj3Th3JPM1aedQHFA8MPwAUiq+nXN6HRDeH03NIxQ8SxfldeaSYOXR7Dz9g5vUXDCcgXX8Irw5goLRcCfwG4M15JUZl4uom7x+nbR/5rWg6QLdTIgEZm+WbXiTG3C4HA0VQSoDGpRadShuruQg1z7B9UcAPuMZg7413unQa9SMyTJFEPCwh9vOI22qmUz5wIoRe7W4UHr8rk2/+ZLRNYBIObJ2eqUZQtHOcxGIWagOtvl+ZIGveo06tds6s="
    ) {
        rotation(-90.0, 70.0)

        type("ambient")
    }
}
