rootProject.name = "github-actions-experiments"
include("lib")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version "${kotlinVersion}"
        kotlin("plugin.noarg") version "${kotlinVersion}"
    }
}
