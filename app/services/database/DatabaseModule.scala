package services.database

trait DatabaseModule {
  lazy val auditLogger = new AuditLogger()
  lazy val database: Database = new InMemoryDatabase(auditLogger)
}
