import kotlinx.coroutines.*
import java.io.File

fun main() = runBlocking{

    val file = File("example.txt")
    file.createNewFile()

    val job = launch (Dispatchers.IO){
        for (number in 43..181){
            file.appendText("$number\t" )
            plusNumber(number)
        }
    }
    job.join()
}
fun plusNumber (number: Int): Int{
    print("${number}\t")
    number.plus(1)
    return number
}