package javaBasics.excercise;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArraysTest {
    private int[] array;

    private void createArray(int size) {
        array = new int[size];
        Random random = new Random();
        int bound = 100; //Integer.MAX_VALUE;
        Arrays.setAll(array, i -> random.nextInt(bound));
//        for(int i = 0; i < size; i++){
//            array[i] = random.nextInt(bound);
//        }
    }

    private void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + array[i] + "; ");
        }
        System.out.println();
    }

    private void streamArray() {
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private void reverse() {
        int start = 0;
        int stop = array.length - 1;
        int temp;
        while (start < stop) {
            temp = array[start];
            array[start] = array[stop];
            array[stop] = temp;
            start++;
            stop--;
        }
//        for(int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
    }

    private void divideByThree() {
        System.out.println("Divisible by 3:");
//        for(int element : array){
//            if(element % 3 == 0){
//                System.out.print(element + " ");
//            }
//        }
        Arrays.stream(array).filter(i -> i % 3 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    private void getIndex() {
        boolean flag = false;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Give number: ");
            int number = input.nextInt();
            System.out.println("Number found on:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    System.out.println("Index: " + i);
                    flag = true;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not an integer");
        }
        System.out.println(flag ? "" : "-1: number not found");
    }

    private void getDuplicates() {
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.println("Duplicate found: " + array[i]);
                    flag = true;
                }
            }
        }
        System.out.println(flag ? "" : "No duplicates found");
        //w secie zrobic
    }

    private void getMean() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Mean is: " + (sum / array.length));

        Arrays.stream(array).average().ifPresent(s-> System.out.println("Average is: " + s));
    }

    private void getGCD(int a, int b) {
        int num1 = array[a];
        int num2 = array[b];
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        while (num1 != num2) // dopóki dwie liczby nie są sobie równe
        {
            if (num1 > num2)  // sprawdzamy, która z nich jest większa
            {
                num1 = num1 - num2; // odejmujemy mniejszą liczbę
            }                               // od większej
            else {
                num2 = num2 - num1;
            }
        }
        System.out.println("Greatest common divisor: " + num1);

    }

    private void testMethod(int size) {
        createArray(size);
        // printArray();
        streamArray();
        reverse();
        streamArray();
        divideByThree();
        getIndex();
        getDuplicates();
        getMean();
        getGCD(3, 5);
    }

    public static void main(String[] args) {
        int size = 0;
        if (args.length < 1) {
            System.out.println("no argument");
        } else {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Positive integer parameter required");
            }
            if (size <= 0) {
                throw new IllegalArgumentException("Positive integer parameter required");
            }
            new ArraysTest().testMethod(size);
        }
    }
}
