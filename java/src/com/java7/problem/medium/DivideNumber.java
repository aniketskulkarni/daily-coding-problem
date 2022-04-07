package com.java7.problem.medium;

/**
 * Implement division of two positive integers without using the division,
 * multiplication, or modulus operators.
 * Return the quotient as an integer, ignoring the remainder.
 */

public class DivideNumber {

    public int divideNumber(int divident, int divisor) {
        int quotient = 0;
        while (divident - divisor >= 0) {
            divident -= divisor;
            quotient += 1;
        }
        return quotient;
    }

    public static void main(String[] args) {
        DivideNumber obj = new DivideNumber();
        int quotient = obj.divideNumber(102, 17);
        System.out.println(quotient);
    }
}
