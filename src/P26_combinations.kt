fun <T> combinations(n: Int, list: List<T>): List<List<T>>{
    if (n == 0) return mutableListOf()

    if (n == 1) return list.map { listOf(it) }

    val out = mutableListOf<List<T>>()
    val x = combinations(n-1, list)
    for (i in list){
        for (j in x){
            if (!j.contains(i)) {
                val cur =  j + i
                if (!(out.any { elem -> elem.containsAll(cur) && cur.containsAll(elem) }))
                    out.add( j + i)
            }
        }
    }

    return out


}
