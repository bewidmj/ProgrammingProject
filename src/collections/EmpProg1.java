package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpProg1 {
    public static void main(String[] args) {
        var empList = new ArrayList<Employee>();
        var emp1 = new Employee("A", 20000, "IT");
        var emp2 = new Employee("B", 50000, "HR");

        empList.add(emp1);
        empList.add(emp2);

        empList.stream().forEach(System.out::println);
        increaseSalaryByPercentage(empList, 20);
        empList.stream().forEach(System.out::println);
    }

    private static void increaseSalaryByPercentage(List<Employee> employeeList, int percentage) {
        employeeList.stream().map(emp -> { emp.setSalary(emp.getSalary() + (emp.getSalary() * percentage)/100);
        return emp; }).collect(Collectors.toList());

    }
}
