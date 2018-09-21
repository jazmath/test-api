package v1.employee


import java.sql.Date

import dao.EmployeeDAO
import javax.inject.Inject
import models.Employee
import play.api.libs.json.JsValue
import play.api.mvc._
import play.libs.Json

import scala.concurrent.ExecutionException

class EmployeeController @Inject()(employeeDAO : EmployeeDAO,
                                   c: ControllerComponents)
                                  (implicit  executionException: ExecutionException) extends AbstractController(c){

  def index() =  Action {
    Ok("Ok Azmath")
  }

  def create = Action { implicit request: Request[AnyContent] =>
    val body: AnyContent = request.body
    val jsonBody: Option[JsValue] = body.asJson

    val employee  = Employee(0L, "John", "Doe", "john.doe@gmail.com", "#123,Allen Avenue,Colomno 05", Date.valueOf("1988-04-01"), "Civil Engineer")
    employeeDAO.save(employee)

    jsonBody.map { json =>
      Ok("Got: " + (json \ "firstName").as[String])
    }.getOrElse {
      BadRequest("Expecting application/json request body")
    }

  }

  def save = Action { implicit request: Request[AnyContent] =>
    import play.api.libs.json.Json
    val employee  = Employee(0L, "Allan", "Doe", "allan.doe@gmail.com", "#123,Peterson Avenue,Colomno 05", Date.valueOf("1988-04-23"), "Civil Engineer")
    val savedEmployee = employeeDAO.save(employee)
    Ok(Json.toJson(savedEmployee))
  }

}
