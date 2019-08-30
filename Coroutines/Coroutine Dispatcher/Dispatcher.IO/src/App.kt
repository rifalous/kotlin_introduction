import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch(Dispatchers.IO) {
        // TODO: Implement suspending lambda here
    }

    println("Dispatcher IO")
}