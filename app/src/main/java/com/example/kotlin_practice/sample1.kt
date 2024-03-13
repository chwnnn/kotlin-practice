package com.example.kotlin_practice

fun main() {

}
// 4. 조건식

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
}

//// 1. 함수
//fun helloWorld() {
//    println("Hello World")
//}
//
//fun add(a: Int, b: Int): Int {
//    return a + b
//}
//
//// 2. val vs var
//// val = value
//
//fun hi() {
//    val a: Int = 10
//    var b: Int = 9
//
//    var e = String
//
//    b = 100
//
//    var name = "kotlin"
//}
// 3. String Template
//
//    val name = "Chaewoon"
//    val lastName = "Kim"
//    println("my name is ${name + lastName}I'm 19")
//
//    println("this is 2\$a")