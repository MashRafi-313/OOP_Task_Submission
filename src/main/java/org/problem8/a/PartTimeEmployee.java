package org.problem8.a;

public class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

