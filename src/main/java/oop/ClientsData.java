package oop;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class ClientsData {

//    БД: всі клієнти, методи: скільки загальна сума грошей, дата найранішого відкриття рахунку, дата найпізнішого,
//    різниця між найстаршим і наймолодшим, отримати кількість клієнтів

    //table/list of Clients. Initially = 0 clients
    List<Client> clientsBase = new LinkedList<>();

    public ClientsData() {
    }

    public void addClient(Client client){
        clientsBase.add(client);
    }

    public void setNewClient(Client client) {

    }

    // скільки загальна сума грошей
    public int getAmountOfMoney() {
        int sumAmountOfClients = 0;

        for (int i = 0; i < clientsBase.size(); i++) {

            sumAmountOfClients = clientsBase.get(i).balance + sumAmountOfClients;
        }
        return sumAmountOfClients;
    }

    // дата найранішого відкриття рахунку

    public LocalDate getEarliestDateOfOpeningAccount() {
        LocalDate earliestDateOfAccount = clientsBase.get(0).getDateOfOpeningAccount();

        for (int i = 1; i < clientsBase.size(); i++) {
            if (clientsBase.get(i).dateOfOpeningAccount.isBefore(earliestDateOfAccount)) {
               earliestDateOfAccount = clientsBase.get(i).dateOfOpeningAccount;
            }
        }
           return earliestDateOfAccount;
    }


//дата найпізнішого відкриття рахунку

    public LocalDate getLatestOpenAccountDate(){
      LocalDate latestOpenAccountDate = clientsBase.get(0).getDateOfOpeningAccount();

        for (int i = 1; i < clientsBase.size(); i++) {
            if(clientsBase.get(i).dateOfOpeningAccount.isAfter(latestOpenAccountDate)){
                latestOpenAccountDate = clientsBase.get(i).dateOfOpeningAccount;
            }
        }
      return latestOpenAccountDate;
    }

    // різниця між найстаршим і наймолодшим (account)
    public Period getDateRange() {
        Period differenceDates = Period.between(getLatestOpenAccountDate(),getEarliestDateOfOpeningAccount());

       return  differenceDates;

    }

    // отримати кількість клієнтів
    public int allClients(){
        int allClients = clientsBase.size();
        return allClients;
    }




}
