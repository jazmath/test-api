// @GENERATOR:play-routes-compiler
// @SOURCE:/home/azmath/Personal/Workspace/test-api/conf/routes
// @DATE:Fri Sep 21 10:02:17 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:11
package v1.employee {

  // @LINE:11
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "v1/employees/create")
    }
  
    // @LINE:12
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "v1/employees")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/employees")
    }
  
  }


}
