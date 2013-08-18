package services.greetings

import com.softwaremill.macwire.MacwireMacros._
import services.database.DatabaseModule

trait GreetingsModule extends DatabaseModule {
  lazy val randomItemChooser      = wire[RandomItemChooser]
  lazy val greetingsSaver         = wire[GreetingsSaver]
  // will expand to new RandomGreetingsService(database, randomItemChooser)
  lazy val randomGreetingsService = wire[RandomGreetingsService]
}
