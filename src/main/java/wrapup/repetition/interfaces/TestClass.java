package wrapup.repetition.interfaces;

public class TestClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA(String str) {
        System.out.println("Nadpisana metoda z interface'u A");
    }

    @Override
    public void methodDefault(String str) { //dwie metody defaultowe z dwoch roznych interface'ow, trzeba zaimplementować!
        System.out.println("metoda defaultowa z interface'u nadpisana w klasie implementujacej");
    }

    public void testA(){
        //str = "inny str"; z interface'u zmienna jest finalna
    }
}
