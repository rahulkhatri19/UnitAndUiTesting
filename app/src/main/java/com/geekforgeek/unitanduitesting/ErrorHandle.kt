package com.geekforgeek.unitanduitesting

import android.util.Log

class ErrorHandle {
}

fun main() {
    val user:Int = 0
    println("User value $user")


    try {
        user/0
    } catch (e:Exception){
        user/3
    }

}