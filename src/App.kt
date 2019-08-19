import com.github.ryusa.designpattern.iterator.BookShelf

fun main() {
    val names = listOf("this", "that", "hodge")
    val target = BookShelf(names = names)

    val itrt = target.iterator()

    while (itrt.hasNext()) {
        println(itrt.next().getName())
    }
}