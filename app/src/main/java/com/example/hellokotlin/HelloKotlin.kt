package com.example.hellokotlin

fun main(){

    val name = "Pedro"   // THIS TYPE CANNOT BE CHANGED (CONSTANT VALUE)
    var age = "29"       // THIS TYPE CAN BE CHANGED
    var city : String    // CREATING VARIABLE WITHOUT VALUE YET


    println("Hello Kotlin Developers")
    print("My Friends, ")
    println("My name is " + name + " Amorim")
    println("And I am " + age + " years old")
    city = "Abaeté"


    // What type of DEV am I?
    println("I am a Java Developer")
    println(4+6)
    println("And I live in " + city)

    /*
    Hello this an exemple
    of a multiline comment!
     */

    println()
    println("Integer Numbers: ")
    // Byte: -128 to 127
    val b : Byte = 100
    println("Byte: " + b)

    // Short: -32786 to 327677
    val s : Short = 7000
    println("Short: " + s)

    // Int:
    val i : Int = 5000000
    println("Int: " + i)

    // Long:
    val l : Long = 32424083490385L
    println("Long: " + l)

    println()
    println()
    println("Float-point Numbers:")

    // FLoat:
    val f : Float = 3.34834F
    println("Float: " + f)

    // Double:
    val d : Double = 900.273834643934
    println("Double: " + d)

    println()
    println()

    // Booleans:

    println("Booleans: ")
    val verdade : Boolean = true
    val mentira : Boolean = false

    println("True: " + verdade)
    println("False: " + mentira)
    println()

    println("Boolean Expressions:")
    val a = 10
    val c = 5
    println("Is 10 > 5? " + (a > c) )
    println()
    println()

    println("Characters:")
    val myGrad : Char = 'B'
    println("Char: " + myGrad)



}