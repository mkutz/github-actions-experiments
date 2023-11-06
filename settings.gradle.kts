rootProject.name = "github-actions-experiments"
include("lib")

pluginManagement {
    val kotlinVersion = "1.9.20"
    plugins {
        kotlin("jvm") version "${kotlinVersion}"
        kotlin("plugin.noarg") version "${kotlinVersion}"
    }
}
