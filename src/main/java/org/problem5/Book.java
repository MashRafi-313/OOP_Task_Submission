package org.problem5;

public class Book {
    private final String title;
    private final String author;

    public Book(String title) {
        this.title = title;
        this.author = null;  // author not passed, so set to null
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public void display() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not specified");
        }
    }


    public static void main(String[] args) {
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        book1.display();
        System.out.println();
        book2.display();
    }
}

