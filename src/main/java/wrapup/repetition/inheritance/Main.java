package wrapup.repetition.inheritance;

public class Main {

    public static void main(String[] args) {
       // Child child = new Child();
       //Child child2 = new Child("String z maina");
       // Parent child3 = new Child();
        Parent parent = new Parent();
        Child child4 = new Child();
        Parent child5 = new Child();
        ((Child) child5).childMethod("string z maina");

        AbstractClass absClass = new AbstractClass() {
            @Override
            public void abstractMethod(String name) {

            }
        };

        AbstractClass absClass2 = new AfterAbstract();

    }
}
