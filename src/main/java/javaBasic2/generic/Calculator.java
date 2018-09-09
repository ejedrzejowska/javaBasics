package javaBasic2.generic;

import java.math.BigDecimal;

public class Calculator<T extends Number> {
    private Number number;
    private Number result;

    public Calculator(T number) {
        this.number = number;

    }

    public T add(T number2) {
        if (number instanceof Integer) {
            result = number.intValue() + number2.intValue();
            System.out.println("Instancja Integer");
        }
        if (number instanceof Double){
            result = number.doubleValue() + number2.doubleValue();
            System.out.println("Instancja Double");
        }
        if (number instanceof BigDecimal){
            result = ((BigDecimal)number).add((BigDecimal)number2);
            System.out.println("Instancja BigDecimal");
        }
        return (T) result;
    }

    public Number subtract(Number number2){
        if (number instanceof Integer) {
            result = number.intValue() - number2.intValue();
        }
        if (number instanceof Double){
            result = number.doubleValue() - number2.doubleValue();
        }
        if (number instanceof BigDecimal){
            result = ((BigDecimal)number).subtract((BigDecimal)number2);
        }
        return result;
    }
}
