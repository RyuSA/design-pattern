package com.github.ryusa.designpattern.iterator

fun main() {
    val names = listOf("this", "that", "hodge")
    val target = BookShelf(names = names)

    val itrt = target.iterator()

    while (itrt.hasNext()) {
        println(itrt.next().getName())
    }
}