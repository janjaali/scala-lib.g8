ThisBuild / organization := "$organization$"

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scalaVersion := "3.3.3"

lazy val supportedScalaVersions = List("2.13.6", "3.3.3")
ThisBuild / crossScalaVersions := supportedScalaVersions

ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

ThisBuild / scalafixDependencies += {
  "com.github.liancheng" %% "organize-imports" % "0.6.0"
}

publishMavenStyle := true
credentials += publishSettings.credentials
publishTo := publishSettings.publishTo

lazy val lib = (project in file("lib"))
  .settings(
    name := "$project_name;format="lower,hyphen"$",

    libraryDependencies ++= Seq(
      // tests
      "org.scalameta" %% "munit" % "1.0.2" % Test
    )
  )
