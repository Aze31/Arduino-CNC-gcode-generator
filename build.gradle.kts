plugins {
    kotlin("jvm") version "1.9.0" // Kotlin JVM plugin
}

group = "com.example"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17 // Set Java compatibility
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.poi:poi-ooxml:5.2.3")

    // JavaFX for GUI
    implementation("org.openjfx:javafx-controls:17.0.2")
    implementation("org.openjfx:javafx-fxml:17.0.2")

    // JUnit for testing - PLEASE BRING BACK
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.jar {
    manifest {
        //attributes["Main-Class"] = "com.example.ExcelProcessor" // Set main class
    }
}

tasks.register<JavaExec>("run") {
    //mainClass.set("com.example.ExcelProcessor") // runs the java code
    classpath = sourceSets.main.get().runtimeClasspath
}
