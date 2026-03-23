package oop_people;

import java.util.LinkedList;

public class Storage {

    String stuff;

    LinkedList<String> listOfStuff = new LinkedList<>();

    public Storage(){

    }

    public void setListOfStuff(LinkedList<String> listOfStuff) {
        this.listOfStuff = listOfStuff;
    }

    public boolean isStorageCreated(){

        return listOfStuff != null;
    }

    public boolean isStorageEmpty(){

       return listOfStuff.isEmpty();

    }





    public void addOfStuff(String otherStuff){

       listOfStuff.add(0, otherStuff);
    }

    public LinkedList<String> printList(){

        return listOfStuff;
    }



}
