package javaBasics.stream;

import javaBasics.dao.EmployeesDao;
import javaBasics.lambda.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        new Main().sampleStream();
    }

    public void sampleStreamCopy(){
        List<Employee> employees = EmployeesDao.createList();
        List<Employee> employeesCopy  = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .filter(emp -> emp.getFirstName().startsWith("P"))
                .collect(Collectors.toList());

        employeesCopy.forEach(System.out::println);

    }

    public void sampleStream(){
        List<Employee> employees = EmployeesDao.createList();
//        Stream<Employee> employeeStream = employees.stream();
//        employeeStream.filter(emp -> emp.getAge() > 30).forEach(System.out::println);
        employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .filter(emp -> emp.getFirstName().startsWith("P"))
//                .map(emp -> emp.getLastName().toUpperCase())
                .sorted((emp1, emp2) -> emp1.getAge() - emp2.getAge())
                .forEach(System.out::println);
    }

    public void sample(){
        List<Employee> employees = EmployeesDao.createList();
        for(Employee emp : employees){
            if(emp.getAge() > 30 && emp.getFirstName().startsWith("P")){
                System.out.println(emp);
            }
        }
    }
}
