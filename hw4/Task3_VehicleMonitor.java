package Homeworks.hw4;

import java.util.Scanner;

public class Task3_VehicleMonitor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // Number of cars
        double fuelPrice = Double.parseDouble(scanner.nextLine());

        final int maxInputParams = 8;
        final int requiredInputParams = 6;

        Vehicle[] vehicles = new Vehicle[N];
        int[] distances = new int[N];
        for (int i = 0; i < N; ++i) {
            String line = scanner.nextLine();
            String[] params = line.split(", ");

            if (params.length < requiredInputParams || params.length > maxInputParams) {
                throw new IllegalArgumentException("Invalid input vehicle!");
            }

            String type = params[0];
            String model = params[1];
            int power = Integer.parseInt(params[2]);
            double fuelConsumption = Double.parseDouble(params[3]);
            int yearProduced = Integer.parseInt(params[4]);

            distances[i] = Integer.parseInt(params[5]);

            vehicles[i] = new Vehicle(type, model, power,
                    fuelConsumption, yearProduced);

            if (params.length > requiredInputParams) {
                int weight = Integer.parseInt(params[6]);
                vehicles[i].setWeight(weight);
            }
            if (params.length == maxInputParams) {
                String color = params[7];
                vehicles[i].setColor(color);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%s - %s, %d, %s, Insurance cost: %.2f - Тravel cost: %.2f%n",
                    vehicles[i].getLicenseNo(), vehicles[i].getModel(), vehicles[i].getYearProduced(),
                    vehicles[i].getColor(), vehicles[i].getInsurancePrice(), vehicles[i].calculateTripPrice(fuelPrice, distances[i]));
        }
    }
}






