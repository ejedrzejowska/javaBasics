package javaBasic2.classInClass;

public class SubClass {
    private int privDynamicVar = 10;
    private static int privStaticVar = 7;
    public int pubDynamicVar = 10;
    public static int pubStaticVar = 7;

    public class InnerDynamicClass {
        private int privDynamicDC = 10;
//        private static int privStaticDC = 7;      //static not allowed in non-static class
        public int pubDynamicDC = 10;
//        public static int pubStaticDC = 7;
        public void method(){
            //ma dostęp do wszystkich zmiennych z SubClass i z InnerDynamicClass
        }
    }

    public static class InnerStaticClass {
        private int privDynamicSC = 10;
        private static int privStaticSC = 7;
        public int pubDynamicSC = 10;
        public static int pubStaticSC = 7;

        public void method(){
            //nie ma dostępu do zmiennych niestatycznych z SubClass
        }

        /**
         * tak tworzymy Java Doc. Formatowanie jak HTML; br przechodzi do nowej linii; ctrl+q podglad
         */
        public static void javaDocMethod(){

        }
    }

    public void sampleMethod(){
        class SampleClass{
            //można stworzyć tylko po co? łatwo się pogubić
        }

        InnerDynamicClass innerDC = new InnerDynamicClass();
        innerDC.method();

        InnerStaticClass innerSC = new InnerStaticClass();
        innerSC.method();
        InnerStaticClass.privStaticSC += 10;
    }
}
