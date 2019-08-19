package com.github.ryusa.designpattern.adaptor

import com.github.ryusa.designpattern.adaptor.given.Banner

/**
 * Wrapping given class(Banner), PrintBanner is Print-implement class without more coding
 */
class PrintBanner(string: String) : Print, Banner(string) {

    override fun printWeak() {
        this.showWithParen()
    }

    override fun printStrong() {
        this.showWithAster()
    }
}