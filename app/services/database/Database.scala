package services.database

trait Database {
  def storeValue(key: String, value: String): Unit
  def lookupValue(key: String): Option[String]
  def allKeys(): List[String]
}
