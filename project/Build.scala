import sbt._
import Keys._

object ProjectBuild extends Build {

  val ScalaVersion = "2.11.6"
  val PublishLocation = "./target/releases"

  lazy val root = Project(
    id = "sbt-release-sample",
    base = file("."),
    settings = Seq(
      scalaVersion := ScalaVersion,
      publishTo := Some(Resolver.file("file",  new File( PublishLocation )) )
    )
  )

}
