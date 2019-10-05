package Homeworks.hm4;

public class Car {
    private String brandCar;
    private String modelCar;
    private int powerEngineCar;
    private int yearPoductionCar;

    public Car(String brandCar, String modelCar, int powerEngineCar, int yearPoductionCar) {
        setBrandCar(brandCar);
        setModelCar(modelCar);
        setPowerEngineCar(powerEngineCar);
        setYearPoductionCar(yearPoductionCar);
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        if (brandCar == null || brandCar.length() == 0) {
            throw new IllegalArgumentException("Invalid brand");
        }
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        if (modelCar == null || modelCar.length() == 0) {
            throw new IllegalArgumentException("Invalid model");
        }
        this.modelCar = modelCar;
    }

    public int getPowerEngineCar() {
        return powerEngineCar;
    }

    public void setPowerEngineCar(int powerEngineCar) {
        if (powerEngineCar < 0) {
            throw new IllegalArgumentException("Invalid power engine");
        }
        this.powerEngineCar = powerEngineCar;
    }

    public int getYearPoductionCar() {
        return yearPoductionCar;
    }

    public void setYearPoductionCar(int yearPoductionCar) {
        if (yearPoductionCar < 0 || yearPoductionCar > 2019) {
            throw new IllegalArgumentException("Invalid production");
        }
        this.yearPoductionCar = yearPoductionCar;
    }

    public int insuranceCategory() {
        int year = 2019 - yearPoductionCar;
        if (year < 8) {
            return 1;
        } else if (year >= 8 && year <= 15) {
            return 2;
        } else if (year > 15 && year <= 25) {
            return 3;
        } else {
            return 4;
        }
    }

    public double taxCar() {
        int category = insuranceCategory();
        double result = 0;
        switch (category) {
            case 1:
                result = 150;
                break;
            case 2:
                result = 200;
                break;
            case 3:
                result = 300;
                break;
            case 4:
                result = 500;
                break;
            default:
        }

        if (powerEngineCar < 80) {
            result += result * 0.2;
        } else if (powerEngineCar > 140) {
            result += result * 0.45;
        }
        return result;
    }

    public static void main(String[] args) {
        Car car = new Car("Opel", "Astra", 85, 1996);
        System.out.println(car.insuranceCategory());
        System.out.println(car.taxCar());


    }
}


