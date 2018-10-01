package javaBasic2.sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public int[] createArray(int size) {
        int range = 1000;
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = new Random().nextInt(range);
        }
        return output;
    }

    public void changeOrder(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public int[] heapSort(int[] inputArray) {
        int[] array = Arrays.copyOf(inputArray, inputArray.length);

        return array;
    }

    public void merge(int start, int mid, int end){

    }

    public int[] mergeSort(int[] inputArray) {
        int[] array = Arrays.copyOf(inputArray, inputArray.length);
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        if(start < end){
            int[] arrayLow = Arrays.copyOfRange(array, start, mid);
            int[] arrayHigh = Arrays.copyOfRange(array, mid + 1, end);
            mergeSort(arrayLow);
            mergeSort(arrayHigh);
            merge(start, mid, end);
        }
        return array;
    }

    public int[] insertionSort(int[] inputArray) {
        int[] array = Arrays.copyOf(inputArray, inputArray.length);
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] inputArray) {
        boolean flag;
        int[] array = Arrays.copyOf(inputArray, inputArray.length);
        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        Arrays.stream(array).forEach(o -> System.out.print(o + ", "));
        System.out.println();
    }

    public void sortTest() {
        int[] testArray = createArray(20);
        printArray(testArray);
        printArray(bubbleSort(testArray));
        printArray(insertionSort(testArray));
    }

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        sort.sortTest();
//        sort.changeOrder(7, 3);
    }
}
