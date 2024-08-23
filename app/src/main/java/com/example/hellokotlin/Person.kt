package com.example.hellokotlin

open class Person (var name : String, var age : Int) {
    init {
        println()
        println("Creating a New Person right now!")
        println("The Person name : $name ")
        println("The Person age: $age")
    }

    fun talk(){
        println("$name is talking")
    }

    fun walk(){
        println("$name is walking")
    }

    fun eat(){
        println("$name is eating")
    }
}
