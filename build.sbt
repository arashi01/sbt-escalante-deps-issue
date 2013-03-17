import sbt._
import sbt.Keys._
import io.escalante.sbt.EscalantePlugin._
import io.escalante.sbt.EscalantePlugin.EscalanteKeys._

version := "0.2.0-SNAPSHOT"

scalaVersion := "2.9.1"

escalanteSettings

liftWarName in liftWar := "escalante-sbt-helloworld-lift.war"

liftVersion in liftWar := Some("2.4")

libraryDependencies <++= (liftVersion in liftWar) { lv: Option[String] => Seq(
  "net.liftweb" %% "lift-webkit" % lv.get % "provided",
  "org.squeryl" %% "squeryl" % "0.9.5-6" % "compile",
  "org.fusesource.scalamd" % "scalamd_2.9" % "1.6")
}
