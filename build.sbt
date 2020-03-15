
name := "GraalVMExperiments"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.graalvm.sdk" % "graal-sdk" % "20.0.0",
  "org.graalvm.truffle" % "truffle-api" % "20.0.0",
  "org.graalvm.js" % "js" % "20.0.0"
)
