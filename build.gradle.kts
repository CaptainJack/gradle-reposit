plugins {
	`kotlin-dsl`
	`java-gradle-plugin`
	`maven-publish`
	id("com.gradle.plugin-publish") version "0.14.0"
	id("nebula.release") version "15.3.1"
}

group = "ru.capjack.gradle"

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("gradle-plugin"))
}

gradlePlugin {
	plugins.create("CapjackReposit") {
		id = "ru.capjack.reposit"
		implementationClass = "ru.capjack.gradle.reposit.RepositPlugin"
		displayName = "CapjackReposit"
	}
}

pluginBundle {
	vcsUrl = "https://github.com/CaptainJack/gradle-reposit"
	website = vcsUrl
	description = "Provides access to CaptainJack repositories"
	tags = listOf("capjack")
}

tasks["postRelease"].finalizedBy("publishPlugins")