package wrapup.repetition.inheritance;

public class Parent {
    public Parent() {
        System.out.println("Konstruktor klasy nadrzednej");
    }

    public Parent(String str){
        System.out.println("String z konstruktora z Parent.java: " + str);
    }

    public void parentMethod(String str){
        System.out.println("Metoda z rodzica: " +  str);
    }
}
