package javaBasic2.testEquals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> list = new ArrayList<>();
    String testString = "987654start";

    private void createList(){
        int maxValue = 1000000;
        String str = "start";
        for (int i = 0; i < maxValue; i++){
            list.add(i + str);
        }
    }

    private void testDoubleEqualSign(){
        long start = System.currentTimeMillis();
        long stop = 0;
        for(String str : list){
            if(str == testString);
            stop = System.currentTimeMillis();
            break;
        }
        System.out.println("Metoda ==: " + (stop - start));
    }

    private void testEqualMethod(){
        long start = System.currentTimeMillis();
        long stop = 0;
        for(String str : list){
            if(str.equals(testString));
            stop = System.currentTimeMillis();
            break;
        }
        System.out.println("Metoda eguals: " + (stop - start));
    }

    private void testIntern(){
        long start = System.currentTimeMillis();
        long stop = 0;
        for(String str : list){
            if(str.intern() == testString.intern());
            stop = System.currentTimeMillis();
            break;
        }
        System.out.println("Metoda intern: " + (stop - start));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createList();
        main.testDoubleEqualSign();
        main.testEqualMethod();
        main.testIntern();
    }
}
