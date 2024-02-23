import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] arrName = new String[]{"Ivan", "Petr", "Kolya", "Vasia", "Alex", "Tyler", "Kate", "John", "Julia", "Tatiana"};
        Employee[] employees = new Employee[10];
        Random emp = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(arrName[emp.nextInt(0, 9)], emp.nextInt(1, 5), emp.nextInt(20000, 80000), i);
        }
        allEmployers(employees);
        salarySum(employees);
        minSalary(employees);
        maxSalary(employees);
        System.out.println(salarySum(employees) / employees.length);
        allFio(employees);
    }

    public static void allEmployers(Employee[] employee) {
        System.out.println("Метод №1. Получение списка всех сотрудников");
        for (int j = 0; j < employee.length; j++) {
            System.out.println(employee[j].getFio(j) + " " + employee[j].getDep(j) + " " + employee[j].getSalary(j));
        }
    }
    public static int salarySum(Employee[] employee) {
        //System.out.println("Метод №2. Посчитать сумму затрат на ЗП на месяц");
        int summa = 0;
        for (int i = 0; i < employee.length; i++) {
            summa += employee[i].getSalary(i);
        }
        //System.out.println(summa);
        return summa;
    }
    public static void minSalary(Employee[] employee) {
        System.out.println("Метод №3. Сотрудник с min ЗП");
        int minSalary = employee[0].getSalary(0);
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary(i)) {
                minSalary = employee[i].getSalary(i);
            }
        }
        System.out.println(minSalary);
    }
    public static void maxSalary(Employee[] employee) {
        System.out.println("Метод №4. Сотрудник с max ЗП");
        int maxSalary = employee[0].getSalary(0);
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary(i)) {
                maxSalary = employee[i].getSalary(i);
            }
        }
        System.out.println(maxSalary);
    }
    public static void allFio(Employee[] employee) {
        System.out.println("Метод №6. Получение ФиО всех сотрудников");
        for (int j = 0; j < employee.length; j++) {
            System.out.println(employee[j].getFio(j));
        }
    }

}