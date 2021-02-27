fun <T> identity(t: T) = t

fun <T, R, S> T.compose(func1: (T) -> R, func2: (R) -> S): S {
    return func2(func1(this))
}