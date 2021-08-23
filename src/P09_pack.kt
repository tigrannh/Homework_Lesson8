fun <T> pack(list: List<T>): List<List<T>> {
    var newList = mutableListOf< MutableList<T>>()
    for (i in list) {
        if (newList.isEmpty()) newList.add(mutableListOf<T>(i))
        else {

            if (newList[newList.size - 1][0] != i) newList.add(mutableListOf<T>(i))
            else newList[newList.size - 1].add(i)
        }
    }

    return newList
}

