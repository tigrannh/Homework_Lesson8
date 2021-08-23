fun <T> duplicate(list: List<T>) = list.flatMap { listOf(it,it) }

