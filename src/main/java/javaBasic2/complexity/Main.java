package javaBasic2.complexity;

public class Main {

    public static void printComplexity(int n) {
        System.out.println("O(log n):     " + (int) Math.log(n));
        System.out.println("O(n):         " + n);
        System.out.println("O(n*(log n)): " + (int) (n * Math.log(n)));
        System.out.println("O(n^2):       " + (int) Math.pow(n, 2));
        System.out.println("O(n^3):       " + (int) Math.pow(n, 3));
        System.out.println("O(2^n):       " + (int) Math.pow(2, n));
        System.out.println("O(n!):        " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        printComplexity(15);
    }
}

