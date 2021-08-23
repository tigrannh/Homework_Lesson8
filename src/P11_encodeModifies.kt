fun encodeModified(list: List<Any>): List<Any> =
    pack(list).map {
        if (it.size == 1) it[0]
        else Pair(it.size, it[0])
    }

