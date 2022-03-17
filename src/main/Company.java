package main;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void printTotalSalaries() {
        System.out.println("Sum of all employees salary: " + employees.stream().mapToInt(Employee::getSalary).sum());
    }

    public void printAllEmployeesData() {
        employees.forEach(Employee::getAllData);
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }
}