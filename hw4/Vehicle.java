package Homeworks.hw4;

import java.util.Random;

public class Vehicle {

    static private int sLicenseNo;

    private String type;
    private String model;
    private int power;
    private double fuelConsumption;
    private int yearProduced;
    private int licenseNo;
    private int weight;
    private String color;

    public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced) {
        setType(type);
        setModel(model);
        setPower(power);
        setFuelConsumption(fuelConsumption);
        setYearProduced(yearProduced);
        setLicenseNo(sLicenseNo++);
        setColor("N/A");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!(type.equals("car") || type.equals("suv") || type.equals("truck") || type.equals("motorcycle"))) {
            throw new IllegalArgumentException("Invalid type !");
        }
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.length() == 0) {
            throw new IllegalArgumentException("Invalid model !");
        }
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Invalid power !");
        }
        this.power = power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption < 0) {
            throw new IllegalArgumentException("Invalid fuelConsumption !");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        if (yearProduced < 0) {
            throw new IllegalArgumentException("Invalid year !");
        }
        this.yearProduced = yearProduced;
    }

    public String getLicenseNo() {
        return String.format("%04d", licenseNo);
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Invalid weight !");
        }
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.length() == 0) {
            throw new IllegalArgumentException("Invalid color!");
        }
        this.color = color;
    }

    public double calculateTripPrice(double fuelPrice, double distance) {
        return (getFuelConsumption() / 100.0) * distance * fuelPrice;
    }

    public double getInsurancePrice() {
        double typeCoefficient = 0.0;
        double carAge = 2016 - getYearProduced();

        switch (getType()) {
            case "car":
                typeCoefficient = 1.00;
                break;
            case "suv":
                typeCoefficient = 1.12;
                break;
            case "truck":
                typeCoefficient = 1.20;
                break;
            case "motorcycle":
                typeCoefficient = 1.50;
                break;
            default:
        }

        return (0.16 * getPower()) * (1.25 * carAge) * (0.05 * getFuelConsumption()) * typeCoefficient;
    }

}





