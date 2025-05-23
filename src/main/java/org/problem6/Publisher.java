package org.problem6;

public class Publisher {
    int id;
    String name;
    String address;
    int phoneNo;

    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void addPub() {
        System.out.println("Adding publisher...");
    }

    public void modifyPub() {
        System.out.println("Modifying publisher...");
    }

    public void deletePub() {
        System.out.println("Deleting publisher...");
    }

    public void orderStatus() {
        System.out.println("Checking publisher order status...");
    }
}

