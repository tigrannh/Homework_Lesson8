fun <T> decode(list: List<Pair<Int, T>>): List<T> =
    list.flatMap { (first, second) -> List(first) { index -> second } }

