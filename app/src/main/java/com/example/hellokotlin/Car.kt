package com.example.hellokotlin

import java.time.Year

class Car(var brand : String,
          var year: Int,
          var color : String) {

    // ATTRIBUTES => PROPERTY
    // VARIABLES THAT BELONG TO THE CLASS




    // CONSTRUCTORS



    // METHODS / FUNCTIONS => BEHAVIOUR
    fun drive(){
        println("Driving...")
    }

    fun brake(){
        println("Breaking...")
    }

}