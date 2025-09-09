package org.bankTransactionsLog;

public class NullException extends Exception {
    public NullException() {
        super("The expression can't be null");
    }
}
