import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Woman looking at clock in center main hub.
    playerNPC(
        absoluteVec(310.5, 39.5, 544.3),
        "Ursola Locket",
        "ewogICJ0aW1lc3RhbXAiIDogMTU4ODI4NTgyMTk1NCwKICAicHJvZmlsZUlkIiA6ICJiZWNkZGIyOGEyYzg0OWI0YTliMDkyMmE1ODA1MTQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdFR2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E1ZGZhNzI5ODc0MmNiZmM2M2EwODRlNDFkYWUyYTU5NjVmYzViOTZjYTczNDU1MDhhMWViNDYyZDkxNGM2NTciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
        "gGn9pewC5vqDDxnFmsmouf4uGzA42jSy87i0u5u8dN1nU0T2fkN3B/0g/fwPSx/4PGYdZ89AigdPAfOwMm2bCX4qn/37Jcvm7GBmRR1D1mAbvbMXuShQH0Yyxu1nnGiXZV1RHr3SVcZ31352vx0vIEC/iLacj62TMgULA3JYkjxoqcyDeIG8w0OsW90l1j3ln7fyJCDSqXgjihe89Neb8VNxcIMCN3hF2a62tyhJW8pDGaZMXETaRxMVZbz1VqS2c1TTgJU9d1u+eCX4wrfPT4DU6V6MMtUd02lzqSNAZV8fkHdAXXjaGeh6b5Rm0Awh/fhr9dK9HPxtiNf6gsWkMIGz5Hw9PV4u7C2GtXhO1WuJCWhI7hYyyQVEQKgOf2EZ99v5oDj1xFVHgfeecfeigW3Ss9EO71txvNIPpK8JgWmq1HgOIIdV1IwbBT2YEjYyIZg50w201Ln9h7+fwB190dBZzV86TnWBWr7eM0H6sZMGoXCjvAUbU0+Mf8fPpMF/06e6N4wM2TVXYDaRtvZoXbYYUcjrTRNquBS6oTZL9ZV8kCKE92Isysr5DZU6r+i0zna2/CMk8YBEzyvYhLdHMI8nPpffC36P2BmeiBIsbymE1TRAPlQus89fZmM4W0RRdTQWjaYMdCLmtNChkiPpLAvafuuNgu4pB8W1+zmZChk="
    ) {
        rotation(40.0, -40.0)

        type("ambient")
    }
}
