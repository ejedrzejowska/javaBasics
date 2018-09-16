package javaBasic2.sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static int[] createArray(int size){
        int range = 1000;
        int[] output = new int[size];
        for(int i = 0; i < size; i++){
            output[i] = new Random().nextInt(range);
        }
        return output;
    }
    public static void changeOrder(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);

    }
    public static int[] insertionSort(int[] inputArray){
        int[] array = Arrays.copyOf(inputArray, inputArray.length);
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length; j++){

            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] inputArray){
        int[] array = Arrays.copyOf(inputArray, inputArray.length);
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j - 1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array){
        Arrays.stream(array).forEach(o -> System.out.print(o + ", "));
        System.out.println();
    }

    public static void sortTest(){
        int[] testArray = createArray(20);
        printArray(testArray);
        printArray(bubbleSort(testArray));

    }

    public static void main(String[] args) {
        sortTest();
        changeOrder(7, 3);
    }
}
