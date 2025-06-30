/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));

        int choice;

        do {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Show all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    library.searchBook(keyword);
                    break;
                case 3:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = sc.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
