package services.database

import java.util.Date

class AuditLogger {
  def logOperation(op: String) {
    println(new Date() + ": " + op)
  }
}
