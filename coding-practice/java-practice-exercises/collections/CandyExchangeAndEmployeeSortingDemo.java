package collections;

import collections.Employee;

import java.util.HashSet;
import java.util.Set;

public class CandyExchangeAndEmployeeSortingDemo {

    static int getCandies(int amount) {
        int result = amount;
        int prevDivident = amount / 4;
        if (prevDivident > 1) {
            result = result + prevDivident;
            if (result / 4 > prevDivident) {
                result = result + (result / 4) - prevDivident;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getCandies(104));

        Set<Employee> set = new HashSet<>();

        set.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).forEach(System.out::println);

//        select (select dept_name, count(*) as numbers from employee join department on employee.deptId = department.deptId group by deptName)


    }
}
