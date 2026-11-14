
ThisBuild / scalaVersion := "2.13.13"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.training"

val sparkVersion = "4.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "employee-spark",

    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    ),

    Test / parallelExecution := false,

    // Run tests in a separate JVM
    Test / fork := true,

    // Allow Spark to access the Java DirectBuffer class
    Test / javaOptions ++= Seq(
      "--add-exports=java.base/sun.nio.ch=ALL-UNNAMED"
    )
  )
