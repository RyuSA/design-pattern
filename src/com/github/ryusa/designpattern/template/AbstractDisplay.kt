package com.github.ryusa.designpattern.template

/**
 * @author ryusa
 */
abstract class AbstractDisplay {

    /**
     * open a resource
     */
    abstract fun open()

    /**
     * print a resource
     */
    abstract fun print()

    /**
     * close a resource
     */
    abstract fun close()

    /**
     *  Opening a resource, execute print method 5 times. then close it
     */
    final fun display() {
        this.open()
        for (i in 1..5) {
            this.print()
        }
        this.close()
    }

}