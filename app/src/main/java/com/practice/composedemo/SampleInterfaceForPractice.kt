package com.practice.composedemo

interface SampleInterfaceForPractice {
    val someValue: Int
    val someDescription: String
    fun tryThisFun()
    fun retryThisFun()
    fun catchThisFun()
}

abstract class CheckInterface: SampleInterfaceForPractice {

}