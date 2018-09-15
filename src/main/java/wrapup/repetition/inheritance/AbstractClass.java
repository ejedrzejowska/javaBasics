package wrapup.repetition.inheritance;

public abstract class AbstractClass {
    protected String str;

    public void printString(){
        System.out.println("Wypisuje str z AbstracClass: " + str);
    }

    public abstract void abstractMethod(String name);
}
