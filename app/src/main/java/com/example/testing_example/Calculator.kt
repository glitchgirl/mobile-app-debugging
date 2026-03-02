package com.example.testing_example

class Calculator {

    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }

    fun average(numbers: List<Int>): Double {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("List cannot be empty")
        }

        val sum = numbers.sum()
        return sum.toDouble() / numbers.size
    }
}