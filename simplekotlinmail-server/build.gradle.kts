@file:Suppress("UNUSED_VARIABLE")

/**
 * PLUGINS
 */

plugins {
    `common-build-script`
}

/**
 * DEPENDENCY MANAGEMENT
 */

kotlin {
    sourceSets {
        val jvmMain by getting {

            dependencies {

                implementation(project(":${rootProject.name}-core"))

                // SUBETHA SMTP
                implementation("org.subethamail:subethasmtp:3.1.7")

            }

        }
    }
}