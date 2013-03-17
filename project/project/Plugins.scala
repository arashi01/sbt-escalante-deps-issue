import sbt._
import Keys._

object Plugins extends Build {
  lazy val pluginProject = Project("plugins", file(".")).settings(
    resolvers ++= Seq(
      "JBoss repository" at "http://repository.jboss.org/nexus/content/groups/public/",
      "Project Odd repository" at "http://repository-projectodd.forge.cloudbees.com/upstream/")
    // addSbtPlugin("io.escalante.sbt" % "sbt-escalante" % "0.1.1")  Currently causes dependency resolution errors due to
    // https://github.com/sbt/sbt/issues/647.  Using git dependency instead.
  ).dependsOn(sbtEscalante)
  
  lazy val sbtEscalante = uri("git://github.com/escalante/sbt-escalante.git#0.1.1")
}
