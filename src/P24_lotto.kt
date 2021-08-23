import kotlin.random.Random

fun lotto(count: Int, to: Int, random: Random = Random): List<Int> =
    randomSelect(count, (1..to).toList(), random)