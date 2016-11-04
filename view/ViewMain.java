/*
 * @author Tobias Straub
 * @modul Formale Methoden und Datenstrukturen
 */
package view;

import controller.XMLtoObject;
import model.Student;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ViewMain {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File("src/model/students.xml"));
            //manualTraverse(document);

            Student student = XMLtoObject.createStudent(document.getDocumentElement());

            System.out.print(student);

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println("Sorry, da ging was schief: " + ex.getMessage());
        }
    }
    
    
    public static void manualTraverse(Node node) {
        NodeList nodeList = node.getChildNodes();
        
        if(node.getNodeType() == Node.ELEMENT_NODE) {
           if(nodeList.getLength() <= 1) {
               System.out.print(node.getNodeName() + " -> ");
               System.out.print(node.getTextContent() + "\n");
           } else {
               System.out.println("\n" + node.getNodeName());
           }
        }
        
        for(int i = 0; i < nodeList.getLength(); i++) {
            manualTraverse(nodeList.item(i));
        }
        
        
        
    }
}
