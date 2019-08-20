package com.github.ryusa.designpattern.template

fun main() {
    val aDisplay = CharDisplay('a')
    val bDisplay = CharDisplay('b')

    aDisplay.display()
    bDisplay.display()

    val imymeDisplay = StringDisplay("IMyMe!")
    val testDisplay = StringDisplay("this is sample")

    imymeDisplay.display()
    testDisplay.display()
}
