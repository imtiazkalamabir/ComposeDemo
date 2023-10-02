package com.practice.composedemo

import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.ui.text.toUpperCase
import java.util.Locale

enum class EnumPractice (val somevalue: String, val order: Int) {
    FIRST("First",100),
    SECOND("Second",200),
    THIRD("Third",300),
    FOURTH("Fourth",400),
    FIFTH("Fifth",500);

    fun printFullInfo() {
        println("someValue: $somevalue, order: $order")
    }

    fun main(){
        val text = EnumPractice.FIRST
        text.printFullInfo() // someValue: FIRST, order: 100
        println(text.name) // FIRST
        println(text.ordinal) // 0
        println(text.somevalue) // First
        println(text.order) // 100
        println(text.isValid("TENTH")) // false
        println(EnumPractice.values())
        println(EnumPractice.valueOf(EnumPractice.FIFTH.name))
    }

    fun isValid(text: String): Boolean {
        for(enum in EnumPractice.values()) {
            if (text.uppercase(Locale.ROOT) == enum.name) return true
        }
        return false
    }
}