
package collections;

public class ComparableEmployee implements Comparable<ComparableEmployee> {

    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ComparableEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public int compareTo(ComparableEmployee o) {
        if (this.id > o.id) {
            return 1;
        } else if(this.id == o.id) {
            return 0;
        } else {
            return -1;
        }
    }
}
