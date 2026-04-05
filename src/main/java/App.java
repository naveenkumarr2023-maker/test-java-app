package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Welcome to Maven Demo Project  ");
        System.out.println("=================================");

        greetUser("Naveen");
        calculateSum(10, 20);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
