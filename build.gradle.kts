import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") apply false
}

group = "ru.edu.otuskotlin.clickhouse"
version = "1.0"

repositories {
    mavenCentral()
}

subprojects {
    group = rootProject.group
    version = rootProject.version
    repositories {
        mavenCentral()
    }

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

}