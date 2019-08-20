package com.github.ryusa.designpattern.template

class StringDisplay(string : String) : AbstractDisplay() {

    private val string : String = string
    private val line : String = "+" + "-".repeat(this.string.length) + "+"


    override fun open() {
        println(this.line)
    }

    override fun print() {
        println(this.string)
    }

    override fun close() {
        println(this.line)
    }

}
