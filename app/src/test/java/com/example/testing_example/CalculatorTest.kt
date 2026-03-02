package com.example.testing_example

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testDivide() {
        val result = calculator.divide(10, 0)
        assertEquals(5, result)
    }

    @Test
    fun testAverage() {
        val result = calculator.average(listOf(1, 2, 3))
        assertEquals(2.0, result, 0.0)
    }
}