package org.problem6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(101, "Effective Java", "Joshua Bloch", "2018", 45.99f, "Available");
        User user = new User(1, "John Doe", "123 Main Street", 123456789);
        Librarian librarian = new Librarian(1, "Jane Smith");
        Publisher publisher = new Publisher(501, "Pearson Education", "NY, USA", 987654321);


        System.out.println("\n--- Book Operations ---");
        book.displayBookDetails();
        book.inquiryBook();

        System.out.println("\n--- User Operations ---");
        user.addNewUser();
        user.bookPurchase();
        user.returnBooks();
        user.payFine(new Date());

        System.out.println("\n--- Librarian Operations ---");
        librarian.searchBook("Effective Java");
        librarian.verifyMember(user.userID);
        librarian.orderBooks();
        librarian.sellBooks();

        System.out.println("\n--- Publisher Operations ---");
        publisher.addPub();
        publisher.orderStatus();
    }
}

