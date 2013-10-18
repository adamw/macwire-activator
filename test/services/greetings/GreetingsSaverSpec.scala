package services.greetings

import org.specs2.mutable._

import org.specs2.mock.Mockito
import services.database.Database
import org.mockito.Matchers

class GreetingsSaverSpec extends Specification with Mockito {
  
  "GreetingsSaver" should {
    "save the new greeting in the database" in {
      // Given
      val modules = new GreetingsModule {
        override lazy val database = mock[Database]
      }

      // When
      modules.greetingsSaver.saveGreetings("Hello World!")

      // Then
      there was one(modules.database).storeValue(Matchers.any(), Matchers.eq("Hello World!"))
    }
  }
}