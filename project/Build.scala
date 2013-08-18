import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "macwire-activator"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Select Play modules
    //jdbc,      // The JDBC connection pool and the play.api.db API
    //anorm,     // Scala RDBMS Library
    //javaJdbc,  // Java database API
    //javaEbean, // Java Ebean plugin
    //javaJpa,   // Java JPA plugin
    //filters,   // A set of built-in filters
    //javaCore,  // The core Java API
  
    // WebJars pull in client-side web libraries
    "org.webjars" %% "webjars-play" % "2.1.0-3",
    "org.webjars" % "bootstrap" % "2.3.1",
  
    // Add your own project dependencies in the form:
    // "group" % "artifact" % "version"
    "com.softwaremill.macwire" %% "core" % "0.4-SNAPSHOT",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    scalaVersion := "2.10.2",
    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  )

}
