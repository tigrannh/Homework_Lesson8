fun <T> encodeDirect(list: List<T>): List<Pair<Int, T>> =
    list.fold(emptyList()) { out, elem ->
        if (out.isEmpty()) listOf(Pair(1, elem))
        else {
            val last = out[out.size - 1]
            if (last.second == elem) out.dropLast(1) + Pair(last.first + 1, elem)
            else out + Pair(1, elem)
        }
    }

