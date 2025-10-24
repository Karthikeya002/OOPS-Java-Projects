// Employee.java - Demonstrates Encapsulation
public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private static int employeeCount = 0;

    public Employee(int id, String name, double salary, String department) {
        this.employeeId = ++employeeCount;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: $" + salary + ", Dept: " + department);
    }

    public void giveRaise(double percentage) {
        salary += salary * percentage / 100;
    }

    public double getSalary() { return salary; }
    public static int getEmployeeCount() { return employeeCount; }
}
