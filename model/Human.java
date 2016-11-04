/*
 * @author Tobias Straub
 * @modul Formale Methoden und Datenstrukturen
 */

package model;

public class Human {
    private String firstName;
    private String lastName;
    private int matrikelNumber;
    
    public Human(String firstName, String lastName, int matrikelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNumber = matrikelNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getMatrikelNumber() {
        return matrikelNumber;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + matrikelNumber + ")";
    }
}
