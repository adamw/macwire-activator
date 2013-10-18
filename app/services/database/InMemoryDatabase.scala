package services.database

import scala.collection.JavaConverters._
import java.util.concurrent.ConcurrentHashMap

class InMemoryDatabase(auditLogger: AuditLogger) extends Database {
  private val map = new ConcurrentHashMap[String, String]().asScala

  def storeValue(key: String, value: String): Unit = {
    auditLogger.logOperation(s"For key $key storing value $value")
    map(key) = value
  }

  def lookupValue(key: String) = {
    auditLogger.logOperation(s"Looking up value for key $key")
    map.get(key)
  }

  def allKeys() = {
    auditLogger.logOperation("Retrieving all keys")
    map.keys.toList
  }
}
