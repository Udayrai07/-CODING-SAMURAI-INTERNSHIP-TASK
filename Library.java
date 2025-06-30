/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with keyword: " + keyword);
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You borrowed: " + title);
                } else {
                    System.out.println("Sorry, book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You returned: " + title);
                } else {
                    System.out.println("This book wasn't borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
