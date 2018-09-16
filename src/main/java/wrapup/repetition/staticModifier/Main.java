package wrapup.repetition.staticModifier;

public class Main {
    public void sample(){
        Car.staticName = "Audi";
        Car.staticName = "BMW";
        Car.printStatic();
    }

    public void sample2(){
        Car.staticName = "Polskie";
        Car car = new Car();
        car.dynamicName = "Polonez";
        Car car1 = new Car();
        car1.dynamicName = "Syrenka";
        car.printDynamic();
        car1.printDynamic();
    }
    public static void main(String[] args) {
        new Main().sample();
        new Main().sample2();
    }
}
