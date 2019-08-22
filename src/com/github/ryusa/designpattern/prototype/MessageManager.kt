package com.github.ryusa.designpattern.prototype

object MessageManager {

    private var showCase = mutableMapOf<String, MessageProduct>()

    public fun register(productName: String, product: MessageProduct) {
        this.showCase.putIfAbsent(productName, product)
    }

    public fun createClone(productName: String) : MessageProduct?{
        return this.showCase[productName]?.createClone()
    }
}