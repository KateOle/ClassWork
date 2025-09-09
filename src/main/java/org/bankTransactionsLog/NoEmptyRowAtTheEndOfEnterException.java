package org.bankTransactionsLog;

public class NoEmptyRowAtTheEndOfEnterException extends Exception{
    public NoEmptyRowAtTheEndOfEnterException() {super(String.format("At the end of entrance should be empty row"));}
}
