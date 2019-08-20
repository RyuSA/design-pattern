package com.github.ryusa.designpattern.factory

/**
 * @author ryusa
 */
class IDCard(owner : String) : AbstractCard() {

    /**
     * 所有者の名前(変更不可)
     */
    private val owner : String = owner

    init {
        println("Make Your Card : name : " + this.owner)
    }

    /**
     * カードを使用する
     */
    override fun use() {
        println("Used your card : " + this.owner)
    }

    /**
     * ユーザーの名前を返却する
     */
    fun getName() : String {
        return this.owner
    }
}