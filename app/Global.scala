import com.softwaremill.macwire.{InstanceLookup, Macwire}
import play.api.GlobalSettings

object Global extends GlobalSettings with Macwire {
  val instanceLookup = InstanceLookup(valsByClass(Application))

  override def getControllerInstance[A](controllerClass: Class[A]) = instanceLookup.lookupSingleOrThrow(controllerClass)
}
