package com.davidherndeztechpro.learn.kotlin

import com.davidherndeztechpro.learn.kotlin.utils.TimeUtils

fun main(args : Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "ES" -> "¡Hola!"
        "RU" -> "Привет!"
        else  -> "Sorry, I can't greet you in $language yet"
    })

    println("Length of $language = ${len(language)}")
    val nullStr: String? = null
    println("Length of null = ${len(nullStr)}")

    //val sevenDaysAgo : TimeUtils.

}

fun len(str : String?): Int {
    val l = str?.length ?: -1
    //val l = str.length; // compiler error because not null safe
    return l;
}