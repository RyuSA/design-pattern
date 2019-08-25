package com.github.ryusa.designpattern.builder

/**
 * @author ryusa
 */
class Director(private val builder: Builder) {

    public fun construct(): String {
        builder.makeTitle("Greeting")
        builder.makeString("月月火水木金金")
        builder.makeItems(arrayOf("おはよう", "こんにちは"))
        builder.makeString("夜中に")
        builder.makeItems(arrayOf("hoge", "huga"))
        return builder.close()
    }
}