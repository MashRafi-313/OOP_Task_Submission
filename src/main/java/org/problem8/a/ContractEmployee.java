package org.problem8.a;

public class ContractEmployee extends Employee {
    private final String projectName;
    private final double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Project: " + projectName;
    }
}

