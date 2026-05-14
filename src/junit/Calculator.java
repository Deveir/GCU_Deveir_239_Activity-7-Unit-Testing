package junit;

/**
 * Simple Calculator class that performs basic math operations.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a first number
     * @param b second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two integers.
     *
     * @param a first number
     * @param b second number
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a first number
     * @param b second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers.
     *
     * @param a first number
     * @param b second number
     * @return the quotient of a divided by b
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Main method used to manually test the calculator.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: 2 + 1 = " + calc.add(2, 1));
        System.out.println("Subtraction: 5 - 3 = " + calc.subtract(5, 3));
        System.out.println("Multiplication: 4 * 3 = " + calc.multiply(4, 3));
        System.out.println("Division: 10 / 2 = " + calc.divide(10, 2));
    }
}