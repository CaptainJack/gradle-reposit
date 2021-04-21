package ru.capjack.gradle.reposit

import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.AuthenticationSupported
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.kotlin.dsl.maven

open class RepositExtension(project: Project) {
	var username: String? = project.findProperty(RepositPlugin.PROPERTY_USERNAME) as String?
	var password: String? = project.findProperty(RepositPlugin.PROPERTY_PASSWORD) as String?
}