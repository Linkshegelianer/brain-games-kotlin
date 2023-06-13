
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")

    testImplementation("org.mockito:mockito-core:3.12.4")
}

application {
    mainClass.set("code.AppKt")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
