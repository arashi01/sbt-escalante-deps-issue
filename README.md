## What is it?

This example demonstrates a packaging issue affecting sbt-escalante versions <= 0.1.1.

*See:* escalante/sbt-escalante#12

To reproduce issue:

From root project directory

-  run `mvn package`
-  explode war artefact produced by Maven build (located at `<project root>/target/escalante-maven-helloworld-lift.war`)
-  observe that `WEB-INF/lib` directory in maven produced war contains runtime jar dependencies
-  run `sbt escalante-lift-war`
-  explode war artefact produced by sbt build (located at `<project root>/target/escalante-sbt-helloworld-lift.war`)
-  observe that `WEB-INF/lib` directory is absent in sbt-escalante produced war
