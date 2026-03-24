import exceptions_Exercises.CyclicInputVerification;
import oop_people.NoItemsInThePocketException;
import oop_people.Storage;
import oop_people.Person;
import oop_people.Tests;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

//        // Class Man
//        man Kate = new man("Kate", 30, false);
//
//        man Ivan = new man("Ivan", 30, true);
//
//        Kate.isPensioner();
//        Kate.getAge();
//        Kate.plusOneYear();
//
//        Kate.updateAge(Ivan);
//
//        System.out.println(Kate.getAge());

        // 2. Class Book
//        Book firstBook = new Book("Luice Karol","Alice in wonderland", 1980, 700);
//
//        firstBook.getAuthorAndTitle();
//        firstBook.setYearOfPublication(1982);
//
//        System.out.println(firstBook.getAuthorAndTitle());

        // 3. Class Client
//
//        Client client1 = new Client("Andrii", "Koshko", 123456, 10000, LocalDate.of(2025,3,1));
//        Client client2 = new Client("Viktoriia", "Kolesnikova", 654321, 100, LocalDate.of(2025,7,1));
//        Client client3 = new Client("Andrii", "Pes", 654321, 356, LocalDate.of(2016,12,1));
//        Client client4 = new Client("Andrii", "Chomiaczko", 56789, 6589, LocalDate.of(2019,12,3));
//        Client client5 = new Client("Olena", "Koshko", 987456, 12359, LocalDate.of(2018,11,30));
//
//        Client client6 = new Client("Kateryna", "Koshko", 987431, 123311, LocalDate.of(2015,11,30));
//        Client client7 = new Client("Olena", "Pesko", 987894, 56359, LocalDate.of(2016,11,30));
//      //  Client client8 = new Client("Andrii", "Chomiaczko", 56789, 12332, LocalDate.of(2022,11,30));
//        Client client9 = new Client("Marta", "Kotko", 561456, 12000, LocalDate.of(2023,11,30));
//        Client client10 = client4;
//
//
//        ClientsData cd1 = new ClientsData();
//        ClientsData cd2 = new ClientsData();
//
//        List<Client> cdlist = new LinkedList<>();
//
//        cd1.addClient(client1);
//        cd1.addClient(client2);
//        cd1.addClient(client3);
//        cd1.addClient(client4);
//        cd1.addClient(client5);
//
//        cd2.addClient(client6);
//        cd2.addClient(client7);
//       // cd2.addClient(client8);
//        cd2.addClient(client9);
//        cd2.addClient(client10);
//
//
//
//    //  System.out.println(cd1.getClientsData());
//     //   cd1.removeClient(654321);
//      //  cd1.removeClient("Koshko");
//       // cd1.getClientByAccount(56789);
//
//   //   cd1.getEarliestDateOfOpeningAccount();
//
//   //    System.out.println(cd1.getEarliestDateOfOpeningAccount());
//   //    System.out.println(cd1.getAmountOfMoney());
//     // System.out.println(cd1.getLatestOpenAccountDate());
//    //   System.out.println(cd1.getDateRange());
//       // System.out.println(cd1.allClients());
//     //   System.out.println(cd1.getClientsData());
//     //   System.out.println(cd1.getClient(56789));
//
////        Client searchedClient = cd1.getClientLast("Katya");
////
////        if(searchedClient == null){
////            System.out.println("There is no such Client, please try again");
////        } else
////            System.out.println(searchedClient.getAccount());
//
//       // System.out.println(cd1.getClientLast("Andrii").getAccount());
//       // System.out.println(cd1.getClientFirst("Andrii").getAccount());
//
////       cdlist = cd1.getClientAll("Andrii");
////
////
////        for (int i = 0; i < cdlist.size() ; i++) {
////            System.out.println(cdlist.get(i).getName());
////        }
//
//        System.out.println(cd1.mergedClientBase(cd2).getNameSurnameAccount());


        // 4. Class Person -> 20.03.2026

        LinkedList<String> perst = new LinkedList<>();

        Person person1 = new Person( "Petro", "Koshko", LocalDate.of(1990, 12, 23) );
        Person person2 = new Person( "Vasyl", "Rysko", LocalDate.of(2026, 2, 18) );
        Person person3 = new Person( "Olena", "Slonko", LocalDate.of(1998, 2, 27) );

        person1.addStuff("Phone");
        person2.addStuff("Laptop");
        person3.addStuff("Ball");
        person3.addStuff("Cap");

        Storage st1 = new Storage();
