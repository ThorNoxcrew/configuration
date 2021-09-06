import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
  val i18n: I18n by inject()

  playerNPC(
      absoluteVec(331.7, 39.0, 460.1),
      "Ian",
      "ewogICJ0aW1lc3RhbXAiIDogMTYyMTcyMjYyNjY1NiwKICAicHJvZmlsZUlkIiA6ICI0ZWQ4MjMzNzFhMmU0YmI3YTVlYWJmY2ZmZGE4NDk1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlYnlyZDg4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwNjU3NDkxNWRhZjhiNjY4YTliNjc3MjU0YTFhZWJmZDkyMjVlYjc2YmYxZjlkNTRhMTJmODg4ZGUxMjI0OSIKICAgIH0KICB9Cn0=",
      "JAMJHPWGETBFdl1cy20XgATTb2WjMs0sZ/fkXJBetOVTfdl/fKEnWcRz/qOB0JhRPEikPWgqsVJUP5LyPO7oR8TXop8CUmzW/0XY0JK0E+iVlyLOJsGav89bAR6zTY3w9WLJrJvkUl8XZOJsKQuTCAb8OruYsmRpKOvg5TGOK0gaG+PmGk8wPKHlXAQcewMDePRcLyEqjuGTBdZnmxmASkvk1e8JXlistHopIPwE7v22+jKl6tagSfqolD20ZoifxqOERNay9UsPE4JoIO2pqVdP3y/9eGxi5GJ7F3bohqqts0A2Ha5MXcyzFWkj0CjX8LFAoboKc9NFDGAC64RJ/uPh4ogXMLRp82NSFaRr9slcMQkLtzv6ksgKLBRW+RkmBvKJbDXat/+3AYfnx+2sS55GkexKUDbgjC4KN4ewo/O7sc2gNje5kbxupCcUINT1LVETMG5tQYfsgIHLQv2z/RACw1pwXdp2a+5QAOa4DjR+L5vwQZuE3Edna6a+3pTcASi7hriTbX+ruo9tt5sh2eAfHUh0or7J+zy9+rh+hHbc6hjFn6sSpKvILtfgnGmWJAokfpENVC8MC2A1a1gck0fLfptpzOI44JJjifAXhKyqEEvQ7U9wwessuUFTzQrcOl+MR49Aaa7G7VAckHxBUS/HV14yXRwP+mcN0yJjQUw=") {
    rotation(-160.0, 0.0)
    lookClosePerPlayer(6)
    cooldown(1.seconds)

    type("ambient")
  }
}
