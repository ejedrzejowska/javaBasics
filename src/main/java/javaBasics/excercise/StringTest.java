package javaBasics.excercise;

import java.util.Arrays;

public class StringTest {
    private String testString = "kobyla ma maly bok";

    private void isPalindrome() {
        String test = testString.toLowerCase().replace(" ", "");
        String reverse = "";
//        StringBuilder reverse = new StringBuilder(test);
//        reverse.reverse().toString();
//        System.out.println(test);
//        System.out.println(reverse);

        for (int i = test.length() - 1; i >= 0; i--) {
            reverse += test.charAt(i);
        }

        if (test.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private void reversedOrder() {
        String[] array = testString.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void consecutiveLetters() {
        char[] myChar = testString.toCharArray();
        int result = 0;
        for (int i = 0; i < myChar.length - 1; i++) {
            if (myChar[i] == myChar[i + 1] - 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    private void getLongest() {
        String[] array = testString.split(" ");
        int result = 0;
        String resultString = "";
        for (String str : array) {
            if (result < str.length()) {
                resultString = str;
                result = str.length();
            }
        }
        System.out.println("The longest: " + resultString + " with length " + result);
    }

    private void testing() {
        isPalindrome();
        reversedOrder();
        consecutiveLetters();
        getLongest();
    }

    public static void main(String[] args) {
        new StringTest().testing();
    }
}
