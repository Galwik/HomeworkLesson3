package main;

import java.util.Scanner;

public class InputHandler {
    Company company = new Company();

    public void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter employee's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter employee's salary:");
        int salary = scanner.nextInt();
        scanner.nextLine();
        company.addNewEmployee(new Employee(firstName, lastName, salary));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – End program");
    }

    public void ask() {
        Scanner scanner = new Scanner(System.in);
        boolean end;
        do {
            end = false;
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    company.printTotalSalaries();
                    break;
                case 2:
                    company.printAllEmployeesData();
                    break;
                case 3:
                    addNewEmployee();
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