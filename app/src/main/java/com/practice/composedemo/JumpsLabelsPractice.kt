package com.practice.composedemo

class JumpsLabelsPractice {

    fun loopBreakNumbers() {
        // here loop@ is an identifier for the loop
        loop@ for (i in 1..3) {
            for (j in 1..3) {
                println("i = $i, j = $j")
                if (j == 3) break@loop // breaks the inner and outer loop
            }
        }
    }

    fun loopContinueNumbers() {
        loop@ for (i in 1..3) {
            for (j in 1..3) {
                for (k in 1..5) {
                    if (k == 3) continue@loop // continue to next iteration from the outer loop at k = 3
                    println("i = $i, j = $j, k = $k")
                }
            }
        }

        for (i in 1..7) {
            loop@ for (j in 1..6) {
                for (k in 1..5) {
                    if (k == 4) continue@loop // continue to next interation from the middle loop at k = 4
                    println("i = $i, j = $j, k = $k")
                }
            }
        }
    }

    fun loopWithWhen() {
        loop@ for (i in 1..10) {
            when (i) {
                3 -> continue@loop // continue to next iteration from the outer loop at i = 3
                6 -> break@loop // break from outer loop at i = 6
                else -> println(i)
            }
        }
    }
}