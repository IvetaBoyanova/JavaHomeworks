package Homeworks.hw4;

import java.lang.reflect.Array;
import java.util.*;

public class Task2_EmployeeSalarySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        final int maxInputParams = 6;
        final int requiredInputParams = 4;

        Employee[] employees = new Employee[N];

        for (int i = 0; i < N; ++i) {
            String line = scanner.nextLine();
            String[] params = line.split(", ");

            if (params.length < requiredInputParams || params.length > maxInputParams) {
                throw new IllegalArgumentException("Invalid input employee !");
            }

            String name = params[0];
            double salary = Double.parseDouble(params[1]);
            String positions = params[2];
            String department = params[3];

            employees[i] = new Employee(name, salary, positions, department);

            if (params.length > requiredInputParams) {
                int age = Integer.parseInt(params[4]);
                employees[i].setAge(age);
            }
            if (params.length == maxInputParams) {
                String email = params[5];
                employees[i].setEmail(email);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (employees[j].compareTo(employees[j + 1]) < 0) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; ++i) {

            System.out.printf("%s, %s, %s, %s%n", employees[i].getName(), employees[i].getDepartment(),
                    employees[i].getPosition(), employees[i].getEmail());
        }
    }
}


