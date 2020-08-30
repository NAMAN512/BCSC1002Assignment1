/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] name;

    public Student() {
        studentName = "Naman Dulani";
        universityRollNumber = 191500471;
        numberOfBooksIssued = 10;
        this.name = new Book[10];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("IssuedBook " + (index + 1));
        }
    }

    public Student(String studentName, long universityRollNumber, int numberOfBooksIssued, Book[] name) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.name = new Book[10];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("Book " + (index + 1));
        }
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getName() {
        return this.name;
    }

    public void setName(Book[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", name=" + Arrays.toString(name) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getName());
        return result;
    }
}
