public abstract class Main {
    static Employee[] employees = new Employee[10];
    //static employees[0] = new Employee("Иванов Иван Иванович", 1, 43000);
    private static int id = 0;
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 43000);
        employees[1] = new Employee("Петров Пётр Петрович", 2, 75000);
        employees[2] = new Employee("Викторов Виктор Викторович", 3, 54000);
        employees[3] = new Employee("Смирнов Василий Степанович", 4, 70000);
        employees[4] = new Employee("Чашкин Роман Романович", 5, 68000);
        employees[5] = new Employee("Газетов Игорь Михайлович", 1, 43000);
        employees[6] = new Employee("Константинов Эдуард Егорович", 2, 29000);
        employees[7] = new Employee("Трубных Виктория Павловна", 3, 90000);
        employees[8] = new Employee("Мышкина Вита Михайловна", 4, 103000);
        employees[9] = new Employee("Безруков Степан Николаевич", 5, 55000);
        getAllEmployees();
        getSumSalaryMonth();
        findEmploeerWithMinSalary();
        findEmploeerWithMaxSalary();
        findAvarageSalaryOfAllEmployeers();
        getInitalsEmploees();

    }
    public static void getAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + ". " + employees[i].getFio() + " " + employees[i].getDep() + " " + employees[i].getSalary());
        }
    }
    public static int getSumSalaryMonth() {
        int summa = 0;
        for (int i = 0; i < employees.length; i++) {
            summa += employees[i].getSalary();
        }
        return summa;
        //System.out.println("\nСумма затрат на ЗП в месяц равна: " + summa + "\n");
    }
    public static int findEmploeerWithMinSalary() {
        int minimum = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (minimum > employees[i].getSalary()) {
                minimum = employees[i].getSalary();
            }
        }
        return minimum;
        //System.out.println("Минимальная зарплата у сотрудника равна: " + minimum + "\n");
    }

    public static int findEmploeerWithMaxSalary() {
        int maximum = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (maximum < employees[i].getSalary()) {
                maximum = employees[i].getSalary();
            }
        }
        return maximum;
        //System.out.println("Минимальная зарплата у сотрудника равна: " + maximum + "\n");
    }
    public static int findAvarageSalaryOfAllEmployeers() {
        return getSumSalaryMonth()/employees.length;
    }
    public static void getInitalsEmploees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + ". " + employees[i].getFio());
        }
    }


}