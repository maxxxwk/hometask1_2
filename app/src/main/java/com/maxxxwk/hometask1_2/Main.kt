package com.maxxxwk.hometask1_2

fun main(){
    var i = 0
    while (i <= 100){
        when {
            i % 3 == 0 -> println("Piff")
            i % 5 == 0 -> println("Paff ")
        }
        i++
    }
}