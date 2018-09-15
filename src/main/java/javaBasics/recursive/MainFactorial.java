package javaBasics.recursive;

public class MainFactorial {

    private int factorial(int a){
        if (a==0){
            return 1;
        }
        return a * factorial(a - 1);
    }
}
