package wrapup.repetition.generics;

public class Wildcard {

    class Employee<T>{}
    interface A{}
    interface B extends A {}
    interface C extends B{}

    void add (Employee<?> emp){
    }

    void add1 (Employee<? extends B> emp){ //ogranicza nas do klas dziedziczacych
    }

    void add2 (Employee<? super B> emp){ //ogranicza nas do klas z ktorych dziedziczymy
    }

    void test(){
        add(new Employee<A>());
        add(new Employee<B>());
        add(new Employee<C>());

      //  add1(new Employee<A>());
        add1(new Employee<B>());
        add1(new Employee<C>());

        add2(new Employee<A>());
        add2(new Employee<B>());
     //   add2(new Employee<C>());
    }
}
