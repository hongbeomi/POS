package processor

interface Processor<T> {
    fun process(): T
}