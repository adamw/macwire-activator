package controllers

import play.api.mvc._
import services.greetings.RandomGreetingsService

class MainController(randomGreetingsService: RandomGreetingsService) extends Controller {
  def index = Action {
    Ok(views.html.index(randomGreetingsService.nextGreeting()))
  }
}