import org.jetbrains.kotlin.gradle.dsl.kotlinExtension

plugins {
    kotlin("jvm") version "2.0.20" apply false
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    repositories {
        mavenCentral()
    }

    val implementation by configurations
    val testImplementation by configurations

    dependencies {
        if (name != "common") {
            implementation(project(":common"))
        }
        implementation("com.github.ajalt.mordant:mordant:3.0.0")
        testImplementation(kotlin("test"))
        testImplementation("org.assertj:assertj-core:3.26.3")
    }
    tasks.withType<Test> {
       useJUnitPlatform()
    }
}
tasks.withType<Copy> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}