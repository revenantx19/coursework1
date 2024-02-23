import java.util.Arrays;

public class Employee {
    //String[] arrFio = {"Ivan", "Petr", "Kolya", "Vasia", "Alex"};
    //int[] arrDep = {1, 2, 3, 4, 5};
    //int[] arrSalary = {44000, 39000, 57000, 83000, 54000};
    String[] arrFio = new String[10];
    int[] arrDep = new int[10];
    int[] arrSalary = new int[10];

    public Employee(String fio, int dep, int salary, int i) {
        arrFio[i] = fio;
        arrDep[i] = dep;
        arrSalary[i] = salary;
    }

    public String getFio(int i) {
        return this.arrFio[i];
    }

    public int getDep(int i) {
        return this.arrDep[i];
    }

    public int getSalary(int i) {
        return this.arrSalary[i];
    }

    public int setArrDep(int i, int department) {
        this.arrDep[i] = department;
        return this.arrDep[i];
    }

    public int setArrSalary(int i, int salary) {
        this.arrSalary[i] = salary;
        return this.arrSalary[i];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Arrays.equals(arrFio, employee.arrFio) && Arrays.equals(arrDep, employee.arrDep) && Arrays.equals(arrSalary, employee.arrSalary);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arrFio);
        result = 31 * result + Arrays.hashCode(arrDep);
        result = 31 * result + Arrays.hashCode(arrSalary);
        return result;
    }
}
