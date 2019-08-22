package com.github.ryusa.designpattern.prototype

class UnderlineProduct(char: Char) : MessageProduct {

    private val decoChar: Char = char

    public override fun use(string: String) {
        println(this.decoChar.repeat(string.length + 4))
        println("$decoChar $string $decoChar")
        println(this.decoChar.repeat(string.length + 4))
    }

    public override fun createClone(): MessageProduct {
        return UnderlineProduct(this.decoChar)
    }
}

