import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    `maven-publish`
    application
}

group = "org.bank"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    //okHttp
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("com.github.xBaank:simpleJson:5.0.2")
    //junit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    //kluent
    testImplementation("org.amshove.kluent:kluent:1.72")
}

//publish
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}