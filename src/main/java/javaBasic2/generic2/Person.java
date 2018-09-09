package javaBasic2.generic2;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected int age;
    protected Status status;
    protected String str;

    public Person() {
    }

    public Person(Status status) {
        this.status = status;
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    public void printData(String str){
        this.str = str;
        System.out.println(status.name() + " - " + str);
    }
}
