package collections;

import java.util.*;

public class EmployeeSalaryAndNameSortingDemo {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Twinkle", "1");
//        map.put("Mayank", "2");
//
//        //int[] arr = {1,2,3,4,5,6};
//
//        for(Map.Entry entry: map.entrySet()) {
//            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
//        }
        List<ComparableEmployee> list = new ArrayList<>();

        ComparableEmployee e1 = new ComparableEmployee();
        e1.setId(1);
        e1.setName("Twinkle");
        e1.setSalary(2000000);

        ComparableEmployee e2 = new ComparableEmployee();
        e2.setId(2);
        e2.setName("Mayank");
        e2.setSalary(1000000);

        ComparableEmployee e3 = new ComparableEmployee();
        e3.setId(3);
        e3.setName("Bittu");
        e3.setSalary(20000);

        list.add(e2);
        list.add(e1);
        list.add(e3);

        System.out.println(list);

        Collections.sort(list, (ea, eb) -> eb.getSalary() - ea.getSalary());

        Collections.sort(list, (ea, eb) -> eb.getName().compareTo(ea.getName()));

        System.out.println(list);

    }
}
