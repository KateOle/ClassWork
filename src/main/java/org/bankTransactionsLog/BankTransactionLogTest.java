package org.bankTransactionsLog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.bankTransactionsLog.BankTransactionsLog.transactionsResultSum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.bankTransactionsLog.BankTransactionsLog;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

public class BankTransactionLogTest {
    @Test
    public void testBankTransactionsLog() {

        // Entered positive integer amounts, difference of sums is positive: D 300, W 200 D 200 W100\n, S 200
        // Entered floating W: D 300, W 200.50 D 200 W100.30\n, S 199.20
        // Sum of balance is Zero: D300, W400 D300 W200\n, S0


        // Withdraw more then deposit -> Error:  D 300, W 600 D 200 W100\n, "Sum can't be negative, please add 200 money on deposit"
        // Character instead of amount: D 300, W !\n, "Not allowed character, please enter a number"
        // Enter some word instead of amount: D300 W zero\n, "Not allowed character, please enter a number"
        // Enter wrong separator: D 300, W 200,50\n, "Not allowed separator, separator should be ."
        // Not correct finishing of task: D 300, W 600 D 200 W100 SPACE, "Not correct finishing of task, please enter \n"
        // Not correct finishing of task: D 300, W 600 D 200 W100\t, "Not correct finishing of task, please enter \n"
        // Incorrect format of transactions log: D  300, W 200 D 200 W 100\n, "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions log: D 300, W 200 D200 W 100\n, "Incorrect format of transactions log, should be D 000"
        // Incorrect character of transaction: "WWW", "Not allowed character, please enter a number"
        // Incorrect character of transaction: " ", "Not allowed character, please enter a number"
        // Incorrect format of transactions: "WW 100", "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions: "DW 50", "Incorrect format of transactions log, should be D 000"
        // Negative amount or zero: "D -50", "Amount of money should be positive and not 0"
        // Extra character after valid transaction: W 200\n\nD 200\n\", "Extra characters in the transaction"
        // Incorrect format of transactions: null, "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions: "", "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions: " ", "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions: "\t", "Incorrect format of transactions log, should be D 000"
        // Incorrect format of transactions: "\n", "Incorrect format of transactions log, should be D 000"
        // Extra character after valid transaction: "D 500\n\nW 100\n\n", "Extra characters in the transaction"
        //Extra character after valid transaction: "D 500\n\nW 100\n", "Extra characters in the transaction"
        //Incorrect format of transactions: "\n\n", "Incorrect format of transactions log, should be D 000"

//        Double result = 0.00;
//
//        String[] inputtedAmountPositive = {
//                "D 300\nW 200\nD 200\nW 100\n\n",
//                "D 300\nW 200.50\nD 200\nW 100.30\n\n",
//                "D 300\nW 400\nD 300\nW 200\n\n",
//        };
//
//        Double[] expectedSumPositive = {
//                200.00,
//                199.20,
//                0.00,
//        };

        try {

            assertEquals(200.00, transactionsResultSum("D 300\nW 200\nD 200\nW 100\n\n"), "The sum of transaction should be 200.00");

        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
    @Test
    public void testBankTransactionsLog1() {

        try {

            assertEquals(199.20, transactionsResultSum("D 300\nW 200.50\nD 200\nW 100.30\n\n"), "The sum of transaction should be 199.20");

        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
    @Test
    public void testBankTransactionsLog2() {

        try {

            assertEquals(0.00, transactionsResultSum("D 300\nW 400\nD 300\nW 200\n\n"), "The sum of transaction should be 0.00");

        } catch (Exception e) {
            System.out.println("Fail");
        }
    }

//        // Negative cases
@Test
@DisplayName ("Negative result of transaction")
  public void testBankTransactionLogNegative(){

            Exception exception = assertThrows(NegativeResultOfTransactionException.class, () -> {
                transactionsResultSum("D 300\nW 600\nD 200\nW 100\n\n");
            });
        }

@Test
@DisplayName ("Not allowed character")
    public void testBankTransactionLogNegative1(){
         Exception exception = assertThrows(NotAllowedCharacterException.class, () -> {
             transactionsResultSum("D 300\nW !\n\n");
         });
}

@Test
    @DisplayName("Not allowed character - zero")
    public void testBankTransactionLogNegative2() {
    Exception exception = assertThrows(NotAllowedCharacterException.class, () -> {
        transactionsResultSum("D 300\nW zero\n\n");
    });
}

    @Test
    @DisplayName("Not allowed separator")
    public void testBankTransactionLogNegative3() {
        Exception exception = assertThrows(NotAllowedCharacterException.class, () -> {
            transactionsResultSum("D 300\nW 200,50\n\n");
        });
    }
    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative4() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("D 300\nW 600\nD 200\nW 100 ");
        });
    }

    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative5() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("D 300\nW 600\nD 200\nW 100\n\t");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative6() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("D  300\nW 200\nD 200\nW 100\n\n");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative7() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("D 300\nW 200\nD200\nW 100\n\n");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative8() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("WWW\n\n");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative9() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum(" \n\n");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative10() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("WW 100\n\n");
        });
    }

    @Test
    @DisplayName("Incorrect Format Exception")
    public void testBankTransactionLogNegative11() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("DW 50\n\n");
        });
    }

    @Test
    @DisplayName("Not allowed character")
    public void testBankTransactionLogNegative12() {
        Exception exception = assertThrows(NotAllowedCharacterException.class, () -> {
            transactionsResultSum("D -50\n\n");
        });
    }

    @Test
    @DisplayName("No empty row at the end")
    public void testBankTransactionLogNegative13() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("W 200\n\nD 200\n\"");
        });
    }

    @Test
    @DisplayName("Null exception")
    public void testBankTransactionLogNegative14() {
        Exception exception = assertThrows(NullException.class, () -> {
            transactionsResultSum(null);
        });
    }
    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative15() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("");
        });
    }

    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative16() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum(" ");
        });
    }

    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative17() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("\t");
        });
    }

    @Test
    @DisplayName("No Empty row at the end")
    public void testBankTransactionLogNegative18() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("\n");
        });
    }

    @Test
    @DisplayName("Incorrect format")
    public void testBankTransactionLogNegative19() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("D 500\n\nW 100\n\n");
        });
    }

    @Test
    @DisplayName("No Empty row")
    public void testBankTransactionLogNegative20() {
        Exception exception = assertThrows(NoEmptyRowAtTheEndOfEnterException.class, () -> {
            transactionsResultSum("D 500\n\nW 100\n");
        });
    }

    @Test
    @DisplayName("Incorrect format")
    public void testBankTransactionLogNegative21() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            transactionsResultSum("\n\n");
        });
    }

    public static void testFunction() throws Exception
    { transactionsResultSum("D 300\nW 200\nD 200\nW 100\n\n\n"); }

    @Test
    @DisplayName("Incorrect format")
    public void testBankTransactionLogNegative22() {
        Exception exception = assertThrows(MoreThenOneEmptyRowAtTheEndException.class, BankTransactionLogTest::testFunction);
    }

    @TestFactory
    public List<DynamicTest> testBankTransactionLogNegative23() {
       return Arrays.asList(
          dynamicTest("Incorrect format", () -> assertThrows(MoreThenOneEmptyRowAtTheEndException.class,
                  ()-> transactionsResultSum("D 300\nW 200\nD 200\nW 100\n\n\n"))),
               dynamicTest("Incorrect format", ()-> assertThrows(IncorrectFormatException.class,
                       ()-> transactionsResultSum("\n\n")))
       );

    }


