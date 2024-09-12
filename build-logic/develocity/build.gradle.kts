plugins { 
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.gradle:develocity-gradle-plugin:3.17.6")
}