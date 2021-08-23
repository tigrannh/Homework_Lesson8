import kotlin.random.Random

fun <T> randomPermute(list: List<T>, random: Random = Random): List<T> =
        randomSelect(list.size, list, random)

