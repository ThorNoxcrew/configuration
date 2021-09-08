import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

//Part of trio of girls that listen to outdoor concert.
  playerNPC(
      absoluteVec(356.5, 32.0, 437.4),
      "Rachel",
      "ewogICJ0aW1lc3RhbXAiIDogMTYzMDU5NTMxMzU1NiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JiMGJiNzhkMWQ4YzA2NDExYmVmODM1YWQ4N2U3MGE4NmFiYmQ0ZGY3NWU2YTQyNTM1YTM1ZjU2NzZiNzAyODgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
      "n52rKPuOnnxUiuwWujzLhPou+D00HcATcVELPamPSnd4wlaoJeCLRzEuFphKAaFm0Ht+PFhIJJmwEcA5WPfmj7wPjmvPOasJDVUAtxU/RzDNsHbfNU3V9CCvuxTqtM8/LWuX+dhaoAG+II3TJ+beG5XltNktR4qn/sX7DNWO2hyKTHdOcR4i+imAEEtJ2L/n4y9WngqVom2F1lV7PtaLUGcBLjWo9eLQ+RA+uZFsc9CVOE3BDk04tkiEuA1C+z7gDHaEp23qvF74i71Ofl9dMVtJlxPGHVZTi8s/CTLOK79bNPWwI1nQhFlHjpEXlrUn5GPmbXD2zgxCkjGgSET1ZsNWwg7xur2qReQtyaLUJee2mHf+o07y8zyTZ9SZhd8CBjQqtuQNMP/GiMSZsdCuP6znifeE864RiY7GkFIrcIwyhpLZ3Tippe7RHn+V7a2akBc3HNESeQyHyEit9y0pCa+yD3vONcneDgGQeXDNDPMbgeaausCALhtkvgq3rbh1RbSVA4ZnCb91V9aO+KbQ9nPDzw+pM7ceiuJnCAGTEgJdP1d16PN50yDhpi0yhPkqZ9pJGOPRwKB+y6pWkSWQN55TvultYRAXnKaYx+KGzOlOWQQdYFFJ8rj5UkddFqMTlF0tBQaEV7WLK52YIsMgkXiJkCBshi0/Ibw9ZcbvQ28=") {
    rotation(-90.0, 0.0)

    type("ambient")
  }
}
