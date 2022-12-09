rootProject.name = "github-actions-experiments"
include("lib")

pluginManagement {
    val kotlinVersion = "1.7.10"
    plugins {
        kotlin("jvm") version "${kotlinVersion}"
        kotlin("plugin.noarg") version "${kotlinVersion}"
    }
}
