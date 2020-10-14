package hassaku.io

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.stream.Stream

fun Path.createDirectories(): Path {
    return Files.createDirectories(this)
}

fun Path.list(): Stream<Path> {
    return Files.list(this)
}

fun Path.delete() {
    Files.delete(this)
}

fun String.toPath(): Path {
    return Paths.get(this)
}

val Path.isDirectory: Boolean
    get() = Files.isDirectory(this)

val Path.nameWithoutExtension: String
    get() = this.toFile().nameWithoutExtension

val Path.extension: String
    get() = this.toFile().extension

