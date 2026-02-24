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

  String stuff;
  String name;
  String surname;
  LocalDate dateOfBirth;
  // int age;
 // LinkedList <String> listOfStuff;

    LinkedList <String> listOfStuff = new LinkedList<>();

    public Person(String stuff, String name, String surname, LocalDate dateOfBirthd) {
        this.stuff = stuff;
      //  this.listOfStuff = listOfStuff;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirthd;
    }

    public Person(){

    }

    @Override
    public String toString() {
     //   return super.toString();
        return name+" "+surname;
    }

    public String getStuff() {
        return stuff;
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

    //    public LinkedList<String> getListOfStuff() {
//        return listOfStuff;
//    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Date of Birth
    public int getAge(){

        LocalDate curentDate = LocalDate.now();

        int years = 0;

       years = Period.between(dateOfBirth, curentDate).getYears();

        return years;

    }


    // прийняти вещи
    public String addStuff(String stuff){

        listOfStuff.add(0, stuff);

        return null;
    }

    // віддати предмет
    public void giveStuff(ListOfStuff repositorium){

        if(this.stuff == null){
            System.out.println("The person doesn't have any stuff");

        } else {
            repositorium.addOfStuff(this.stuff);
            this.stuff = null;
        }


    }

}
