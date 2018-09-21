// @GENERATOR:play-routes-compiler
// @SOURCE:/home/azmath/Personal/Workspace/test-api/conf/routes
// @DATE:Fri Sep 21 10:02:17 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:11
package v1.employee.javascript {

  // @LINE:11
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "v1.employee.EmployeeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/employees/create"})
        }
      """
    )
  
    // @LINE:12
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "v1.employee.EmployeeController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/employees"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "v1.employee.EmployeeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/employees"})
        }
      """
    )
  
  }


}
