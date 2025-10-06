package org.CapitanFlintTreasure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

import static org.CapitanFlintTreasure.Coordinates.coordinate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CoordinatesTest {

    // Positive:
    //North 6\nSouth 3\nEast 7\nWest 9\nTreasure! -> -2 3
    //South 6\nWest 3\nTreasure! -> -3 -6
    //North 4\nSouth 2\nSouth 2\nEast 0\nWest 1\nTreasure! -> -1 0
    //North 3\nTreasure! -> 0 3
    // West 0\nEast 0\nSouth 0\nNorth 0\nTreasure! -> 0 0


    //Negative
    //null -> NullException
    //1  Empty row -> "" -> EmptyRowException

    //2 - Only word Treasure! -> Treasure! -> BrokenStructureException
    //3 - Negative test Brocken structureNo Treasure! at the end -> Up 10 -> BrokenStructureException
    //4 - Negative test Brocken structureStart with \n -> \nNorth 3\nTreasure! -> BrokenStructureException
    //5 - Negative test Brocken structureTwo times Treasure! -> Treasure!\nTreasure! -> BrokenStructureException
    //6 - Negative test Brocken structureContinuing enter after Treasure! -> Treasure!\nSouth 4 -> BrokenStructureException
    //7 - No enter after word [digit] -> West 6West 5\nTreasure! -> BrokenStructureException
    //8 - No \n after side of world -> Down 4 \nTrea! -> BrokenStructureException

    //9 - Treasure without ! at the end -> South 6\nWest 3\nTreasure-> BrokenStructureOfRowException
    //10 - Empty side of world: North 3\n 5\nEast 3\nTreasure! -> BrokenStructureOfRowException
    //11 - No Space between word and digit -> Up5\nTreasure! -> BrokenStructureOfRowException
    //12 - No Space between word and digit -> West4\nTreasure! -> BrokenStructureOfRowException
    //13 - No Space between word and digit -> East-4\nTreasure! -> BrokenStructureOfRowException
    //14 - No digit -> South 6\nWest \nTreasure! ->BrokenStructureOfRowException

    //15 - Other word then Treasure at the end -> South 6\nWest 3\nStop! -> BrokenContentException
    //16 - Misspelling in the word -> South 6\nWest 3\nTreasur! -> BrokenContentException
    //17 - Incorrect word [side of word] -> South 6\nTest 3\nTreasure!-> BrokenContentException
    //18 - Float digit -> South 6.3\nWest 3\nTreasure! -> BrokenContentException
    //19 - Negative digit -> //West -5\nTreasure! -> BrokenContentException

    @TestFactory
    public List<DynamicTest> coordinateTestPositive() {
        return Arrays.asList(
                dynamicTest("Positive tests",
                        () -> assertEquals("-2 3", coordinate("North 6\nSouth 3\nEast 7\nWest 9\nTreasure!"))),
                dynamicTest("Positive tests",
                        ()-> assertEquals("-3 -6", coordinate("South 6\nWest 3\nTreasure!"))),
                dynamicTest("Positive tests",
                        ()-> assertEquals("-1 0", coordinate("North 4\nSouth 2\nSouth 2\nEast 0\nWest 1\nTreasure!"))),
                dynamicTest("Positive tests",
                                        ()-> assertEquals("0 3", coordinate("North 3\nTreasure!"))),
                dynamicTest("Positive tests",
                        ()-> assertEquals("0 0", coordinate("West 0\nEast 0\nSouth 0\nNorth 0\nTreasure!")))
        );

    }

    @Test
    @DisplayName("Negative test Null exception")
    public void coordinateTestNegative() {
        Exception exception = assertThrows(NullException.class, () -> {
            coordinate(null);
        });
    }

    @Test
    @DisplayName("Negative test Empty row")
    public void coordinateTestNegative1() {
        Exception exception = assertThrows(EmptyRowException.class, () -> {
            coordinate("");
        });
    }

    @TestFactory
    public List<DynamicTest> coordinateTestBrokenStructure() {
        return Arrays.asList(
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureException.class,
                                () -> coordinate("South 6\nWest 3\nTreasure"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureException.class,
                                () -> coordinate("\"Treasure!\""))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureException.class,
                                () -> coordinate("Up 10"))),
//                dynamicTest("Negative test Brocken structure",
//                        () -> assertThrows(BrokenStructureException.class,
//                                () -> coordinate("\nNorth 3\nTreasure!"))),
//                dynamicTest("Negative test Brocken structure",
//                        () -> assertThrows(BrokenStructureException.class,
//                                () -> coordinate("Treasure!\nTreasure!"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureException.class,
                                () -> coordinate("Treasure!\nSouth 4"))),
                dynamicTest("Incorrect structure of Content",
                        () -> assertThrows(BrokenStructureException.class,
                                () -> coordinate("South 6\nWest 3\nStop!"))),
                dynamicTest("Incorrect structure of Content",
                        ()-> assertThrows(BrokenStructureException.class,
                                ()-> coordinate("South 6\nWest 3\nTreasur!")))
