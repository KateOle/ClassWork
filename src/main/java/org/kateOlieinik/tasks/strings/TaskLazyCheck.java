package org.kateOlieinik.tasks.strings;

public class TaskLazyCheck {

    // Чи є в магазині хоча би один товар

    public static void main(String[] args) {
        shop();
    }

    public static void shop() {

        String[] list = {"помідор", "майонез", "сметана", "сир"};

        String[] shop = {"вода", "хліб", "сир"};

        String[] shop2 = {"м'ясо", "вода", "гриби"};

        boolean check = false;

        outerloop:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < shop.length; j++) {
                if(list[i] == shop[j]) {
                    check = true;
                    break outerloop;
                }
            }
        }
        System.out.println(check);

        boolean check2 = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < shop2.length; j++) {
                if(list[i] == shop[j]) {
                    check = true;
                    break;
                }
            }
        }

        System.out.println(check2);
    }
}
