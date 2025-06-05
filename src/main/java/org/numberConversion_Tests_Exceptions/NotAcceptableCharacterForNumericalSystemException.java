package org.numberConversion_Tests_Exceptions;

public class NotAcceptableCharacterForNumericalSystemException extends Exception {
    public NotAcceptableCharacterForNumericalSystemException (Character c) {
        super(String.format("Not allowed character: %c", c));
    }

}
