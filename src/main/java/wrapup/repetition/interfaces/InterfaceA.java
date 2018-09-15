package wrapup.repetition.interfaces;

public interface InterfaceA {
    String str = "String z interface A";
    void methodA(String str);
    default void methodDefault(String str){
        System.out.println("Metoda defaultowa z interface A: " + str);
    }
}
