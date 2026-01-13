package oop;

public class man {

    String name;
    int age;
    boolean male;

    static int malePens = 65;
    static int femalePens = 60;

    public man(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void setName (String name){
        this.name = name;

    }

    public boolean isPensioner() {

        if(male & age >= malePens){
           return true;
        } if(!male & age >= femalePens) {
            return true;
        } else {
            return false;
        }

    }

    public int getAge () {
       return age;
    }

    public void plusOneYear () {
        age = age + 1;

    }

    public void updateAge (man other) {
       this.age = other.age;
    }

}
