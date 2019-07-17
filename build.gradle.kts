plugins {
	
	kotlin("jvm") version "1.3.40" apply false


}
subprojects {
	apply(plugin = "kotlin")
	repositories {
		// Use jcenter for resolving dependencies.
		// You can declare any Maven/Ivy/file repository here.
		jcenter()
	}
	val implementation by configurations
	dependencies {

		//
		//	val implementation by configurations

		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

		// Use the Kotlin test library.
		val testImplementation by configurations
		testImplementation("org.jetbrains.kotlin:kotlin-test")

		// Use the Kotlin JUnit integration.
		testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
	}


}