# Attempt to reproduce Gradle bug #30498

This is an attempt to reproduce [8.10.1: ClassNotFoundException: com.gradle.develocity.agent.a.a.a](https://github.com/gradle/gradle/issues/30498).

The structure of the build includes 3 build-logic builds. This is so the classloader hierarchy can be made complicated enough to cause Develocity's proxy based method calls to kick-in.

The Develocity version is set at [build-logic/develocity/build.gradle.kts](build-logic/develocity/build.gradle.kts).

The plugin is applied in the [root build](settings.gradle) and in the [build-logic build](build-logic/settings/settings.gradle)

The Gradle wrapper is set at 8.9 since the faulty behavior is already present in that version.

Run the repro attempt with:

     ./gradlew :settings:build --configuration-cache --scan -Dscan.dump
