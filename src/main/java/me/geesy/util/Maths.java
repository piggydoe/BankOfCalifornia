package me.geesy.util;

public class Maths {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int modulo(int a, int b){
        return a % b;
    }
    public static int exponent(int a, int b){
        return (int)Math.pow(a, b);
    }
    public static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact *= i;
        }
        return fact;
    }
    public static int percentageToDecimal(int a, int b){
        return (a * b) / 100;
    }
}
