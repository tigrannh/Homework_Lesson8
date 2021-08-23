fun <T> drop(n: Int, list: List<T>) = list.filterIndexed {
    index, _ -> (index + 1) % n != 0
}

