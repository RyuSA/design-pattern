package com.github.ryusa.designpattern.factory

import kotlin.RuntimeException

/**
 * @author ryusa
 */
class IDCardFactory : AbstractCardFactory() {

    private var owners : ArrayList<String> = arrayListOf()

    /**
     * カードを生成する
     */
    override fun signName(name: String): AbstractCard {
        return IDCard(name)
    }

    /**
     * 所有者一覧に所有者の名前を追加する
     */
    override fun registerCard(card: AbstractCard) {
        if (card is IDCard) {
            this.owners.add(card.getName())
        } else {
            throw RuntimeException()
        }
    }
}