//                dynamicTest("Negative test Brocken structure",
//                        () -> assertThrows(BrokenStructureException.class,
//                                () -> coordinate("West 6West 5\nTreasure!"))),
//                dynamicTest("Negative test Brocken structure",
//                        () -> assertThrows(BrokenStructureException.class,
//                                () -> coordinate("West 6West 5\nTreasure!")))
        );
    }

    @TestFactory
    public List<DynamicTest> coordinateTestBrockenStructureOfRow() {
        return Arrays.asList(
//                dynamicTest("Incorrect structure of row",
//                        () -> assertThrows(BrokenStructureOfRowException.class,
//                                () -> coordinate("South 6\nWest 3\nTreasure"))),
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("North 3\n 5\nEast 3\nTreasure!"))),
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("Up5\nTreasure!"))),
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("West4\nTreasure!"))),
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("East-4\nTreasure!"))),
                dynamicTest("Incorrect structure of row",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("South 6\nWest \nTreasure!"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("\nNorth 3\nTreasure!"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("Treasure!\nTreasure!"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("West 6West 5\nTreasure!"))),
                dynamicTest("Negative test Brocken structure",
                        () -> assertThrows(BrokenStructureOfRowException.class,
                                () -> coordinate("West 6West 5\nTreasure!"))),
                dynamicTest("Incorrect structure of Content",
                        ()-> assertThrows(BrokenStructureOfRowException.class,
                                ()-> coordinate("South 6\nTest 3\nTreasure!"))),
                dynamicTest("Incorrect structure of Content",
                        ()-> assertThrows(BrokenStructureOfRowException.class,
                                ()-> coordinate("South 6.3\nWest 3\nTreasure!"))),
                dynamicTest("Incorrect structure of Content",
                        ()-> assertThrows(BrokenStructureOfRowException.class,
                                ()-> coordinate("West -5\nTreasure!")))
        );

    }

//    @TestFactory
//    public List<DynamicTest> coordinateTestBrokenContent() {
//        return Arrays.asList(
////                dynamicTest("Incorrect structure of Content",
////                        () -> assertThrows(BrokenContentException.class,
////                                () -> coordinate("South 6\nWest 3\nStop!"))),
////                dynamicTest("Incorrect structure of Content",
////                        ()-> assertThrows(BrokenContentException.class,
////                                ()-> coordinate("South 6\nWest 3\nTreasur!"))),
////                dynamicTest("Incorrect structure of Content",
////                        ()-> assertThrows(BrokenContentException.class,
////                                ()-> coordinate("South 6\nTest 3\nTreasure!"))),
////                dynamicTest("Incorrect structure of Content",
////                        ()-> assertThrows(BrokenContentException.class,
////                        ()-> coordinate("South 6.3\nWest 3\nTreasure!"))),
//                dynamicTest("Incorrect structure of Content",
//                        ()-> assertThrows(BrokenContentException.class,
//                                ()-> coordinate("West -5\nTreasure!")))
//
//                );
//    }
}










