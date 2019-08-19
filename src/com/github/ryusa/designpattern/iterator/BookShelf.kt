package com.github.ryusa.designpattern.iterator

/**
 * BookShelf
 *
 * @author ryusa
 *
 */
class BookShelf(names: List<String>) : Aggregate {

    private val books: List<Book> = names.map { name -> Book(name) }
    private val last: Int = names.size

    /**
     * return Book
     */
    public fun getBookAt(index: Int): Book {
        return this.books[index]
    }

    /**
     * return Number of Book this book-shelf contains
     */
    public fun getLength(): Int {
        return this.last
    }

    /**
     * return Book-shelf's iterator
     */
    override fun iterator(): BookShelfIterator {
        return BookShelfIterator(this)
    }

}