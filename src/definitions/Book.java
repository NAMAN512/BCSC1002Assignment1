/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String sbnNumberOfTheBook;

    //getter method

    public String getBookName() {
        return bookName;
    }

    //stter method

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getSbnNumberOfTheBook() {
        return sbnNumberOfTheBook;
    }

    public void setSbnNumberOfTheBook(String sbnNumberOfTheBook) {
        this.sbnNumberOfTheBook = sbnNumberOfTheBook;
    }
}
