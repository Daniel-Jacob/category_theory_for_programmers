fun <F, E> memoize(element: F, f: (F) -> E): E {
    val elements = mutableSetOf<E>()

    fun memoized(element: F): E {
        if (element !in elements) {
            val result = f(element)
            elements.add(result)
        }
        return elements.firstOrNull { it == element } ?: throw IllegalArgumentException("could not find element: $element")
    }
    return memoized(element)
}
