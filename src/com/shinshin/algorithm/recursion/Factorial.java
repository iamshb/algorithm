package com.shinshin.algorithm.recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = recursiveFactorial(5);
        System.out.println(result);
    }

    public static int interativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i=1; i<= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int recursiveFactorial(int num) {
        System.out.println(num + "!");
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
