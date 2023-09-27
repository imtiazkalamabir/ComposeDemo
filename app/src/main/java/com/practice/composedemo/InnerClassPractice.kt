package com.practice.composedemo

class InnerClassPractice(val info: String) {
    val description = "Practice Class"
    fun printPractice() {
        println("Printing info: $info with description: $description")
        println("Printing inner class property info: ${Sample("wiki").info}") // accessing inner class property

    }
    inner class Sample(val info: String) {
        fun printInfo() {
            printPractice() // accessing the outer class functions from inner class
            println("This $info belongs to $this@InnerClassPractice.info") // accessing outer class properties from inner class
        }
    }

    fun main() {
        val parent = InnerClassPractice("Book")
        val inner: InnerClassPractice.Sample = parent.Sample("Encyclopedia")
        inner.printInfo() // accessing inner class function
        parent.printPractice() // accessing inner class function
    }
}