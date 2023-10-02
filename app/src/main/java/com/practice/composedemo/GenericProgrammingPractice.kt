package com.practice.composedemo

/**
 * The type parameter is named with a single letter according to the convention in order to
 * distinguish it from an ordinary class name
 *     T – Type;
 *     S, U, V, etc. – 2nd, 3rd, 4th types;
 *     E – Element (often used by different collections);
 *     K – Key;
 *     V – Value;
 *     N – Number.
 */

class GenericProgrammingPractice {

    class Box<T>(t: T) {
        var value = t
            get() = field
            set(value) {
                field = value
            }
    }

    class Three<T, U, V>(var first: T, var second: U, var third: V)

    // val obj1: Box<Int> = Box<Int>(123)
    // val obj2: Box<String> = Box<String>("abc")

    val obj1 = Box<Int>(123)
    val obj2 = Box<String>("abc")

    // If the class has more than one type parameter, we should specify all of them
    val obj3 = Three<String, Int, Boolean>("Hello",213,true)


    fun genericPrint() {
        println(obj1.value)
        println(obj1.value)
    }

    // creating own collection
    class OwnCollection<T>(val items: MutableList<T>) {
        fun get(index: Int): T {
            return items[index]
        }
        fun length(): Int {
            return items.size
        }
    }

    /**
     * Generic Functions
     */
    fun <T> someGenericFun(t: T): T {
        val someObj = t
        return someObj
    }

    fun <T> calculateLength(list: List<FuncPractice>): Int {
        return list.size
    }

    fun <T, U, V> multipleDoSomething(t: T, u: U, v: V): V {
        // do something
        return v
    }

    /**
     * Example of Generic methods
     */
    class SomeGenericClass<T> {
        // Here this method receives arguments of the class's type T and the method's own type U.
        // The class's type has been already declared in the class header, so we do not need to declare it again in the method.
        fun <U> someGenericMethod(t: T, u: U): T {
            // do something
            return t
        }
    }

    /**
     * Extension functions
     */
    class SomeSwappingBox<T>(var value1: T, var value2: T)

    fun <T> SomeSwappingBox<T>.changeBox() {
        val temp = this.value1
        this.value1 = this.value2
        this.value2 = temp
    }

    fun main(){
        // calling generic function
        println(calculateLength<FuncPractice>(listOf(FuncPractice())))

        // extension function of generic type class example
        val box = SomeSwappingBox("android","kotline")
        println("${box.value1} and ${box.value2}") // android and kotlin
        box.changeBox()
        println("${box.value1} and ${box.value2}") // kotlin and android
    }
}