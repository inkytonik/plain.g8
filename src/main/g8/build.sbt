name := "$name$"

version := "$version$"

organization := "$organization$"

// Scala compiler settings

scalaVersion := "$scalaversion$"

scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked")

// Interactive settings

logLevel := Level.Info

shellPrompt in ThisBuild := {
    state =>
        Project.extract(state).currentRef.project + " " + version.value +
            " " + scalaVersion.value + "> "
}

// Dependencies

libraryDependencies ++=
    Seq (
        "org.scalatest" %% "scalatest" % "3.2.3" % "test"
    )

resolvers ++= Seq (
    Resolver.sonatypeRepo ("releases"),
    Resolver.sonatypeRepo ("snapshots")
)
