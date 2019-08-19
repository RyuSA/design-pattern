package com.github.ryusa.designpattern.iterator

class BookShelfIterator(bookshelf: BookShelf) : MyIterator {

    private val bookshelf = bookshelf
    private var index = 0

    override fun hasNext(): Boolean {
        return this.bookshelf.getLength() > this.index
    }

    override fun next(): Book {
        val book = this.bookshelf.getBookAt(this.index)
        this.index++
        return book
    }

}