import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Blog"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
    	"postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    	"com.github.twitter" % "bootstrap" % "2.0.2"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    	resolvers += "webjars" at "http://webjars.github.com/m2"
    )

}
