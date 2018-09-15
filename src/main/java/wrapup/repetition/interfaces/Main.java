package wrapup.repetition.interfaces;

public class Main {
    public static void main(String[] args) {
//        InterfaceA ia = new InterfaceA() {
//            @Override
//            public void methodA(String str) {
//                System.out.println(str);
//            }
//        };
        InterfaceA ia = (a -> System.out.println(a)); //lambda tylko dla interfacow i tylko jak jest jedna metoda; gdyby byla jescze methodB(), bylby blad
        ia.methodA("String z methody A");
    }
}
