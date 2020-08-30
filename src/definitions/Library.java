/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] provide;

    public Library() {
        this.provide = new Book[10];
        for (int index = 0; index < provide.length; index++) {
            provide[index] = new Book("AvailableBook " + (index + 1));
        }
    }

    public Library(Book[] provide) {
        this.provide = provide;
    }

    public Book[] getProvide() {
        return this.provide;
    }

    public void setProvide(Book[] provide) {
        this.provide = provide;
    }

    @Override
    public String toString() {
        return "Library{" +
                "provide=" + Arrays.toString(provide) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getProvide(), library.getProvide());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getProvide());
    }

}
