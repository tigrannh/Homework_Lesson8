fun <T> group3(list: List<T>): List<List<List<T>>> {
    if (list.size >=9) {
        var result = mutableListOf<List<List<T>>>()
        for (i in combinations(2, list)) {
            val cur = list.filterNot { i.contains(it) }
            for (j in combinations(3, cur)) {
                val cur2 = cur.filterNot { j.contains(it) }
                for (k in combinations(4, cur2)) {
                    result.add(listOf(i, j, k))
                }
            }
        }

        return result
    }
    else return emptyList()
}


fun <T> group(sizes: List<Int>, list: List<T>): List<List<List<T>>>{
    if (list.size >=9) {
        var result = mutableListOf<List<List<T>>>()
        for (i in combinations(sizes[0], list)) {
            val cur = list.filterNot { i.contains(it) }
            for (j in combinations(sizes[1], cur)) {
                val cur2 = cur.filterNot { j.contains(it) }
                for (k in combinations(sizes[2], cur2)) {
                    result.add(listOf(i, j, k))
                }
            }
        }

        return result
    }
    else return emptyList()

}
