package oop;
import java.time.LocalDate;

public class Client {
  //Клієнт: імя, прізвище, на рахунку, дата відкриття рахунку

    // внутрішні параметри
    String name;
    String surname;
    int account;
    int balance;
    LocalDate dateOfOpeningAccount;

    static int pensAge = 65;

    // зовнішні параметри
    public Client(String name, String surname, int account, int balance, LocalDate dateOfOpeningAccount) {
        this.name = name;
        this.surname = surname;
        this.account = account;
        this.balance = balance;
        this.dateOfOpeningAccount = dateOfOpeningAccount;
    }

    public int getBalance(){

        return balance;
    }

    public LocalDate getDateOfOpeningAccount() {
        return dateOfOpeningAccount;
    }

    public void setRemoveClient(int account){

    }

    public String getSurname(){
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }
}
