package org.bankTransactionsLog;

//478. Напишіть програму, яка обчислює суму на банківському рахунку на основі журналу транзакцій. Формат журналу
//транзакцій відображається наступним чином:
//
//D 100
//W 200
//де D – покласти на депозит ціле значення суми, а W - вилучити. Введення транзакцій завершується порожнім рядком.

public class BankTransactionsLog {

    public static void main(String[] args) throws NegativeResultOfTransactionException, NoEmptyRowAtTheEndOfEnterException, IncorrectFormatException, MoreThenOneEmptyRowAtTheEndException, NotAllowedCharacterException {
      // System.out.println("300".matches("\\d+.\\d+"));
       // System.out.println("02.12.22".matches("\\d{2}.\\d{2}.\\d{2}"));
      //  System.out.println("D 15.123".matches("^([WD]{1})[ ]{1}\\d*\\.?\\d{0,2}"));
        //System.out.println("+48551666999".matches("^[+]\\d{11}"));
       // System.out.println("John Smith".matches("\\w*[ ]{1}\\w*"));
       // System.out.println("23test569".matches("\\d+\\D*\\d+"));

       //testBankTransactionsLog();
       // transactionsResultSum("D 300\nW 200\nD200\nW 100\n\n");


//        try {
//            transactionsResultSum("D 300\nW 600\nD 200\nW 100\n\t");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
    }

    public static Double transactionsResultSum(String transactions) throws NullException, NoEmptyRowAtTheEndOfEnterException,
            MoreThenOneEmptyRowAtTheEndException, NotAllowedCharacterException,
             IncorrectFormatException, NegativeResultOfTransactionException {

        if(transactions == null){
            throw new NullException();
        }

        if (!transactions.endsWith("\n\n")) {
            throw new NoEmptyRowAtTheEndOfEnterException();
        }

        if (transactions.endsWith("\n\n\n")) {
            throw new MoreThenOneEmptyRowAtTheEndException();
        }

        for (int i = 0; i < transactions.length(); i++) {
            if (transactions.charAt(i) == 'W' ||
                    transactions.charAt(i) == 'D' ||
                    Character.isDigit(transactions.charAt(i)) ||
                    transactions.charAt(i) == '.' ||
                    transactions.charAt(i) == ' ' ||
                    transactions.charAt(i) == '\n') {

            } else throw new NotAllowedCharacterException();
        }


        String[] partsOfText = transactions.split("\n");
        String[] partsOfRow = new String[2];
        String[] partsOfRowMinus = new String[2];
        double amount = 0.00;


        for (int i = 0; i <partsOfText.length ; i++) {

//                partsOfRow = partsOfText[i].split(" ");
//                if(partsOfRow[0].startsWith("D") || partsOfRow[0].startsWith("W") &&
//                      //  partsOfRow[1].contains(" ") &&
//                        partsOfRow[1].matches("\\d+.\\d{0,2}")
//                ){
//
//                }
            if(partsOfText[i].matches("^([W,D]{1})[ ]{1}\\d*\\.?\\d{0,2}")){

            }
               else {
                    throw new IncorrectFormatException();
                }
            }


        if (!transactions.isEmpty() && !transactions.isBlank() && transactions != null) {

            for (int i = 0; i < partsOfText.length; i++) {

                if (partsOfText[i].startsWith("D") || partsOfText[i].startsWith("W")) {
                    try {
                        partsOfRow = partsOfText[i].split(" ");
                    } catch (Exception e) {
                        // if(){}
                        throw new IncorrectFormatException();
                    }
                    try {
                        amount += Double.parseDouble(partsOfRow[1]) * (partsOfText[i].startsWith("D") ? +1 : -1);
                    } catch (Exception e) {
                        throw new IncorrectFormatException();
                    }

                }
            }
        } else throw new IncorrectFormatException();

        if (amount < 0.0) {
            throw new NegativeResultOfTransactionException();
        }
        // System.out.println("Amount " + amount);

        return amount;
    }





}
