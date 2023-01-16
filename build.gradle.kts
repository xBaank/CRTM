import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val jaxws by configurations.creating

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

group = "org.bank"
version = "0.2.0"

plugins {
    kotlin("jvm") version "1.7.21"
    `maven-publish`
   // application
}

dependencies {
    jaxws("com.sun.xml.ws:jaxws-tools:4.0.0")
    //jaxws("com.sun.xml.ws:jaxws-rt:2.1.4")

    //jaxws("com.sun.xml.ws:runtime:2.3.2")
    //jaxws("javax.xml.ws:jaxws-api:2.3.1")

    implementation("com.sun.xml.ws:jaxws-tools:4.0.0")
    //implementation("com.sun.xml.ws:jaxws-rt:2.1.4")

    //implementation("com.sun.xml.ws:runtime:2.3.2")
    //implementation("javax.xml.ws:jaxws-api:2.3.1")


    //arrow kt
    implementation("io.arrow-kt:arrow-core:1.1.3")
    //okHttp
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("com.github.xBaank:simpleJson:6.0.0")
    //junit 5
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    //kluent
    testImplementation("org.amshove.kluent:kluent:1.72")
    implementation(kotlin("stdlib-jdk8"))
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

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
}

task("wsimport-myservice") {
    group = BasePlugin.BUILD_GROUP
    val destDir = file("$projectDir/src/main/java")
    destDir.mkdirs()
    val sourceDestDir = file("$projectDir/src/main/java")
    sourceDestDir.mkdirs()
    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to jaxws.asPath
            )

            "wsimport"(
                "keep" to true,
                "sourcedestdir" to sourceDestDir,
                //"destDir" to destDir, alreaddy compiled java classes, not needed
                "package" to "crtm.soap",
                "wsdl" to "http://www.citram.es:8080/WSMultimodalInformation/MultimodalInformation.svc?wsdl",
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}