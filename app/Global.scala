import com.softwaremill.macwire.{InstanceLookup, Macwire}
import controllers.{MessageController, MainController}
import play.api.GlobalSettings

object Global extends GlobalSettings with Macwire {
  object Application {
    val mainController = wire[MainController]
    val messageController = wire[MessageController]
  }

  val instanceLookup = InstanceLookup(valsByClass(Application))

  override def getControllerInstance[A](controllerClass: Class[A]) = instanceLookup.lookupSingleOrThrow(controllerClass)
}
