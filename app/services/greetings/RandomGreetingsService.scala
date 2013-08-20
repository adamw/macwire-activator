package services.greetings

import services.database.Database

class RandomGreetingsService(database: Database,
                             randomItemChooser: RandomItemChooser) {
  def nextGreeting(): String = {
    val keys = database.allKeys()
    val randomKey = randomItemChooser.chooseFrom(keys)
    randomKey.flatMap(database.lookupValue).getOrElse("No greetings, sorry!")
  }
}
