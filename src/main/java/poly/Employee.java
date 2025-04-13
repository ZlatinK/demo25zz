package poly;

import poly.interfaces.Junior;
import poly.interfaces.Senior;

public abstract class Employee implements Senior, Junior {
    private String name;
    private int age;
    private String department;
    private double salary;
    private String startDate;
    private static final double MIN_SALARY = 1077;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid entry for Name!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid entry for Age!");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (!department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Error: Invalid entry for department!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            System.out.println("Error: Invalid entry for salary!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        if (!startDate.isEmpty()) {
            this.startDate = startDate;
        } else {
            System.out.println("Error: Invalid entry for start date!");
        }
    }

    public Employee(String name, int age, String department, double salary, String startDate){
        setName(name);
        setAge(age);
        setDepartment(department);
        setSalary(salary);
        setStartDate(startDate);
    }

    public abstract void doWork();

    public void getPayCheck(){
        System.out.printf("%s has received %.2f.\n",
                name, this.salary - (this.salary * 0.2));
    }

    public void getBonus(){
        System.out.printf("%s is getting 500 BGN bonus\n", name);
    }

    //method overloading...
    public final void getBonus(int bonus) {
        System.out.printf("%s is getting %d BGN bonus\n", name, bonus);
    }

    public static void staticMethod() {
        System.out.println("I am a static Method...");
    }
}
