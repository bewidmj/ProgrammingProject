package com.mayank.myproject.programs;

import com.mayank.myproject.programs.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class SortByMapValue {

    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        map.put("1", new Employee("1", "Twinkle", 1300000, "IT"));
        map.put("2", new Employee("2", "Harshit", 900000, "Management"));
        map.put("3", new Employee("3", "Mayank", 2000000, "IT"));
        map.put("4", new Employee("4", "Pankaj", 750000, "IT"));

        // Sort by employee salary desc

        map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().getSalary() - e1.getValue().getSalary())
                .forEach(System.out::println);

        //Sort by employee name asc

        map.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().getName().compareTo(e2.getValue().getName()))
                .forEach(System.out::println);
    }
}
