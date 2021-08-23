fun <T> removeAt(n: Int, list: List<T>): Pair<List<T>, T> =
    Pair(list.filterIndexed { index, _ ->  index != n}, list[n])

