/*
 * @author Tobias Straub
 * @modul Formale Methoden und Datenstrukturen
 */

package controller;

import model.Student;
import model.Human;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLtoObject {
    public static Student createStudent(Element studentXML) {
        Student student = new Student();
        NodeList studentList = studentXML.getElementsByTagName("human");
        
        for(int i = 0; i < studentList.getLength(); i++) {
            student.addHuman(createHuman((Element) studentList.item(i)));
        }
        
        return student;
    }
    
    public static Human createHuman(Element humanXML) {
        String firstName = humanXML.getElementsByTagName("firstName").item(0).getTextContent().trim();
        String lastName = humanXML.getElementsByTagName("lastName").item(0).getTextContent().trim();
        int matrikelNumber = Integer.parseInt(humanXML.getElementsByTagName("matrikelNumber").item(0).getTextContent().trim());
        
        Human human = new Human(firstName, lastName, matrikelNumber);
        
        return human;
    }
}
