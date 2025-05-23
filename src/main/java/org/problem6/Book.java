package org.problem6;

public class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    public Book(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }


    public void addNewBooks() {
        System.out.println("Adding new book...");
    }

    public void deleteBooks() {
        System.out.println("Deleting book...");
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Name: " + bookName + ", Author: " + bookAuthor +
                ", Year: " + yearOfPub + ", Price: " + price + ", Status: " + status);
    }

    public void inquiryBook() {
        System.out.println("Inquiring about book: " + bookName);
    }
}

