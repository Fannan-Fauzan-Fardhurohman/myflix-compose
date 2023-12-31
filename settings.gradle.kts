pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Myflix"
include(":app")
include(":core")
include(":feature-auth:api")
include(":feature-auth:impl")
include(":feature-home:api")
include(":feature-home:impl")
include(":feature-favorite:api")
include(":feature-profile:api")
include(":feature-profile:impl")
include(":design-system")
include(":feature-favorite:impl")
