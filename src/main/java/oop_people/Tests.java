package oop_people;

public class Tests {

    public void positiveTestsPerson() {
        // Check that list of stuff (listOfStuff) is created
        // Check that list of stuff is empty
        // Check that the stuff can be added to the list

        // 4 Check that list for person (pocket) is created and empty
        // 5 Check if there is a list to take few stuff/items for every person (pocket)
        // 6 Check that person can't give more than she has
        // 7 Check that if item was gaven it removed from the pocket of person
        // 8 Check that person can take more than 1 item/stuff
        // 9 Check that item is added to the person's pocket who took it.
        // 10  Check that id person gave to the heap - the item is removed from the person
        // 11 ---//-- - the item is added to the heap
        // 12 Check that person can take some item/stuff (addStuff)

        Storage storage = new Storage();

        System.out.println("TC1. Creation of list ");
        if (storage.isStorageCreated()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }
        System.out.println("TC2. List of stuff is empty ");
        if (storage.isStorageEmpty()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }

        System.out.println("TC3. Stuff can be added to the list ");
        storage.addOfStuff("Bottle");
        if (!storage.isStorageCreated()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println("TC4. The pocket is created ");
        if (person1.isPocketExist()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }

        System.out.println("TC5. The pocket is empty ");
        if (person1.isPocketEmpty()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }

        System.out.println("TC6. The pocket can store more then 1 item ");
        person1.addStuff("Pencil");
        person1.addStuff("Phone");
        if (!person1.isPocketEmpty()) {
            System.out.println("ok");
        } else {
            System.out.println("False");
        }

        System.out.println("TC7. The person can't give more then has ");

        boolean success = true;

        try {
            person1.giveStuff(storage);
            person1.giveStuff(person2);
            person1.giveStuff(person2);

        } catch (NoItemsInThePocketException e) {

            success = false;
            System.out.println("ok");
        } if (success) {
            System.out.println("False");
        }



//        public void negativeTestsPerson () {
//            // Check that tries to give an item/stuff which doesn't have it
//
//        }


    }

}
