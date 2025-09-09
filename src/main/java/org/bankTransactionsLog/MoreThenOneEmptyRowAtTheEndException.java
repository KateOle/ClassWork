package org.bankTransactionsLog;

public class MoreThenOneEmptyRowAtTheEndException extends Exception{
    public MoreThenOneEmptyRowAtTheEndException() {super(String.format("There should be only one empty row at the end of entrance"));}}