fun <T> encode(list: List<T>): List<Pair<Int, T>> =
    pack(list).map { Pair(it.size, it[0]) }

