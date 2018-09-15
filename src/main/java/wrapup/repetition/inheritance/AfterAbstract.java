package wrapup.repetition.inheritance;

public class AfterAbstract extends AbstractClass {
    @Override
    public void abstractMethod(String name) {
        str = name;
        System.out.println("zaimplementowana metoda z klasy abstrakcyjnej: " + name);
    }
}
