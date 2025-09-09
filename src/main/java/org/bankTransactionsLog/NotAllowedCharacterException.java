package org.bankTransactionsLog;

public class NotAllowedCharacterException extends Exception{
    public NotAllowedCharacterException() {super(String.format("Not allowed character, please enter a number"));}
}
