import java.util.*
import java.text.DateFormat
import java.text.SimpleDateFormat

fun main(){

    var now =Date()
    var sFormat : SimpleDateFormat

    sFormat = SimpleDateFormat("yyyMMdd")
    println(sFormat.format(now))

    sFormat = SimpleDateFormat("HH:mm:ss")
    println(sFormat.format(now))
}