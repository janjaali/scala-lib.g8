ThisBuild / organization := "janjaali"

ThisBuild / version := "1.6.0-SNAPSHOT"
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scalaVersion := "2.12.16"

ThisBuild / scalafixDependencies += {
  "com.github.liancheng" %% "organize-imports" % "0.5.0"
}

lazy val lib = (project in file("."))
  .settings(
    name := "scala-lib",

    libraryDependencies ++= Seq(
      // tests
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
