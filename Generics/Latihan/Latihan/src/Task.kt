// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("""
        $stringResult
        $intResult
    """.trimIndent())
}

// TODO 1
fun <T> getResult(args: T): Int {
    when (args){
        is Int -> return args*5
        is String -> return args.length
        else -> return 0
    }
}