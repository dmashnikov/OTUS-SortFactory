package org.dmashnikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class SortedTests {

    @Test
    void checkChoiceSort() throws FileNotFoundException {
        int sortType = 1;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        ArraySorter arraySorter = new ArraySorter();
        int[] sorted = arraySorter.sortByType(sortType, inArr);
        Assertions.assertArrayEquals(expectedArr, sorted);
    }

    @Test
    void checkPasteSort() throws FileNotFoundException {
        int sortType = 2;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        ArraySorter arraySorter = new ArraySorter();
        int[] sorted = arraySorter.sortByType(sortType, inArr);
        Assertions.assertArrayEquals(expectedArr, sorted);
    }

    @Test
    void checkMergeSort() throws FileNotFoundException {
        int sortType = 3;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        ArraySorter arraySorter = new ArraySorter();
        int[] sorted = arraySorter.sortByType(sortType, inArr);
        Assertions.assertArrayEquals(expectedArr, sorted);
    }

}
