package org.gradle.kotlin.dsl

import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import ru.capjack.gradle.reposit.RepositExtension
import ru.capjack.gradle.reposit.RepositPlugin

fun RepositoryHandler.mavenCapjack(): MavenArtifactRepository {
	return maven(RepositPlugin.REPO_MAVEN)
}

fun RepositoryHandler.mavenCapjack(reposit: RepositExtension): MavenArtifactRepository {
	return maven(RepositPlugin.REPO_MAVEN).configureCredentials(reposit)
}

fun RepositoryHandler.mavenCapjackPublic(reposit: RepositExtension): MavenArtifactRepository {
	return maven(RepositPlugin.REPO_MAVEN_PUBLIC).configureCredentials(reposit)
}

fun RepositoryHandler.mavenCapjackPrivate(reposit: RepositExtension): MavenArtifactRepository {
	return maven(RepositPlugin.REPO_MAVEN_PRIVATE).configureCredentials(reposit)
}


private fun MavenArtifactRepository.configureCredentials(reposit: RepositExtension): MavenArtifactRepository {
	credentials.username = reposit.username
	credentials.password = reposit.password
	return this
}