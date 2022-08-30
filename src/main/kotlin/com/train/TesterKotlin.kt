package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets:  ")
    var RTticket = scanner.nextInt()
    val tic = Ticket(ticket, RTticket)
    tic.print()
}

class Ticket(var ticket: Int, var RTticket: Int) {
    fun print() {
        println("Total tickets: " + ticket + "\n" + "Round-trip: " + RTticket +
                "\n" + "Total: " + ((ticket - RTticket) * 1000 + RTticket * 2000 * 0.9))
    }
}