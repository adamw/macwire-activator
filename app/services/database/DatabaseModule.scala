package services.database

import com.softwaremill.macwire.MacwireMacros._

trait DatabaseModule {
  lazy val database: Database = wire[InMemoryDatabase] // will expand to new InMemoryDatabase()
}
