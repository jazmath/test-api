package dao

import java.sql.Date

import javax.inject.Inject
import models.Employee
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

class EmployeeDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._

  private val employees = TableQuery[EmployeeTable]


  def all() : Future[Seq[Employee]] = db.run(employees.result);

  /**
    * Save employee
    *
    * @param employee
    * @return
    */
  def save(employee : Employee) : Future[Option[Employee]] = {

    db.run(employees += employee).map(_ => Some(employee))

  }


  private class EmployeeTable(tag : Tag) extends Table[Employee](tag, "t_employees"){

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("first_name")
    def lastName = column[String]("last_name")
    def email = column[String]("email")
    def address = column[String]("address")
    def dob = column[Date]("dob")
    def designation = column[String]("designation")

    override def * = (id, firstName, lastName, email, address, dob, designation) <> (Employee.tupled, Employee.unapply)
  }



}
