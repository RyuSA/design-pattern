package com.github.ryusa.designpattern.builder

import java.io.PrintWriter

class HTMLBuilder : Builder() {

    private var buffer = ""

    override fun makeTitle(title: String) {
        buffer += "<h1>$title</h1>"
    }

    override fun makeString(str: String) {
        buffer += "<p>$str</p>"
     }

    override fun makeItems(items: Array<String>) {
        buffer += "<ul>"
        for (item in items) {
            buffer += "<li>$item</li>"
        }
        buffer += "</ul>"
    }

    override fun close() : String{
        return "<html>$buffer</html>"
    }
}