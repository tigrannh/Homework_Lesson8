fun <T> compress(list: List<T>): List<T> {
    var newList = emptyList<T>()
    for (i in list) {
        if (newList.isEmpty()) newList = newList + i
        else if (newList[newList.size-1] != i) newList = newList + i
    }

    return newList
}

