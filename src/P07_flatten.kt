fun flatten(list: List<Any>): List<Any> =
    list.flatMap {
        if (it is List<*>) flatten(it as List<Any>) else listOf(it)
    }

