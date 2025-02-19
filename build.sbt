name := "telepost"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.0",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.0",
  "javax.mail" % "mail" % "1.4",
  "org.apache.sanselan" % "sanselan" % "0.97-incubator"
)
	
mainClass := Some("Main")

scalaVersion := "2.9.2"

