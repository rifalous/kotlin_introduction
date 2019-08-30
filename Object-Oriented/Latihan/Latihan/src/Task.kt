// TODO 1
class Cat(private val name: String) {
    private var sleep: Boolean = false

    fun getSleep(): Boolean = sleep

    fun setSleep(value: Boolean){
        sleep = value
    }

    fun toSleep() {
        when(sleep){
            true -> println("""
                Fungsi getter dipanggil
                $name, sleep!
            """.trimIndent())
            false -> println("""
                Fungsi getter dipanggil
                $name, let's play!
                Fungsi setter dipanggil
            """.trimIndent())
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.setSleep(true)
    gippy.toSleep()
}