package com.practice.composedemo

class InheritancePractice {

    /**
     * By default all the classes of kotlin is closed for extension
     * 'open' keyword is used when you want to create a child class or want a class to extend from it
     */
    open class Book(val pages: Int, val author: String, var cost: Float = 0F) {
        fun getFullInfo(): String {
            return "$pages pages, $author author, $$cost cost"
        }
    }

    /**
     * Here comics class(child class) extends from Book class(parent class)
     */
    class Comics(pages: Int, author: String, cost: Float) : Book(pages,author,cost)

    fun main() {
        val spidermanBook = Comics(60, "The Universe", 8.99F)
        print(spidermanBook.getFullInfo())
    }
}