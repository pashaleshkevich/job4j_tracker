package ru.job4j.oop;

public class Calculator {
    private static int x = 20;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result sum: " + sum(10));
        System.out.println("Result minus: " + minus(40));
        System.out.println("Result multiply: " + calculator.multiply(10));
        System.out.println("Result divide: " + calculator.divide(40));
        System.out.println("Result sum all operations: " + calculator.sumAllOperation(10));
    }
}
