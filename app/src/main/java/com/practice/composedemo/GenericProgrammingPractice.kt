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



}