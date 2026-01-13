package oop;
import java.time.LocalDate;

public class Client {
  //Клієнт: імя, прізвище, на рахунку, дата відкриття рахунку

    String name;
    String surname;
    int account;  // String ??
    int balance; // float ??
    LocalDate dateOfOpeningAccount;

    static int pensAge = 65;

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


}
