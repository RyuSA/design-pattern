package com.github.ryusa.designpattern.builder

/**
 * @author ryusa
 */
abstract class Builder {
    public abstract fun makeTitle(title: String)
    public abstract fun makeString(str: String)
    public abstract fun makeItems(items: Array<String>)
    public abstract fun close() : String
}