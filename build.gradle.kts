plugins {
    kotlin("jvm") version "1.8.20"
}

group = "br.com.enginez"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}