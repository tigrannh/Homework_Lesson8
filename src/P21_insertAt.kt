fun <T> insertAt(value: T, n: Int, list: List<T>): List<T> =
    List(list.size + 1) {index ->
        if (index < n) list[index]
        else if(index == n) value
        else list[index - 1]
     }

