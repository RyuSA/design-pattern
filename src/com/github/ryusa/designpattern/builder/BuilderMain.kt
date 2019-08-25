package com.github.ryusa.designpattern.builder

fun main() {
    val hemlDirector: Director = Director(HTMLBuilder())
    println(hemlDirector.construct())

    val textDirector: Director = Director(TextBuilder())
    println(textDirector.construct())

}
