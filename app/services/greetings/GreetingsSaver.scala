package services.greetings

import services.database.Database
import java.util.UUID

class GreetingsSaver(database: Database) {
  def saveGreetings(greeting: String) {
    database.storeValue(UUID.randomUUID().toString, greeting)
  }
}
