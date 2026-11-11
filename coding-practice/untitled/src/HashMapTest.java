import java.util.*;

public class HashMapTest {

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
        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Twinkle");
        e1.setSalary(2000000);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Mayank");
        e2.setSalary(1000000);

        Employee e3 = new Employee();
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
