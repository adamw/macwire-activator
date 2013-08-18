package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json
import play.api.Routes
import services.greetings.GreetingsSaver

class AddGreetingController(greetingsSaver: GreetingsSaver) extends Controller {

  def addGreeting(greeting: String) = Action {
    greetingsSaver.saveGreetings(greeting)
    Ok(Json.toJson("ok"))
  }

  def javascriptRoutes = Action { implicit request =>
    Ok(Routes.javascriptRouter("jsRoutes")(routes.javascript.AddGreetingController.addGreeting)).as(JAVASCRIPT)
  }

}