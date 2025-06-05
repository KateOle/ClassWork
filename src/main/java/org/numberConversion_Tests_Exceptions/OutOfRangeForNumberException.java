package org.numberConversion_Tests_Exceptions;

public class OutOfRangeForNumberException extends Exception {
    public OutOfRangeForNumberException(String s, int d){
        super(String.format("Number :%s in numeric system: %d is out of range. The range for Number is N (1 ≤ |N| < 1000000000)", s, d));
    }


}
