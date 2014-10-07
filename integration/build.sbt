resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
  )

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test",
  "com.google.protobuf" % "protobuf-java" % "2.6.0"
)

libraryDependencies <+= (scalaVersion) { v => "org.scala-lang" % "scala-compiler" % v }

fork in Test := true