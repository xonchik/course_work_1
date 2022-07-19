import java.sql.SQLOutput;

public class Main {

    ///Получить список всех сотрудников со всеми имеющимися по ним данными
    //(вывести в консоль значения всех полей (toString)).
    public static void allEmployees(Employees[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    ///Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void allName(Employees[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());
        }
    }

    ///Посчитать сумму затрат на зарплаты в месяц.
    public static double allSalaries(Employees[] employee){
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    ///Найти сотрудника с минимальной зарплатой.
    public static void minSalary(Employees[] employee){
        double minSalary = 1_000_000_000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == minSalary) {
                System.out.println("Сотрудник с самой минимальной зарплатой : " + employee[i]);
            }
        }
    }

    ///Найти сотрудника с максимальной зарплатой.
    public static void maxSalary(Employees[] employee) {
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == maxSalary) {
                System.out.println("Сотрудник с самой максимальной зарплатой : " + employee[i]);
            }
        }
    }

    ///Подсчитать среднее значение зарплат.
    public static void avgSalary(Employees[] employee) {
        allSalaries(employee);
        System.out.println("Среднее значение зарплат : " + allSalaries(employee) / employee.length);
    }

    ///Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static void indexingSalary(Employees[]employee) {
        double onePercent = allSalaries(employee) / 100;
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + ": " + employee[i].getSalary() / onePercent + "%");
        }
    }
    private static Employees[] employee = new Employees[10];

    ///Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой.
    public static void minSalaryInDepartment(int department){
        double minSalary = 1_000_000_000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() == minSalary) {
                System.out.println("Сотрудник с самой минимальной зарплатой в отделе : " + employee[i]);
            }
        }
    }

    ///Получить в качестве параметра номер отдела (1–5) и найти сотрудника с максимальной зарплатой.
    public static void maxSalaryInDepartment(int department) {
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() == maxSalary) {
                System.out.println("Сотрудник с самой максимальной зарплатой в отделе : " + employee[i]);
            }
        }
    }

    ///Получить в качестве параметра номер отдела (1–5) и найти сумму затрат на зарплату по отделу.
    public static double allSalariesInDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                sum = sum + employee[i].getSalary();
            }
        }
        return sum;
    }

    ///Получить в качестве параметра номер отдела (1–5) и найти среднюю зарплату по отделу.
    public static void avgSalaryInDepartment(int department) {
        double sum = 0;
        int numOfEmployee = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                sum = sum + employee[i].getSalary();
                numOfEmployee = numOfEmployee + 1;
            }
        }
        System.out.println("Среднее значение зарплат в отделе : " + sum / numOfEmployee);
    }

    ///Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void indexingSalaryInDepartment(int department) {
        double onePercent = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                onePercent = onePercent + employee[i].getSalary();
            }
        }
        onePercent = onePercent / 100;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                System.out.println(employee[i].getName() + ": " + employee[i].getSalary() / onePercent + "%");
            }
        }
    }

    ///Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void staffOfDepartment(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                System.out.println(employee[i].getName() + " - Зарплата : " + employee[i].getSalary());
            }
        }
    }

    ///Получить в качестве параметра число и найти: Всех сотрудников с зарплатой больше (или равно) числа
    //(вывести id, Ф. И. О. и зарплатой в консоль).
    public static void salaryIsHigher(double salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= salary) {
                System.out.println("Id:" + employee[i].getId() + " Name: " +
                        employee[i].getName() + " Salary: " + employee[i].getSalary());
            }
        }
    }

    ///Получить в качестве параметра число и найти: Всех сотрудников с зарплатой меньше числа
    //(вывести id, Ф. И. О. и зарплатой в консоль).
    public static void salaryIsLower(double salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < salary) {
                System.out.println("Id:" + employee[i].getId() + " Name: " +
                        employee[i].getName() + " Salary: " + employee[i].getSalary());
            }
        }
    }


    public static void main(String[] args) {

        employee[0] = new Employees("Хон Станислав Станиславович", 390_000, 1);
        employee[1] = new Employees("Петров Николай Васильевич", 190_000, 1);
        employee[2] = new Employees("Медведев Александр Павлович", 150_000, 2);
        employee[3] = new Employees("Мухаммедов Шавкат Ибрагимович", 290_000, 2);
        employee[4] = new Employees("Григорян Артур Рубенович", 130_000, 3);
        employee[5] = new Employees("Ковальчук Ирина Александровна", 350_000, 3);
        employee[6] = new Employees("Давидова Светлана Александровна", 330_000, 4);
        employee[7] = new Employees("Бондареко Иван Иванович", 200_000, 4);
        employee[8] = new Employees("Семенова Инна Владиславовна", 310_000, 5);
        employee[9] = new Employees("Ким Евгений Петрович", 180_000, 5);
    }
}