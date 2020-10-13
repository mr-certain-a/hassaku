package hassaku.io

import java.nio.file.Path
import java.nio.file.Paths

fun String.toPath(): Path {
    return Paths.get(this)
}
