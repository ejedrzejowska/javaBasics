package wrapup;

public class NotUseClass {

    public NotUseClass(){
        System.out.println("konstruktor klasy someclass");
    }
    static {
        System.out.println("metoda statyczna someclass");
    }
    {
        System.out.println("metoda dynamiczna someclass");
    }

    public static void main(String[] args) {
        new NotUseClass(); //1. statyczna 2. dynamiczna 3. konstruktor
        //Main a;
        //new NotUseClass().sample();
    }

//    public void sample(){
//        System.out.println("Krok pierwszy");
//        int a = 0;
//        label:
//        for(;;){
//            if (a == 5) break label;
//            System.out.println(a++);
//        }
//    }
}
