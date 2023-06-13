import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    id("org.jetbrains.kotlin.kapt") version "1.6.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "ltd.matrixstudios"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven(url = "https://repo.lucko.me/")
    maven(url = "https://repo.aikar.co/content/groups/aikar/")
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")
    implementation("co.aikar:acf-paper:0.5.1-SNAPSHOT")
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}