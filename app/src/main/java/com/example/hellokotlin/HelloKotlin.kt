package com.example.hellokotlin

fun main(){

    val name = "Pedro"   // THIS TYPE CANNOT BE CHANGED (CONSTANT VALUE)
    var age = 29       // THIS TYPE CAN BE CHANGED
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
    println()

    myFirstFunction()
    myFirstFunction()

    mySecondFunction(name, age, myGrad)

    println()
    println()

    var result = addTwoNumbers(5555,8000)
    println("Result : " + result)

    println()
    println("Adding and printing three numbers in one line of code: ")
    println("Here they are: " + (addThreeNumbers(10,15,25)))
    println()
    println()

    // Create a c1 object of the Car Class
    var c1 = Car("Ferrari", 1950, "Green")

    // Access attributes/properties from the object
    println("Brand: " + c1.brand)
    println("Year: " + c1.year)
    c1.color = "New Black"
    println("Color: " + c1.color)

    // Instância na memória do objeto criado
    println(c1)

    // Access the function/methods of the object
    c1.drive()
    c1.brake()

    // CREATING BETTER OBJECTS:
    var teacher01 = Teacher("Luis Henrique", 30)
    teacher01.walk()
    teacher01.talk()
    teacher01.eat()

    var player01 = Player("Jorge Vinicius", 22)
    player01.talk()
    player01.walk()
    player01.eat()

    var business01 = BusinessMan("Pedro Cássio", 30)
    business01.talk()
    business01.walk()
    business01.eat()

}

fun myFirstFunction(){
    println("This is just the Beginning, Baby!")
}

fun mySecondFunction(name : String, age : Int, char : Char){
    println("Hello " + name)
    println("Your age is " + age)
    println("Your character is " + char)
}

fun addTwoNumbers (x : Int, y : Int) : Int {
    return x + y
}

fun addThreeNumbers(x : Int, y : Int, z : Int) = (x + y + z)