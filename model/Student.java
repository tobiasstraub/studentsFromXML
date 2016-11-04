/*
 * @author Tobias Straub
 * @modul Formale Methoden und Datenstrukturen
 */

package model;

import java.util.ArrayList;

public class Student {
    
    private ArrayList humanList;
    
    public Student() {
        humanList = new ArrayList(4);
    }
    
    public void addHuman(Human h) {
        humanList.add(h);
    }
    
    public ArrayList getAllHumans() {
        return humanList;
    }
    
    @Override
    public String toString() {
        String print = "";
        for(int i = 0; i < humanList.size(); i++) {
            print += "Datensatz#" + (i+1) + ": " + humanList.get(i) + "\n";
        }
        return print;
    }
}
