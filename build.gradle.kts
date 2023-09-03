plugins {
    application 
}

repositories {
    mavenCentral() 
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3") 

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.google.guava:guava:32.1.1-jre") 
}

application {
    mainClass.set("demo.App") 
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}