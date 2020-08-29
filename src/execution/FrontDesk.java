/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("The Third Door");
        book.setAuthorOfTheBook("Alex Banayan");
        book.setSbnNumberOfTheBook("9780804136662");
        System.out.println(book.getBookName());
        System.out.println(book.getAuthorOfTheBook());
        System.out.println(book.getSbnNumberOfTheBook());
    }
}
