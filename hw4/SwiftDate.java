package Homeworks.hw4;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class SwiftDate {

    private int year;
    private int month;
    private int day;


    public SwiftDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year ");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 1 || month >= 12) {
            throw new IllegalArgumentException("Invalid month ");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day <= 1 || day >= 31) {
            throw new IllegalArgumentException("Invalid day ");
        }
        this.day = day;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public int getCentury() {
        if (year % 100 == 0) {
            return (year / 100);

        } else {
            return (year / 100) + 1;

        }
    }

    public int getDaysDifference(SwiftDate other) {

        LocalDate dateFrom = LocalDate.of(year, month, day);
        LocalDate dateTo = LocalDate.of(other.getYear(), other.getMonth(), other.getDay());
        long daysDifference = DAYS.between(dateFrom, dateTo);

        return (int) Math.abs(daysDifference) + 1;

    }


    public void printInfo() {
        if (isLeapYear()) {
            System.out.printf("%d %02d %02d - %d century.It is LEAP year.%n", year, month, day, getCentury());
        } else {
            System.out.printf("%d %02d %02d - %d century.", year, month, day, getCentury());

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int days = scanner.nextInt();

        SwiftDate date1 = new SwiftDate(year, month, days);

        year = scanner.nextInt();
        month = scanner.nextInt();
        days = scanner.nextInt();

        SwiftDate date2 = new SwiftDate(year, month, days);

        System.out.println(date1.getDaysDifference(date2));
        date1.printInfo();
        date2.printInfo();
    }
}

