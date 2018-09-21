// @GENERATOR:play-routes-compiler
// @SOURCE:/home/azmath/Personal/Workspace/test-api/conf/routes
// @DATE:Fri Sep 21 10:02:17 IST 2018

package v1.employee;

import router.RoutesPrefix;

public class routes {
  
  public static final v1.employee.ReverseEmployeeController EmployeeController = new v1.employee.ReverseEmployeeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.employee.javascript.ReverseEmployeeController EmployeeController = new v1.employee.javascript.ReverseEmployeeController(RoutesPrefix.byNamePrefix());
  }

}
