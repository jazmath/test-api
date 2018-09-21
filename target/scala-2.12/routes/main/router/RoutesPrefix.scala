// @GENERATOR:play-routes-compiler
// @SOURCE:/home/azmath/Personal/Workspace/test-api/conf/routes
// @DATE:Fri Sep 21 10:02:17 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
