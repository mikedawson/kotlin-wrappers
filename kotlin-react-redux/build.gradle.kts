plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    compile(project(":kotlin-extensions"))
    compile(project(":kotlin-react"))
    compile(project(":kotlin-redux"))
}
