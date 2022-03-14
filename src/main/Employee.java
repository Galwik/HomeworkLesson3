package main;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void getAllData(Employee employee) {
        System.out.printf("Salary for %s %s is %d%n", employee.firstName, employee.lastName, employee.salary);
    }
}
