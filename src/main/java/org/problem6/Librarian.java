package org.problem6;

public class Librarian {
    int id;
    String name;

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void searchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    public boolean verifyMember(int id) {
        System.out.println("Verifying member with ID: " + id);
        return true; // stub
    }

    public void orderBooks() {
        System.out.println("Ordering books...");
    }

    public void sellBooks() {
        System.out.println("Selling books...");
    }
}

