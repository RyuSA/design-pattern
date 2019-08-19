import com.github.ryusa.designpattern.adaptor.PrintBanner
import com.github.ryusa.designpattern.iterator.BookShelf

fun main() {
    val banner = PrintBanner("i am print banner! lol")
    banner.printStrong()
    banner.printWeak()
}