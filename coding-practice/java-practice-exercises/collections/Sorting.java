package collections;

import collections.Employee;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).forEach(System.out::println);

//        empId, Empname, managerId, managerName
//
//        select managerName, count(*) from employee group by managerId desc;

    }
}
