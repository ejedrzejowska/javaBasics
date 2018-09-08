package javaBasics.excercise;

public class FooClass {

    protected String intToBinaryString(int number){
        String str = "";
        if (number < 1) return "0";
        while (number > 0) {                            // while (a > 0) do
            str = number % 2 + str;                     // res := Str(a mod 2) + res
            number /= 2;                                // a := a div 2
        }
        return str;
    }
}
