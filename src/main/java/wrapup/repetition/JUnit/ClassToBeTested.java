package wrapup.repetition.JUnit;

public class ClassToBeTested {

    int add(int a, int b){
        if (b == 0 || a == 0){
            return a;
        }
       return add(++a, --b);
    }

    int factorial(int n){
        if(n < 0) {
            throw new IllegalArgumentException();
        }
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    String toBinary(int number){
        String str = "";
        if (number < 1){
            return "0";
        }
        while (number > 0){
            str = number % 2 + str;
            number /= 2;
        }
        return str;

    }
}
