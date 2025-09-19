package com.CLIS.BankingSystem.Calculator;

public class BasicCalculator implements CalculatorFunction {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public double div(int n1, int n2) {
        if (n1 == 0) {
            throw new ArithmeticException("Dividend Zero Error");
        }
        return (double) n1 / n2;
    }

    public double pow(int n1, int n2) {
        return Math.pow(n1, n2);
    }

}
