package main;

import java.util.Scanner;

public class Main {
    public static Company company = new Company();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            addNewEmployeer();
        }
        ask();
    }

    public static void addNewEmployeer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter employee's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter employee's salary:");
        int salary = scanner.nextInt();
        scanner.nextLine();
        company.employees.add(new Employee(firstName, lastName, salary));
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – End program");
    }

    public static void ask() {
        Scanner scanner = new Scanner(System.in);
        boolean end;
        do {
            end = false;
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Sum of all employees salary: " + company.employees.stream().mapToInt(Employee::getSalary).sum());
                    break;
                case 2:
                    company.employees.forEach(Employee::getAllData);
                    break;
                case 3:
                    addNewEmployeer();
                    break;
                case 4:
                    end = true;
                    break;
                default:
                    System.out.println("choose from 1 to 4");
                    break;
            }
        } while (!end);
    }
}
