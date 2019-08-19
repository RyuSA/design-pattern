package com.github.ryusa.designpattern.iterator

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

interface MyIterator {
    fun hasNext(): Boolean
    fun next(): Any
}