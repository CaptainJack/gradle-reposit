package ru.capjack.gradle.reposit

import org.gradle.api.Project

open class RepositExtension(project: Project) {
	var publishOnNebulaRelease: Boolean = true
	
	var username: String? = project.findProperty(RepositPlugin.PROPERTY_USERNAME) as String?
	var password: String? = project.findProperty(RepositPlugin.PROPERTY_PASSWORD) as String?
}