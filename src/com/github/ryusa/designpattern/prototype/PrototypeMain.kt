package com.github.ryusa.designpattern.prototype

fun main() {

    val manager = MessageManager
    val strongMessage = "strong message"
    val warningBox = "warning box"
    val slashBox = "slashBox"

    manager.register(strongMessage, UnderlineProduct('~'))
    manager.register(warningBox, MessageBoxProduct('*'))
    manager.register(slashBox, MessageBoxProduct('/'))

    val product1 = manager.createClone(strongMessage)!!
    product1.use("sample1")

    val product2 = manager.createClone(warningBox)!!
    product2.use("sample2")

    val product3 = manager.createClone(slashBox)!!
    product3.use("sample3")

}