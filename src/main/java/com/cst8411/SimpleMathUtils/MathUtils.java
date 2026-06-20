package com.cst8411.SimpleMathUtils;

/**
 * This class providing common mathematical operations
 */
public class MathUtils {

    /**
     * Calculates the sum of two integers
     * @param
     * a The first integer
     *  b The second integer
     * The sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the difference between two integers
     * @param
     * a the first integer, b the second integer
     *  The difference a - b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Calculates the product of two integers
     * @param
     * a the first integer, b the second integer
     * The product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers.
     * @param
     * a The dividend, b The divisor
     * The result of the division (integer part)
     *  IllegalArgumentException if the divisor (b) is zero
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    /**
     * Calculates the power of a base to an exponent
     * @param
     * base The base number, exponent The exponent (must be non-negative)
     *  The result of base raised to the power of exponent
     *  IllegalArgumentException if the exponent is negative
     */
    public static long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent cannot be negative.");
        }
        if (exponent == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * @param
     * n The non-negative integer
     *  The factorial of n
     * IllegalArgumentException if the input number is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Finds the maximum of two integers.
     * @param
     * a The first integer, b The second integer
     * The larger of the two integers
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Finds the minimum of two integers.
     * @param
     * a The first integer, b The second integer
     * The smaller of the two integers
     */
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
