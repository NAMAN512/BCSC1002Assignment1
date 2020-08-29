/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private String universityRollNumber;
    private String numberOfBooksIssued;
    private String namesOfBooksIssued;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(String universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public String getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(String numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public String getNamesOfBooksIssued() {
        return namesOfBooksIssued;
    }

    public void setNamesOfBooksIssued(String namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

}
