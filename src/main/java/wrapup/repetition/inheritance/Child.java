package wrapup.repetition.inheritance;

public class Child extends Parent{
    public Child() {
       // super("String z klasy Child"); //bedzie domyslny jesli go nie uruchomimy
        System.out.println("Konstruktor klasy dziedziczącej");
    }

    public Child(String str){
        super(str);
        System.out.println("konstruktor z klasy Child: " + str);
    }

    public void childMethod(String str){
        System.out.println("Metoda z klasy dziedziczącej: " + str);
    }
}
