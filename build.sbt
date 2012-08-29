name := "Scala99"

organization := "ca.polymtl.log4420"

scalaVersion := "2.9.2"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= { Seq(
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)}
