/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            Book book = new Book();
            System.out.println("Book Name :"bookName);
        } else if (n == 2) {

        }
    }
}
