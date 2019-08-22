package com.github.ryusa.designpattern.prototype

/**
 * return a string which is repeated a char n times
 */
public fun Char.repeat(n: Int): String {
    var string: String = ""
    for (i in 1..n) {
        string += this
    }
    return string
}
