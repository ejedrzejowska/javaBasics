package javaBasics.lambda;


import javaBasics.dao.EmployeesDao;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
//        new Main().sample();
//        System.out.println("*********************");
//        new Main().lambda();

//        new Main().printList();

//        new Main().printEmployees();
        Main main = new Main();

        main.sortByAge(EmployeesDao.createList());
    }

    private void sample() {
        int c1 = 7;
        int c2 = 3;

        Func add = new Func() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        Func subtract = new Func() {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };

        System.out.println(add.calc(c1, c2) + "");
        System.out.println(subtract.calc(c1, c2) + "");
    }

    private void lambda() {
        int c1 = 7;
        int c2 = 3;

        Function<Integer, String> ch = (a) -> "Liczba: " + a;

        Func add = (a,b) -> a + b;
        Func subtract =  (a,b) -> a - b;


        System.out.println(add.calc(c1, c2) + "");
        System.out.println(subtract.calc(c1, c2) + "");
        System.out.println(ch.apply(3));
    }

    private void printList(){
        List<String> list = new ArrayList<>();
        list.add("Paweł");
        list.add("Kasia");
        list.add("Józek");

//        for(String str : list){
//            System.out.println(str);
//        }

        list.forEach(a -> System.out.println(a));
        System.out.println("****************************");
        list.forEach(System.out::println);
    }

    private void printEmployees(){
        List<Employee> list = EmployeesDao.createList();
//        list.add(new Employee("Paweł", "Jackowski", 32));
//        list.add(new Employee("Ewa", "Marchewa", 25));
//        list.add(new Employee("Adam", "Jacek", 35));
//        list.add(new Employee("Ewelina", "Jakaś", 30));
//        list.add(new Employee("Paweł", "Jackowski", 40));
//        list.add(new Employee("Asia", "Cośtam", 29));

        list.forEach(a -> System.out.println(a.getAge() + ": " + a.getFirstName()));

        list.forEach(System.out::println);

    }



    private void printSorted(List<Employee> list){
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("*********************");
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
        Collections.sort(list, employeeComparator);
        list.forEach(System.out::println);
    }

    private void printSortedLambda(List<Employee> list){
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("*********************");
//        Comparator<Employee> employeeComparator = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
//        Collections.sort(list, employeeComparator);
        Collections.sort(list, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        list.forEach(System.out::println);
    }

    private void sortByAge(List<Employee> list){
        Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());
        list.forEach(System.out::println);
    }
}

