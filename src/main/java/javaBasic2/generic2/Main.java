package javaBasic2.generic2;

public class Main {

    private <T extends Person> T samplePerson(T person){
        if (person instanceof Student){
            person.printData("Student");
        }
        if (person instanceof Teacher){
            person.printData("Teacher");
        }
        if (person instanceof Director){
            person.printData("Director");
        }
        return person;
    }

    private void sampleTest(){
        Student student = new Student();
        samplePerson(student);
        System.out.println(student);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sampleTest();

    }
}
