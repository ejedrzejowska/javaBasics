package javaBasics.dao;

import javaBasics.lambda.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    public static List<Employee> createList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Paweł", "Jackowski", 32));
        list.add(new Employee("Ewa", "Marchewa", 25));
        list.add(new Employee("Adam", "Jacek", 35));
        list.add(new Employee("Ewelina", "Jakaś", 30));
        list.add(new Employee("Paweł", "Jackowski", 40));
        list.add(new Employee("Asia", "Cośtam", 29));
        return list;
    }
}
