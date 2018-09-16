package wrapup.repetition.staticModifier;

public class Car {
    public static String staticName;
    public String dynamicName; //zmienna widoczna z obiektu, nie z klasy

    //metody i zmienne statycze są niezależne od utworzenia obiektu danej klasy

    public static void printStatic(){
        int i = 7;
        i = i + 5;
        System.out.println("Metoda statyczna");
//        System.out.println(staticName + " " + dynamicName);  nie można uzyć dynamicznej zmiennej w metodzie statycznej
        System.out.println(staticName);
        System.out.println(i);
    }

    public void printDynamic(){
        System.out.println("Metoda dynamiczna");
        System.out.println(staticName + " " + dynamicName);
    }
}