//        Double resultNegative = 0.00;
//
//        String[] inputtedAmountNegative = {
//                "D 300\nW 600\nD 200\nW 100\n\n",  // 4
//                "D 300\nW !\n\n",         // 5
//                "D 300\nW zero\n\n",      // 6
//                "D 300\nW 200,50\n\n",    //7
//                "D 300\nW 600\nD 200\nW 100 ",   //8
//                "D 300\nW 600\nD 200\nW 100\n\t",  //9
//                "D  300\nW 200\nD 200\nW 100\n\n", //10
//                "D 300\nW 200\nD200\nW 100\n\n", //11
//                "WWW\n\n", //12
//                " \n\n",   //13
//                "WW 100\n\n", //14
//                "DW 50\n\n",  //15
//                "D -50\n\n",  //16
//                "W 200\n\nD 200\n\"", //17
//                null, //18
//                "", //19
//                " ", //20
//                "\t", //21
//                "\n",  //22
//                "D 500\n\nW 100\n\n", //23
//                "D 500\n\nW 100\n",  //24
//                "\n\n",  //25
//                "D 300\nW 200\nD 200\nW 100\n\n\n"  //26
//        };
//
//        Exception[] expectedException = {new NegativeResultOfTransactionException(),  //4
//                new NotAllowedCharacterException(),  //5
//                new NotAllowedCharacterException(),  //6
//                new NotAllowedCharacterException(),  //7
//                new NoEmptyRowAtTheEndOfEnterException(),  //8
//                new NoEmptyRowAtTheEndOfEnterException(),  //9
//                new IncorrectFormatException(),  //10
//                new IncorrectFormatException(),  //11
//                new IncorrectFormatException(),  //12
//                new IncorrectFormatException(),  //13
//                new IncorrectFormatException(),  //14
//                new IncorrectFormatException(),  //15
//                new NotAllowedCharacterException(),  //16
//                new NoEmptyRowAtTheEndOfEnterException(),  //17
//                new NullException(),  //18
//                new NoEmptyRowAtTheEndOfEnterException(),  //19
//                new NoEmptyRowAtTheEndOfEnterException(),  //20
//                new NoEmptyRowAtTheEndOfEnterException(),  //21
//                new NoEmptyRowAtTheEndOfEnterException(),  //22
//                new IncorrectFormatException(),  //23
//                new NoEmptyRowAtTheEndOfEnterException(),  //24
//                new IncorrectFormatException(),  //25
//                new MoreThenOneEmptyRowAtTheEndException()     //26
//        };
//
//
//        for (int i = 0; i < inputtedAmountNegative.length; i++) {
//            System.out.println("Test case " + (i + 4));
//            try {
//                resultNegative = transactionsResultSum(inputtedAmountNegative[i]);
//                System.out.println("Fail");
//            } catch (Exception receivedException) {
//                if (expectedException[i].getClass() == receivedException.getClass()) {
//                    System.out.println("Pass");
//                } else System.out.println("Fail");
//            }
//        }
//
    }
