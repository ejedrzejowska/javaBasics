package wrapup.repetition.interfaces;

public interface InterfaceB {
    default void methodDefault(String str){
        System.out.println("Metoda defaultowa z interface B: " + str);
    }
}
