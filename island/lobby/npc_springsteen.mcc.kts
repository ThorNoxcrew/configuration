mccScript {
  playerNPC(
      absoluteVec(360.5, 32.0, 457.5),
      "Springsteen",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyNTE3NDk3MTk5MCwKICAicHJvZmlsZUlkIiA6ICIzOTg5OGFiODFmMjU0NmQxOGIyY2ExMTE1MDRkZGU1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICIzOTg5OGFiODFmMjU0NmQxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M3MzY5YzYzYTlhZTZkYzMyZTAzNTI0NzBjYTAzMTY5NDRlZWIwOWE5MDExODFmZjRkMjk3MTAyZjc3ZmRjMjIiCiAgICB9CiAgfQp9",
      "bvTGICxy3xQjnJSDZaD9veK4Ucet6z5sqWuSWN9bmfxPSXj3Oxy4OGgmyYrDTcvRUe9Y74uw7X4tFy8EV/i7PQ1FAwHN1KxWu2EbIzDmfeNdxpuBZGkGVPKeev43n1hIG8862Ii8z/ZLZSZWu8ItD7ZtbkoqhclE3pLsLYcldhNtiMDBd1/Z9bJJrmrQBM+LJJWYCnEmGoy3JldJoxdq0P3vh2Z9c+fU6HiyKgwSKZPSbQcM7/X3IyNd6crdYceO7uinHQ4CI9spBppMse2OMH5BAf+aUGjGXqH8nJNrEEPiDv9gtutRQLJq9b6SrpLlD5o4ERKdj43I6GwacwCY1Phnm43KI0GkKJCUR4zkbqPMu1zHvNciO9CYF6VvZcBJZHJfDq15u2y50OGkEdzRvqfPBynAIg5vpOa64/caWzMu3sZ+atEREJpYR5pICoDV09ml70p7GmMhN/yhTIupjD4vSMhQjrV6rMYR13vP2GXGYxCOu9Bzl0b7SsTVPMdNRRtK5pfwa5u80Fg68W1f58JvCpqSGyvVbb1icFcGvudDDC5N1DydMvtenQmHsQCSFi3O+LiaW57zjd6oXUE/M+Unt1taavkJN4UkOkhvR21kwKVLCP0cbyVoM+Zguxv2s4wwfHJpcdgW1QjSp4KyaGz0cY6S4/xXJK5JuzZ3BSs=") {
    rotation(180.0, 0.0)
    lookClosePerPlayer(6)
    
    proximityBubbleChat(
        listOf(
            i18n.translatable("island.npc.springsteen.dialogue1")),
        30.seconds)
	
	type("shop")
  }
}
