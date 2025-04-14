plugins {
    kotlin("jvm")
    kotlin("plugin.noarg")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.12.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation(platform("org.mockito:mockito-bom:5.17.0"))
    testImplementation("org.mockito:mockito-core")
}

tasks.test {
    useJUnitPlatform()
}
