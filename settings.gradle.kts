rootProject.name = "github-actions-experiments"
include("lib")

pluginManagement {
    val kotlinVersion = "2.0.0"
    plugins {
        kotlin("jvm") version "${kotlinVersion}"
        kotlin("plugin.noarg") version "${kotlinVersion}"
    }
}
