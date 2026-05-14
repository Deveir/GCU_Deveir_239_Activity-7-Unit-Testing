package test;

import org.junit.Assert;
import org.junit.Test;

import junit.Calculator;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();

        Assert.assertEquals(3, calc.add(2, 1));
        Assert.assertEquals(10, calc.add(5, 5));
        Assert.assertEquals(0, calc.add(-1, 1));
        Assert.assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();

        Assert.assertEquals(4, calc.subtract(7, 3));
        Assert.assertEquals(0, calc.subtract(5, 5));
        Assert.assertEquals(-2, calc.subtract(3, 5));
        Assert.assertEquals(-5, calc.subtract(-2, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();

        Assert.assertEquals(12, calc.multiply(4, 3));
        Assert.assertEquals(0, calc.multiply(0, 5));
        Assert.assertEquals(-10, calc.multiply(-2, 5));
        Assert.assertEquals(6, calc.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();

        Assert.assertEquals(5, calc.divide(10, 2));
        Assert.assertEquals(3, calc.divide(9, 3));
        Assert.assertEquals(-4, calc.divide(-8, 2));
        Assert.assertEquals(4, calc.divide(-8, -2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();

        calc.divide(10, 0);
    }
}