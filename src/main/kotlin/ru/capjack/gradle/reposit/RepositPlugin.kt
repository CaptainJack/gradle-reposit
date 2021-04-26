package ru.capjack.gradle.reposit

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType

class RepositPlugin : Plugin<Project> {
	override fun apply(project: Project) {
		project.extensions.create<RepositExtension>(EXCEPTION, project)
	}
	
	companion object {
		const val EXCEPTION = "reposit"
		
		const val REPO_MAVEN = "https://nexus.capjack.ru/repository/maven"
		const val REPO_MAVEN_PUBLIC = "https://nexus.capjack.ru/repository/maven-public"
		const val REPO_MAVEN_PRIVATE = "https://nexus.capjack.ru/repository/maven-private"
		
		const val PROPERTY_USERNAME = "capjack.reposit.username"
		const val PROPERTY_PASSWORD = "capjack.reposit.password"
	}
}

