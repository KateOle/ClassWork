package org.bankTransactionsLog;

public class NegativeResultOfTransactionException extends Exception{
    public NegativeResultOfTransactionException()
    {super("Sum can't be negative, please add 200 money on deposit");}
}
