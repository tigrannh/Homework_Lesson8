fun <T> rotate(n: Int, list: List<T>): List<T> {

    if (n == 0)  return list

    val cur: Int = if (n > 0) n % list.size
    else list.size + n % list.size

    return  list.subList(cur, list.size ) + list.subList(0, cur)
}

