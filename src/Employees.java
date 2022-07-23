public class Employees {
    private String name;
    private double salary;
    private int department;
    private int id;
    private static int counter = 1;
    public Employees(String name, double salary, int department){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter;
        counter++;
    }

    public int getId() {
        return this.id;
    }
    public int getCounter(){
        return counter;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getDepartment(){
        return this.department;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public String toString(){
        return this.name + " - Зарплата : " + this.salary + "; Отдел : " + this.department + ";";
    }

}
