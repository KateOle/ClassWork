package oop_people;

import java.util.LinkedList;

public class ListOfStuff {

    String stuff;

    LinkedList<String> listOfStuff = new LinkedList<>();

    public ListOfStuff(){

    }

    public void setListOfStuff(LinkedList<String> listOfStuff) {
        this.listOfStuff = listOfStuff;
    }

    public void addOfStuff(String otherStuff){

       listOfStuff.add(0, otherStuff);
    }

    public LinkedList<String> printList(){

        return listOfStuff;
    }



}
