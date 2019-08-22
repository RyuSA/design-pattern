package com.github.ryusa.designpattern.prototype

interface MessageProduct {
    public abstract fun use(string: String)
    public abstract fun createClone(): MessageProduct
}