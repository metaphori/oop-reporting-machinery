import org.danilopianini.VersionAliases.justAdditionalAliases

plugins {
    id("de.fayard.refreshVersions") version "0.30.0"
}

refreshVersions {
    extraArtifactVersionKeyRules = justAdditionalAliases
}

buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    dependencies {
        classpath("org.danilopianini:refreshversions-aliases:+")
    }
}
