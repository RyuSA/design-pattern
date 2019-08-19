package com.github.ryusa.designpattern.adaptor.given

/**
 *
 * This is a given class. You MUST NOT modify it
 *
 * @author ryusa
 */
open class Banner (string:String){

    private val string = string

    fun showWithParen() {
        println("(" + this.string + ")")
    }

    fun showWithAster() {
        println("*" + this.string + "*")
    }
}