package com.github.ryusa.designpattern.iterator

/**
 * Book Class
 *
 * @author ryusa
 *
 */
class Book(private val name: String) {

    /**
     * return book's name
     */
    fun getName(): String {
        return this.name;
    }
}
