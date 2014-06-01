name := "macwire-activator"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    "org.webjars" %% "webjars-play" % "2.3.0",
    "org.webjars" % "bootstrap" % "3.1.1-1",
    "com.softwaremill.macwire" %% "macros" % "0.6",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
)
