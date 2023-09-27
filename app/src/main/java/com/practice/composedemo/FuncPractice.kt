package com.practice.composedemo

import androidx.compose.runtime.produceState

class FuncPractice {

    //Anonymous Function and func object using Lambda expressions
    val mulFunc = fun(a: Int, b: Int): Int {
        return a * b
    }
    val addFunc = fun(a: Int, b: Int): Int = a + b

    var divFunc = { a: Int, b: Int -> a / b }

    fun main() {
        println(mulFunc(1,2))
        println(addFunc(1,2))
        println(divFunc(1,2))

        fun isNotDot(c: Char): Boolean = c != '.'
        val originalText = "I don't know... what to say..."
        var textWithoutDots = originalText.filter(::isNotDot)
        println(textWithoutDots) // I don't know what to say

        // Applying Lambda
        textWithoutDots = originalText.filter({ c: Char -> c != '.' })
        println(textWithoutDots) // I don't know what to say

        // more simplified lambda applied
        textWithoutDots = originalText.filter { c -> c != '.' }


        // Implicit name of a single parameter: it
        textWithoutDots = originalText.filter { it != '.' }
    }

    // Extension functions
    fun main(str: String) {

        fun String.repeatString(): String = this + this
        val resultString = "wow that's a nice test".repeatString()

        class Customer(val name: String, val age: Int)

        fun Customer.getInfo() = "$name $age"

        val newCustomer = Customer("John",25)
        println(newCustomer.getInfo())



    }
}

