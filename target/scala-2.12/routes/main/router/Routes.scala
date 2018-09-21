// @GENERATOR:play-routes-compiler
// @SOURCE:/home/azmath/Personal/Workspace/test-api/conf/routes
// @DATE:Fri Sep 21 10:02:17 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: controllers.HomeController,
  // @LINE:5
  v1_post_PostRouter_0: v1.post.PostRouter,
  // @LINE:8
  Assets_2: controllers.Assets,
  // @LINE:11
  EmployeeController_1: v1.employee.EmployeeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: controllers.HomeController,
    // @LINE:5
    v1_post_PostRouter_0: v1.post.PostRouter,
    // @LINE:8
    Assets_2: controllers.Assets,
    // @LINE:11
    EmployeeController_1: v1.employee.EmployeeController
  ) = this(errorHandler, HomeController_0, v1_post_PostRouter_0, Assets_2, EmployeeController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, v1_post_PostRouter_0, Assets_2, EmployeeController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    prefixed_v1_post_PostRouter_0_1.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/employees""", """v1.employee.EmployeeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/employees""", """v1.employee.EmployeeController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/employees/create""", """v1.employee.EmployeeController.save"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] val prefixed_v1_post_PostRouter_0_1 = Include(v1_post_PostRouter_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/posts"))

  // @LINE:8
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val v1_employee_EmployeeController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/employees")))
  )
  private[this] lazy val v1_employee_EmployeeController_index3_invoker = createInvoker(
    EmployeeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "v1.employee.EmployeeController",
      "index",
      Nil,
      "GET",
      this.prefix + """v1/employees""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val v1_employee_EmployeeController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/employees")))
  )
  private[this] lazy val v1_employee_EmployeeController_create4_invoker = createInvoker(
    EmployeeController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "v1.employee.EmployeeController",
      "create",
      Nil,
      "POST",
      this.prefix + """v1/employees""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val v1_employee_EmployeeController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/employees/create")))
  )
  private[this] lazy val v1_employee_EmployeeController_save5_invoker = createInvoker(
    EmployeeController_1.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "v1.employee.EmployeeController",
      "save",
      Nil,
      "POST",
      this.prefix + """v1/employees/create""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:5
    case prefixed_v1_post_PostRouter_0_1(handler) => handler
  
    // @LINE:8
    case controllers_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:11
    case v1_employee_EmployeeController_index3_route(params@_) =>
      call { 
        v1_employee_EmployeeController_index3_invoker.call(EmployeeController_1.index)
      }
  
    // @LINE:12
    case v1_employee_EmployeeController_create4_route(params@_) =>
      call { 
        v1_employee_EmployeeController_create4_invoker.call(EmployeeController_1.create)
      }
  
    // @LINE:13
    case v1_employee_EmployeeController_save5_route(params@_) =>
      call { 
        v1_employee_EmployeeController_save5_invoker.call(EmployeeController_1.save)
      }
  }
}
