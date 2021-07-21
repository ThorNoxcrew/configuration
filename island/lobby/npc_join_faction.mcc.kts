import kotlin.time.seconds

mccScript {
  playerNPC(
      absoluteVec(392.5, 34.0, 549.5),
      "Join a faction!",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMzI3NDczMjAwOSwKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZlMTZjYjQzOTE5MmNjYzNhMDExZGJhYzFlNTgyY2Y4YThhNmY2MDZjZGQzMTBkOTI4ZDIxNjI0NGJkOGVmNTIiCiAgICB9CiAgfQp9",
      "ZQ5nAwWIapz31/Z2IcCQPPLUQtck4EuQBovOHo8RHsR2QVC+mHFyS+XDwL8KIaJ6D/9Og8CWRp0xzPphlWMI507ycz42PbySzN5A448/4VhVyTHJmtvFPluRK4b+51r/UjKFIzOtwCFYLh4+C00yw7FWZJzW1IxPD1GcD2w7JpwILJUdlDZS5uHe415hJTFgT+pRQhuKzPaI/+a3vI78WGbC3SlhOHuTVnZ4N8Ndar6oLY26BH6Jpm6yFgIyMES2goBdi84pxxAqmifj9Wzth83EnFKrJvY+bYOY+E/arEaxcMaVKcMa3glTJFEZFPqZ8xVHv3OKVPvm+OlcEQ+jntw2gwQ5nnSQHzMn2BboiJxy7rPIJ5iWIdeoiTDac8xgEPCKoYeqP5ogFGQfypRcIVzDaxP80Pi0hNXoOXNs/P0PX40bsi5Hu5zcW9VG6EKfDaVN71U1G8l1AaVxKXcf3egzIF03FoHBOZrYMlfWhSl+X2Wg52ES0JBgSupzkusl/3kqBwlHMcXvdT0dErJOUqroqepJ/jXpw18c0OlxWWtXKAQtHtypzB3tH5qqsQYLy++1cWn6hh8dGkZg0D0cFjuHyIhS7AqePG7kj6TR1xs/wnz+gms9SzTZLR43dby4/sVPJurnjc74m49Wq7sE37p1YqNh+S9/cIZWUMy4ek0=") {
    rotation(0.0, 0.0)
    lookClosePerPlayer(20)
    cooldown(1.seconds)

    interactBehavior { npc, player ->
      withContext(Dispatchers.Minecraft) { player.performCommand("faction join") }
    }
  }
}
