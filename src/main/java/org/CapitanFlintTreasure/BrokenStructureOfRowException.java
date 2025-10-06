package org.CapitanFlintTreasure;

public class BrokenStructureOfRowException extends Exception {
    public BrokenStructureOfRowException(String side) {
        super (String.format("Incorrect structure of row. Example - %s", side));
    }
}
