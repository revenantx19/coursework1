import java.util.Arrays;
import java.util.Objects;

public class Employee {
    //String[] arrFio = new String[10];
    //int[] arrDep = new int[10];
    //int[] arrSalary = new int[10];
    private String fio;
    private int dep, salary;
    int id = 0;
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
    public int setDep(int dep) {
        this.dep = dep;
        return this.dep;
    }
    public int setSalary(int salary) {
        this.salary = salary;
        return this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dep == employee.dep && salary == employee.salary && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, dep, salary);
    }
}
