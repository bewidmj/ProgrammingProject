package collections;

import java.util.Comparator;

class EmployeeSalaryComparator implements Comparator<ComparableEmployee> {

   @Override
   public int compare(ComparableEmployee o1, ComparableEmployee o2) {
       if (o2.getSalary() > o1.getSalary()) {
           return 1;
       } else if(o2.getSalary() == o1.getSalary()) {
           return 0;
       } else {
           return -1;
       }
   }
}