package services.database

import scala.collection.JavaConverters._
import java.util.concurrent.ConcurrentHashMap

class InMemoryDatabase extends Database {
  private val map = new ConcurrentHashMap[String, String]().asScala

  def storeValue(key: String, value: String) {
    map(key) = value
  }

  def lookupValue(key: String) = map.get(key)

  def allKeys() = map.keys.toList
}
