name := "lift-mongo-multiauth"

version := "0.0.1"

organization := "net.liftweb"

scalaVersion := "2.9.2"

EclipseKeys.withSource := true

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"        at "http://oss.sonatype.org/content/repositories/releases",
                  "Omniauth repo" at "https://repository-liftmodules.forge.cloudbees.com/release"
                )

seq(com.github.siasia.WebPlugin.webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5-M3"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "net.liftweb"       %% "lift-mapper"        % liftVersion        % "compile",
    "net.liftmodules" %% "mongoauth" % (liftVersion+"-0.3"),
    "net.liftweb" %% "lift-mongodb-record" % liftVersion,
    "net.liftmodules"   %% "lift-jquery-module" % (liftVersion + "-2.0"),
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.7.v20120910"  % "container,test",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "ch.qos.logback"    % "logback-classic"     % "1.0.9",
    "org.specs2"        %% "specs2"             % "1.12.3"           % "test",
    "net.liftmodules" %% "omniauth" % "2.4-0.7"
  )
}

seq(lessSettings:_*)

(LessKeys.mini in (Compile, LessKeys.less)) := true

(resourceManaged in (Compile, LessKeys.less)) <<= baseDirectory(_ /"src" / "main" / "webapp" / "css")

(LessKeys.filter in (Compile, LessKeys.less)) := "styles.less"



