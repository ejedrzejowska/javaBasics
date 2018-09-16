package javaBasic2.classInClass;

public class Main {
    public static void main(String[] args) {

    }

    private void staticClass(){
        SubClass.InnerStaticClass.pubStaticSC = 50;
        SubClass.InnerStaticClass.javaDocMethod();
        SubClass.InnerStaticClass innerSC = new SubClass.InnerStaticClass();
        innerSC.method();
        SubClass.InnerStaticClass.javaDocMethod();
    }

    private void dynamicClass(){
        SubClass oneMore = new SubClass();
        SubClass.InnerDynamicClass innerDC = oneMore.new InnerDynamicClass(); //tworzenie obiektu klasy wewnetrznej
        innerDC.pubDynamicDC += 11;
        System.out.println(innerDC.pubDynamicDC);
        innerDC.method();
    }
}
