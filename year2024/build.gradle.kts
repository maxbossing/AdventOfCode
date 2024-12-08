sourceSets {
    test {
        resources {
            srcDir("src/test/resources")
        }
    }
}
tasks {
    processTestResources {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }
}