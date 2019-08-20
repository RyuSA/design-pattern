package com.github.ryusa.designpattern.template

class CharDisplay(char: Char) : AbstractDisplay() {

    private val char : Char = char

    override fun open() {
        print("<<")
    }

    override fun print() {
        print(this.char)
    }

    override fun close() {
        println(">>")
    }
}