plugins {
	`kotlin-dsl`
	id("com.gradle.plugin-publish") version "1.2.0"
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
	vcsUrl.set("https://github.com/CaptainJack/gradle-reposit")
	website.set(vcsUrl.get())
	plugins.create("CapjackReposit") {
		id = "ru.capjack.reposit"
		implementationClass = "ru.capjack.gradle.reposit.RepositPlugin"
		displayName = "CapjackReposit"
		description = "Provides access to CaptainJack repositories"
		tags.set(listOf("capjack"))
	}
}

tasks["postRelease"].finalizedBy("publishPlugins")
