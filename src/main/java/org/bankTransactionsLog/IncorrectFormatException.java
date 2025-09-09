package org.bankTransactionsLog;

public class IncorrectFormatException extends Exception{
    public IncorrectFormatException() {
        super("Incorrect format of transactions log, should be D 000");
    }
}
