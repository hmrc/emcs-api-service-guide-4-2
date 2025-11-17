import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "9.10.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootStrapPlayVersion)

  val test: Seq[ModuleID] = Seq(
    "org.pegdown"   %  "pegdown"                    % "1.6.0"                % Test,
    "org.scalatest" %% "scalatest"                  % "3.0.8"                % Test,
    "uk.gov.hmrc"   %% "bootstrap-test-play-30"     % bootStrapPlayVersion   % Test
  )
}
