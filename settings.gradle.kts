plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "reproducer-project"
include("a")
include("a:b")
findProject(":a:b")?.name = "b"
