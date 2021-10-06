import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Wealthy woman in house to right of main hub patrolling bottom floor.
    playerNPC(
        absoluteVec(338.2, 37.0, 589.0),
        "Sadie Baggs",
        "eyJ0aW1lc3RhbXAiOjE1NzEzMDAyOTQyMzcsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YTZhMDNiNTY5OGQ2MmZkNWIzOGYwY2RkYTZhZTBlZDljODc1MGRmNzkyYzU1OGJhYmEwOGRjYWNhMDAzMDI3IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
        "UTxeLoanc+yhz9mkdugldCgZHD25cgA85uuJeZPZrAB2KEjtcPrwVf6irdwAnyJ+00pdch6qO4oKR/t5PEFznRJsQPz59r/qPF2X3GXadeC/omsu6dUgTg0ckqiTGn93rsf32B0vakOUfjBpnatGoqX08wut9mNjZ9/qOdaZLlX5HSMn+UwTxbEGiBxMUy1mngTEBmRZbiCs6BKFvHOvuba2K4WIFX6XxTuM+rwcD/gMP8OnTrjzRt+jSZ6796C2ikb58JE4QEGMKYKYEZmlHVjAy4oQnQz+KI8DlSXg5TIFbBMD+yDhRtnVy6501V5A9X66wpMtpjWhzKWkG703NVszGRrq9EFvAFC9HVw977UhCuXa+6s78VmAgPJiOf6uV4ffy2I/m8wgzUT2IecStC4VkVgi5M7y5cYgywoCiF0HP9Woo9jbWcfTkceeRtr/6woeeTd1Iyx6O9Od4+SZYyinhNuJf9vf8YRPOBVKKgaGlegnXSr0500Q0ACgl9qyDRHSAk4TXriQCoXwsWCeja/8OlM12AMN7jN17gO/xubbqQYOfCZXYBSAV5qC39jbK580DgHLtYd5KCRsWqIn8RoB4qgplibUPtNeYKDDN4hWbRGYlAVDbm5jo8pBuXG5VB2jWQGNpgW9+rcQujChnBwTOMIKAW8kk4rRswNhCnI="
    ) {
        roaming(absoluteVec(340.0, 37.0, 591.5), absoluteVec(335.5, 37.0, 587.5))

        type("ambient")
    }
}
