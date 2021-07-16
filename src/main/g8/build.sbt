ThisBuild / organization := "$organization$"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scalaVersion := "3.0.1"

lazy val supportedScalaVersions = List("2.13.6", "3.0.1")
ThisBuild / crossScalaVersions := supportedScalaVersions

publishMavenStyle := true

credentials += publishSettings.credentials

publishTo := publishSettings.publishTo

lazy val lib = (project in file("lib"))
  .settings(
    name := "$project_name;format="lower,hyphen"$",

    libraryDependencies ++= Seq(
      // tests
      "org.scalameta" %% "munit" % "0.7.27" % Test
    )
  )
