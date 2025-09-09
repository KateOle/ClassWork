package org.bankTransactionsLog;

public class ExtraCharactersAfterTransactionException extends Exception {
    public  ExtraCharactersAfterTransactionException() {
        super("Extra characters in the transaction");
    }

}
