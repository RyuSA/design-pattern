package com.github.ryusa.designpattern.factory

/**
 * @author ryusa
 */
abstract class AbstractCardFactory {

    /**
     * カードに名前を付与し、登録を行う
     */
    final fun create(owner: String): AbstractCard {
        val card: AbstractCard = signName(owner)
        registerCard(card)
        return card
    }

    /**
     * カードに名前を付与する
     */
    protected abstract fun signName(name: String): AbstractCard

    /**
     * 名前を登録する
     */
    protected abstract fun registerCard(card: AbstractCard)
}