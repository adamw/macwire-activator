import play.Project._

name := "macwire-activator"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.webjars" %% "webjars-play" % "2.2.0",
    "org.webjars" % "bootstrap" % "2.3.1",
    "com.softwaremill.macwire" %% "macros" % "0.5",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

playScalaSettings