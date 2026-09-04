def Scala213 = "3.9.0"
def Scala3 = "3.3.8"

scalaVersion := Scala213

crossScalaVersions := Seq(Scala213, Scala3)

libraryDependencies ++= {
  if (CrossVersion.partialVersion(scalaVersion.value).exists(_._1 == 2)) {
    Seq("com.chuusai" %% "shapeless" % "2.3.13")
  } else {
    Nil
  }
}
