name := "macwire-activator"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
    "org.webjars" %% "webjars-play" % "2.4.0",
    "org.webjars" % "bootstrap" % "3.3.4",
    "com.softwaremill.macwire" %% "macros" % "1.0.1",
    "org.mockito" % "mockito-core" % "1.10.19" % "test"
)
