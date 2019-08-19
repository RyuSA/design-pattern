package com.github.ryusa.designpattern.iterator

/**
 * Iterator generator
 *
 * @author ryusa
 *
 */
interface Aggregate {
    fun iterator() :MyIterator;
}