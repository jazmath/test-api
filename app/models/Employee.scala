package models

import java.sql.Date

case class Employee(id : Long, fistName : String, lastName : String, email : String, address : String, dob : Date, designation : String) {

}

