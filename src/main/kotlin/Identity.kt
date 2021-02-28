fun <T> identity(t: T) = t

fun <T, R, S> compose(element: T, func1: (T) -> R, func2: (R) -> S): S {
    return func2(func1(element))
}