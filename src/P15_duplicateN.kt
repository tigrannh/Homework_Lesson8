fun <T> duplicateN(N:Int, list: List<T>) = list.flatMap { x -> List(N) {x} }

