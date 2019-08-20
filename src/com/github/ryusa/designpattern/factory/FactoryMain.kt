package com.github.ryusa.designpattern.factory

fun main() {
    val factory = IDCardFactory

    val card1 = factory.create("Alice")
    val card2 = factory.create("Bob")
    val card3 = factory.create("M")

    card1.use()
    card2.use()
    card3.use()
}