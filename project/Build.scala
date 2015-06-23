import sbt._
import Keys._

object ProjectBuild extends Build {

  val ScalaVersion = "2.11.6"

  lazy val root = Project(
    id = "sbt-release-sample",
    base = file("."),
    settings = Seq(
      scalaVersion := ScalaVersion
    )
  )

}
