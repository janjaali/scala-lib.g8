ThisBuild / name := "$project_name;format="lower,hyphen"$"

ThisBuild / organization := "$organization$"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scalaVersion := "2.13.3"

lazy val supportedScalaVersions = List("2.12.4", "2.13.0")
ThisBuild / crossScalaVersions := supportedScalaVersions

publishMavenStyle := true

credentials += publishSettings.credentials

publishTo := publishSettings.publishTo

lazy val lib = (project in file("lib"))
  .settings(
    name := "lib",

    libraryDependencies ++= Seq(
      // tests
      "org.scalatest" %% "scalatest" % "3.2.2" % Test
    )
  )
