
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10" // <1>

    application // <2>
}

repositories {
    mavenCentral() // <3>
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5") // <4>

    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1") // <5>

    implementation("com.google.guava:guava:31.1-jre") // <6>
}

application {
    mainClass.set("code.AppKt") // <7>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <8>
}
