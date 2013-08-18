import controllers.{AddGreetingController, MainController}

import com.softwaremill.macwire.MacwireMacros._
import services.database.DatabaseModule
import services.greetings.GreetingsModule

object Application extends GreetingsModule with DatabaseModule {
  val mainController    = wire[MainController]
  val messageController = wire[AddGreetingController]
}
