package libra



import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

object JitPack{
  fun dateDuration(date: String): String {
    val format = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    val past = format.parse(date)
    val current = Date()
    val hours = TimeUnit.MILLISECONDS.toHours(current.time - past.time)
    val days = TimeUnit.MILLISECONDS.toDays(current.time - past.time)
    return when {
      hours < 24 -> "$hours hour(s) ago"
      else -> "$days day(s) ago"
    }
  }
}