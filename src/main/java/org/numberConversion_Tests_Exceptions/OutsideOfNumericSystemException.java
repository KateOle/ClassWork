package org.numberConversion_Tests_Exceptions;

public class OutsideOfNumericSystemException extends Exception{

    public OutsideOfNumericSystemException(int d, String s){
        super(String.format("Numeric system %d not in range of numeric system, %s", d, s));
    }

}
