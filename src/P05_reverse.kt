fun <T> reverse(list: List<T>): List<T> {
    return List(list.size){index -> list[list.size - 1 - index]}
}

