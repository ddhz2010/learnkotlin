package com.davidherndeztechpro.learn.kotlin.fileio

import java.io.File
import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main(args : Array<String>) {
    val lines = readFileLineByLineUsingForEachLine("/home/david/Downloads/Chase3319_Activity_20180922.CSV")
    val transactions = convertLinesToTransactions(lines)
}


fun readFileLineByLineUsingForEachLine(fileName: String)
        = File(fileName).useLines { it.toList() }

fun convertLinesToTransactions(lines : List<String>) : List<Transaction>  {
    val transactions = mutableListOf<Transaction>()
    for (line in lines) {
        val items: List<String> = line.split(",")
        if (items.get(0) == "Details" && items.get(1) == "Posting Date") {
            continue
        }
        val trx = Transaction()
        trx.type = items.get(0)
        trx.postDate = LocalDate.parse(items.get(1), DateTimeFormatter.ofPattern("MM/dd/yyyy"))
        transactions.add(trx)
    }
    return transactions
}

class Transaction {
    var type : String = ""
    var postDate : LocalDate? = null;
}