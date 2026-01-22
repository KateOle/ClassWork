package oop;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class ClientsData {

//    БД: всі клієнти, методи: скільки загальна сума грошей, дата найранішого відкриття рахунку, дата найпізнішого,
//    різниця між найстаршим і наймолодшим, отримати кількість клієнтів

    // Видалити клієнта по account/імені
    // Знайти і повернути клієнта по account/імені
    //// Два списки злити в один
    // Реалізувати вертання клієнтів по списку - Lists -> find first, find last, find all

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


// Видалити клієнта по account
    public void removeClient(int account){

       // int removedClient;

        for (int i = 0; i < clientsBase.size(); i++) {
            if(account == clientsBase.get(i).getAccount()){
               clientsBase.remove(i);
            }
        }

    }


    // Видалити клієнта по імені
   public void removeClient(String surname){


        for (int i = 0; i < clientsBase.size(); i++) {
            if(surname == clientsBase.get(i).getSurname()){
                clientsBase.remove(i);
                    i--;
            }
        }

//        for(Client client : clientsBase){
//            if(surname.equals(client.getSurname())){
//                clientsBase.remove(client);
//            }
//        }

    }

    // повернути прізв клієнтів без видаленого

    public String getClientsData(){
        StringBuilder surn = new StringBuilder();

      //  String surn;

        for (int i = 0; i < clientsBase.size(); i++) {
           surn.append(clientsBase.get(i).getSurname() + " " + clientsBase.get(i).getName() + " " +
                   clientsBase.get(i).getBalance() + "\n");

        }
        return surn.toString();
    }

    // Знайти і повернути клієнта по account

    public List<Client> getClient(int account){

        Client c = null;
        List<Client> searchedClients = new LinkedList<>();

        for (int i = 0; i < clientsBase.size(); i++) {
           if(clientsBase.get(i).getAccount() == account){
               c = clientsBase.get(i);
              searchedClients.add(c);
           }
        }
        return searchedClients;
    }

    // Знайти і повернути клієнта по імені + дописати, шоб вертав список клієнтів з однаковими іменами
    public Client getClient(String name){

        Client c = null;

        for (int i = 0; i < clientsBase.size(); i++) {
            if(name.equals(clientsBase.get(i).getName())){
                c = clientsBase.get(i);

            }
        }
        return c;
    }

}
