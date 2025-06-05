package org.numberConversion_Tests_Exceptions;

public class MissingNumberException extends Exception{
    public MissingNumberException(){
        super(String.format("Missing or empty number"));
    }
}