//
//        st1.addOfStuff("Book");
//        st1.addOfStuff("Notebook");
//
//        Tests test = new Tests();
//
//        test.positiveTestsPerson();

//        try {
//            person1.giveStuff(person2);
//            person1.giveStuff(person2);
//        } catch (NoItemsInThePocketException e) {
//            System.out.println(" There is no items in the pocket of " + person1);
//        }
//
//        try {
//            person1.giveStuff(st1);
//        } catch (NoItemsInThePocketException e) {
//            System.out.println( " There is no items in the pocket of " + person1);
//        }

        //    System.out.println(st1.printList());

     //   System.out.println(person1.getAge());
     //   System.out.println(person2.getAge());

     //   person1.setName("Luka");
    //    System.out.println(person1);

//        System.out.println("Person who has some stuff - " + person2);
//
//        System.out.println("Initial heap of stuff - " + st1.printList());
//
//        System.out.println();
//
//        person2.giveStuff(st1);
//
//        System.out.println("Person put his stuff to the heap - " + person2);
//
//        System.out.println("The heap after th stuff was added - " + st1.printList());
//
//        System.out.println();

//
//        System.out.println(person3);
//        System.out.println(person1);
//
//        person3.giveStuff(st1);
//
//        System.out.println();
//        System.out.println(st1.printList());
//       System.out.println(person3);
//
//        System.out.println();

//        for (int i = 0; i < st1.size(); i++) {
//            st1.add("Test");
//        }




    //24.03.2026
    //    CyclicInputVerification.InputANumber();


// 4 partii - 0, 1, 2, 3. 1000 people in every parties. 20% of people move to the party there speaker tells.
// Speaker 0 is telling.


//      3. Конвертор валют. Є на виібр 4 валюти: гривні, долари, євро і злоті.
//      Користувач вводить скільки в ньогоо є на одній валюті, а отримує скільки це на іншій яку він вказав

//
//                User a = new User();
//                User andrii = new User();
//
//                a.age = 23;
//  }

//}

//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter number 1");
//            double number1 = scanner.nextDouble();
//            System.out.println("Enter number 2");
//            double number2 = scanner.nextDouble();
//
//            System.out.println("Enter sign: +, -, *, /");
//            char sign = scanner.next().charAt(0);
//
//            while (sign != '+' & sign != '-' & sign != '*' & sign != '/') {
//                System.out.println("Enter valid sign: +, -, *, /");
//                sign = scanner.next().charAt(0);
//            }
//
//            if ( sign == '/' ) {
//                while (number2 == 0) {
//                    System.out.println("Enter other number, not zero");
//                    number2 = scanner.nextDouble();
//                }
//            }
//
//            double a = calculator(number1, number2, sign);
//            calculationResult(a);
//
//    }


// 4. Три игровые кости. рассчитать кто выиграл
//    public static int multi(int a, int b, int c) {
//        return a * b * c;
//    }
//
//    public static int twoMulti(int a) {
//        return a * 2;
//    }
//
//    public static void task1 () {
//
//        System.out.println("Input an age");
//
//        Scanner age = new Scanner(System.in);
//
//        short n = age.nextShort();
//
//        if (isMoreThan18(n)) {
//            System.out.println("Vouting");
//        } else {
//            System.out.println("Not vouting");
//        }
//
//    }
//
//    public static boolean isMoreThan18(int age){
//        return age >= 18;
//    }
//
//
//    public static void main(String[] args) {

//       multi (2, 4, 7);
//        System.out.println(multi (4, 5, 7));

//        int b = twoMulti(5);
//        System.out.println(b);

//  task1();



    }
}


