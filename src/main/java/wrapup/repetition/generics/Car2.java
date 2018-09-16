package wrapup.repetition.generics;

public class Car2<T> {
    private T t;

    public Car2(){

    }

    public Car2(T t) {
        this.t = t;
    }

    public void printSth(){
        if(t instanceof Mercedes){
            ((Mercedes) t).sampleCarPrint();
        } else {
            System.out.println("To nie jest Mercedes");
        }
    }
}
