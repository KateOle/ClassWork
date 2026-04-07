package oop_people;

//Клас група людей (назва групи, список людей) (список всіх предметів унікальних,
// список предметів кількісно,
//перемішати між людьми предмети)

import java.util.LinkedList;
import java.util.Random;

public class PeopleGroup {

    String nameOfGroup;

    LinkedList <Person> listOfPeople = new LinkedList<>();

    LinkedList <String> uniqueStaff = new  LinkedList<>();

    Random r = new Random();


    public void addPerson(Person person){

        listOfPeople.add(person);

    }

   public LinkedList<String> getUniqueStaff() {

       uniqueStaff.clear();

       for (int i = 0; i < listOfPeople.size(); i++) {
           for (int j = 0; j < listOfPeople.get(i).getPocket().size(); j++) {

               if(uniqueStaff.contains(listOfPeople.get(i).getPocket().get(j))){

               } else
                   uniqueStaff.add(listOfPeople.get(i).getPocket().get(j));
           }
       }

     return uniqueStaff;

   }

    // список предметів кількісно

    public int amountOfStuff(){

        int amountOfStuff = 0;

        for (int i = 0; i < listOfPeople.size(); i++) {
           amountOfStuff = listOfPeople.get(i).getPocket().size() + amountOfStuff;
        }

        return amountOfStuff;
    }

    LinkedList <String> allStuff = new LinkedList<>();

    //перемішати між людьми предмети
    public void randomExchangeOfStuff(){



        for (int i = 0; i < listOfPeople.size(); i++) {

            allStuff.addAll(listOfPeople.get(i).getPocket());
            listOfPeople.get(i).clearPockets();

        }

        for (int l = 0; l < allStuff.size(); l++) {

            int random = r.nextInt(listOfPeople.size());

          listOfPeople.get(random).addStuff(allStuff.get(l));

        }



    }

}
