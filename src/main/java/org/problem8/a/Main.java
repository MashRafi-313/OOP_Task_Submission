package org.problem8.a;

public class Main {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, "HR", 5000);
        Employee partTime = new PartTimeEmployee("Bob", 102, "Tech", 25, 80);
        Employee contract = new ContractEmployee("Charlie", 103, "Design", "UX Redesign", 7000);

        Employee[] employees = {fullTime, partTime, contract};

        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("Pay: $" + emp.calculatePay());
        }
    }
}

