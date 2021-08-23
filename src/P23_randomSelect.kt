import kotlin.random.Random

fun <T> randomSelect(n: Int, list: List<T>, random: Random = Random): List<T>{
    val ret = mutableListOf<T>()
    val lt = list.toMutableList()
    for (i in 1..n){
        val cur = random.nextInt(lt.size)
        ret.add(lt[cur])
        lt.removeAt(cur)
    }

    return ret
}

