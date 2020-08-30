/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String sbnNumberOfTheBook;

    //constructor

    public Book() {
        bookName = "The Third Door";
        authorOfTheBook = "Alex Banayan";
        sbnNumberOfTheBook = "9780804136662";
    }

    public Book(String bookName, String authorOfTheBook, String sbnNumberOfTheBook) {
        this.bookName = bookName;
        this.authorOfTheBook = authorOfTheBook;
        this.sbnNumberOfTheBook = sbnNumberOfTheBook;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }
    //getter method

    public String getBookName() {
        return this.bookName;
    }

    //stter method

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorOfTheBook() {
        return this.authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getSbnNumberOfTheBook() {
        return this.sbnNumberOfTheBook;
    }

    public void setSbnNumberOfTheBook(String sbnNumberOfTheBook) {
        this.sbnNumberOfTheBook = sbnNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorOfTheBook='" + authorOfTheBook + '\'' +
                ", sbnNumberOfTheBook='" + sbnNumberOfTheBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getSbnNumberOfTheBook(), book.getSbnNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorOfTheBook(), getSbnNumberOfTheBook());
    }
}
