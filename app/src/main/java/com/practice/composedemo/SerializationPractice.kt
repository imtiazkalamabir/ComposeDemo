package com.practice.composedemo

import kotlinx.serialization.*
import kotlinx.serialization.json.*


class SerializationPractice {

    @Serializable
    class Test(val name: String, val integerNumber: Int, val realNumber: Double, val listString: List<String>, val setInteger: Set<Int>)

    fun main() {
        val listStr = listOf("One", "Two", "Three")
        val setNum = setOf(1, 0, 2, 9)
        val instance = Test("test", 42, 15.55, listStr, setNum)
        // val serialized = Json.encodeToString(instance)
        // println(serialized)
        // Output: {"name":"test","integerNumber":42,"realNumber":15.55,"listString":["One","Two","Three"],"setInteger":[1,0,2,9]}

        val jsonPrettyPrint = Json { prettyPrint = true }
        val serialized = jsonPrettyPrint.encodeToString(instance)
        println(serialized)

        // Output:
        /*{
            "name": "test",
            "integerNumber": 42,
            "realNumber": 15.55,
            "listString": [
            "One",
            "Two",
            "Three"
            ],
            "setInteger": [
            1,
            0,
            2,
            9
            ]
        }*/
    }
}