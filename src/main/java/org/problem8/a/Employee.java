package org.problem8.a;

public abstract class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Department: " + department;
    }
}

