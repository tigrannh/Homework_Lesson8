fun <T> lengthSort(list: List<List<T>>): List<List<T>> = list.sortedBy { it.size }

fun <T> lengthFreqSort(list: List<List<T>>): List<List<T>> {
    val map = list.groupBy { it.size }
    return list.sortedBy { map.getValue(it.size).size }
}
