package com.practice.composedemo

/**
 * @param name default functions of data class will consider this property
 * @param count default functions of data class will consider this property
 * Default functions won't consider someData field, because it isn't inside the constructor
 * You can override all those functions, except for copy()
 *  The primary constructor of a data class must have at least one parameter and all of those parameters must be val or var
 */
data class DataClassPractice(val name: String, val count: Int) {
    var someData: Int = 0

    override fun toString(): String {
        return "DataClassPractice(name='$name',count=$count,someData=$someData"
    }
}
