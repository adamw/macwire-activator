package controllers

import play.api.mvc._

class MainController extends Controller {
  def index = Action {
    Ok(views.html.index("Yo."))
  }
}