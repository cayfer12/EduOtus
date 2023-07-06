rootProject.name = "education"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false

    }
}

include("click-house")

