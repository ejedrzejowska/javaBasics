package wrapup.repetition.generics;

public class Car<T extends CarInterface> {
    private CarInterface genericType;

    public void sample(){
        genericType.sampleCarPrint();
    }

    public Car(T genericType){
        this.genericType = genericType;
    }

    public CarInterface getGenericType(){
        return genericType;
    }
}
