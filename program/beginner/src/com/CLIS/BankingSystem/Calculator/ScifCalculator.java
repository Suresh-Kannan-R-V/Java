package com.CLIS.BankingSystem.Calculator;

public class ScifCalculator extends BasicCalculator {

    public double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public double cos(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }

    public double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot take sqrt of negative number");
        }
        return Math.sqrt(number);
    }

    public double cbrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot take cbrt of negative number");
        }
        return Math.cbrt(number);
    }

    public double log(double value) {
        return Math.log(value);
    }

    public double log10(double value) {
        return Math.log10(value);

    }

    public double exp(double value) {
        return Math.exp(value);
    }

    public long factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }
}
