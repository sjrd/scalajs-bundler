val scalaJSVersion = sys.props.getOrElse("scalajs.version", sys.error("'scalajs.version' environment variable is not defined"))
val scalaJSBundlerVersion = sys.props.getOrElse("plugin.version", sys.error("'plugin.version' environment variable is not set"))

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % scalaJSBundlerVersion)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.2")

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
