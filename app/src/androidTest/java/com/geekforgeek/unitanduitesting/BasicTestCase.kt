package com.geekforgeek.unitanduitesting

import junit.framework.TestCase.assertEquals
import org.junit.Test

class BasicTestCase {

    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2,3)
        val subtract = calculator.subtract(3,3)
        assertEquals(5, result)
    }

    @Test
    fun testSubtract(){
        val calculator = Calculator()
        val subtract = calculator.subtract(3,3)
        assertEquals(0, subtract)
    }

}

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}