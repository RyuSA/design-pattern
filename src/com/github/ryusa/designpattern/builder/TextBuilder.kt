package com.github.ryusa.designpattern.builder

class TextBuilder : Builder() {

    private var buffer = ""

    override fun makeTitle(title: String) {
        buffer += "===================================\n"
        buffer += "「$title」\n\n"
    }

    override fun makeString(str: String) {
        buffer += "■ $str \n\n"
    }

    override fun makeItems(items: Array<String>) {
        buffer += "===================================\n"
    }

    override fun close() : String{
        return buffer
    }
}