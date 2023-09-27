package com.practice.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.practice.composedemo.ui.theme.ComposeDemoTheme
import java.lang.Exception

const val MY_STRING = "NEW_CONSTANT"
const val MY_NUMBER: Float = 100_000.05F


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }


        val items = listOf("apple", 223, "kiwifruit") // list of items of various types
        // for loop iteration
        for (index in items.indices) {
            println(items.get(index))
        }


        val myMutableList = mutableListOf(1,2,3,4,5,"asdfs","a903u", 100_000L, 100_000.50_00_00F) // mutable list of various types
        myMutableList.add(10)
        myMutableList.add("WOWOJWOJWO")
        val bigNum: Long = 100_000_000_000_000
        val bigFloat: Float = 200_000_000.00F
        val intNumz: Int = bigNum.toInt()
        val intNumzz: Int = bigFloat.toInt()
        val intNumber = 20
        intNumber.toDouble()
        intNumber.toLong()


        val myMutableList2: MutableList<String> = mutableListOf("asfs","262","sfds","e4rt") // mutable list


        val boolFalse: Boolean
        println(isRequired = true, textMsg = "") // declare parameter name if position is changed


        val x = 1
        val y = 9
        if (x in 2..y+1) {
            println("fits in range")
        }

        // WHEN keyword impl
        fun describe(obj: Any): String =
            when (obj) {
                100 -> "wow"
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

        val validNumb = confirmNumbers(10,20)
        println("${describe("Hello")} is necessary") // string template impl

        // value assignation with conditionals
        val max = if ( x > y) {
            x+1
        } else {
            y+1
        }

        val maxNumb = if (x > y) x + 1 else y + 1 // one line if-else condition

        // when impl
        val randNumb = 5
        when (randNumb) {
            1 -> println("One")
            2 -> println("Two")
            5 -> println("Five")
            else -> println("Zero")
        }

        val verifyNumb = when (randNumb) {
            1 -> "VERIFIED NUMBER"
            2 -> "UNVERIFIED"
            3 -> return Unit
            else -> "VERIFICATION FAILED"
        }


        val anyVal: String = "any value" // non-nullable variable
        val something: String? = null // nullable variable

        println(something?.length) // ?. is null safe call

        val s = "string"
        print("$s.length")

        var name: String? = "Kotlin"
        val length: Int? = name?.length
        print(length ?: 0)

        print(name?.length ?: 0) // if name.length is not null then print that otherwise print 0

        val outer: InnerClassPractice = InnerClassPractice("New Info") // outer class instance
        val inner: InnerClassPractice.Sample = outer.Sample("Inner Info") // inner class instance
        inner.printInfo() // inner class function call

    }
}

fun sum(a: Int, b: Int): Int = a + b // function without parenthesis

val sumObject = ::sum // function assign to object

// function impl without parenthesis
fun confirmNumbers(number1: Int, number2: Int): Long =
    if (number1 > number2)
        100_000_000
    else 500_000_000

fun checkNumbers(number1: Int, number2: Int): String =
    if(number1 > number2) {
        "NUMBER @#$%"
    }else {
        "GO BACK..NOTHING HERE"
    }

fun compNumber(number: Int): Int {
    var dNum: Int = sumObject(10,30)
    when {
        number < 0 -> dNum
        number > 10 -> dNum = number+2
        number == 2 -> dNum = number + 10
        else -> dNum = 100
    }

    val num: Int = 12
    val nNum: Int? = num

    return dNum
}


fun someFunc(x: Int) = x
fun someOtherFunc(y: Int) = y + 1
fun randomFunc(z: Int) = z + 100_000L

// function as return type
fun callingFunc(isFunc: Boolean): (Int) -> Int {
    if (isFunc)
        return ::someFunc
    else return ::someOtherFunc
}
val wantedFunc = callingFunc(true) // function object


fun validNumber(number: Int) = number > 0 // Return type Boolean not necessary for declaration here

fun booleanExp (): Int {
    val str: String? = null // nullable val str
    val len: Int? = str?.length //null safety
    str.equals("")
    wantedFunc(100) // call to the function object
    val exampleClass: ExampleClass = ExampleClass(13,"",false)
    exampleClass.isOk = false

    return len ?:0 //Elvis operator returns len if not null otherwise (if null) zero

}

// Function as parameter
fun same(x: Int) = x
fun square(x: Int) = x * x
fun triple(x: Int) = 3 * x

fun applyAndMultiply(a: Int, b: Int, operation: (Int) -> Int): Int {
    return operation(a) * operation(b)
}


// Function Objects
fun isNotDot(c: Char): Boolean = c != '.'

fun isNotDots(c: Char = 'n') = c != '.'

fun resultOfMultiply() {
    val mulOne = applyAndMultiply(1, 2) { it + 1 + 2 } // lambda expression for func as parameter
    val mulTwo = applyAndMultiply(1,2, ::square)
    val mulThree = applyAndMultiply(1,2, ::triple)
    val mulFour = applyAndMultiply(1,2, ::same)

    val someText = "I don't know... what to say..."
    val filteredText = someText.filter(::isNotDot)
}

// Class constructor and default values
class ExampleClass (val name: Int = 10, val age: String = "20 years", var isOk: Boolean = true) {

}

// Class properties with default values
class Patient {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

fun boolExpShort(): Int {
    var name: String? = "Kotlin" // ? nullable variable name of String type
    return name!!.length // assertion
}

fun makeAnException(): Nothing {
    throw Exception("This is an Exception!")
}

fun main() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    val numLong: Long = 100_000_000_000_000
    val cInt = numLong.toInt()
    val checkNumber = abc(1,2)
    print(cInt)
}

fun abc(number1: Int, number2: Int) = number1 > number2

fun interface FI{
    fun testFI()
}

fun println(textMsg: String, isRequired: Boolean): Any {
    // function object
    var totalS: (Int, Int)-> Unit = ::pp
    totalS(5,10)
    /*if(isRequired) {
        println(textMsg)
        return true
    } else {
        return false
    }*/
    /****** Find the kitty cat */
    /*** TODO: Call grandma ***/
    val name_with_space = "asefs"
    val numb = addNumbers(false,1,2)
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    return if(isRequired) println(textMsg) else false
}
 fun pp(a:Int, b:Int)= print("Print values: $a, $b")

/**
 * @param isCheck : wow boolean check
 * @param number1 : fake number 1
 * @param number2 : fake number 2
 */
fun addNumbers(isCheck: Boolean, number1: Int, number2: Int): Int =
    when (isCheck) {
        true -> number1 + number2
        false -> 0
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeDemoTheme {
        Greeting("Android")
    }
}