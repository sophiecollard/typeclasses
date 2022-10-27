ThisBuild / organization     := "com.github.sophiecollard"
ThisBuild / organizationName := "SophieCollard"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion     := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "typeclasses",
    libraryDependencies ++= Dependencies.list,
    scalacOptions ++= Seq(
      "-deprecation",
      "-Xfatal-warnings",
      "-Ywarn-dead-code",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Ywarn-unused"
    )
  )

addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)
