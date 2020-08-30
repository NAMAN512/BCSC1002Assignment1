/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Input;

        Library libraryObject = new Library();
        Student studentObject = new Student();
        Book bookObject = new Book();

        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?\n");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice: ");
            Input = sc.nextInt();
            switch (Input) {
                case ISSUE_A_NEW_BOOK_FOR_ME:
                    System.out.println("How many Books you want to issue: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the books that you want to issue: ");
                    String[] bookNames = new String[n];
                    for (int i = 0; i < n; i++) {
                        bookNames[i] = sc.next();
                    }
                    for (String bookName : bookNames) {
                        System.out.println(bookName);
                    }

                    break;

                case RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME:
                    System.out.println("How many Books you want to return: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the books that you want to issue: ");
                    String[] returnBookName = new String[r];
                    for (int i = 0; i < r; i++) {
                        returnBookName[i] = sc.next();
                    }
                    for (String bookName : returnBookName) {
                        System.out.println(bookName);
                    }

                    break;

                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    System.out.println("Your all issues book names are: ");
                    sc.nextLine();

                    break;

                default:
            }
        } while (Input != EXIT);
        sc.close();
    }
}


