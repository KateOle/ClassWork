package oop_people;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

//Задача: Люди і речі.
//        Речі - строки
//Люди обєкти (імя, прізвище, вік, список речей) (змінити імя, змінити вік, віддати предмет, прийняти предмет)
//Клас група людей (назва групи, список людей) (список всіх предметів унікальних, список предметів кількісно,
//перемішати між людьми предмети)

public class Person {

 // String stuff;
  String name;
  String surname;
  LocalDate dateOfBirth;
  // int age;
 // LinkedList <String> listOfStuff;

   LinkedList <String> pocket = new LinkedList<>();

   PeopleGroup peopleGroup = new PeopleGroup();

    public Person(String name, String surname, LocalDate dateOfBirthd) {
      //  this.stuffForPerson = stuffForPerson;
      //  this.stuff = stuff;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirthd;
    }

    public Person(){

    }

    @Override
    public String toString() {
     //   return super.toString();
        return name+" "+surname+" "+ pocket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LinkedList<String> getPocket() {
        return pocket;
    }

    //    public LinkedList<String> getListOfStuff() {
//        return listOfStuff;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isPocketEmpty(){

        return pocket.isEmpty();

    }

    public boolean isPocketExist(){

        return pocket != null;

    }

    // Date of Birth
    public int getAge(){

        LocalDate curentDate = LocalDate.now();

        int years = 0;

       years = Period.between(dateOfBirth, curentDate).getYears();

        return years;

    }


    //  Додати речі в список людини
    public void addStuff(String stuff){

      //  Storage listOfStuff = new Storage();

        pocket.add(0, stuff);

       // return null;
    }

    // віддати предмет в кучу
    public void giveStuff(Storage repositorium) throws NoItemsInThePocketException{

        if(pocket.isEmpty()){
            throw new NoItemsInThePocketException();

        } else {
            repositorium.addOfStuff(pocket.pop());

        }

    }

    // віддати предмет людині
    public void giveStuff(Person personWhoTakesGift) throws NoItemsInThePocketException {

        String stuffForGift;

        if(pocket.isEmpty()){
            throw new NoItemsInThePocketException();
          //  System.out.println("The person doesn't have any stuff");

        } else {
            stuffForGift = pocket.pop();
            personWhoTakesGift.pocket.add(0, stuffForGift);

        }

    }

    //забрати предмет

    public void removeStuff(){

      //  String stuff1;

        if(pocket.isEmpty()){

        } else
            pocket.remove(0);



    }

    // видалити всі речі з карману кожної людини

    public void clearPockets(){

        pocket.clear();

    }
}
