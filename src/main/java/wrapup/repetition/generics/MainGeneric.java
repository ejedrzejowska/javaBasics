package wrapup.repetition.generics;

public class MainGeneric {

    public void sampleTest(){
        Car<Mercedes> car = new Car<>(new Mercedes());
        System.out.println(car.getGenericType());
    }

    public void sampleTest2(){
        Car2<Integer> car2 = new Car2<>(23);
        car2.printSth();
       // Car2<String> car3 = new Car2<>("Audi");
        Car2<Mercedes> car4 = new Car2<>(new Mercedes());
        car4.printSth();
    }

    public void  add(Car2<?> car){

    }

    public void sampleGeneric(){
        add(new Car2<Mercedes>());
        add(new Car2<String>());
        add(new Car2<MainGeneric>());
    }

    public static void main(String[] args) {
        new MainGeneric().sampleTest2();
    }
}
