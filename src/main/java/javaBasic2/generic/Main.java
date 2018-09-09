package javaBasic2.generic;

import java.math.BigDecimal;

public class Main {

    private void sampleBook(){
        Book book = new Book();
        book.setTitle("Jakiś tytuł");
        String title = (String)book.getTitle();

        Book<String> newBook = new Book<>();
        newBook.setTitle("Kolejny tytuł");
        String newTitle = newBook.getTitle();
        newBook.printTitle();

        Book<Cover> anotherBook = new Book<>();
        anotherBook.setTitle(new Cover());
        anotherBook.printTitle();
    }

    private void sampleCalculator(){
        Calculator<Integer> calculator = new Calculator(37);
        System.out.println(calculator.add(34));
        Calculator<Double> calculator2 = new Calculator(37.6);
        System.out.println(calculator2.add(34.5));
        Calculator<BigDecimal> calculator3 = new Calculator(new BigDecimal(35.5));
        System.out.println(calculator3.add(new BigDecimal(34.0)));
    }

    private <T, S> T sampleGeneric(T something, S somethingelse){
        if (something instanceof Integer && somethingelse instanceof Integer){
            System.out.println("Integer:");
            return (T)((Number) (((Integer) something).intValue() + ((Integer) somethingelse).intValue()));
        }
        if (something instanceof Double && somethingelse instanceof Double){
            System.out.println("Double:");
            return (T)((Double)((Double)something + (Double)somethingelse));
        }
        return something;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sampleBook();
        main.sampleCalculator();
        System.out.println(main.sampleGeneric(12.5d, 34.6d));
    }
}
