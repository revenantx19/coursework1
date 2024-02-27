import java.util.Objects;

public class Employee {
    private String fio;
    private int dep;
    private int salary;
    private static int id = 0;

    public Employee(String fio, int dep, int salary) {
        this.fio = fio;
        this.dep = dep;
        this.salary = salary;
        id++;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDep() {
        return this.dep;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee id = (Employee) other;
        return id.equals(Employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
