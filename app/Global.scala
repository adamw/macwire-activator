import com.softwaremill.macwire.{InstanceLookup, Macwire}
import play.api.GlobalSettings

object Global extends GlobalSettings with Macwire {
  val wired = wiredInModule(Application)

  override def getControllerInstance[A](controllerClass: Class[A]) = wired.lookupSingleOrThrow(controllerClass)
}
