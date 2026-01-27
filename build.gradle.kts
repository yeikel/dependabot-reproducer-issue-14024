import org.gradle.api.tasks.wrapper.Wrapper

tasks.named<Wrapper>("wrapper") {
    networkTimeout = 20_000
}