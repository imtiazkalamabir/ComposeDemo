package com.practice.composedemo

class LateLazyInitPractice {

    fun main() {
        lateinit var lateText: String // lateinit variable

        // lazy initialization function
        val lazyString: String by lazy {
            "This is a lazy text"
        }
        val someText = "text"
        println(someText)
        println(lazyString)
        println("This is a late init text: ${"someLateText".also { lateText = it }}")
    }
}