/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.9/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    alias(libs.plugins.jvm)

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation(libs.junit.jupiter.engine)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
    implementation("org.postgresql:postgresql:42.7.3")
    implementation("org.jdbi:jdbi3-postgres:3.45.3")
    implementation("org.jdbi:jdbi3-sqlobject:3.45.3")
    implementation("io.dropwizard:dropwizard-core:5.0.0-alpha.1")
    implementation("org.jdbi:jdbi3-core:3.45.3")
    implementation("io.dropwizard:dropwizard-db:5.0.0-alpha.1")
    implementation("io.dropwizard:dropwizard-jdbi3:5.0.0-alpha.1")


}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<JavaExec> {
    args = listOf("server", "../config.yml")
}

application {
    // Define the main class for the application.
    mainClass.set("org.example.APIApplication")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
