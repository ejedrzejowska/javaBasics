package javaBasics.excercise;

import java.util.stream.IntStream;

public class SomeSum {

    private int summing(int a, int b){
        int[] sum = {a, b};
        return IntStream.of(sum).sum();
    }

    private int anotherSumming(int a, int b){
        for(int i = 0; i < b; i++){
            a++;
        }
        return a;
    }

    private int anotherone(int a, int b){
        return ((-1) * a - b) * (-1);
    }

    private int someSum(int a, int b){
        return a += b;
    }

    private int binarySumming(int a, int b){
        int[] aBinary = intoBinary(a);
        int[] bBinary = intoBinary(b);
        int length = aBinary.length;
        int flag = 0;

        int[] bSum = new int[length];
        for(int i = 0; i < bSum.length; i++){
            bSum[i] = aBinary[i] ^ bBinary[i] ^ flag;
            if ((aBinary[i] == 1 && bBinary[i] == 1) || (aBinary[i] == 1 && flag == 1) || (bBinary[i] == 1 && flag == 1)){
                flag = 1;
                bSum[i + 1] = flag;
            } else {
                flag = 0;
            }
        }
        return backToDecimal(bSum);
    }

    private int[] intoBinary(int number){
        int[] output = new int[100];
        int i = 0;
        while (number > 0) {
            output[i] = number % 2;
            number /= 2;
            i++;
        }
        return output;
    }

    private int backToDecimal(int[] binary){
        int decimal = 0;
        for (int i = 0; i < binary.length; i++)
        {
            decimal += (Math.pow(2, i) * binary[i]);
        }
        return decimal;
    }

    private void assertEquals(int a, int b){
        if(a == b) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }
    }

    public static void main(String[] args) {
        SomeSum someSum = new SomeSum();
        System.out.println(someSum.summing(12, 11));
        System.out.println(someSum.anotherSumming(13, 25));
        System.out.println(someSum.anotherone(2, 54));
        System.out.println(someSum.someSum(23, 45));
        System.out.println(someSum.binarySumming(3, 3));
//        System.out.println(someSum.backToDecimal(someSum.intoBinary(9)));
        someSum.assertEquals(someSum.binarySumming(4,6), 10);




    }
}
